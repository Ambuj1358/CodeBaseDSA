package alpha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
	
	//function to reverse Syring word by word
	public static String reverse(String str) {
		
		str=str.trim();
		
		Stack<String> st=new Stack<String>();
		String[] str2=str.split(" ");
		
		for(int i=0;  i<str2.length;  i++) {
			st.push(str2[i]);
		}
		
		String str3="";
		
		while(!st.isEmpty()) {
			str3+=st.pop() + " ";
		}
		
		
		
		
		
		return str3;
	}
	
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	   String str=sc.nextLine();
	   
	   System.out.println(reverse(str));
	   
	 }
		
}


