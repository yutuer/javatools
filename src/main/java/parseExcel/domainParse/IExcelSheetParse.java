package parseExcel.domainParse;

import org.apache.poi.ss.usermodel.Sheet;

public interface IExcelSheetParse {

	Class<?> parseModel2Class(Sheet sheet) throws Exception;
	
}
