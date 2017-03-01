package com.pureland.fix.spi;

public class MyHello implements IHelloInterface {
	@Override
	public void sayHello() {
		System.out.println("My Hello");
	}
}
