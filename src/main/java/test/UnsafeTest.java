package test;

import sun.misc.Unsafe;
import util.MyUtil;

@SuppressWarnings("restriction")
public class UnsafeTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		long intClassAddress = normalize(getUnsafe().getInt(new Integer(0), 4L));
		long strClassAddress = normalize(getUnsafe().getInt("", 4L));
		getUnsafe().putAddress(intClassAddress + 36, strClassAddress);

		Object obj = (new Integer(666));
		String str = (String) obj;
		System.out.println(str);
	}

	public static Unsafe getUnsafe() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		return MyUtil.getUnsafe();
	}

	private static long normalize(int value) {
		if (value >= 0)
			return value;
		return (~0L >>> 32) & value;
	}
}
