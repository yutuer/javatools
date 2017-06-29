package asm.print;

public class T {
	
	public static void main(String[] args) throws Exception {
		ClassLoader cl = new ByteClassLoader_loadClass();
		Class<?> c = cl.loadClass("asm.C");
		Object o = c.newInstance();
		c.getDeclaredMethod("a", null).invoke(o, null);
		c.getDeclaredMethod("b", null).invoke(o, null);
		c.getDeclaredMethod("c", null).invoke(o, null);
	}
}
