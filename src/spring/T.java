package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class T {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("redis.xml");
		RedisTemplate redisTemplate = (RedisTemplate) ctx.getBean("jedisTemplate");
		ValueOperations<String, User> valueOper = redisTemplate.opsForValue();  
        User suser = new User(1,"zhangsan",12);  
        valueOper.set("user:" + suser.getId(),suser);  
        System.out.println(valueOper.get("user:" + suser.getId()).getName());
	}
}
