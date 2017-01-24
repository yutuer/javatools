package parseExcel.domainParse;

import org.apache.poi.ss.usermodel.Sheet;

public class AsmExcelParse extends AbstractExcelSheetParse{

	public AsmExcelParse(String fileName, String domainClassName, int minColumn, int maxColumn) {
		super(fileName, domainClassName, minColumn, maxColumn);
	}

	@Override
	public Class<?> parseModel2Class(Sheet sheet) throws Exception {
		return null;
	}

}
