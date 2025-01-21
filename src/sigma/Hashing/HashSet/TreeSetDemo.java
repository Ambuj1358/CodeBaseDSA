package sigma.Hashing.HashSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>(Comparator.reverseOrder());
		
		ts.add(10);
		ts.add(10);
		ts.add(100);
		ts.add(9);
		ts.add(1);
		
		System.out.println(ts);//no duplicates and descending order
		
		//Iterating on element using Iterator interface
		Iterator i=ts.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
			
		}
		System.out.println();
		
		//iterating using enhanced for loop(forEach loop)
		
		for(int it: ts) {
			System.out.print(it + " ");
		}
		
	}

}
