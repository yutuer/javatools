package test;

public class AssignFromTest {
	public static void main(String[] args) {
		System.out.println(Man.class.isAssignableFrom(Parent.class));
		System.out.println(Parent.class.isAssignableFrom(Son.class));
		System.out.println(Man.class.isAssignableFrom(Son.class));
	}
}

interface Man{}
class Parent implements Man{}
class Son extends Parent{}