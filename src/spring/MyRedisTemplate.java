package spring;

import java.util.List;

import org.springframework.data.redis.core.RedisTemplate;

public class MyRedisTemplate extends RedisTemplate {

	private ThreadLocal<Integer> MultiExecLocal = new ThreadLocal<Integer>();

	public int getMultiExecValue() {
		int ret = 0;
		if (MultiExecLocal.get() == null) {
			MultiExecLocal.set(0);
		}
		ret = MultiExecLocal.get();
		return ret;
	}

	public void addMultiExecValue() {
		int value = getMultiExecValue();
		MultiExecLocal.set(value + 1);
	}

	public void subMultiExecValue() {
		int value = getMultiExecValue();
		assert value >= 0;
		MultiExecLocal.set(value - 1);
	}

	@Override
	public void multi() {
		addMultiExecValue();
		if (getMultiExecValue() == 1) {
			super.multi();
		}
	}

	@Override
	public List exec() {
		subMultiExecValue();
		if (getMultiExecValue() == 0) {
			return super.exec();
		}
		return null;
	}

}
