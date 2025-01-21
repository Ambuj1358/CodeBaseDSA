package alpha;

import java.util.Arrays;
import java.util.Stack;

public class StringPractice {
	
	//function to reverse a string using stream api
//	public static String reverseStringStream(String str) {
//		
//	}
	
	//function to add integer present in a string
	public static int add(String str) {
		int sum=0;
		
		int n=str.length();
		for(int i=0;  i<n;  i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		
		return sum;
	}
	
	//function for toggling string
	public static String toggle(String str) {
		String togldStr="";
		
		for(int i=0;  i<str.length();  i++) {
			char c=str.charAt(i);
			if(Character.isLowerCase(c)) {
				togldStr+=Character.toUpperCase(c);
			} else if(Character.isUpperCase(c)) {
				togldStr+=Character.toLowerCase(c);
			}
		}
		return togldStr;
	}
	
	//function for toggle word wise
	public static String toggleWordWise(String str) {
		
		String[] arr=str.split(" ");
		
		
		for(int i=0;  i<arr.length;  i++) {
			arr[i]=toggle(arr[i]);
		}
		
		return Arrays.toString(arr);
	}
	
	//function to reverse String using Stack
	public static char[] reverse(char[] s) {
		Stack<Character> st=new Stack<>();
		
		for(int i=0;  i<s.length;  i++) {
			st.push(s[i]);
		}
			
		
		//we know that lenth of array is size of stack->>do we will use this
		for(int i=0;  i<s.length;  i++) {
			s[i]=st.pop();
		}
		
		return s;
		
	}
	//function to check if given String is panagram or not
	public static boolean isPanagram(String str) {
		return str.chars().mapToObj(c->(char)c).filter(c->Character.isLetter(c)).distinct().count()==26;
	}
	
	
	public static void main(String[] args) {
		
		String str="  java is good  java alpha bita";
		System.out.println(str.startsWith("java"));
		
		str.indexOf(0);
		
		//System.out.println(str.contains("java"));
//		System.out.println(str.indexOf("java"));
//		System.out.println(str.lastIndexOf("java"));
		
		
//		String str="abcklmlkhgdgfhjnopqrstuvwxyz";
//		System.out.println(isPanagram(str));
		
		 
		
//		StringBuilder sbr=new StringBuilder();
//		System.out.println(sbr.capacity());
//		char[] s= {'h','e','l','l','o'};
//		
//		s=reverse(s);
//		for(int i=0;  i<s.length;  i++) {
//			System.out.print(s[i] + " ");
//		}
//		
		
		
		//String str="    ambuj     kumar    is good";
		//str.trim
//		String str="mbuj1234";
//		int sum=0;
//		
//		for(int i=0;  i<str.length();  i++) {
//			char ch=str.charAt(i);
//			
//			if(Character.isDigit(ch)) {
//				sum+=(ch-'0');
//			}
//		}
//		System.out.println(sum);
	//	System.out.println(Character.isAlphabetic(97));
		//we have to convert every 1st letter to uppercase
		
//		String[] arr= str.split("\\W+");//split into string array with all possible blank spaces removed
//		
//		for(int i=0;  i<arr.length;  i++) {
//			arr[i]=Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
//		}
//		//arr[i].substring(0,1).toUpperCase()->>retyrns string specified character converted to uppercase letter
//		
//		for(int i=0;  i<arr.length;  i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		
		
//		String str="AAAAambujaajjaabbaa";
//		//str.
//		StringBuilder sbr=new StringBuilder("Ambuj");
//		//sbr.
//		
//		System.out.println(str.contains("buj"));
//		
//		String str2=str.replaceAll("[a-z]", "*");
//		
//		System.out.println(str);
//		System.out.println(str2);
		
		//System.out.println(str.indexOf("a"));
		
//		String str1=new String("kumar").intern();
//		
//		String str2="kumar";
//		
//		System.out.println(str1==str2);
		
//		String str1="Ambuj";
//		String str2=new String("Ambuj");
		
	//	System.out.println(str1==str2);
		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());//same hashcpde as in string hashcode is generated based on string content
//		String str="today is july 15th";
//		
//		System.out.println(toggle(str));
//		System.out.println(toggleWordWise(str));
//		//System.out.println(add(str));
		
	}

}
