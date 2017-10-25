package threadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	
	private Lock lock = new ReentrantLock();	
	
	public static void main(String[] args) {
		new LockTest().start();
	}
	
	private void start(){
		for(int i=1;i<4;i++){
			new Thread(new A(""+i)).start();
		}
	}
	
	private class A implements Runnable{

		private String name;
		
		public A(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
			while(true){
				try {
					System.out.println(name + ":begin lock");
					lock.lock();
					System.out.println(name + ":get lock");
					System.out.println(System.currentTimeMillis());
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
		
	}
}
