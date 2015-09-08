package com.alibaba.dubbo.demo;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:dubbo/consumer.xml" });
		context.start();

		// 参数回调
		CallbackService callbackService = (CallbackService) context.getBean("callbackService");

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (byte i = 1;; i++) {
					callbackService.addListener(new CallbackListener() {
						@Override
						public void changed(byte[] data) {
							System.out.println("callback:" + Arrays.toString(data));
						}
					}, "hanshubo1", new byte[4096 * 2]);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.setDaemon(true);
		t.start();
		System.in.read();
	}
}
