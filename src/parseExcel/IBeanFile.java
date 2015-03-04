package parseExcel;

import java.util.List;

public interface IBeanFile {
	String createContent(String cname, List<ExcelHead> fieldList);
}
