package parseExcel;

import java.util.List;

public interface IBeanFile {
	String createContent(String className, List<ExcelHead> fieldList);
}
