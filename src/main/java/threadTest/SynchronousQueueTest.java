package threadTest;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueTest {
	public static void main(String[] args) throws InterruptedException {
		SynchronousQueue<Long> synchronousQueue = new SynchronousQueue<>();
		boolean offer1 = synchronousQueue.offer(1L);
		System.out.println(offer1);
		synchronousQueue.offer(1L, 2, TimeUnit.HOURS);
		
	}
}
