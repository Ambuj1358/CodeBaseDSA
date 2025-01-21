package sigma.Hashing;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<String , Integer> tm=new TreeMap<>();
		
		tm.put("india", 100);
		tm.put("usa", 50);
		tm.put("china", 200);
		tm.put("nepal", 60);
		
		System.out.println(tm);
	}

}
