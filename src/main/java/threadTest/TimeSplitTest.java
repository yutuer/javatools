package threadTest;

/**
 * cpu 时间片测试
 */
public class TimeSplitTest {

	public static void main(String[] args) {
		new Thread(new R()).start();
		new Thread(new R()).start();
	}
	
	static class R implements Runnable{
		
		@Override
		public void run() {
			int limit = 1000000000;
			for (int i = 0; i < limit; i++) {
				if (i % 1000000 == 0) {
					System.out.println(i);
				}
				if(i == limit-1){
					i = 0;
				}
			}
		}
		
		
	}
}
