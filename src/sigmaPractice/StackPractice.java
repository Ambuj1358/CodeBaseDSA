package sigmaPractice;

import java.util.Stack;

public class StackPractice {
	
	//function to put at bottom  of stack
	public static Stack<Integer> pushAtBottom(Stack<Integer> s, int data){
		//we will use recursion here
		//base case
		if(s.isEmpty()) {
			s.push(data);
			return s;  //come out of call stack
		}
		
		//recursion
		int top=s.pop();
		pushAtBottom(s,data);//here stack is diff than prev as one time popo done
		s.push(top);
		
		return s;
		
	}
	//The above problem can also be solved by taking return type void
	
	
	//function to reverse A String using Stack
	public static String reverseString(String str) {
		
		Stack<Character> s=new Stack<>();
		
		for(int i=0;  i<str.length();  i++) {
			s.push(str.charAt(i));
		}
		String rev="";
		
		while(!s.isEmpty()) {
			rev+=s.pop();
		}
		return rev;
	}
	
	//function to reverse Stack(method 1->using stack), t.c->O(N),s.c->O(N)
	public static Stack<Integer> reverseStack(Stack<Integer> s){
		
		Stack<Integer> revStack=new Stack<>();
		
		while(!s.isEmpty()) {
			revStack.push(s.pop());
		}
		
		return revStack;
	}
	
	//function to reverse Stack using recursion(method 2), t.c-O(N),S.C=O(1) CONSTANT SPECE
	public static Stack<Integer> reverseStack2(Stack<Integer> s){
		//base cases
		if(s.isEmpty()) {
			return s;
		}
		
		//recursion
		int top=s.pop();
		reverseStack2(s);//here s is getting changed that leads to recursion
		
		//Stack<Integer> revStack= pushAtBottom(s, top);
		Stack<Integer> revStack=pushAtBottom(s, top);
		
		return revStack;
	}
	
	//Function to reverse String using Stack(optimised)
	public static String revString(String str) {
		Stack<Character> s=new Stack<>();
		
		for(int i=0;  i<str.length();  i++) {
			s.push(str.charAt(i));
		}
		
		StringBuilder sbr=new StringBuilder();
		while(!s.isEmpty()) {
			sbr.append(s.pop());
		}
		
		return sbr.toString();
	}
	//in above code, appending takes O(N) time, and converting sbr to String takes O(M) time 
	//where m is length of string  and n>=m; so O(N)+ O(M)==O(N)
	
	
	//function for stack using Arrays
	
	
	
	public static void main(String[] args) {
		
		String str="Ambuj";
		System.out.println(revString(str));
		
//		Stack<Integer> s=new Stack<>();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
//		
//		Stack<Integer> st=reverseStack2(s);
//		
//		while(!st.isEmpty()) {
//			System.out.println(st.pop());
//		}
		
		
		
//		String str="ambuj kumar is a good boy";
//		System.out.println(str);
		//reverse at spot word
//		String[] arr= str.split(" ");
//		for(int i=0; i<arr.length;  i++) {
//			arr[i]=reverse(arr[i]);
//		}
//		for(int i=0;  i<arr.length;  i++) {
//			System.out.print(arr[i] + " ");
//		}
		//System.out.println(reverse(str) );
		
//		Stack<Integer> s=new Stack<>();
//		s.push(2);
//		s.push(4);
//		s.push(6);
//		while(!s.isEmpty()) {
//			System.out.println(s.pop());
//		}
//		
//		Stack<Integer> st=pushAtBottom(s, 0);
//		while(!s.isEmpty()) {
//			System.out.println(st.pop());
//		}
	}

}
