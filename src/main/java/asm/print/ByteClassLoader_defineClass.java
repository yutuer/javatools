package asm.print;

public class ByteClassLoader_defineClass extends ClassLoader {

	public ByteClassLoader_defineClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ByteClassLoader_defineClass(ClassLoader parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	public Class<?> defineClass(String name, byte[] b) {
		return super.defineClass(name, b, 0, b.length);
	}

}
