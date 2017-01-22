package parseExcel;

import java.util.List;

import parseExcel.head.ExcelHead;

public interface IBeanFile {
	String createContent(String className, List<ExcelHead> fieldList);
}
