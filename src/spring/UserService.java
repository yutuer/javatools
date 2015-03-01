package spring;

public class UserService {
	private static UserDao userDao = SpringContextUtil.<UserDao> getBean(UserDao.class.getSimpleName());

	public void addUser(User... users) {
		for (User u : users) {
			userDao.addUser(u);
			if (1 == 1) {
				throw new RuntimeException("111");
			}
		}
	}

}
