package test;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadCacheAndMainCache_ThreadPool {

	private int i;
	
	/**
	 * 结论:
	 * 使用线程池的情况下while(true), 运行的runnable中会读取主存.
	 * 这是因为调用execute(Runable r)的时候, 会先执行一个cas操作,会使用 一个volatile 的value来同步一下主存
	 */
	public static void main(String[] args) {
		final ThreadCacheAndMainCache_ThreadPool a = new ThreadCacheAndMainCache_ThreadPool();
		final ThreadCacheAndMainCache_ThreadPool b = new ThreadCacheAndMainCache_ThreadPool();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						TimeUnit.SECONDS.sleep(1);
						if (a.i == 1) {
							a.i = 0;
						} else {
							a.i = 1;
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		ThreadPoolExecutor es = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);
		while(true){
			es.submit(new Runnable() {
				@Override
				public void run() {
					if (a.i == 1) {
//						System.out.println(1);
					}
				}
			});
		}

	}
}
