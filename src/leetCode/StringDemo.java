package leetCode;

import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringDemo {
	
	//function to reverse String using stream api
	public static String reverse(String str) {
		  
	return 	IntStream.range(0, str.length())
		.mapToObj(i->str.charAt(str.length()-1-i))
		.map(String:: valueOf)
		.collect(Collectors.joining());
		
	}
	//function to check a given number is prime or not using Stream api
	public static Boolean isPrime(int n) {
		if(n<=1) return false;
		if(n==2 || n==3) return true;
		
		return IntStream.rangeClosed(2,(int) Math.sqrt(n))
				.noneMatch(i->n%i==0);
	}
	public static void main(String[] args) {
		Integer[] arr=new Integer[] {7,1,4,9,5,1,9};
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;  i<arr.length;  i++) {
			pq.add(arr[i]);
		}
		
		System.out.println(pq.remove());
		
//		
//		String str="Ambuj1234kumar";
//		//add the digit of character
//		int sum=0;
//		
//		for(int i=0;  i<str.length();  i++) {
//			char ch=str.charAt(i);
//			if(Character.isDigit(ch)) {
//			//	sum+=ch-'0';//substract the 0th unicode to get numeric value
//				sum+=Character.getNumericValue(ch);
//				
//			}
//		}
//		
//		System.out.println('a'+1);
		//System.out.println(sum);
		
	//	System.out.println(isPrime(5));
		
		
		
//		String str="Bob. hIt, baLl";
//		
//		System.out.println(str.toLowerCase());
//		str="kumar";
//		
//		System.out.println(str);
		
	}

}
