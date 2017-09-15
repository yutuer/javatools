package asm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import asm.print.AsmSeq;

public class C extends B implements A{
	
	private static Logger log = LoggerFactory.getLogger(C.class.getSimpleName());
	
	private int i = 1;
	
	private static String s;
	
	public void m() throws Exception{
		Thread.sleep(100);
	}
	
	public void a(){
		log.info("success in C.a, classLoader:{}", this.getClass().getClassLoader());
	}
	
	public void b(A a) {
		log.info("success in C.b, classLoader:{}", a.getClass().getClassLoader());
	}
	
	public void c(){
		AsmSeq d = new AsmSeq();
		log.info("success in C.c, classLoader:{}", d.getClass().getClassLoader());
	}
}
