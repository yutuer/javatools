package spring;

public class UserService {
	private static UserDao userDao = SpringContextUtil.<UserDao> getBean(UserDao.class.getSimpleName());

	public void addUser(User... users) {
		for (User u : users) {
			userDao.addUser(u);
		}
	}

	public User getUser(final long id) {
		return userDao.getUser(id);
	}

	public void testSpeed(int count) {
		for (int i = 0; i < count; i++) {
			userDao.addRandomUser();
			userDao.getUser(i);
		}
	}

	public void testPipeline() {
		userDao.pipelineSample();
	}

	public void normalRead() {
		userDao.normalRead();
	}
}
