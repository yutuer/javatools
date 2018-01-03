package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TraceHandler implements InvocationHandler{

	private static final Logger logger = LoggerFactory.getLogger(TraceHandler.class);
	
	private Object target;
	
	public TraceHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		logger.info("before invoke");
		Object ret = method.invoke(target, args);
		logger.info("after invoke");
		return ret;
	}

}
