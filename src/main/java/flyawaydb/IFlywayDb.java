package flyawaydb;

public interface IFlywayDb {
	
	void clean();
	
	void migrate();
	
}
