package sigma.Hashing.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		//insertion order will be maintained
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		
		lhs.add(5);
		lhs.add(1);
		lhs.add(10);
		lhs.add(100);
		lhs.add(91);
		lhs.add(5);//no duplicates will be added again by default implementation in LinkedHshMap, only random value will update
		
		System.out.println(lhs);
		
		
		
		//Iteration over lhs using Iterator interface
		Iterator i=lhs.iterator();
		
		while(i.hasNext()) {//if next element is present
			System.out.print(i.next() + " ");
			
		}
		System.out.println();
		//Iteration over lhs using enhanced for loop(forEach loop)
		for(int it: lhs) {
			System.out.print(it + " ");
		}
		
	}

}
