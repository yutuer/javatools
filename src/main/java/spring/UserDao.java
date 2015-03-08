package spring;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.ValueOperations;

public class UserDao {
	private RedisTemplate redisTemplate = (RedisTemplate) SpringContextUtil.getBean("jedisTemplate");

	public void addUser(final User user) {
		SessionCallback<User> sessionCallback_write = new SessionCallback<User>() {
			@Override
			public User execute(RedisOperations operations) throws DataAccessException {
				String key = "user::" + user.getId();
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
				String key = "user::" + id;
				ValueOperations<String, User> oper = operations.opsForValue();
				User u = oper.get(key);
				return u;
			}
		};
		User u = (User) redisTemplate.execute(sessionCallback_read);
		return u;
	}

	public void pipelineSample2() {
		final byte[] rawKey = redisTemplate.getKeySerializer().serialize("user_total");
		// pipeline
		RedisCallback<List<Object>> pipelineCallback = new RedisCallback<List<Object>>() {
			@Override
			public List<Object> doInRedis(RedisConnection connection) throws DataAccessException {
				connection.openPipeline();
				connection.incr(rawKey);
				connection.incr(rawKey);
				return connection.closePipeline();
			}

		};
		List<Object> results = (List<Object>) redisTemplate.execute(pipelineCallback);
		for (Object item : results) {
			System.out.println(item.toString());
		}
	}

	public void pipelineSample() {
		final byte[] rawKey = redisTemplate.getKeySerializer().serialize("user_total");
		// pipeline
		RedisCallback<List<Object>> pipelineCallback = new RedisCallback<List<Object>>() {
			@Override
			public List<Object> doInRedis(RedisConnection connection) throws DataAccessException {
				connection.openPipeline();
				connection.incr(rawKey);
				connection.incr(rawKey);
				return connection.closePipeline();
			}

		};
		List<Object> results = (List<Object>) redisTemplate.execute(pipelineCallback);
		for (Object item : results) {
			System.out.println(item.toString());
		}
	}

	public void addRandomUser() {
		User u = new User("11", 100);
		addUser(u);
	}

}
