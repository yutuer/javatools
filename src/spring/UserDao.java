package spring;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.ValueOperations;

public class UserDao {
	private RedisTemplate redisTemplate = (RedisTemplate) SpringContextUtil.getBean("jedisTemplate");

	public void addUser(final User user) {
		SessionCallback<User> sessionCallback = new SessionCallback<User>() {
			@Override
			public User execute(RedisOperations operations) throws DataAccessException {
				operations.multi();
				String key = "user:" + user.getId();
				ValueOperations<String, String> oper = operations.opsForValue();
				oper.set(org.apache.commons.lang3.StringUtils.join(new String[] { "user", String.valueOf(user.getId()), User.Field.ID.name() },
						SpringContextUtil.SPLITCHAR), String.valueOf(user.getId()));
				oper.set(org.apache.commons.lang3.StringUtils.join(new String[] { "user", String.valueOf(user.getId()), User.Field.NAME.name() },
						SpringContextUtil.SPLITCHAR), String.valueOf(user.getName()));
				oper.set(org.apache.commons.lang3.StringUtils.join(new String[] { "user", String.valueOf(user.getId()), User.Field.AGE.name() },
						SpringContextUtil.SPLITCHAR), String.valueOf(user.getAge()));
				operations.exec();
				return user;
			}
		};
		User u = (User) redisTemplate.execute(sessionCallback);
		System.out.println(u.getName());
	}

}
