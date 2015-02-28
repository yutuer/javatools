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

public class ExcelGenBean {
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		genBeans();
	}

	public static void genBeans() {
		String path = "resources/excels";
		String path2 = "excels";
		File dir = new File(path);
		if (dir.isDirectory()) {
			for (File f : dir.listFiles()) {
				String fileName = f.getName();
				String filePath = path2 + "/" + fileName;
				Map<String, List<ExcelHead>> map_head = ExcelUtil.getExcelBeans(false, filePath);
				createDataBeanFile(map_head);
				// ExcelReadData.readData(filePath, map_head);
			}
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
		final String field = "private";
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
					String fieldFormat = "\t//%s\n\t%s %s %s;\n";
					StringBuilder fieldsb = new StringBuilder();

					String conAssignFormat = "\tthis.%s=%s;\n";
					StringBuilder conAssignsb = new StringBuilder();

					String getMethodFormat = "public %s get%s(){\n \treturn %s;\n}\n";
					StringBuilder getMethodsb = new StringBuilder();

					String setMethodFormat = "public void set%s(%s %s){\n \tthis.%s=%s;\n}\n";
					StringBuilder setMethodsb = new StringBuilder();
					for (ExcelHead head : fieldList) {
						String type = transferType(head.type);
						fieldsb.append(String.format(fieldFormat, head.desc, field, type, head.title));

						getMethodsb.append(String.format(getMethodFormat, type, MyUtil.firstChar2Upper(head.title), head.title));

						setMethodsb.append(String.format(setMethodFormat, MyUtil.firstChar2Upper(head.title), type, head.title, head.title, head.title));

						conDefList_str.add("String " + head.title);
						conDefList.add(type + " " + head.title);
						if ("String".equals(type)) {
							conRefList.add(head.title);
						} else {
							conRefList.add(getMethod(head.type) + "(" + head.title + ")");
						}
						toStringList.add(head.title + "=\\\"+" + head.title);
						conAssignsb.append(String.format(conAssignFormat, head.title, head.title));
					}
					String conDef_str = MyUtil.getJoinString(conDefList_str, "", ",", "");
					String conDef = MyUtil.getJoinString(conDefList, "", ",", "");
					String conRef = MyUtil.getJoinString(conRefList, "", ",", "");
					String toString = MyUtil.getJoinString(toStringList, "", "+\\\", ", "");
					// 去掉最后一个','
					toString = toString.substring(0, toString.length() - 1);
					String content = templateString.replaceAll("%cname%", cname).replaceAll("%field_def%", fieldsb.toString())
							.replaceAll("%construct_def%", conDef).replaceAll("%construct_strDef%", conDef_str)
							.replaceAll("%construct_assign%", conAssignsb.toString()).replaceAll("%construct_strAssign%", conRef)
							.replaceAll("%toString%", toString.toString()).replaceAll("%get_method%", getMethodsb.toString())
							.replaceAll("%set_method%", setMethodsb.toString());
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

			writeFile("/src/parseExcel/bean/" + cname, beanFileLogic.createContent(cname, fieldList));
		}
	}
}
