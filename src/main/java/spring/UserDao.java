package spring;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class UserDao {
	private StringRedisTemplate redisTemplate = (StringRedisTemplate) SpringContextUtil.getBean("jedisTemplate");

	public void addUser(final User user) {
		SessionCallback<User> sessionCallback_write = new SessionCallback<User>() {
			@Override
			public User execute(RedisOperations operations) throws DataAccessException {
				String key = "user:" + user.getId();
				ValueOperations<String, User> oper = operations.opsForValue();
				oper.set(key, user);
				return user;
			}
		};
		redisTemplate.execute(sessionCallback_write);
	}

	public User getUser(final long id) {
		SessionCallback<User> sessionCallback_read = new SessionCallback<User>() {
			@Override
			public User execute(RedisOperations operations) throws DataAccessException {
				String key = "user:" + id;
				ValueOperations<String, User> oper = operations.opsForValue();
				User u = oper.get(key);
				return u;
			}
		};
		User u = (User) redisTemplate.execute(sessionCallback_read);
		return u;
	}

	public void pipelineSample() {
		// pipeline
		RedisCallback<Object> pipelineCallback = new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.openPipeline();
				StringRedisConnection src = (StringRedisConnection) connection;
				for (int i = 0; i < UserDaoTest.COUNT; i++) {
					src.get("user:" + i);
				}
				return null;
			}
		};
		List<Object> results = (List<Object>) redisTemplate.executePipelined(pipelineCallback);
		for (Object item : results) {
			if (item instanceof User) {
				User u = (User) item;
			}
		}
	}

	public void addUserNoTranction() {
		User u = new User("11", 100);
		addUser(u);
	}

	public void normalRead() {
		for (int i = 0; i < UserDaoTest.COUNT; i++) {
			User u = getUser(i);
		}
	}

	public void addUserInTranction(final int count) {
		SessionCallback<List<User>> sessionCallback_write = new SessionCallback<List<User>>() {
			@Override
			public List<User> execute(RedisOperations operations) throws DataAccessException {
				operations.multi();
				for (int i = 0; i < count; i++) {
					User user = new User("11", 10);
					String key = "user:" + user.getId();
					ValueOperations<String, User> oper = operations.opsForValue();
					oper.set(key, user);
				}
				return operations.exec();
			}
		};
		redisTemplate.execute(sessionCallback_write);
	}

}
