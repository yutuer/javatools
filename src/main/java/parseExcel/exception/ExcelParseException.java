package parseExcel.exception;

public class ExcelParseException extends RuntimeException {

	private static final long serialVersionUID = 8441791905010706568L;

	public ExcelParseException() {
		super();
	}

	public ExcelParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExcelParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcelParseException(String message) {
		super(message);
	}

	public ExcelParseException(Throwable cause) {
		super(cause);
	}

}
