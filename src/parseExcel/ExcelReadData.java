package parseExcel;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import parseExcel.bean.RankModel;

public class ExcelReadData {

	public static void readData(String fileName, Map<String, List<ExcelHead>> map_head) {
		Map<String, List<List<Object>>> map_data = ExcelUtil.getExcelData(false, fileName, map_head);
		try {
			for (Entry<String, List<List<Object>>> entry : map_data.entrySet()) {
				String cname = entry.getKey();
				Class c = (Class<RankModel>) Class.forName("parseExcel.bean." + cname);
				List l = ExcelUtil.transferObjFromData(entry.getValue(), c, map_head.get(cname));
				System.out.println(l);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
