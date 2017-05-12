package asm.print;

import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.spi.LocationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import asm.A;

import com.google.common.collect.Maps;

public class AsmSeq {

	private static Logger log = LoggerFactory.getLogger(AsmSeq.class.getSimpleName());
	static Map<String, Class<?>> map = Maps.newHashMap();

	public static void main(String[] args) throws Exception {
		// log.info("begin");

		new MyLogger().print();

		// 10秒替换一次类
		new ScheduledThreadPoolExecutor(1).scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					map.put("aaa", new ByteClassLoader_loadClass().loadClass("asm.C"));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}, 0, 10, TimeUnit.SECONDS);

		// 2秒执行一次逻辑
		new ScheduledThreadPoolExecutor(1).scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					Class<?> newCls_C = map.get("aaa");
					Object reflectNewC = newCls_C.newInstance();
					A a1 = A.class.cast(reflectNewC);
					a1.a();
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}, 1, 2, TimeUnit.SECONDS);

	}
}
