package jdk18.damangren;

import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		String[] a = new String[] { "\\|", "&" };
		List<String> l = Arrays.asList(a);
		System.out.println(l);
		l.remove(0);
	}
}
