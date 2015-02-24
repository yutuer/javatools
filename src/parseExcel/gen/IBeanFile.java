package parseExcel.gen;

import java.util.List;

import parseExcel.ExcelHead;

public interface IBeanFile {
	String createContent(String cname, List<ExcelHead> fieldList);
}
