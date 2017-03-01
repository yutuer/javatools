package com.pureland.fix.spi;

public class ImageHello implements IHelloInterface {
	@Override
	public void sayHello() {
		System.out.println("Image Hello");
	}
}
