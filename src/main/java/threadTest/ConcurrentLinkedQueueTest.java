package threadTest;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueTest {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Long> concurrentLinkedQueue = new ConcurrentLinkedQueue<Long>();
		concurrentLinkedQueue.offer(1L);
	}
}
