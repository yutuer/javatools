package com.pureland.fix.spi;

public class TextHello implements IHelloInterface {
	@Override
	public void sayHello() {
		System.out.println("Text Hello.");
	}
}
