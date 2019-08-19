package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", 1); // auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get("two"); // auto unboxing
		System.out.println(i);
		
		map.put("three", 333);
		System.out.println(map.get("three"));
		
		// 순회
		Set<String> s = map.keySet();
		for(String key : s) {
			int value = map.get(key);
			System.out.println(value);
		}
		
		
	}
	
}
