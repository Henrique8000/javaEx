package application;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		//System.out.println(set.contains("Notebook"));
		
		//set.remove("Tablet");
		
		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
