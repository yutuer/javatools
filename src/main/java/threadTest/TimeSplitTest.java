package threadTest;

/**
 * cpu 时间片测试
 */
public class TimeSplitTest {

	/**
	 * 1.8 inter Xeon 所有核cpu都等量运行
	 * 
	 * 
	 */
	public static void main(String[] args) {
		new Thread(new R("r1")).start();
		new Thread(new R("r2")).start();
	}
	
	static class R implements Runnable{
		
		String name;
		
		public R(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
			int limit = 1000000000;
			for (int i = 0; i < limit; i++) {
				if (i % 1000000 == 0) {
					System.out.println(name+ ":" + i);
				}
				if(i == limit-1){
					i = 0;
				}
			}
		}
		
		
	}
}
