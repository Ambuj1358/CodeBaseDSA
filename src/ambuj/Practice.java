package ambuj;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
	
	//function to reverse String
	public static String reverse(String str) {
		String rev="";
		for(int i=0;  i<str.length();  i++) {
			rev=str.charAt(i) + rev;
		}
		//time->O(N) AND SPACE->o(n)
		
		return rev;
	}
	
	//function to reverse String 2nd method
	public static String reverse2(String str) {
		
		return new StringBuilder(str).reverse().toString();
//		String str2=new StringBuilder(str).reverse().toString();
//		
//		return str2;
	}
	
	//function to reverse String 3rd method
	public static String reverse3(String str) {
		Stack<Character> st=new Stack<>();
		
	    for(int i=0;  i<str.length();  i++) {
	    	st.add(str.charAt(i));
	    }
	    
	    String str2="";
	    while(!st.isEmpty()) {
	    	str2+=st.add(st.pop());
	    }
	    
	    return str2;
	}
	
	//using Stream api->>reverse String
	public static String reverse4(String str) {
		
		return IntStream.range(0,str.length()).mapToObj(i->str.charAt(str.length()-1-i)).map(String::valueOf)
				.collect(Collectors.joining());
	}
	
	//Q2->>function to find the average of array element whose last digit is 4
	public static int average(int[] arr) {
		int sum=0;
		int n=arr.length;
		int count=0;
		
		for(int i=0;  i<n;  i++) {
			if(arr[i]%10==4) {//if last digit is 4
				sum+=arr[i];
				count++;
				
			}
		}
		
		return sum/count;
	}
	
	//Q3->>Add special character after every char in string but inside string only
	public static String addString(String str) {
		String str2="";
		int n=str.length();
		
		for(int i=0;  i<n-1;  i++) {
			if(i%2!=0) {//if index is not even
				str2+=Character.toUpperCase(str.charAt(i)) + "$";
				
			} else {
				str2+=str.charAt(i) + "$";
			}
			
		}
		
		return str2 + str.charAt(n-1);
	}
	
	//Q4->>Function to count alphabet counts
	public static int counts(String str) {
		int count=0;
		for(int i=0;  i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		
		String str=" Hello world is beutiful";
		System.out.println(counts(str));
		
//		String str="welcome";
//		System.out.println(addString(str));
		
//		int arr[]= {111,114,214,314,222,333};
//		System.out.println(average(arr));
		
//		System.out.println(reverse("Ambuj"));
//		System.out.println(reverse2("ambuj"));
//		System.out.println(reverse("ambuj"));
//		System.out.println(reverse("ambuj"));
		
	}

}
