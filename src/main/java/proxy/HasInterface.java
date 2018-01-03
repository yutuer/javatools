package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HasInterface implements Comparable<HasInterface>{
	
	private static final Logger logger = LoggerFactory.getLogger(HasInterface.class);
	
	private final int i;

	public HasInterface(int i) {
		super();
		this.i = i;
	}

	public void test(){
		logger.info(String.valueOf(i));
	}
	
	@Override
	public int compareTo(HasInterface o) {
		return i - o.i;
	}

}
