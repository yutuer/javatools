package flyawaydb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class Prop implements Iterable<String>{

	private final Properties prop;

	public Prop(String propLocation){
		prop = new Properties();
		try {
			InputStream is = getClass().getClassLoader().getResourceAsStream(propLocation);
			prop.load(is);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Prop(Properties prop) {
		super();
		if (prop == null) {
			throw new RuntimeException("can't find prop");
		}
		this.prop = prop;
	}


	public String getProperty(String key) {
		return prop.getProperty(key);
	}

	public String getProperty(String key, String defaultValue) {
		return prop.getProperty(key, defaultValue);
	}

	public String getProperty(String key, RuntimeException re) {
		String ret = prop.getProperty(key);
		if (ret == null) {
			throw re;
		}
		return ret;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iter();
	}
	
	private class Iter implements Iterator<String>{

		private Enumeration<Object> emu = prop.keys();
		
		public Iter() {
			super();
		}

		@Override
		public boolean hasNext() {
			return emu.hasMoreElements();
		}

		@Override
		public String next() {
			return emu.nextElement().toString();
		}
		
	}
}
