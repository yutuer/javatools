package flyawaydb;

import org.apache.commons.dbcp.BasicDataSource;
import org.flywaydb.core.Flyway;
import org.junit.Test;

public class FlyAway {
	
	@Test
	public void test(){
		Flyway flyway = new Flyway();
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test2?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true");
		ds.setUsername("root");
		ds.setPassword("");
		
		flyway.setDataSource(ds);
		flyway.migrate();
	}
	
}
