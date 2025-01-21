package alpha;

import java.util.Stack;

public class PracticeProblem {
	
	//function for reversing a String
	public static String reverse(String str) {
		Stack<Character> st=new Stack<>();
		String rev="";
		
		for(int i=0;  i<str.length();  i++) {
			st.push(str.charAt(i));
		}
		
		while(!st.isEmpty()) {
			rev+=st.pop();
		}
		
		return rev;
	}
	
	
	//Customised Function for reversing a String
	public static String reverse2(String str) {
		
		String str1=str.trim();
		String[] arr=str1.split(" ");
		String rev="";
		
		for(int i=0;  i<str.length();  i++) {
			arr[i]=reverse(arr[i].trim());
			rev+=arr[i];
		}
		
		
		
		return rev;
	}
	
	public static void main(String[] args) {
		
		String str="   Ambuj is a   good     boy   ";
		reverse2(str);
		
	}

}
