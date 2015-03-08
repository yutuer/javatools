package spring;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class UserDaoTest {
	public static final int COUNT = 10;
	private ApplicationContext app;
	private UserService userService;

	@Before
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		userService = (UserService) app.getBean("UserService");
	}

	@Test
	public void test_0_Speed() {
		userService.testSpeed(COUNT);
	}

	@Test
	public void test_1_Add() {
		User u = new User("1", 2);
		userService.addUser(u);

		User user = userService.getUser(u.getId());
		assert user.getAge() == u.getAge();
	}

	@Test
	public void test_2_Pipeline() {
		userService.testPipeline();
	}
	
	@Test
	public void test_3_normalRead(){
		userService.normalRead();
	}
}
