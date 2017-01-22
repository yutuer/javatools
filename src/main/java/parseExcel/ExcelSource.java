package parseExcel;

import java.io.InputStream;

public class ExcelSource implements InputSource {

	private final String fileName;

	public ExcelSource(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public InputStream getInputStream() {
		return ClassLoader.getSystemResourceAsStream(fileName);
	}

}
