package test;

import java.util.concurrent.TimeUnit;

public class ThreadCacheAndMainCache_NewThread {

	private int i;

	/**
	 * 结论:
	 * 不用线程池的情况下while(true), 当下面没有同步主存操作的时候, 线程是不会读取主存的, 所以这个时候就永远得不到主存中的值,也就永远也不会正确
	 * 
	 */
	public static void main(String[] args) {
		final ThreadCacheAndMainCache_NewThread a = new ThreadCacheAndMainCache_NewThread();
		final ThreadCacheAndMainCache_NewThread b = new ThreadCacheAndMainCache_NewThread();

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

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					if (a.i == 1) {
						System.out.println(1);
					} 
				}
			}
		}).start();

	}

}
