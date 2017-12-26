package threadTest;

import java.util.concurrent.locks.LockSupport;

public class LockSupport01 {
	public static void main(String[] args) {
		Thread01 t = new Thread01();
		t.start();// ******************************2
		System.out.println("unpark–start");
		// 先执行也会释放后面的park
		LockSupport.unpark(t); // ******************************1
		// 下面的再unpark,也不能解锁一个park了, 只有上面的起作用
//		LockSupport.unpark(t); // ******************************2
//		LockSupport.unpark(t); // ******************************3
		System.out.println("unpark–end");
	}
}

class Thread01 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("park—start");
		LockSupport.park(new Object());
		//如果是2个park就解锁不了了
//		LockSupport.park();
		System.out.println("park—end");
	}
}
