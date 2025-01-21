package basics;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StringDemo {

	public static void main(String[] args) {
		
		String[] fruits = {"apple", "banana", "cherry"};
        String fruitsString = Arrays.stream(fruits)
            .collect(Collectors.joining(", "));

        System.out.println(fruitsString); 
		
		/*
		 * write a code to find missing number in Integer List Test cases : a)
		 * 1,2,3,4,5,7,8,9,10 b)2,4,6,10,12,14,16,18,20 c)1,3,5,9,11,13,15,17
		 */
		
		//List<Integer> list=Arrays.asList(1,2,3,4,5,7,8,9,10);
		
		
		
		
		/*
		 * int arr[]= {3,5,3,3,9,1,8,1,6,5};
		 * 
		 * Arrays.asList(arr).stream().sorted().distinct().collect(Collectors.to)
		 */
		
		//Stream<Integer>
		/*
		 * List<Integer> list1=List.of(3,46,8,1,2,89,46,9,4,8,3,1,1,3,7);
		 * 
		 * Set<Integer> set=list1.stream().filter(e->Collections.frequency(list1,
		 * e)>1).collect(Collectors.toSet()); System.out.println(set);
		 * 
		 * list1.stream().filter(n->(n>50)).forEach(System.out::println);
		 * 
		 * List<Integer> listEven=new ArrayList<>();
		 */
		//conventional method to find even
		/*
		 * for(Integer i: list1) { if(i%2==0) { listEven.add(i); } }
		 * System.out.println(list1); System.out.println(listEven);
		 * 
		 * List<Integer>
		 * list2=list1.stream().filter(n->n%2==0).collect(Collectors.toList());
		 * System.out.println(list2);
		 */
		//create a list and filter all even numbers
		/*
		 * List.of(3,8,1,9,4,3,7); List<Integer> list=Arrays.asList(3,8,1,9,4,3,7);
		 */
		
		//list.stream().sorted().filter(n->n%2==0).forEach(System.out::println);
		
		/*
		 * List<Integer> list=Arrays.asList(1,2,3,4,5,7,8,9);
		 * 
		 * for(int i=1; i<list.size()-1; i++) { if(list.contains(i)) { continue; } else
		 * { System.out.println(i + " "); } }
		 */
		
		/*
		 * print helloworld 10 times. o/p= Hello world 1 Hello World 2 .... Hello World
		 * 10
		 */
		//que1
//		for(int i=1;  i<=10;  i++) {
//			System.out.println("Hello world " + i);
//		}
		//que2
		//arr={3,3,3,3,3,45,23,45}
		
		
//		List<Integer> list=Arrays.asList(3,3,3,3,3,45,23,45);
//		List<Integer> lis=new ArrayList<>();
//		     lis=list.stream().distinct().sorted().collect(Collectors.toList());
//		   Object[] arr= lis.toArray();
//		   
//		   for(int i=0;  i<arr.length; i++) {
//			   System.out.println(arr[arr.length-3]);
//		   }
//		int n=lis.size();
//		for(int i=0; i<n; i++) {
//			//System.out.println("3rd largest num is : " + );
//		}
		
		//3) reverse a given string. i/p="Capgemini"
		/*
		 * String str="Capgemini"; String rev=Stream.of(str).map(s->new
		 * StringBuilder(s).reverse()).collect(Collectors.joining());
		 * System.out.println(rev);
		 */
		
		
		//startsWith() method belongs to String class
//		List<Integer> list=Arrays.asList(2,9,1,5,9,2,2,8,1,1,90);
//		
//		 System.out.println(list.stream().findFirst());
		
		
		//Print duplicates element from list using stream api
		
//		List<Integer> list=Arrays.asList(2,9,1,5,9,2,2,8,1,1,90);
//		
//		Set<Integer> set=list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet());
//		
//		   System.out.println(set);
		//Sort the element of list using Stream api
		
		/*
		 * List<Integer> list=Arrays.asList(2,9,1,5,90);
		 * 
		 * List<Integer> lis=list.stream().sorted().collect(Collectors.toList());
		 * System.out.println(lis);
		 */
		/*
		 * forEach(System.out::println);
		 * List<Integer> list = Arrays.asList(2,34,678,3); Long totalElements =
		 * list.stream() .collect(Collectors.counting());
		 * 
		 * 
		 * System.out.println(totalElements);
		 * 
		 * List<Integer>
		 * list2=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		 */
	       // System.out.println(list2);
//		String str="helllo world";
//		Stream.of(str).map(s->new StringBuilder(s).reverse()).collect(Collectors.joining()).forEach(System.out::println));
//		
//		
		
		//checking a String  palindrome or not
		
		/*
		 * String str="madam"; //String c=str.charAt(0);
		 * 
		 * String rev=""; //System.out.println(rev+c);
		 * 
		 * for(int i=str.length()-1; i>=0; i--) { rev=rev + str.charAt(i); }
		 * if(rev.equals(str)) { System.out.println("Palindrome"); } else {
		 * System.out.println("not a palindrome"); }
		 */
		
//		 String str="Ambuj";
//		 String s=str.toLowerCase();//ambuj
//		 String s1=str.toUpperCase();
//		 System.out.println(str);
//		 System.out.println(s);
//		 System.out.println(s1);
//		
//		String s="Hello";
//		
//		//String s2=s.toUpperCase() + s.substring(0,1).toLowerCase()+ s.substring(1);
//    
//		String s2=s.toUpperCase();
//		
//		String s3=s2.substring(0, 1).toLowerCase()+ s2.substring(1);
//		
//		System.out.println(s2);
//		System.out.println(s3);
		//"Hello ambuj kumar" -> "kumar Ambuj Hello"
//		String s= "Hello Ambuj Kumar";
//		String arr[]=s.split(" ");
//		int reverseArr[]=new int[arr.length];
//		
//		for(int i=arr.length-1;  i>0;  i--) {
//			
//		}
//		
	}

}
