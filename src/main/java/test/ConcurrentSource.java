package test;

import java.util.Map;

import com.google.common.collect.Maps;

public class ConcurrentSource {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = Maps.newConcurrentMap();
		map.put(1, 10);
		map.put(1, 21);
		
		map.values();
		
		map.put(3, 32);
		System.out.println(map.values()	);
		
		int limit = -Integer.MAX_VALUE;
		System.out.println(limit);
		Integer i1 = Integer.parseInt("1");
		Integer i2 = Integer.parseInt("1");
		System.out.println(i1==i2);

		Integer i3 = Integer.parseInt("1111");
		Integer i4 = Integer.parseInt("1111");
		System.out.println(i3==i4);
		
	}
}

