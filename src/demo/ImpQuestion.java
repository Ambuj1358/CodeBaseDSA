package demo;

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImpQuestion {

	public static void main(String[] args) {

		// QUE-5

	
	      String str="Hellllllllllllo";
	      char c='l';
	      int count=0; 
	      for(int i=0;i<str.length(); i++) { 
	    	  if(c==str.charAt(i)) { 
	    		  count++; 
	    		  } 
	     	  }
		    System.out.println(count);
		

		//String str = "Hello";

		// Arrays.asList(str.toCharArray()).stream().filter(n->Collections.frequency(Arrays.asList(str.toCharArray()),))

		// Que->4(done)

		// 4(a)

		// a) 1,2,3,4,5,7,8,9,10,find missing number in integer list

		/*
		 * List<Integer> list=Arrays.asList(1,2,3,4,5,7,8,9,10);
		 * 
		 * for(int i=1; i<10; i++) { if(list.contains(i)) { continue; } else {
		 * System.out.println(i + " "); } }
		 */

		// 4(b)
		/*
		 * List<Integer> list1=Arrays.asList(2,4,6,10,12,14,16,18,20);
		 * 
		 * for(int i=1; i<=10; i++) { if(list1.contains(2*i)) { continue; } else {
		 * System.out.println(2*i + " "); } }
		 */
		// 4(c)
		/*
		 * List<Integer> list2=Arrays.asList(1,3,5,9,11,13,15,17);
		 * 
		 * for(int i=1; i<=9; i++) { if(list2.contains(2*i-1)) { continue; } else {
		 * System.out.println(2*i-1 + " "); } }
		 */

		// Que->3 (done with all possible methods known to me)

		// reverse a given string. i/p="Capgemini"

		// There are 4 methods to reverse a string,we are going to see all possible
		// methods

		// pure logic method->method 1

		/*
		 * String str="Capgemini";
		 * 
		 * String rev="";
		 * 
		 * for(int i=str.length()-1; i>=0; i--) { rev =rev+ str.charAt(i); }
		 * System.out.println(rev);
		 */

		// Using StringBuilder -method 2
		/*
		 * String str="Capgemini"; String rev=new
		 * StringBuilder(str).reverse().toString(); System.out.println(rev);
		 */

		// using Stream api- method 3

		/*
		 * String str="Capgemini";
		 * 
		 * String rev=Stream.of(str).map(n->new
		 * StringBuilder(n).reverse()).collect(Collectors.joining());
		 * System.out.println(rev);
		 */

		// using stack data structure ->method 4

		/*
		 * String str="Capgemini";
		 * 
		 * Stack<Character> st=new Stack<>();
		 * 
		 * for(int i=0; i<str.length(); i++) { st.push(str.charAt(i)); }
		 * 
		 * 
		 * String rev="";
		 * 
		 * for(int i=0; i<str.length(); i++) { rev= rev +st.pop(); }
		 * System.out.println(rev);
		 */

		// QUE->1(DONE)
		/*
		 * for(int i=1; i<=10; i++) { System.out.println("Hello world " + i); }
		 */
		// QUE->2(done with all the possible methods i know)

		// IF THERE is no duplicates
		/*
		 * int[] arr= {2,8,4,1,9};
		 * 
		 * Arrays.sort(arr); for(Integer i:arr) { System.out.print(i + " "); }
		 * System.out.println(); int n=arr.length; System.out.println(arr[n-3]);
		 */

		// If there may be duplicates
		/*
		 * List<int[]> list =new ArrayList<>();
		 * list=Arrays.asList(arr).stream().sorted().distinct().collect(Collectors.
		 * toList()); // Object[] arr2 =list.toArray();
		 * 
		 * //Absolute method->hard coding int array[]= {1,9,3,8,5,3,9,2,9,3}; int
		 * largest=Integer.MIN_VALUE; int secondLargest=Integer.MIN_VALUE; int
		 * thirdLargest=Integer.MIN_VALUE;
		 * 
		 * for(int i=0; i<array.length; i++) { if(array[i]>largest) {
		 * thirdLargest=secondLargest; secondLargest=largest; largest=array[i]; }
		 * 
		 * if(array[i]>secondLargest && array[i]!=largest) { thirdLargest=secondLargest;
		 * secondLargest=array[i]; }
		 * 
		 * if(array[i]>thirdLargest && array[i]!=largest && array[i] !=secondLargest) {
		 * thirdLargest=array[i]; } } System.out.println("ThirdLargest number is :" +
		 * thirdLargest );
		 */

//	 for(int i=0;  i<list.size();  i++) {
//		 System.out.println(list[size-3]);
//	 }

//	  for(int i=0;  i<arr2.length;  i++) {
//			  System.out.println(arr2[i]);
//	  }
	}

}
