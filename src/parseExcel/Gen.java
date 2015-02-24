package parseExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import parseExcel.gen.IBeanFile;
import util.MyUtil;

import com.google.common.collect.Lists;

public class Gen {
	public static void main(String[] args) {
		final String fileName = "RankModel.xlsx";
		Map<String, List<ExcelHead>> map_head = ExcelUtil.getExcelBeans(false, fileName);
		createBeanFile(map_head);
		Map<String, List<List<Object>>> map_data = ExcelUtil.getExcelData(false, fileName, map_head);
		System.out.println(map_data);
	}

	private static String getTemplateString(String path) {
		FileReader fr = null;
		try {
			File file = new File(path);
			fr = new FileReader(file);
			char[] c = new char[(int) file.length()];
			fr.read(c);
			StringBuilder sb = new StringBuilder();
			sb.append(c);
			String s = sb.toString();
			return s;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private static void writeFile(String filePath, String content) {
		FileWriter fw = null;
		try {
			String p = System.getProperty("user.dir");
			final String writePath = p.replaceAll("\\\\", "/") + filePath + ".java";
			File writeFile = new File(writePath);
			fw = new FileWriter(writeFile);
			fw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void createBeanFile(Map<String, List<ExcelHead>> map_head) {
		final String templateString = getTemplateString("resources/genTemplate/BeanFile");
		final String field = "public final ";
		for (Entry<String, List<ExcelHead>> entry : map_head.entrySet()) {
			final String cname = entry.getKey();
			final List<ExcelHead> fieldList = entry.getValue();
			IBeanFile beanFileLogic = new IBeanFile() {
				@Override
				public String ddd(String cname, List<ExcelHead> fieldList) {
					List<String> conDefList = Lists.newArrayList();
					StringBuilder fieldsb = new StringBuilder();
					StringBuilder conAssignsb = new StringBuilder();
					for (ExcelHead head : fieldList) {
						fieldsb.append("//").append(head.desc).append("\n");
						fieldsb.append(field).append(head.type).append(" ").append(head.title).append(";").append("\n").append("\n");

						conDefList.add(head.type + " " + head.title);
						conAssignsb.append("this.").append(head.title).append("=").append(head.title).append(";\n");
					}
					String conDef = MyUtil.getJoinString(conDefList, "", ",", "");
					String content = templateString.replaceAll("%cname%", cname).replaceAll("%field_def%", fieldsb.toString())
							.replaceAll("%construct_def%", conDef).replaceAll("%construct_assign%", conAssignsb.toString());
					return content;
				}
			};
			String content = beanFileLogic.ddd(cname, fieldList);
			writeFile("/src/parseExcel/bean/" + cname, content);
		}
	}
}
