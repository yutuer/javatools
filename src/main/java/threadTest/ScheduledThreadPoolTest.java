package threadTest;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import io.netty.util.concurrent.DefaultThreadFactory;

public class ScheduledThreadPoolTest {

	/**
	 * 结论:scheduleWithFixedDelay的调用是等待制的,
	 */
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor scheduleCheckThread = new ScheduledThreadPoolExecutor(2, new DefaultThreadFactory(
				"Champion-Check-Thread-Group")) {
			private ThreadLocal<Long> tl = new ThreadLocal<>();

			@Override
			protected void beforeExecute(Thread t, Runnable r) {
				long now = System.currentTimeMillis();
				System.out.println(t.getName() + ", beforeExecute... time:" + now);
				tl.set(now);
			}

			@Override
			protected void afterExecute(Runnable r, Throwable t) {
				long now = System.currentTimeMillis();
				long diff = now - tl.get();
				System.out.println(Thread.currentThread().getName() + ", afterExecute.., diff:" + diff);
			}
		};

		String name1 = "r1:";
		Runnable r1 = new Runnable() {
			private String name = name1;

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println(name + 1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		String name2 = "r2:";
		Runnable r2 = new Runnable() {
			private String name = name2;

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println(name + 2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		scheduleCheckThread.scheduleWithFixedDelay(r1, 0, 2, TimeUnit.SECONDS);
		scheduleCheckThread.scheduleWithFixedDelay(r2, 0, 2, TimeUnit.SECONDS);

	}
}
