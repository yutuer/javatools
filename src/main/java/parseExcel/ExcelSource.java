package parseExcel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import parseExcel.domainParse.IExcelSheetParse;
import parseExcel.domainParse.JavaAssistExcelParse;
import parseExcel.exception.ExcelParseException;
import parseExcel.head.IExcelHeader;

import com.google.common.collect.Maps;

public class ExcelSource implements InputSource {

	private String domainClassName;

	private final String fileName;

	private Map<Integer, IExcelHeader> maps;

	private Workbook wb = null;

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
			} else {
				wb = new XSSFWorkbook(getInputStream());
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
			throw new ExcelParseException(String.format("can't have 3 line, last:%d, first:%d", sheet.getLastRowNum(), sheet.getFirstRowNum()));
		}

		Row row0 = sheet.getRow(sheet.getFirstRowNum());
		short minColIx = row0.getFirstCellNum();
		short maxColIx = row0.getLastCellNum();

		IExcelSheetParse excelSheetParse = new JavaAssistExcelParse(fileName, domainClassName, minColIx, maxColIx, "parseExcel.domain");
		Class<?> c = excelSheetParse.parseModel2Class(sheet);
		
		Map<Integer, IExcelHeader> maps = Maps.newHashMap();

		for (int row = sheet.getFirstRowNum(); row < sheet.getLastRowNum(); row++) {
			for (int colIx = minColIx; colIx < maxColIx; colIx++) {
				
			}
		}
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
		index = domainClassName.lastIndexOf(".");
		if (index == -1) {
			return domainClassName;
		}
		domainClassName = domainClassName.substring(0, index);
		return domainClassName;
	}

}
