package swingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.google.common.collect.Lists;

public class C {
	
	public List<Integer> compare(List<Integer> list){
		if(CollectionUtils.isEmpty(list)){
			return list;
		}
		
		if(list.size() == 1){
			return list;
		}

		int first = 0;
		List<Integer> less = Lists.newArrayList();
		List<Integer> more = Lists.newArrayList();
		
		for (int i = 0; i < list.size(); i++) {
			Integer value = list.get(i);
			if(i == 0){
				first = value;
			}
			
			if(value > first){
				more.add(value);
			}else if(value < first){
				less.add(value);
			}
		}
		
		return join(compare(less), first, compare(more));
	}
	
	private List<Integer> join(List<Integer> less, int first, List<Integer> more){
		List<Integer> ret = Lists.newArrayList();
		ret.addAll(less);
		ret.add(first);
		ret.addAll(more);
		return ret;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = Lists.newArrayList();
		for(int i= 1; i<= 20; i++){
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
		
		List<Integer> compare = new C().compare(list);
		System.out.println(compare);
	}
}


