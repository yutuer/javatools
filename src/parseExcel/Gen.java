package parseExcel;

import java.util.List;
import java.util.Map;

public class Gen {
	public static void main(String[] args) {
		Map<String, List<ExcelHead>> map = ExcelUtil.getExcelBeans(false,
				"RankModel.xlsx");
	}
}
