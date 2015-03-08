package parseExcel;

import java.util.HashMap;
import java.util.Map;

public class MyNumberHashMap<K, V extends Number> extends HashMap<K, Number> {
	private static final long serialVersionUID = -4586285812385217705L;

    public MyNumberHashMap() {
    	super();
    }
    
    public MyNumberHashMap(int initialCapacity) {
    	super(initialCapacity);
    }
    
    public MyNumberHashMap(int initialCapacity, float loadFactor) {
    	super(initialCapacity, loadFactor);
    }
    
    public MyNumberHashMap(Map<K,Number> m) {
    	super(m);
    }
	
	public Number get(Object key) {
        if(super.containsKey(key)){
        	return super.get(key);
        }
		return (Number) new Integer(0);
    }
	
	public Number put(K key,Number value){
		if((value instanceof Byte)
				|| (value instanceof Short)
				|| (value instanceof Integer)
				|| (value instanceof Float)
				|| (value instanceof Long)
				|| (value instanceof Double)){
			return super.put(key, value);
		}
		return super.put(key, (Number)Double.valueOf(value.toString()));
	}
}