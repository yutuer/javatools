package spring_redis;

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

	public void addUserNoTranction(int count) {
		for (int i = 0; i < count; i++) {
			userDao.addUserNoTranction();
		}
	}

	public void testPipeline() {
		userDao.pipelineSample();
	}

	public void normalRead() {
		userDao.normalRead();
	}

	public void addUserInTranction(int count) {
		userDao.addUserInTranction(count);
	}

	public void addGuildName() {
		userDao.addGuildName();
	}

	public boolean findGuildByName(String guildName) {
		return userDao.findGuildByName(guildName);
	}

	public void getThenSetInTraction() {
		userDao.getThenSetInTraction();
	}

	public void execScript() {
//		userDao.addTemp();
		userDao.execScript();
	}

	public void a() {
//		userDao.sessionZAdd();
//		userDao.sessionZRank();
		userDao.redisZAdd();
		userDao.redisZRank();
	}
}
