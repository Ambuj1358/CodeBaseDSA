package basics;
import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		//javadoc comment key short-> ctrl + shift +/
		
		TreeMap<Integer,String> tmap=new TreeMap<>();
		Map<Integer,String> hmap=new HashMap<>();
		hmap.put(23, "ram");
		hmap.put(67, "ravan");
		hmap.put(3, "ramayan");
		hmap.put(41, "ram");
		hmap.put(0, "raman");
		System.out.println(hmap.entrySet());
		
		tmap.put(2, "ambuj");
		//if you put same key with diff value then treeMap will take updated value,
		//no same key,can't have more than one same key
		tmap.put(2, "ambuj1");
		tmap.put(9, "verma");
		tmap.put(67, "rohan");
		tmap.put(0, "shyam");
		System.out.println(tmap);
		
		//This method will remove all the mappings of treeMap
		/*
		 * tmap.clear(); System.out.println(tmap);
		 */
		//This method copies all hashmap data to treemap
		tmap.putAll(hmap);
		System.out.println(tmap);
		//check if key is present or not-> true if present
		//System.out.println(tmap.containsKey(0));
		
		//check the key for corresponding given value present or not->return true if present
		//System.out.println(tmap.containsValue("ravanam"));
		
		
		//show the map data in set format
		System.out.println(tmap.entrySet());
		
		
		//get the first sorted key
		System.out.println(tmap.firstKey());
		
		
		//return the value corresponding to given key
		System.out.println(tmap.get(9));
		
		
		//return key in set format
		System.out.println(tmap.keySet());
		
		//return the last key
		System.out.println(tmap.lastKey());
		
		//remove the given key and it's corresponding values
		/*
		 * tmap.remove(67); System.out.println(tmap);
		 */
		
		//returns size of map
		System.out.println(tmap.size());
		
		
		//return values in collection format
		System.out.println(tmap.values());
		
		TreeMap<Integer, String> cloneTmap=(TreeMap<Integer, String>) tmap.clone();
		System.out.println(cloneTmap);
		
	} 

}
