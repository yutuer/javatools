package annotation.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean implements Lifecycle {
	
	private static final Logger logger = LoggerFactory.getLogger(LifeCycleBean.class);
	
	private boolean isRunning;
	
	@Override
	public void start() {
		isRunning = true;
		logger.info(getClass().getName() + ": start()" );
	}

	@Override
	public void stop() {
		isRunning = false;
		logger.info(getClass().getName() + ": stop()" );
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}

}
