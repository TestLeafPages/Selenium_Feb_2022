package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollections {
/**
 * Collection - Interface
 * Collections - Class
 * Single Dimensional - List, Set
 * Two Dimensional - Map
 * 
 * Single Dimensional Collection
 * List - Dynamic Array - Interface
 * ArrayList - Class
 * List obj = new ArrayList();
 * Properties
 * -> List maintains the insertion order
 * -> List allows duplicates
 * 
 * Set - Dynamic - Interface
 * HashSet - Random output
 * TreeSet - Provides an ordered/sorted output
 * LinkedHashSet - maintain the insertion order
 * Properties
 * -> Set allows only Uniques values
 * -> Set may/may not maintain the insertion order dep on imp class
 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Subash");
		list.add("Fahed");
		list.add("Ganesh");
		list.add("Suresh");
		list.add("Yamini");
		list.add("Ganesh");	// Add
		list.add(2, "Karthick"); // Insert
		list.set(4, "Reshma"); // Replace
		list.remove("Ganesh"); // Remove
		
		
		System.out.println(list.size());
		System.out.println(list);
		/*
		 * Collections.sort(list); System.out.println(list);
		 */
		Collections.reverse(list);
		System.out.println(list);
		/*
		 * String name = list.get(0); for(String eachElement : list) {
		 * System.out.println(eachElement); } boolean contains = list.contains("Fahed");
		 * list.clear(); list.isEmpty();
		 */
		
	}
}
