package parseExcel;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import parseExcel.bean.RankModel;

public class ExcelReadData {

	public static void main(String[] args) {
		String fileName = "src/main/resources/excels/EntityModel.xlsx";
		File f = new File(fileName);
		readData(f.getAbsolutePath());
	}

	public static void readData(String fileName) {
		Map<String, List<ExcelHead>> map_head = ExcelUtil.getExcelBeans(true, fileName);
		Map<String, List<List<Object>>> map_data = ExcelUtil.getExcelData(true, fileName, map_head);
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
