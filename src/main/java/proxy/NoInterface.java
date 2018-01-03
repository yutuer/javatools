package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoInterface {
	
	private static final Logger logger = LoggerFactory.getLogger(NoInterface.class);
		
	private String address = this.toString();
	
	public void test(){
		logger.info(address);
	}
	
}
