package threadTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLockConditionTest implements Runnable {

	private static final Lock lock = new ReentrantLock();
	private static final Condition condition = lock.newCondition();

	@Override
	public void run() {
		lock.lock();
		try {
			condition.await();
			//此方法不会抛出InterruptedException异常, 不能被打断
//			condition.awaitUninterruptibly();
			System.out.println("Thread is going on");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ReenterLockConditionTest());
		t.start();

		Thread.sleep(1000L);

		lock.lock();
		try {
			//这里和selector.select,wakeup不同, 这里先调用signal,也不能使下面的await执行
			condition.signal();
		} finally {
			//此处必须释锁, 上面才能放开await()
			lock.unlock();
		}
	}

}
