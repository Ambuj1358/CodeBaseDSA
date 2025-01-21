package sigma.Hashing.HashSet;

import java.util.HashSet;

public class HashSetDemo {
	
	/*
	 * Important points about set
	 * ->> no duplicates allowed   (only unique key)
	 * ->>unordered
	 * ->>Null is allowed   (but single one only as no duplicates allowed)
	 * ->>HashSet internally uses HashMap  to implement itself
	 */
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		//fun ->>add(key),contains(key), remove(key),size(),isEmpty(),clear()
		set.add(1);
		set.add(6);
		set.add(2);
		set.add(1);
		set.add(2);
		
		
		
		System.out.println(set);
		
		set.remove(2);
		System.out.println(set);
		
		System.out.println();
		
		System.out.println(set.contains(2));
		
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		
		
	}

}
