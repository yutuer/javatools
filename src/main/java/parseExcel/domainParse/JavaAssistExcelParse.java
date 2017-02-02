package parseExcel.domainParse;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtNewMethod;
import javassist.bytecode.ClassFile;
import parseExcel.head.ExcelHead;

public class JavaAssistExcelParse extends AbstractExcelSheetParse {
	
	private String dir;

	public JavaAssistExcelParse(String fileName, String domainClassName, int minColumn, int maxColumn, String dir) {
		super(fileName, domainClassName, minColumn, maxColumn);
		this.dir = dir;
	}

	@Override
	public Class<?> parseModel2Class(Sheet sheet) throws Exception {
		Row row0 = sheet.getRow(sheet.getFirstRowNum());
		Row row1 = sheet.getRow(sheet.getFirstRowNum() + 1);
		Row row2 = sheet.getRow(sheet.getFirstRowNum() + 2);

		ClassPool cp = ClassPool.getDefault();
		CtClass ctClass = cp.makeClass(dir + "." + getDomainClassName());
		ctClass.getClassFile().setMajorVersion(ClassFile.JAVA_7);
		
		CtConstructor ctCon = new CtConstructor(new CtClass[]{}, ctClass);
		ctCon.setBody("{}");
		ctClass.addConstructor(ctCon);
		
		for (int colIx = getMinColumn(); colIx < getMaxColumn(); colIx++) {
			Cell cell0 = row0.getCell(colIx);
			Cell cell1 = row1.getCell(colIx);
			Cell cell2 = row2.getCell(colIx);
			if (cell0 == null || cell1 == null || cell2 == null) {
				continue;
			}
			
			String desc = cell0.getStringCellValue();
			String type = cell1.getStringCellValue();
			String title = cell2.getStringCellValue();
			ExcelHead eh = new ExcelHead(desc, title, type);
//			ExcelHead eh = new ExcelHead(desc, title, "string");
			eh.setColumn(colIx);
			
			// 设置private field
			CtField ctField = new CtField(getTypeString(eh.getType()), eh.getTitle(), ctClass);
			ctField.setModifiers(Modifier.PRIVATE);

//			// 设置name属性的get set方法
			ctClass.addMethod(CtNewMethod.setter(getMethodName("set", eh.getTitle()), ctField));
			ctClass.addMethod(CtNewMethod.getter(getMethodName("get", eh.getTitle()), ctField));
			ctClass.addField(ctField);
		}
		
		System.out.println(ctClass);
		
		Class<?> c = ctClass.toClass();
		
		System.out.println(c.getName());
		
		Object o = Class.forName(c.getName()).newInstance();
		Method m = c.getDeclaredMethod("setId", int.class);
		m.invoke(o, 1);
		
		return c;
	}

}
