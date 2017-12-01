package zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyZooKeeper implements Watcher{
	
	private static Logger logger = LoggerFactory.getLogger(MyZooKeeper.class);
	
	@Override
	public void process(WatchedEvent arg0) {
		
	}

}
