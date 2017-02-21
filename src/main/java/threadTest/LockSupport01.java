package threadTest;

import java.util.concurrent.locks.LockSupport;

public class LockSupport01 {
	public static void main(String[] args) {
		Thread01 t = new Thread01();
		t.start();// ******************************2
		System.out.println("unpark–start");
		LockSupport.unpark(t); // ******************************1
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
		LockSupport.park();
		System.out.println("park—end");
	}
}
