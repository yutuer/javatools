package parseExcel.domainParse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import parseExcel.exception.ExcelParseException;

public abstract class AbstractExcelSheetParse implements IExcelSheetParse {
	
	public static final Logger logger = LoggerFactory.getLogger(AbstractExcelSheetParse.class);
	
	private final String domainClassName;

	private final String fileName;

	private final int minColumn;

	private final int maxColumn;

	public AbstractExcelSheetParse(String fileName, String domainClassName, int minColumn, int maxColumn) {
		super();
		this.fileName = fileName;
		this.domainClassName = domainClassName;
		this.minColumn = minColumn;
		this.maxColumn = maxColumn;
	}

	protected CtClass getTypeString(String type) throws NotFoundException {
		if (type == null) {
			throw new ExcelParseException("type is null");
		}
		switch (type.toLowerCase()) {
		case "string": {
			return ClassPool.getDefault().get(String.class.getName());
		}
		case "int":
			return CtClass.intType;
		case "double":
			return CtClass.doubleType;
		case "float": {
			return CtClass.floatType;
		}
		default: {
			throw new ExcelParseException("unknown type");
		}
		}
	}

	protected String getMethodName(String prefix, String title) {
		return prefix + title.substring(0, 1).toUpperCase() + title.substring(1);
	}

	public String getDomainClassName() {
		return domainClassName;
	}

	public String getFileName() {
		return fileName;
	}

	public int getMinColumn() {
		return minColumn;
	}

	public int getMaxColumn() {
		return maxColumn;
	}

}
