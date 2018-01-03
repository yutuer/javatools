package swingTest;

import java.util.Map;

import com.google.common.collect.Maps;

public class SwingEnv {
	
	private static Map<String, String> countrys;
	
	
	public static Map<String, String> getCountry(){
		if(countrys == null){
			countrys = Maps.newHashMap();
			
			countrys.put("hengda", "china");
			countrys.put("chelsea", "england");
			countrys.put("Real Madrid", "spain");
			countrys.put("Barcelona", "spain");
			countrys.put("paris", "french");
			countrys.put("man city", "england");
			countrys.put("man united", "england");
			countrys.put("milan", "italy");
			countrys.put("inter milan", "italy");
		}
		return countrys;
	}
	
}
