package parseExcel.domainParse;

import parseExcel.exception.ExcelParseException;

public abstract class AbstractExcelSheetParse implements IExcelSheetParse {

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

	protected String getTypeString(String type) {
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
