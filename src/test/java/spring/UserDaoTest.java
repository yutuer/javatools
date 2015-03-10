package spring;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoTest {
	public static final int COUNT = 10000;
	private ApplicationContext app;
	private UserService userService;

	@Before
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		userService = (UserService) app.getBean("UserService");
	}

	@Test
	public void test_0_addAndReadOnce() {
		User u = new User("11", 2);
		userService.addUser(u);

		User user = userService.getUser(u.getId());
		assert user.getAge() == u.getAge();
	}

	@Test
	public void test_1_addUserNoTranction() {
		userService.addUserNoTranction(COUNT);
	}

	@Test
	public void test_2_AddUserInTranction() {
		userService.addUserInTranction(COUNT);
	}

	@Test
	public void test_3_PipelineRead() {
		userService.testPipeline();
	}

	@Test
	public void test_4_normalRead() {
		userService.normalRead();
	}
}
