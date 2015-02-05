package parseExcel;

import java.util.List;

public class Gen {
	public static void main(String[] args) {
		MultiMap<String, List<ExcelHead>> map = ExcelUtil.getExcelBeans(false,
				"RankModel.xlsx");
	}
}
