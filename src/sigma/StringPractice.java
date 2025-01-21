package sigma;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {
	
	//check for Palindrome (String)
	
	//method 1 for palindrome checking
	public static boolean isPalindrome(String str) {
		for(int i=0;  i<str.length();  i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		
		return true;
	}
	//method 2 for palindrome checking
	public static boolean isPalindrome2(String str) {
		String rev="";
		int n=str.length();
		for(int i=0;  i<n;  i++) {
			rev+= str.charAt(n-1-i);
		}
		
		if(rev.equals(str)) {
			return true;
		}
		return false;
		
	}
	
	//Shortest path finder program
	public static float shortestPath(String path) {
		int n=path.length();
		int x=0, y=0;
		
		for(int i=0; i<n;  i++) {
			char dir=path.charAt(i);
			if(dir=='S') {
				y--;
			}
			if(dir=='N') {
				y++;
			}
			if(dir=='E') {
				x++;
			}
			if(dir=='W') {
				x--;
			}
			
			
		}

		int x2=x*x;
		int y2=y*y;
		
		return  (float)Math.sqrt(x2 + y2);
		
	}
	
	//Substring method
	
	public static String substring(String str,int si, int ei) {
		String substr="";
		
		for(int i=si;  i<ei;  i++) {
			substr+=str.charAt(i);
		}
		return substr;
	}
	
	public static void compare(String fruits[]) {
		String largest=fruits[0];
		
		for(int i=1;  i<fruits.length;  i++) {
			if(largest.compareTo(fruits[i])<0) {
				largest=fruits[i];
			}
		}
		System.out.println(largest);
	}
	
	//Source code for String compression
	
	public static StringBuilder compression(String str) {
		//With string problem solved, try to solve with stringBuilder
		//String newStr="";->O(n) time complexity
		
		StringBuilder sbr=new StringBuilder("");
		
		for(int i=0;  i<str.length();  i++) {
			int count=1;
			
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i + 1)) {
				count++;
				i++;
			}
			
			//newStr+=str.charAt(i);
			sbr.append(str.charAt(i));
			
			if(count>1) {
				//newStr+=count;
				sbr.append(count);
			}
			
			
		}
		
		return sbr;
	}
	
	//function to make a string upper case
	
	public static String upperCase(String str) {
		
		StringBuilder sbr=new StringBuilder("");
		
		char ch=Character.toUpperCase(str.charAt(0));
		sbr.append(ch);
		
		for(int i=1;  i<str.length();  i++) {
			if(str.charAt(i)==' ' && i<str.length()-1) {
				sbr.append(str.charAt(i));
				i++;
				sbr.append(Character.toUpperCase(str.charAt(i)));
			} else {
				sbr.append(str.charAt(i));
			}
		}
		return sbr.toString();
	}
	
	//Assignment questions
	
	//Q1
	
	public static int vowels(String str) {
		int count=0;
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			
			
			if(ch=='a' || ch=='e'  || ch=='i'  || ch=='o' || ch=='u') {
				count++;
			}
		}
		
		return count;
	}
	
	//Anagrams of a String
	
	public static boolean isAnagrams(String str1, String str2) {
		int n1=str1.length();
		int n2=str2.length();
		
		char[] str1Array=str1.toCharArray();
		char[] str2Array=str2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		if(n1!=n2) {
			return false;
		}
		
		boolean result=Arrays.equals(str1Array, str2Array);
		
		
				
				
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		
//		String str1="race";
//		String str2="care";	
//		
		//System.out.println(isAnagrams(str1, str2));
		
		
	//	System.out.println(vowels(str));
//		
//		String str="i am ambuj kumar  ";
//		System.out.println(upperCase(str));
//		Integer count=1;
//		System.out.println(str+count);
		//System.out.println(compression(str));
		
//		String str="hi, i am shradha";
//		
//		String[] arr=str.split(", ");
//		
//		for(int i=0;  i<arr.length;  i++) {
//			//arr[i].charAt(0).toUpperCase();
//		}
//		
//		for(int i=0;  i<arr.length;  i++) {
//			System.out.print(arr[i]);
//		}
		
//		String[] fruits= {"apple","mango","banana"};
//		
//		compare(fruits);
		
//		String largest=fruits[0];
//		
//		for(int i=1;  i<fruits.length;  i++) {
//			if(largest.compareTo(fruits[i])<0) {
//				largest=fruits[i];
//			}
//		}
//		System.out.println(largest);
		
//		String str="Hello world";
//		String str2=str.substring(0,5);
//		System.out.println(str2);
//		
//		System.out.println(substring(str, 0, 5));
		
//		String path="WNEENESENNN";
//		
//		System.out.println(shortestPath(path));
//		String str="alpha";
//		String str2="madam";
//		System.out.println(isPalindrome(str));
//		System.out.println(isPalindrome2(str2));
		
		
	}

}
