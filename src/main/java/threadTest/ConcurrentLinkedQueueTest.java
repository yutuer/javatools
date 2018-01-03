package threadTest;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentLinkedQueueTest {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Long> concurrentLinkedQueue = new ConcurrentLinkedQueue<Long>();
		concurrentLinkedQueue.offer(1L);
		
		LinkedBlockingQueue<Long> linkedBlockingQueue = new LinkedBlockingQueue<Long>();
		
	}
}
