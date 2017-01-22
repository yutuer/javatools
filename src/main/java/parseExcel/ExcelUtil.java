package parseExcel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import util.MyUtil;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import parseExcel.head.ExcelHead;

/**
 * excel辅助工具类
 * 
 */
public class ExcelUtil {

	public static final Logger log = Logger.getRootLogger();

	public static <T> List<T> transferObjFromData(List<List<Object>> lists, Class<T> c, List<ExcelHead> heads) {
		try {
			List<T> objs = Lists.newArrayList();
			List<Class> ll = Lists.newArrayList();
			for (ExcelHead eh : heads) {
				ll.add(String.class);
			}
			assert heads.size() == ll.size();
			Constructor<T> con = c.getConstructor(ll.toArray(new Class[0]));

			A<T> command = new A<T>();
			for (List<Object> list : lists) {
				T t = con.newInstance(list.toArray());
				objs.add(t);
				command.deal(t);
			}
			command.create();
			return objs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	interface Command<T> {
		void deal(T t);
	}

	interface Create {
		void create();
	}

	private static class A<T> implements Command<T>, Create {
		private Set<String> subTypeSet = Sets.newHashSet();
		private List<String> raceTypeList = Lists.newArrayList();
		private Set<String> entityTypeSet = Sets.newHashSet();
		private Set<String> resourceTypeSet = Sets.newHashSet();

		private static final String Path = "src/main/java/parseExcel/enums/";
		private final String templateString = MyUtil.getFileContent("src/main/resources/genTemplate/EnumBeanFile");

		private void createEnumFile(Collection<String> set, String cname) throws Exception {
			List<String> list = Lists.newArrayList();
			String allHaveString = "None";
			set.remove(allHaveString);
			list.add(allHaveString);
			for (String s : set) {
				list.add(s);
			}
			String fieldStr = StringUtils.join(list, ",");
			String content = templateString.replaceAll("%cname%", cname).replaceAll("%fields%", fieldStr);
			FileUtil.writeFile(Path + cname, content);
		}

		@Override
		public void create() {
			try {
				File f = new File(Path);
				if (!f.exists()) {
					f.mkdirs();
				}
				createEnumFile(subTypeSet, "SubServerTypeEnum");
				createEnumFile(raceTypeList, "RaceServerTypeEnum");
				createEnumFile(entityTypeSet, "EntityServerTypeEnum");
				createEnumFile(resourceTypeSet, "ResourceServerTypeEnum");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void deal(T t) {
			if (t.getClass().getSimpleName().equals("EntityModel")) {
				Field subTypeField;
				try {
					subTypeField = t.getClass().getDeclaredField("subType");
					subTypeField.setAccessible(true);
					subTypeSet.add((String) (subTypeField.get(t)));

					Field raceTypeField = t.getClass().getDeclaredField("raceType");
					raceTypeField.setAccessible(true);
					String s = (String) (raceTypeField.get(t));
					if (!raceTypeList.contains(s)) {
						raceTypeList.add(s);
					}

					Field entityTypeField = t.getClass().getDeclaredField("entityType");
					entityTypeField.setAccessible(true);
					entityTypeSet.add((String) (entityTypeField.get(t)));

					Field costResourceTypeField = t.getClass().getDeclaredField("costResourceType");
					costResourceTypeField.setAccessible(true);
					String costResourceValue = (String) (costResourceTypeField.get(t));
					resourceTypeSet.add(costResourceValue);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * 获取excel列数
	 * 
	 * @param row
	 *            excel第一行对象
	 * @return excel列数
	 */
	public static int getColumnsNum(Row row) {
		return row.getLastCellNum();
	}

	/**
	 * 获取excel中的模板表头信息
	 * 
	 * @param filePath
	 * @return
	 */
	public static Map<String, List<ExcelHead>> getExcelBeans(boolean isAbsolutePath, String filePath) {
		Map<String, List<ExcelHead>> map = new LinkedHashMap<String, List<ExcelHead>>();
		if (!(filePath.endsWith(".xls") || filePath.endsWith(".xlsx")))
			return null;
		Workbook wb = null;
		InputStream inp = null;

		boolean flag = filePath.endsWith(".xls") ? true : false;
		try {
			inp = isAbsolutePath ? new FileInputStream(new File(filePath)) : Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(filePath);
			FormulaEvaluator eval = null;
			if (flag) {
				wb = new HSSFWorkbook(new POIFSFileSystem(inp));
				eval = new HSSFFormulaEvaluator((HSSFWorkbook) wb);
			} else {
				wb = new XSSFWorkbook(inp);
				eval = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
			}

			for (int i = 0; i < 1; i++) {
				Sheet sheet = wb.getSheetAt(i);
				Row row0 = sheet.getRow(0);
				Row row1 = sheet.getRow(1);
				Row row2 = sheet.getRow(2);
				if (row0 == null)
					continue;
				if (row1 == null)
					continue;
				if (row2 == null)
					continue;

				List<ExcelHead> list = Lists.newArrayList();
				for (int k = 0; k < getColumnsNum(row0); k++) {
					ExcelHead bean = new ExcelHead();
					bean.desc = GPoiUtils.getStringValue(eval, row0.getCell(k));
					bean.title = GPoiUtils.getStringValue(eval, row2.getCell(k));
					bean.type = GPoiUtils.getStringValue(eval, row1.getCell(k));
					bean.column = k;
					if (StringUtils.isEmpty(bean.desc) || StringUtils.isEmpty(bean.title) || StringUtils.isEmpty(bean.type)) {
						log.error(String.format("%s 检查%d列, 有为''的cell\n", filePath, k + 1));
						continue;
					}
					list.add(bean);
				}
				map.put(sheet.getSheetName(), list);
			}
			eval.clearAllCachedResultValues();
			inp.close();
		} catch (IOException e) {
			log.error("解析表头错误", e);
		}
		return map;
	}

	public static String getExcelSheetName(boolean isAbsolutePath, String filePath) {
		Map<String, List<ExcelHead>> map = new LinkedHashMap<String, List<ExcelHead>>();
		if (!(filePath.endsWith(".xls") || filePath.endsWith(".xlsx")))
			return "";
		Workbook wb = null;
		InputStream inp = null;

		boolean flag = filePath.endsWith(".xls") ? true : false;
		String result = "";
		try {
			inp = isAbsolutePath ? new FileInputStream(new File(filePath)) : Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(filePath);
			FormulaEvaluator eval = null;
			if (flag) {
				wb = new HSSFWorkbook(new POIFSFileSystem(inp));
				eval = new HSSFFormulaEvaluator((HSSFWorkbook) wb);
			} else {
				wb = new XSSFWorkbook(inp);
				eval = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
			}

			List<String> list = new ArrayList<String>();
			if (wb.getNumberOfSheets() > 0) {
				result = wb.getSheetAt(0).getSheetName();
			}
			inp.close();
		} catch (IOException e) {
			log.error("解析表头错误", e);
		}
		return result;
	}

	/**
	 * 获取excel中的数据
	 * 
	 * @param filePath
	 *            文件名字
	 * @return
	 */
	public static Map<String, List<List<Object>>> getExcelData(boolean isAbsolutePath, String filePath, Map<String, List<ExcelHead>> heads) {
		if (!(filePath.endsWith(".xls") || filePath.endsWith(".xlsx")))
			return null;
		Workbook wb = null;
		InputStream inp = null;
		boolean flag = filePath.endsWith(".xls") ? true : false;
		Map<String, List<List<Object>>> result = new LinkedHashMap<String, List<List<Object>>>();
		try {
			inp = isAbsolutePath ? new FileInputStream(new File(filePath)) : Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(filePath);
			if (flag) {
				wb = new HSSFWorkbook(new POIFSFileSystem(inp));
			} else {
				wb = new XSSFWorkbook(inp);
			}
			FormulaEvaluator eval = wb.getCreationHelper().createFormulaEvaluator();

			// for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			for (int i = 0; i < 1; i++) {
				Sheet sheet = wb.getSheetAt(i);
				if (sheet == null)
					continue;
				if (sheet.getPhysicalNumberOfRows() <= 3)
					continue;

				List<ExcelHead> head = heads.get(sheet.getSheetName());
				
				List<Integer> columns = Lists.newArrayList();
				for (ExcelHead h : head) {
					columns.add(h.getColumn());
				}
				int idColumn = columns.get(0);
				
				Map<String, List<Object>> rows = new LinkedHashMap<String, List<Object>>();
				int strat = sheet.getFirstRowNum() + 3;
				int end = sheet.getLastRowNum();
				for (int j = strat; j <= end; j++) {
					Row row = sheet.getRow(j);
					if (row == null)
						continue;
					List<Object> cells = Lists.newArrayList();
					String id = "";
					for (int k = 0; k < getColumnsNum(row); k++) {
						if (!columns.contains(k)) {
							continue;
						}
						Cell cell = row.getCell(k);
						try {
							String str = GPoiUtils.getStringValue(eval, cell).trim();
							if (k == 0 && (str == null || str.equals("")))
								break;
							if (k == idColumn) {
								id = str;
							}
							cells.add(str);
						} catch (Exception e) {
							ExcelHead eh = head.get(k);
							if (!eh.desc.equals("") && !eh.title.equals("") && !eh.type.equals("")) {
								log.error("发生错误的表：" + filePath + "  " + (j + 1) + "行    " + k + "列", e);
							}
							cells.add("");
						}
					}
					if (cells.size() > 0 && !"".equals(id)) {
						if (rows.containsKey(id)) {
							IllegalStateException e = new IllegalStateException("ID重复的表：" + filePath + " id=" + id);
							log.error("ID重复的表：" + filePath + " id=" + id, e);
							throw e;
						}
						rows.put(id, cells);
					}
				}
				result.put(sheet.getSheetName(), new ArrayList<List<Object>>(rows.values()));
			}
			eval.clearAllCachedResultValues();
			inp.close();
		} catch (IOException e1) {
			log.error("解析表数据错误", e1);
		}
		return result;
	}

	/**
	 * 构建一个对应excel模板的 java数据结构
	 * 
	 * @param filePath
	 *            文件名
	 * @param clazz
	 *            类模板
	 * @return 对应excel模板的 java数据结构
	 * @throws Exception
	 */
	public static <T extends IExcelBean> Map<String, T> buildExcelDataMap(String filePath, Class<?> clazz) throws Exception {
		String[] allClassName = clazz.getName().split("\\.");
		String className = allClassName.length == 1 ? allClassName[0] : allClassName[allClassName.length - 1];
		String resFilePath = filePath.substring(0, filePath.lastIndexOf(".")) + ".res";
		InputStream inBuff = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(resFilePath);
		Map<String, T> sheetMap = new LinkedHashMap<String, T>();
		if (inBuff == null) {
			inBuff = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(filePath);
			inBuff.close();
			Map<String, List<ExcelHead>> heads = getExcelBeans(false, filePath);
			List<ExcelHead> cols = heads.get(className);
			List<List<Object>> rows = getExcelData(false, filePath, heads).get(className);
			if (rows != null && rows.size() > 0) {
				for (int i = 0; i < rows.size(); i++) {
					T bean = (T) clazz.newInstance();
					List<Object> row = rows.get(i);
					ByteArrayInputStream bais = new ByteArrayInputStream(buildByteArray(cols, row, className));
					DataInputStream dis = new DataInputStream(bais);
					bean.read(dis);
					dis.close();
					bais.close();
					if (sheetMap.containsKey(bean.getId())) {
						log.error(filePath + "ID重复,请策划检查!id=" + bean.getId(), new IllegalStateException(filePath + "ID重复,请策划检查!id=" + bean.getId()));
					}
					sheetMap.put(bean.getId(), bean);
				}
			}
		} else {
			byte[] datas = FileUtil.readFile(inBuff);
			ByteArrayInputStream bais = new ByteArrayInputStream(datas);
			DataInputStream dis = new DataInputStream(bais);
			int len = dis.readShort();
			for (int i = 0; i < len; i++) {
				T bean = (T) clazz.newInstance();
				bean.read(dis);
				if (sheetMap.containsKey(bean.getId())) {
					log.error(filePath + "ID重复,请策划检查!id=" + bean.getId(), new IllegalStateException(filePath + "ID重复,请策划检查!id=" + bean.getId()));
				}
				sheetMap.put(bean.getId(), bean);
			}
			if (dis.available() != 0) {
				log.error("解析" + resFilePath + "文件时，还有剩余数据，字节数不对!!");
			}
			inBuff.close();
		}
		return sheetMap;
	}

	public static String buildExcelMD5(String filePath) throws Exception {
		String resFilePath = filePath.substring(0, filePath.lastIndexOf(".")) + ".res";
		InputStream inBuff = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(resFilePath);
		String result = "";
		if (inBuff == null) {
			inBuff = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(filePath);
		}
		result = MD5.getStreamHash(inBuff);
		inBuff.close();
		return result;
	}

	public static <T extends IExcelBean> Map<String, T> updateExcelData(String filePath, Class<?> clazz, Map<String, T> oldDatas) throws Exception {
		String[] allClassName = clazz.getName().split("\\.");
		String className = allClassName.length == 1 ? allClassName[0] : allClassName[allClassName.length - 1];
		String resFilePath = filePath.substring(0, filePath.lastIndexOf(".")) + ".res";
		InputStream inBuff = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(resFilePath);
		Map<String, T> addedMap = new LinkedHashMap<String, T>();
		if (inBuff == null) {
			inBuff = Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(filePath);
			inBuff.close();

			Map<String, List<ExcelHead>> heads = getExcelBeans(false, filePath);
			List<ExcelHead> cols = heads.get(className);
			List<List<Object>> rows = getExcelData(false, filePath, heads).get(className);
			if (rows != null && rows.size() > 0) {
				for (int i = 0; i < rows.size(); i++) {
					T bean = (T) clazz.newInstance();
					List<Object> row = rows.get(i);
					ByteArrayInputStream bais = new ByteArrayInputStream(buildByteArray(cols, row, className));
					DataInputStream dis = new DataInputStream(bais);
					bean.read(dis);
					dis.close();
					bais.close();
					if (oldDatas.containsKey(bean.getId())) {
						T oo = oldDatas.get(bean.getId());
						if (!oo.equals(bean)) {
							oldDatas.get(bean.getId()).update(bean);
							addedMap.put(bean.getId(), bean);
						}
					} else {
						oldDatas.put(bean.getId(), bean);
						addedMap.put(bean.getId(), bean);
					}
				}
			}
		} else {
			byte[] datas = FileUtil.readFile(inBuff);
			ByteArrayInputStream bais = new ByteArrayInputStream(datas);
			DataInputStream dis = new DataInputStream(bais);
			int len = dis.readShort();
			for (int i = 0; i < len; i++) {
				T bean = (T) clazz.newInstance();
				bean.read(dis);
				dis.close();
				bais.close();
				if (oldDatas.containsKey(bean.getId())) {
					T oo = oldDatas.get(bean.getId());
					if (!oo.equals(bean)) {
						oldDatas.get(bean.getId()).update(bean);
						addedMap.put(bean.getId(), bean);
					}
				} else {
					oldDatas.put(bean.getId(), bean);
					addedMap.put(bean.getId(), bean);
				}
			}
			if (dis.available() != 0) {
				log.error("解析" + resFilePath + "文件时，还有剩余数据，字节数不对!!");
			}
			inBuff.close();
		}
		return addedMap.size() > 0 ? addedMap : null;
	}

	/**
	 * 构建一个 和对应excel行数据顺序一样的 有序字节数组
	 * 
	 * @param cols
	 *            所有列数据
	 * @param row
	 *            行数据
	 * @param className
	 *            类名
	 * @return 对应excel行数据顺序一样的 有序字节数组
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static byte[] buildByteArray(List<ExcelHead> cols, List<Object> row, String className) throws NumberFormatException, IOException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);

		for (int i = 0; i < cols.size(); i++) {

			ExcelHead bean = cols.get(i);

			// 如果前三行的单元格有空字符串或者空值则忽略
			if ((bean.desc == null || bean.desc.equals("")) || (bean.title == null || bean.title.equals("")) || (bean.type == null || bean.type.equals(""))) {
				continue;
			}

			try {
				writeData(dos, bean, i >= row.size() ? "" : row.get(i).toString());
			} catch (Exception e) {
				log.error("\n页签名:" + className + "\n注释:" + bean.desc + "\n名称:" + bean.title + "\n类型:" + bean.type + "\n值:" + row.get(i).toString(), e);
			}
		}
		byte[] b = baos.toByteArray();
		dos.flush();
		dos.close();
		baos.flush();
		baos.close();

		return b;
	}

	/**
	 * 构建一个 和对应excel行数据顺序一样的 有序字节数组
	 * 
	 * @param cols
	 *            所有列数据
	 * @param rows
	 *            所有行数据
	 * @param className
	 *            类名
	 * @return 对应excel中的一个sheet所有行数据 有序字节数组集合 行与行之间 以 字符串(yes|no)分割 如遇到no则代表
	 *         不在有下一元素
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static byte[] buildByteArrayByAllRow(List<ExcelHead> cols, List<List<Object>> rows, String className) throws NumberFormatException, IOException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		DataOutputStream bos = new DataOutputStream(baos);

		int len = rows.size();
		bos.writeShort(len);
		for (int i = 0; i < len; i++) {

			byte[] buff = buildByteArray(cols, rows.get(i), className);

			baos.write(buff);

		}
		byte[] result = baos.toByteArray();
		bos.flush();
		bos.close();
		baos.flush();
		baos.close();
		return result;
	}

	/**
	 * 将数据写入到 数据流中
	 * 
	 * @param dos
	 *            数据流
	 * @param type
	 *            数据类型
	 * @param value
	 *            值
	 * @throws NumberFormatException
	 *             转换格式异常
	 * @throws IOException
	 *             磁盘异常
	 */
	public static void writeData(DataOutputStream dos, ExcelHead bean, String value) throws NumberFormatException, IOException {
		String type = bean.type;
		if (type.equals("byte")) {

			byte temp = value == null || value.equals("") ? 0 : (byte) parseInt(value, true);

			dos.writeByte(temp);
		} else if (type.equals("short")) {

			short temp = value == null || value.equals("") ? 0 : (short) parseInt(value, true);

			dos.writeShort(temp);
		} else if (type.equals("int")) {

			int temp = value == null || value.equals("") ? 0 : parseInt(value, true);
			dos.writeInt(temp);
		} else if (type.equals("long")) {

			long temp = value == null || value.equals("") ? 0 : Long.parseLong(value);
			long v = temp;
			dos.writeInt((int) (v / 100000000));
			dos.writeInt((int) (v % 100000000));
		} else if (type.equals("float")) {

			float temp = value == null || value.equals("") ? 0 : Float.parseFloat(value);

			dos.writeFloat(temp);
		} else if (type.equals("double")) {
			double temp = value == null || value.equals("") ? 0 : Double.parseDouble(value);
			dos.writeDouble(temp);
		} else if (type.equals("boolean")) {

			boolean temp = value == null || value.equals("") ? false : (value.equals("1") || value.equalsIgnoreCase("true"));

			dos.writeBoolean(temp);
		} else if (type.toUpperCase().equals("STRING")) {
			String temp = value == null || value.equals("") ? "" : value;
			dos.writeUTF(temp);
		} else if (type.equals("byte[]")) {

			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeByte(Byte.parseByte(temps[i]));
				}
			}
		} else if (type.equals("short[]")) {

			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeShort(Short.parseShort(temps[i]));
				}
			}

		} else if (type.equals("int[]")) {
			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeInt(Integer.parseInt(temps[i]));
				}
			}
		} else if (type.equals("long[]")) {
			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					long v = Long.parseLong(temps[i]);
					dos.writeInt((int) (v / 100000000));
					dos.writeInt((int) (v % 100000000));
				}
			}
		} else if (type.equals("float[]")) {
			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeFloat(Float.parseFloat(temps[i]));
				}
			}
		} else if (type.equals("double[]")) {
			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeDouble(Double.parseDouble(temps[i]));
				}
			}
		} else if (type.equals("boolean[]")) {
			if (value == null || value.equals("")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeBoolean(Boolean.parseBoolean(temps[i]));
				}
			}
		} else if (type.toUpperCase().equals("STRING[]")) {
			if (value == null || value.equals("") || value.equals("0")) {
				dos.writeShort(0);
			} else {
				String[] temps = getStringArrayForExcel(bean.desc, value);
				dos.writeShort(temps.length);
				for (int i = 0; i < temps.length; i++) {
					dos.writeUTF(temps[i]);
				}
			}
		}
	}

	/**
	 * 获取分隔符
	 * 
	 * @param titleDesc
	 *            表头描述
	 * @return
	 */
	public static String[] getStringArrayForExcel(String titleDesc, String value) {

		titleDesc = titleDesc.replace("；", ";").replace("，", ",");
		value = value.replace("；", ";").replace("，", ",");

		String mark = null;
		if (titleDesc.indexOf(";") != -1) {
			mark = ";";
		} else if (titleDesc.indexOf(",") != -1) {
			mark = ",";
		}

		String[] result = null;
		boolean isHaveF = value.indexOf(";") != -1;
		// 有分号
		if (isHaveF) {
			result = value.split(";");
		}
		// 没有分号
		else {
			// 先判断title中是否有分号
			if (titleDesc.indexOf(";") != -1) {
				result = value.split(";");
			}
			// title中也没有分号，说明是以逗号作为分隔
			else {
				result = value.split(",");
			}
		}
		if (result == null) {
			result = new String[] { value };
		}
		return result;
	}

	private static int parseInt(String s, boolean isforce) throws NumberFormatException {
		if (!isforce) {
			return Integer.parseInt(s, 10);
		}
		if (s == null) {
			throw new NumberFormatException("null");
		}
		if (s.equals("")) {
			throw new NumberFormatException("\"\"");
		}
		int index = s.indexOf(".");
		int isadd = 0;
		if (s.indexOf(".") != -1 && index > 0) {
			if (index < s.length() - 1) {
				int t = Integer.parseInt(s.substring(index + 1, index + 2));
				isadd = t > 4 ? 1 : 0;
			}
			s = s.substring(0, index);
		}
		return Integer.parseInt(s, 10) + isadd;
	}
}
