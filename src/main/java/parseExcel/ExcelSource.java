package parseExcel;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Maps;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtField.Initializer;
import javassist.CtNewMethod;
import parseExcel.exception.ExcelParseException;
import parseExcel.head.ExcelHead;
import parseExcel.head.IExcelHeader;

public class ExcelSource implements InputSource {

	private String domainClassName;

	private final String fileName;

	private Map<Integer, IExcelHeader> maps;

	private Workbook wb = null;

	private FormulaEvaluator eval = null;

	public ExcelSource(String fileName) {
		super();
		this.fileName = fileName;
		init();
	}

	@Override
	public InputStream getInputStream() {
		return ClassLoader.getSystemResourceAsStream(fileName);
	}

	private void init() {
		if (!(fileName.endsWith(".xls") || fileName.endsWith(".xlsx")))
			throw new RuntimeException("inputFile error");
		boolean flag = fileName.endsWith(".xls") ? true : false;

		try {
			if (flag) {
				wb = new HSSFWorkbook(new POIFSFileSystem(getInputStream()));
				eval = new HSSFFormulaEvaluator((HSSFWorkbook) wb);
			} else {
				wb = new XSSFWorkbook(getInputStream());
				eval = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
			}
		} catch (IOException e) {
			throw new ExcelParseException(e);
		}
	}

	public Map<Integer, IExcelHeader> getHeaders() {
		if (maps == null) {
			maps = Maps.newHashMap();
		}
		return maps;
	}

	public void beginParse() throws Exception {
		int index = wb.getNumberOfSheets();
		if (index > 0) {
			for (int i = 1; i < index; i++) {
			}
		}

		Sheet sheet = wb.getSheet(getExcelFileName());
		if (sheet.getFirstRowNum() != 0) {
			throw new ExcelParseException(String.format("can't be 0, first:%d", sheet.getFirstRowNum()));
		}

		if (sheet.getLastRowNum() - sheet.getFirstRowNum() < 2) {
			throw new ExcelParseException(String.format("can't have 3 line, last:%d, first:%d", sheet.getLastRowNum(),
					sheet.getFirstRowNum()));
		}

		Row row0 = sheet.getRow(sheet.getFirstRowNum());
		Row row1 = sheet.getRow(sheet.getFirstRowNum() + 1);
		Row row2 = sheet.getRow(sheet.getFirstRowNum() + 2);

		ClassPool cp = ClassPool.getDefault();
		CtClass ctClass = cp.makeClass("parseExcel.domain." + getExcelFileName());

		short minColIx = row0.getFirstCellNum();
		short maxColIx = row0.getLastCellNum();
		for (int colIx = minColIx; colIx < maxColIx; colIx++) {
			Cell cell0 = row0.getCell(colIx);
			Cell cell1 = row1.getCell(colIx);
			Cell cell2 = row2.getCell(colIx);
			if (cell0 == null || cell1 == null || cell2 == null) {
				continue;
			}
			String desc = cell0.getStringCellValue();
			String type = cell1.getStringCellValue();
			String title = cell2.getStringCellValue();
			ExcelHead eh = new ExcelHead(desc, title, type);
			eh.setColumn(colIx);

			// 设置private field
			CtField ctField = new CtField(cp.get(getTypeString(eh.getType())), eh.getTitle(), ctClass);
			ctField.setModifiers(Modifier.PRIVATE);

			// 设置name属性的get set方法
			ctClass.addMethod(CtNewMethod.setter(getMethodName("set", eh.getTitle()), ctField));
			ctClass.addMethod(CtNewMethod.getter(getMethodName("get", eh.getTitle()), ctField));
			ctClass.addField(ctField, Initializer.constant("default"));
		}

		ctClass.writeFile("parseExcel.domain." + getExcelFileName());
		
		Map<Integer, IExcelHeader> maps = Maps.newHashMap();

		for (int row = sheet.getFirstRowNum(); row < sheet.getLastRowNum(); row++) {
			for (int colIx = minColIx; colIx < maxColIx; colIx++) {
			}
		}
	}

	private String getMethodName(String prefix, String title) {
		return prefix + title.substring(0, 1).toUpperCase() + title.substring(1);
	}

	private String getExcelFileName() {
		if (domainClassName != null) {
			return domainClassName;
		}
		domainClassName = fileName;
		int index = domainClassName.lastIndexOf("/");
		if (index == -1) {
			return domainClassName;
		}
		domainClassName = domainClassName.substring(index + 1);
		index = domainClassName.indexOf(".");
		if (index == -1) {
			return domainClassName;
		}
		domainClassName = domainClassName.substring(0, index);
		return domainClassName;
	}

	private String getTypeString(String type) {
		if (type == null) {
			throw new ExcelParseException("type is null");
		}
		switch (type.toLowerCase()) {
		case "string": {
			return String.class.getName();
		}
		case "int":
			return int.class.getName();
		case "double":
			return double.class.getName();
		case "float": {
			return float.class.getName();
		}
		default: {
			throw new ExcelParseException("unknown type");
		}
		}
	}
}
