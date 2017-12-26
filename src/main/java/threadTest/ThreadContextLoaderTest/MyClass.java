package threadTest.ThreadContextLoaderTest;

import com.google.common.primitives.UnsignedBytes;

public class MyClass {

    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;
    
	public static void main(String[] args) {
		{
			String binaryString = Integer.toBinaryString(CAPACITY);
			System.out.println(aa(binaryString));
		}
		{
			String binaryString = Integer.toBinaryString(RUNNING);
			System.out.println(aa(binaryString));
		}
	}
	private static String aa(String binaryString) {
		StringBuilder sb = new StringBuilder(binaryString);
		while(sb.length() < Integer.SIZE){
			 sb.insert(0, "0");
		}
		int index = 0;
		int nextInsertPos = 4;
		while(index++ < sb.length()){
			if(index == nextInsertPos){
				sb.insert(nextInsertPos, " ");
				nextInsertPos += 5;
			}
		}
		return sb.toString();
	}
}
