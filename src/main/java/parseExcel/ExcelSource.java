package parseExcel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Maps;

import parseExcel.head.IHeader;

public class ExcelSource implements InputSource {

	private final String fileName;

	private Map<Integer, IHeader> maps;

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
			throw new RuntimeException(e);
		}
	}

	public Map<Integer, IHeader> getHeaders() {
		if (maps == null) {
			maps = Maps.newHashMap();
		}

		return maps;
	}

}
