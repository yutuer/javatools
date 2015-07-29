package com.pureland.fix.spi;

public class MyHello implements HelloInterface {
	@Override
	public void sayHello() {
		System.out.println("My Hello");
	}
}
