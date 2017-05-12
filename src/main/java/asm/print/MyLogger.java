package asm.print;

import org.apache.log4j.spi.LocationInfo;

public class MyLogger {
	LocationInfo li = null;

	public MyLogger() {
		super();
		li = new LocationInfo(new Throwable(), MyLogger.class.getName());
	}

	public void print() {
		System.out.println(String.format("[%s.%s:%s]", li.getClassName(), li.getLineNumber(), li.getMethodName()));
	}
}
