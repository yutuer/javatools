package asm;

public class D implements A{
	
	@Override
	public void a() {
		System.out.println("in inner A, classLoader:" + this.getClass().getClassLoader());
	}
	
}
