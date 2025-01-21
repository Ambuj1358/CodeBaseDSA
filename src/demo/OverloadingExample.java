package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Assignment{
	public int multiply(int a, int b) {
		return a*b;
	}
	public int multiply(int a, int b, int c) {
		return a*b*c;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
}

public class OverloadingExample {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int sum=0;
		
		for(int i=0;  i<str.length();  i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
		
		/*
		 * String string = "today is july 15th"; int sum = 0;
		 * 
		 * for (int i = 0; i < string.length(); i++) { if
		 * (Character.isDigit(string.charAt(i))) { sum +=
		 * Integer.parseInt(String.valueOf(string.charAt(i))); } }
		 */

        System.out.println(sum);
		
		//Reversing a String using stream api
		/*
		 * String revStr=Stream.of(str).map(s->new
		 * StringBuilder(s).reverse()).collect(Collectors.joining());
		 * System.out.println(revStr);
		 */
		
		
//		String str = "Hello, world!";
//		
//		String[] arr=str.split("");
//       Arrays.asList(arr).stream().sorted(Comparator.reverseOrder()).for(e->System.out.println(e));

         //Reverse the string using the Stream API
			/*
			 * String reversedStr = Stream.of(str.split(""))
			 * .sorted(Collections.reverseOrder()) .collect(Collectors.joining());
			 * 
			 * System.out.println(reversedStr);
			 */
//		Assignment a=new Assignment();
//		int res=a.multiply(23,45);
//		int res1=a.multiply(23,45,2);
//		
//		System.out.println(res);
//		System.out.println(res1);
		
	}

}
