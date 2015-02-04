package parseExcel;

import java.util.HashMap;
import java.util.Map;

public class MyBooleanHashMap<K> extends HashMap<K, Boolean> {
	private static final long serialVersionUID = -4586285812385217705L;

    public MyBooleanHashMap() {
    	super();
    }
    
    public MyBooleanHashMap(int initialCapacity) {
    	super(initialCapacity);
    }
    
    public MyBooleanHashMap(int initialCapacity, float loadFactor) {
    	super(initialCapacity, loadFactor);
    }
    
    public MyBooleanHashMap(Map<K,Boolean> m) {
    	super(m);
    }
	
	public Boolean get(Object key) {
        if(super.containsKey(key)){
        	return super.get(key);
        }
		return false;
    }
}