package chap15;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet / JSP");
		set.add("JAVA");
		set.add("iBATIS");

		
		int size = set.size();
		System.out.println("Total number of object: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println("\t"+element);}
		}
	
	set.remove("JDBC");
	set.remove("iBARIS");
	
	System.out.println("Total number of entry: "+set.size());
	
	for(String element : set) {
		System.out.println("\t"+element);}
	}
		

	}
	}

}
