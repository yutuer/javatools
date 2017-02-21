package threadTest;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import io.netty.util.concurrent.DefaultThreadFactory;

public class ScheduledThreadPoolTest {
	
	/**
	 * 结论:scheduleWithFixedDelay的调用是等待制的,
	 */
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor scheduleCheckThread = new ScheduledThreadPoolExecutor(2,
				new DefaultThreadFactory("Champion-Check-Thread-Group")) {
			private ThreadLocal<Long> tl = new ThreadLocal<>();

			@Override
			protected void beforeExecute(Thread t, Runnable r) {
				System.out.println(t.getName() + ", beforeExecute..");
				tl.set(System.currentTimeMillis());
			}

			@Override
			protected void afterExecute(Runnable r, Throwable t) {
				long diff = System.currentTimeMillis() - tl.get();
				System.out.println(Thread.currentThread().getName() + ", afterExecute.., diff:" + diff);
			}
		};
		
		String name1 = "r1:";
		Runnable r1  = new Runnable() {
			private String name = name1;
			@Override
			public void run() {
				for(int i = 0; i< 10000000; i++){
					if(i % 1000000 == 0){
						System.out.println(name + i);
					}
				}
			}
		};
		String name2 = "r2:";
		Runnable r2  = new Runnable() {
			private String name = name2;
			@Override
			public void run() {
				for(int i = 0; i< 10000000; i++){
					if(i % 1000000 == 0){
						System.out.println(name + i);
					}
				}
			}
		};
		
		scheduleCheckThread.scheduleWithFixedDelay(r1, 0, 3, TimeUnit.MILLISECONDS);
		scheduleCheckThread.scheduleWithFixedDelay(r2, 0, 3, TimeUnit.MILLISECONDS);
		
	}
}
