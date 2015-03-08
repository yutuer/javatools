package spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	private ApplicationContext app;
	private UserDao userDao;

	@Before
	public void before() throws Exception {
		app = new ClassPathXmlApplicationContext("Application.xml");
		userDao = (UserDao) app.getBean("UserDao");
	}

	@Test
	public void testAdd() {
		User u = new User("1", 2);
		userDao.addUser(u);

		User user = userDao.getUser(u.getId());
		assert user.getAge() == u.getAge();
	}
}
