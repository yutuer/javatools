package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class T {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("redis.xml");
		RedisTemplate redisTemplate = (RedisTemplate) ctx.getBean("jedisTemplate");
	
	}
}
