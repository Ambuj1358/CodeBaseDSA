package basics;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		//adding elements in arrayList
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(0);
		list.add(3);
		
		
		
		System.out.println(list);
		
		//adding elements at given index without deleting previous elements
		list.add(1, 7);
		System.out.println(list);
		
		//replacing the element of given index with given elements
		list.set(3, 8);
		System.out.println(list);
	
		
		//removing the element from given index
		list.remove(3);
		System.out.println(list);
		
		for(Integer i:list) {
			System.out.print(i + " ");
		}
		System.out.println();
		list.forEach(n->{
			System.out.print(n + " ");
		});
		System.out.println();
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			Integer i=(Integer)it.next();
			System.out.print(i+ " ");
			
		}
		System.out.println();
		ListIterator lit=list.listIterator(list.size());
		
		while(lit.hasPrevious()) {
			Integer i=(Integer)lit.previous();
			System.out.print(i + " ");
		}
		System.out.println();
		
		int i=list.get(1);
		System.out.println(i);
		Collections.sort(list);
		//System.out.println(list);
		
		//method for knowing element is added or not in the list-true/false,
		//it will add element in last as no index given
		System.out.println(list.add(55));
		System.out.println(list);
		
			
		
	}
	
	

}
