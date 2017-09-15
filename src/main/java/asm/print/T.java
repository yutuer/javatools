package asm.print;

import asm.A;

public class T {
	
	public static void main(String[] args) throws Exception {
		ClassLoader cl = new ByteClassLoader_loadClass();
		Class<?> cls = cl.loadClass("asm.C");
		Object c_obj = cls.newInstance();
		cls.getDeclaredMethod("a").invoke(c_obj);
		
		Class<?> cls_d = cl.loadClass("asm.D");
		Object d_obj = cls_d.newInstance();
		// 试试接口强转,这里A是App加载的, d 是ByteClassLoader加载的
		A a_cast = A.class.cast(d_obj); 
		
		Class<?>[] interfaces = d_obj.getClass().getInterfaces();
		for(Class<?> inter: interfaces){ 
			//asm.A loaded by asm.print.ByteClassLoader_loadClass
			System.out.println(inter.getName() + " loaded by " + inter.getClassLoader());
		}
		
		Class<?> cls_a = cl.loadClass("asm.A");
		cls.getDeclaredMethod("b", cls_a).invoke(c_obj, d_obj);
		cls.getDeclaredMethod("c").invoke(c_obj);
		
		//此classLoader是被系统类加载器加载的  AppClassLoader
		System.out.println(ByteClassLoader_loadClass.class.getClassLoader());
	}
}
