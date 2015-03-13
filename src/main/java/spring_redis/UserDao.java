package spring_redis;

import java.util.Collections;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

import com.google.common.collect.Lists;

import spring.UserDaoTest;

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
				for (int i = 0; i < UserDaoTest.COUNT; i++) {
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

	public void addGuildName() {
		SessionCallback<List<String>> sessionCallback_write = new SessionCallback<List<String>>() {
			@Override
			public List<String> execute(RedisOperations operations) throws DataAccessException {
				operations.multi();
				for (int i = 0; i < UserDaoTest.GUILDCOUNT; i++) {
					String key = "guildName";
					SetOperations<String, String> oper = operations.opsForSet();
					oper.add(key, "abcdefghijklmn" + String.valueOf(i) + "abcdefghijklmn");
				}
				return operations.exec();
			}
		};
		redisTemplate.execute(sessionCallback_write);
	}

	public boolean findGuildByName(final String guildName) {
		SessionCallback<Boolean> sessionCallBack = new SessionCallback<Boolean>() {
			@Override
			public Boolean execute(RedisOperations operations) throws DataAccessException {
				String key = "guildName";
				SetOperations<String, String> oper = operations.opsForSet();
				return oper.isMember(key, "abcdefghijklmn" + guildName + "abcdefghijklmn");
			}
		};
		return redisTemplate.execute(sessionCallBack);
	}

	public void addTemp() {
		SessionCallback<User> sessionCallBack = new SessionCallback<User>() {
			@Override
			public User execute(RedisOperations operations) throws DataAccessException {
				String key1 = "a";
				String key2 = "b";
				ValueOperations oper = operations.opsForValue();
				byte[] b = redisTemplate.getStringSerializer().serialize("12");
				oper.set(key1, b);
//				oper.set(key2, "222");
				return null;
			}
		};
		redisTemplate.execute(sessionCallBack);
	}

	private RedisScript<Integer> script() {
		DefaultRedisScript<Integer> redisScript = new DefaultRedisScript<Integer>();
		redisScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("scripts/test2.lua")));
		redisScript.setResultType(Integer.class);
		return redisScript;
	}

	public void execScript() {
		RedisScript<Integer> redisScript = script();
		Object o = redisTemplate.execute(redisScript, Lists.newArrayList("a", "b"));
		System.out.println(o);
	}

	public void getThenSetInTraction() {
		SessionCallback<Boolean> sessionCallBack = new SessionCallback<Boolean>() {
			@Override
			public Boolean execute(RedisOperations operations) throws DataAccessException {
				String key = "incr";
				ValueOperations oper = operations.opsForValue();
				Long id = oper.increment(key, 1);
				operations.multi();
				String key2 = "tmp:" + id;
				oper.set(key2, "1");
				operations.exec();
				return true;
			}
		};
		redisTemplate.execute(sessionCallBack);
	}
}
