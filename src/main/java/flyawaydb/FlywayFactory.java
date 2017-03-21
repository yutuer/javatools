package flyawaydb;

public class FlywayFactory {

	public static FlywayDb getFlywayDb(String propLocation) {
		Prop prop = new Prop(propLocation);
		String name = prop.getProperty("name", new RuntimeException("can't find name"));
		String driverClassName = prop.getProperty("driverClassName", "com.mysql.jdbc.Driver");
		String url = prop.getProperty("url", new RuntimeException("can't find url"));
		String userName = prop.getProperty("userName", "root");
		String password = prop.getProperty("password", "");
		String isClean = prop.getProperty("isClean", "false");
		String isRun = prop.getProperty("isRun", "true");
		String isPlaceHolder = prop.getProperty("isPlaceHolder", "false");
		String locations = prop.getProperty("locations", new RuntimeException("can't find locations"));

		FlywayDb flywayDb = new FlywayDb(name, Boolean.parseBoolean(isPlaceHolder), locations.split(";"));
		flywayDb.setClean(Boolean.parseBoolean(isClean));
		flywayDb.setRun(Boolean.parseBoolean(isRun));

		flywayDb.setDriverClassName(driverClassName).setUrl(url).setUsername(userName).setPassword(password);

		return flywayDb;
	}
}
