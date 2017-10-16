package asm.print;

public class T {
	
	public static void main(String[] args) throws Exception {
		ClassLoader cl = new ByteClassLoader_loadClass();
		Class<?> cls_c = cl.loadClass("asm.C");
		Object c_obj = cls_c.newInstance();
		cls_c.getDeclaredMethod("a").invoke(c_obj);

		Class<?> cls_d = cl.loadClass("asm.D");
		Object d_obj = cls_d.newInstance();
		Class<?> cls_a = cl.loadClass("asm.A");
		// 试试接口强转,这里A是App加载的, d 是ByteClassLoader加载的
		cls_a.cast(d_obj); 
		
		Class<?>[] interfaces = d_obj.getClass().getInterfaces();
		for(Class<?> inter: interfaces){ 
			//asm.A loaded by asm.print.ByteClassLoader_loadClass
			System.out.println(inter.getName() + " loaded by " + inter.getClassLoader());
		}
		
		cls_c.getDeclaredMethod("b", cls_a).invoke(c_obj, d_obj);
		cls_c.getDeclaredMethod("c").invoke(c_obj);
		
		//此classLoader是被系统类加载器加载的  AppClassLoader
		System.out.println(ByteClassLoader_loadClass.class.getClassLoader());
	}
}
