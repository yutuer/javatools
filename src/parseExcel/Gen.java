package parseExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import parseExcel.gen.IBeanFile;
import util.MyUtil;

import com.google.common.collect.Lists;

public class Gen {
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		final String cName = "RankModel";
		final String fileName = cName + ".xlsx";
		Map<String, List<ExcelHead>> map_head = ExcelUtil.getExcelBeans(false, fileName);
		createDataBeanFile(map_head);
		Map<String, List<List<Object>>> map_data = ExcelUtil.getExcelData(false, fileName, map_head);
		for (Entry<String, List<List<Object>>> entry : map_data.entrySet()) {
			String cname = entry.getKey();
			Class c = Class.forName("parseExcel.bean." + cname);
			List l = ExcelUtil.transferObjFromData(entry.getValue(), c, map_head.get(cname));
			System.out.println(l);
		}
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

	private static void createDataBeanFile(Map<String, List<ExcelHead>> map_head) {
		final String templateString = getTemplateString("resources/genTemplate/BeanFile");
		final String field = "public final ";
		for (Entry<String, List<ExcelHead>> entry : map_head.entrySet()) {
			final String cname = entry.getKey();
			final List<ExcelHead> fieldList = entry.getValue();
			IBeanFile beanFileLogic = new IBeanFile() {
				@Override
				public String createContent(String cname, List<ExcelHead> fieldList) {
					List<String> conDefList_str = Lists.newArrayList();
					List<String> conDefList = Lists.newArrayList();
					List<String> conRefList = Lists.newArrayList();
					List<String> toStringList = Lists.newArrayList();
					StringBuilder fieldsb = new StringBuilder();
					StringBuilder conAssignsb = new StringBuilder();
					for (ExcelHead head : fieldList) {
						String type = transferType(head.type);
						fieldsb.append("//").append(head.desc).append("\n");
						fieldsb.append(field).append(type).append(" ").append(head.title).append(";").append("\n").append("\n");

						conDefList_str.add("String " + head.title);
						conDefList.add(type + " " + head.title);
						if ("String".equals(type)) {
							conRefList.add(head.title);
						} else {
							conRefList.add(getMethod(head.type) + "(" + head.title + ")");
						}
						toStringList.add(head.title + "=\\\"+" + head.title);
						conAssignsb.append("this.").append(head.title).append("=").append(head.title).append(";\n");
					}
					String conDef_str = MyUtil.getJoinString(conDefList_str, "", ",", "");
					String conDef = MyUtil.getJoinString(conDefList, "", ",", "");
					String conRef = MyUtil.getJoinString(conRefList, "", ",", "");
					String toString = MyUtil.getJoinString(toStringList, "", "+\\\", ", "");
					// 去掉最后一个,
					toString = toString.substring(0, toString.length() - 1);
					String content = templateString.replaceAll("%cname%", cname).replaceAll("%field_def%", fieldsb.toString())
							.replaceAll("%construct_def%", conDef).replaceAll("%construct_strDef%", conDef_str)
							.replaceAll("%construct_assign%", conAssignsb.toString()).replaceAll("%construct_strAssign%", conRef)
							.replaceAll("%toString%", toString.toString());
					return content;
				}

				private String getMethod(String type) {
					if ("int".equals(type.trim())) {
						return "Integer.parseInt";
					} else if ("double".equals(type.trim())) {
						return "Double.parseDouble";
					} else if ("long".equals(type.trim())) {
						return "Long.parseLong";
					} else {
						return "String";
					}
				}

				private String transferType(String type) {
					if ("int".equals(type.trim())) {
						return "Integer";
					} else if ("double".equals(type.trim())) {
						return "Double";
					} else if ("long".equals(type.trim())) {
						return "Long";
					} else {
						return "String";
					}
				}
			};
			IBeanFile beanFileDaoLogic = new IBeanFile() {
				@Override
				public String createContent(String cname, List<ExcelHead> fieldList) {

					return null;
				}
			};
			writeFile("/src/parseExcel/bean/" + cname, beanFileLogic.createContent(cname, fieldList));
		}
	}
}
