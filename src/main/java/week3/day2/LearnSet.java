package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<>();
	set.add("Subash");
	set.add("Fahed");
	set.add("Ganesh");
	set.add("Suresh");
	set.add("Yamini");
	set.add("Ganesh");	// Add
	System.out.println(set);
//	List<String> list = new ArrayList<String>(set);
	List<String> list = new ArrayList<String>();
    list.addAll(set);
}
}
