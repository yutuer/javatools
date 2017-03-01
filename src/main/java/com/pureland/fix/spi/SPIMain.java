package com.pureland.fix.spi;

import java.util.ServiceLoader;

public class SPIMain {
	public static void main(String[] args) {
		ServiceLoader<IHelloInterface> loaders = ServiceLoader.load(IHelloInterface.class);

		for (IHelloInterface in : loaders) {
			in.sayHello();
		}
	}
}
