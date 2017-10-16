package springRedis;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import spring_redis.service.UserService_redis;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDao_RedisTest {

	private ApplicationContext app;
	private UserService_redis userService;

	@BeforeClass
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		userService = (UserService_redis) app.getBean("UserService");
	}

	// @Test
	// public void test_0_addAndReadOnce() {
	// User u = new User("11", 2);
	// userService.addUser(u);
	//
	// User user = userService.getUser(u.getId());
	// assert user.getAge() == u.getAge();
	// }
	//
	// @Test
	// public void test_1_addUserNoTranction() {
	// userService.addUserNoTranction(COUNT);
	// }
	//
	// @Test
	// public void test_2_AddUserInTranction() {
	// userService.addUserInTranction(COUNT);
	// }
	//
	@Test
	public void test_3_PipelineRead() {
		userService.testPipeline();
	}
	//
	// @Test
	// public void test_4_normalRead() {
	// userService.normalRead();
	// }
	//
	// @Test
	// public void test_5_addGuildName() {
	// userService.addGuildName();
	// }
	//
	// @Test
	// public void test_6_findGuildName() {
	// boolean isFind = userService.findGuildByName(String.valueOf(GUILDCOUNT));
	// Assert.assertTrue(!isFind);
	// }

	// @Test
	// public void test_7_a() {
	// userService.a();
	// }

	// @Test
	// public void test_8_execScript() {
	// userService.execScript();
	// }
}
