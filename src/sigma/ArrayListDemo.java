package sigma;

import java.util.*;

public class ArrayListDemo {
	
	//swapping two numbers in arraylist->O(n)
	public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
		int temp=list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, temp);
		
		System.out.println(list);
		
		
	}
	
	public static void main(String[] args) {
		//only class allowed inside angular bracket like String | Boolean | Float
		//we can not write primitive data type like int , float , boolean
		ArrayList<Integer> list=new ArrayList<>();
		
		//Add->O(1)
		
		
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		Collections.sort(list);//ascending order sorting
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());//descending order sorting
		//this comparator can also be used for object sorting
		System.out.println(list);
		
		//adding element at specified index
		//time complexity->O(n) linear
		
		//list.add(0, 34);
		
		//System.out.println(list);
		
		
		//Get element at given index->O(1)
		
		//int a=list.get(3);
		
		//System.out.println(a);
		
		//Removing an element from arraylist at given index
		//time complexity->O(n) linear
		
//		list.remove(2);
//		System.out.println(list);
		
		
		//set an element in arraylist at given index
		//time complexity ->O(n) linear
//		
//		list.set(2, 9);//this operation deletes element at given index in linear time
//		System.out.println(list);
//		
		//contains opeartion->return true or false
		//time complexity->O(n) linear
		
//		System.out.println(list.contains(4));
//		System.out.println(list.contains(78));
		
		//System.out.println(list);
		
		//size of an ArrayList
		//System.out.println(list.size());
		
		//iterating on arraylist=>O(n)		
//		for(int i=0;  i<list.size();  i++) {
//			System.out.print(list.get(i) + " ");
//		}
//		System.out.println();
		
		//print arraylist element in reverse->O(n)
//		for(int i=list.size()-1;  i>=0;  i--) {
//			System.out.print(list.get(i) + " ");
//			
//		}
		
		//finding maximum element in arraylist
//		int max=Integer.MIN_VALUE;
//		
//		for(int i=0;  i<list.size();  i++) {
////			if(max<list.get(i)) {
////				max=list.get(i);//here we can also use Math.max function
////			}
//			max=Math.max(max, list.get(i));
//			
//		}
//		System.out.println(max);
		
		//finding minimum value in arraylist
//		int min=Integer.MAX_VALUE;
//		for(int i=0;  i<list.size();  i++) {
////			if(min>list.get(i)) {
////				min=list.get(i);
////			}
//			
//			min=Math.min(min, list.get(i));
//		}
//		System.out.println(min);
		
		
		
		//swapping function call
		
		
		//swap(list, 0, 4);
		
		
	}

}
