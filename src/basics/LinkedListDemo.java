package basics;
import java.util.*;
public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		
		//Adding element in linkedlist
		list.add(34);
		list.add(45);
		list.add(12);
		list.add(23);
		list.add(0);
		list.add(0);
		System.out.println(list);
		
		
		//Adding element in linkedList at specific index
		list.add(3,67);
		System.out.println(list);
		
		
		//Add elements at first
		list.addFirst(23);
		System.out.println(list);
		
		
		//Add element at last
		list.addLast(32);
		System.out.println(list);
		
		
		//Method for removing/clearing all element from linked list
//		list.clear();
//		System.out.println(list);
		
		LinkedList<Integer> list2=new LinkedList<>();
		list2=(LinkedList<Integer>) list.clone();
		System.out.println(list2);
		
		System.out.println(list.get(2));
		//used to check object is there or not
		System.out.println(list.contains(32));
		
		System.out.println(list.indexOf(32));
		
		list.remove(6);
		
		System.out.println(list);
		System.out.println(list.size());
		
		//clear() is used to clear/remove all data from list
		//list.clear();
		//System.out.println(list);
		//Sorting list
//		Collections.sort(list);
//		System.out.println(list);
	}

}
