package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("Application.xml");
		UserService userService = SpringContextUtil.<UserService> getBean(UserService.class.getSimpleName());
		long beginTime = System.nanoTime();
		userService.testSpeed(100000);
		long endTime = System.nanoTime();
		System.out.println((endTime - beginTime) / 1000 / 1000 / 1000.0);

	}
}
