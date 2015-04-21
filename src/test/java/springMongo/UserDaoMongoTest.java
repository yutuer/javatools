package springMongo;

import mongo.MyService;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoMongoTest {

	private ApplicationContext app;
	@Autowired
	private MyService myService;

	@Before
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		myService = (MyService) app.getBean("UserService");
	}

	@Test
	public void test_1_doWork() {
		myService.doWork();
	}
}
