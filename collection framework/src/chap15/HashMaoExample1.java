package chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaoExample1 {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("hwang", 85);
	map.put("chae",90);
	map.put("yeon",80);
	map.put("chaeyeon",95);
	System.out.println("Total number of entry: "+map.size());
	
	System.out.println("\t  chaeyeon : "+map.get("chaeyeon"));
	System.out.println();
	
	Set<String> keySet = map.keySet();
	Iterator<String> KeyIterator = keySet.iterator();
	while(KeyIterator.hasNext()){
		String Key = KeyIterator.next();
		Integer value = map.get(keySet);
		System.out.println("\t"+Key + " : "+value);
	}
	System.out.println();
	
	map.remove("È«±æµ¿");
	System.out.println("ÃÑ Entry ¼ö: "+ map.size());
	
	Set<Map.Entry<String, Integer>>entrySet = map.entrySet();
	Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
	while(entryIterator.hasNext()){
		Map.Entry<String,Integer> entry = entryIterator.next();
		String Key = entry.getKey();
		Integer value = entry.getValue();

		System.out.println("\t"+Key + " : "+value);
	}
	System.out.println();
	
	map.clear();
	System.out.println("Total number of entry: "+map.size());
	
}
}
