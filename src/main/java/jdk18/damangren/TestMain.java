package jdk18.damangren;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		String[] a = new String[] { "\\|", "&" };
		List<String> l = Arrays.asList("\\|", "&"); // asList返回的是不可修改的list(Arrays.ArrayList),没有override
													// remove方法, 所以不能执行remove操作

		Comparator<Apple> comparing = Comparator.comparing(Apple::getWeight);

		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i > 0).distinct().skip(1).forEach(System.out::println);
	}
}
