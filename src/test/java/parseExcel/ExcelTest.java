package parseExcel;

import org.testng.annotations.Test;

public class ExcelTest {

	@Test
	public void test(){
		String fileName = "excels/RankModel.xlsx";
		ExcelSource es = new ExcelSource(fileName);
		try {
			es.beginParse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
