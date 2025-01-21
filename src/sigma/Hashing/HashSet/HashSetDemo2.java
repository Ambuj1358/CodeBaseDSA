

package sigma.Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo2 {
	
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("Banglore");
		set.add("Delhi");
		set.add("Patna");
		set.add("Mumbai");
		set.add("Hyderabad");
		
		System.out.println(set);
		
		//iteration on HashSet
		
//		//method1-->>iterator() method--every set has inbuilt iterator method
//		Iterator i=set.iterator();
//		
//		while(i.hasNext()) {//if set has next element present
//			System.out.println(i.next());//print the next element-->>unordered
//		}
//		
//		//method2-enhanced for loop or forEach loop
//		for(String s:set) {//String is datatype of element coming out of loop,s is pointer, storing and printing each element
//			System.out.print(s);
//		}
//		
		//LinkedHashSet-->>maintains insertion order
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add("Banglore");
		lhs.add("Delhi");
		lhs.add("Patna");
		lhs.add("Mumbai");
		lhs.add("Hyderabad");
		
		System.out.println(lhs);//insertion order maintained
		
		//rest all operations are same as hashset
		//LinkedHashSet is ordered using dll(doubly linkedlist), implemented using LinkedHashMap
		
		//TreeSet
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Banglore");
		ts.add("Delhi");
		ts.add("Patna");
		ts.add("Mumbai");
		ts.add("Hyderabad");
		
		System.out.println(ts);
		
		//rest all operations in treeset is same as hashset
		/*
		 * Treeset important points
		 * 1.keys are sorted in ascending order
		 * 2.Null values not allowed(key) as it has to perform comparison always
		 * 3.uses TreeMap to get implemented(Red black tree-->type of self balancing BST)-thta's why for almost all operations takes O(logn) time
		 */
		
	}

}
