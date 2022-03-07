package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {
/**
 * Map - two dimensional Collection
 * <Key,Value> - Entry
 * Map - 2 Dimensional Values - Interface
 * HashMap - Random output based on Key
 * TreeMap - Order the key value and give ordered output
 * LinkedHashMap - maintain the insertion order
 * Map allows only Unique key - Key -> Set
 * Map allows duplicate values - value -> List
 * Map may/may not maintain the insertion order based on the imp class
 * 
 */
	
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10001, "Surya");
		map.put(10002, "Ramya");
		map.put(10005, "Hema");
		map.put(10003, "Ganesh");
		map.put(10004, "Hema");
		map.put(10002, "Mirunalini");
		System.out.println(map);
		boolean containsKey = map.containsKey(10001);
		boolean containsValue = map.containsValue("Hema");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		System.out.println("*****************************");
		map.remove("");
		Set<Integer> keySet = map.keySet();
		for (Integer eachKey : keySet) {
			System.out.println(eachKey +"->"+map.get(eachKey));
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
