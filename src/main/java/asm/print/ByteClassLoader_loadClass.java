package asm.print;

import java.io.IOException;
import java.net.URL;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class ByteClassLoader_loadClass extends ClassLoader {

	public ByteClassLoader_loadClass() {
		this(ClassLoader.getSystemClassLoader().getParent());
	}

	public ByteClassLoader_loadClass(ClassLoader parent) {
		super(parent);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		ClassReader classReader;
		try {
			if (name.startsWith("org.apache.log4j") || name.equals("asm.A")) {
				return ClassLoader.getSystemClassLoader().loadClass(name);
			}
			classReader = new ClassReader(name);
			ClassWriter classWriter = new ClassWriter(0);

			classReader.accept(classWriter, 0);
			byte[] byteArray = classWriter.toByteArray();
			return defineClass(name, byteArray, 0, byteArray.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected URL findResource(String name) {
		return ClassLoader.getSystemResource(name);
	}

}
