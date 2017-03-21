package flyawaydb;

import org.apache.commons.dbcp.BasicDataSource;
import org.flywaydb.core.Flyway;

public class FlywayDb implements IFlywayDb {

	private final Flyway flyway;

	private final String name;

	private final BasicDataSource ds;

	private boolean isRun = true;
	private boolean isClean = true;

	public FlywayDb(String name, boolean isPlaceHolder, String... locations) {
		super();
		this.name = name;
		flyway = new Flyway();
		flyway.setPlaceholderReplacement(isPlaceHolder);
		flyway.setLocations(locations);
		ds = new BasicDataSource();
		flyway.setDataSource(ds);
	}

	public FlywayDb setUrl(String url) {
		ds.setUrl(url);
		return this;
	}

	public FlywayDb setDriverClassName(String dirverClassName) {
		ds.setDriverClassName(dirverClassName);
		return this;
	}

	public FlywayDb setUsername(String userName) {
		ds.setUsername(userName);
		return this;
	}

	public FlywayDb setPassword(String password) {
		ds.setPassword(password);
		return this;
	}

	public void migrate() {
		clean();
		if (isRun) {
			flyway.migrate();
			printSplit();
		}
	}

	public void clean() {
		if(isClean){
			flyway.clean();
		}		
	}

	public String getName() {
		return name;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	public void setRun(boolean isRun) {
		this.isRun = isRun;
	}

	public void printSplit() {
		System.out.println("-----------------------------------我是分隔符---------------------------------");
	}
}
