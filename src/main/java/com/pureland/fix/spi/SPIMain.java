package com.pureland.fix.spi;

import java.util.ServiceLoader;

public class SPIMain {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				while (true) {
					ServiceLoader<IHelloInterface> loaders = ServiceLoader.load(IHelloInterface.class);
					for (IHelloInterface in : loaders) {
						in.sayHello();
					}

					try {
						Thread.sleep(2000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}
}
