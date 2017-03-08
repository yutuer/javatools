package threadTest;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class VolatileTest {

	private volatile int i;

	private Executor exec = Executors.newSingleThreadExecutor();

	private ScheduledExecutorService ses = new ScheduledThreadPoolExecutor(2);

	public static void main(String[] args) {
		final VolatileTest t = new VolatileTest();
		Runnable r  = new Runnable() {
			@Override
			public void run() {
				t.i++;
				t.exec.execute(new Runnable() {
					@Override
					public void run() {
						System.out.println(t.i);
					}
				});
			}
		};
		t.ses.scheduleWithFixedDelay(r, 10, 100, TimeUnit.MILLISECONDS);
		t.ses.scheduleWithFixedDelay(r, 15, 100, TimeUnit.MILLISECONDS);
	}
}
