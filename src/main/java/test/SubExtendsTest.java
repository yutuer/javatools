package test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SubExtendsTest {

	private static class Base {
		
		public Base() {
			System.out.println("in Base Construct");
			subM();
		}

		public void subM() {

		}

		public Map doStuff(HashMap map) {
			System.out.println("in Base");
			return map;
		}
	}

	private static class Sub extends Base {
		
		private int i;
		//这种调用其实很危险, 因为不允许this类有多余的属性, 如果有,那么window调用的时候, this还没初始化完毕
		private Window window = new Window(this); 

		public Sub() {
			this.i = 10;
			System.out.println("in Sub Construct");
		}

		public void SI() {
			System.out.println("in Sub i:" + i);
		}

		@Override
		public void subM() {
			System.out.println(window);
		}

		public HashMap doStuff(Map map) {
			System.out.println("in Sub");
			return new HashMap<>();
		}
	}

	private static class Window {

		private Sub sub;

		public Window(Sub sub) {
			this.sub = sub;
			System.out.println("in window " + sub.i);
			sub.SI();
			
		}

		@Override
		public String toString() {
			return "Window [i=" + sub.i + "]";
		}

	}

	public static void main(String[] args) {
		Base b = new Sub();
		// b.doStuff(new HashMap<>());
		
		
		Date date = new Date(1510629952266L);
		System.out.println(date);
		
		System.out.println(432000 / 3600 /24);
	}

}
