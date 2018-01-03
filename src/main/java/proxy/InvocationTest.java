package proxy;

import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvocationTest {
	
	private static final Logger logger = LoggerFactory.getLogger(InvocationTest.class);
	
	public static void main(String[] args) throws Exception {
		HasInterface i = new HasInterface(1);
		Class<?>[] interfaces = i.getClass().getInterfaces();
		Object proxy = Proxy.newProxyInstance(null, interfaces, new TraceHandler(i));
		logger.info(String.format("%b", proxy == i)); // 不是同一个类
		
		Comparable<HasInterface> c = Comparable.class.cast(proxy); //可以强转 ,并且可以调用接口方法
		c.compareTo(new HasInterface(2));

		Proxy p = Proxy.class.cast(proxy); //所有代理类都是Proxy的子类
		logger.info(String.format("proxy.getClass():%s,  %b", proxy.getClass(), Proxy.isProxyClass(proxy.getClass())));
		
		i = HasInterface.class.cast(proxy); //不能强转成具体类, 因为类型不符合
		i.test();
		
		//没有实现接口的类呢?
		NoInterface no = new NoInterface();
		no.test();
		
		interfaces = no.getClass().getInterfaces();
		proxy = Proxy.newProxyInstance(null, interfaces, new TraceHandler(no));
		logger.info(String.format("%b", no == proxy)); // 没有接口不行, 转换的时候会报错, 并且代理类并没有这个方法
		proxy.getClass().getMethod("test", null).invoke(proxy, null);
	}
}
