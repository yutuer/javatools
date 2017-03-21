package flyawaydb;

import org.flywaydb.core.internal.util.PlaceholderReplacer;

public class FlyAway {

	private static final String TEST_STR = "No ${placeholder} #[left] to ${replace}";

	public static void main(String[] args) {
		Prop prop = new Prop("db/flyway.properties");
		for (String key : prop) {
			FlywayDb flywayDb = FlywayFactory.getFlywayDb(prop.getProperty(key));
			flywayDb.migrate();
		}
	}

//	@Test
	public void test() {
		FlywayDb flywayDb_Dict = new FlywayDb("dict", false, "db/dict");
		flywayDb_Dict.setDriverClassName("com.mysql.jdbc.Driver")
				.setUrl("jdbc:mysql://localhost:3306/dict?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true").setUsername("root").setPassword("");
		flywayDb_Dict.migrate();

		PlaceholderReplacer placeholderReplacer = PlaceholderReplacer.NO_PLACEHOLDERS;
		System.out.println(placeholderReplacer.replacePlaceholders(TEST_STR));
	}

}
