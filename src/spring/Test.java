package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Application.xml");
		UserService userService = SpringContextUtil.<UserService> getBean(UserService.class.getSimpleName());
		User user1 = new User(1, "zhangSan", 12);
		User user2 = new User(2, "lisi", 32);
		userService.addUser(user1, user2);
	}
}
