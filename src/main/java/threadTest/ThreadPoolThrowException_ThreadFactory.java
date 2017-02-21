package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import io.netty.util.concurrent.DefaultThreadFactory;

public class ThreadPoolThrowException_ThreadFactory {

	/**结论:
	 * 使用线程池execute的时候, ThreadFactory 是jdk默认的, 还是netty的DefaultThreadFactory,
	 * 当有异常 RuntimeException, Error, Throwable的时候,都会导致线程池报错, 然后线程销毁
	 * 任务会在新生成的线程里面执行, 看线程nextId自增了就可以知道
	 * 
	 * 
	 * 而使用submit的时候,会吞噬掉异常.而且线程nextId不会自增
	 * 这是因为submit的时候会被封装为FutureTask, 它的run方法里面会catch (Throwable ex),并且FutureTask.setException
	 * 这里一定要区别注意
	 * 
	 * 
	 * TODO 尝试覆盖
	 * beforeExecute(Thread t, Runnable r)
	 * afterExecute(Runnable r, Throwable t)
	 * 
	 * 
	 */
	public static void main(String[] args) {
//		ExecutorService es = Executors.newFixedThreadPool(2);
		ExecutorService es = Executors.newFixedThreadPool(2, new DefaultThreadFactory("testException"));
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				es.submit(new Runnable() {
					@Override
					public void run() {
						System.out.println("exception:" + Thread.currentThread().getName());
						throw new RuntimeException();
//						throw new Error();
//						throw new Error(new Throwable());
					}
				});
			}
			es.execute(new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println("normal:" + Thread.currentThread().getName());
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		es.shutdown();
	}
}
