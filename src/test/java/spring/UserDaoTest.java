package spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	private ApplicationContext app;
	private UserService userService;

	@Before
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		userService = (UserService) app.getBean("UserService");
	}

	@Test
	public void testSpeed() {
		userService.testSpeed(10);
	}

	@Test
	public void testAdd() {
		User u = new User("1", 2);
		userService.addUser(u);

		User user = userService.getUser(u.getId());
		assert user.getAge() == u.getAge();
	}
}
