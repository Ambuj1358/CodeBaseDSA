package sigma;

import java.util.ArrayList;
import java.util.Stack;

import sigmaPractice.StackUsingJCF;

public class StackDemo {
	
	//Stack implementation using ll on other class
	
	
	//Stack implementation using ArrayList
	
//	static class Stack{
//		
//		static ArrayList<Integer> list=new ArrayList<>();
//		
//		
//		//IsEmpty() operation
//		public static boolean isEmpty() {
//			
//			return list.size()==0;
//		}
//		//push() operation->O(1)-time complexity
//		public static void push(int data) {
//			list.add(data);
//		}
//		
//		//pop() operation->O(1)-time complexity
//		//by default pop operation also returns element that has been removed so we will not use void
//		//we will use int return type instead, okay
//		public static int pop() {
//			//if stack is empty
//			if(isEmpty()) {//here IsEmpty called directly as it is method of this class only
//				return -1; //invalid index if stack is empty,then nothing can be removed
//			}
//			int top=list.get(list.size()-1);//last element is top element as stack follows LIFO principle
//			list.remove(list.size()-1);
//			return top;//this element will be removed from top
//		}
//		
//		//peek() operation ->O(1)-time complexity
//		//in this operation we have to only see and return that element (top element) of stack,okay so
//		public static int peek() {
//			if(isEmpty()) {
//				return -1;//if stack empty , nothing can be seen from top
//			}
//			
//			return list.get(list.size()-1);
//			
//		}
//	}
	
	//function for push data at bottom of stack(Asked in amazon, very imp)
	public static void pushAtBottom(Stack<Integer> s, int data) {
		
		//base case
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		//recursion
		pushAtBottom(s, data);//here s is reducing at each step;
		s.push(top);
		
		//idea is first of all I am removing the element from stack at end pushing our desired element
		//then adding element prevoius element according to their previous order
		
	}
	
	//function for reversing a String
	public static String reverseString(String str) {
		Stack<Character> s=new Stack<>();
		
		//using while loop
		int idx=0;//initialisation
		
		while(idx<str.length()) {//condition
			s.push(str.charAt(idx));
			idx++;//upgradation
		}
		
//		for(int i=0; i<str.length(); i++) {
//			s.push(str.charAt(i));
//		}
//		String rev="";
//		
		String rev="";
		while(!s.isEmpty()) {
			rev+=s.pop();
		}
		
		return rev;
	}
	
	//Reverse Stack-method(1)->t.c-O(n), s.c-O(n), due to extra stack
	public static Stack<Integer> revrseStack1(Stack<Integer> s){
		
		Stack<Integer>  s2=new Stack<>();
		while(!s.isEmpty()) {
			s2.push(s.pop());
		}
		
		return s2;
	}
	
	//so we want to reverse stack with s.c-O(1)->method(2)	
	
	//Reverse Stack -Method (2)
	public static void reverseStack2(Stack<Integer> s){
		
		//Base Cases
		if(!s.isEmpty()) {
			return ;//remove method from call stack
		}
		
		//recursion
		int top=s.pop();
		reverseStack2(s);
		pushAtBottom(s, top);
		
	}
	
	
	//function to print stack
	public static void printStack(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	
	//function for stock span problem
	
	public static void stockSpan(int stock[], int span[]) {
		Stack<Integer> s=new Stack<>();
		span[0]=1;
		//in stock we are keeping index of prev high
		s.push(0);
		
		//as span will be of stock so both array will have same length;
		for(int i=1; i<stock.length;  i++) {
			int currPrice=stock[i];
			
			while(!s.isEmpty() && currPrice > stock[s.peek()]) {
				s.pop(); //as we want prev high so smaller will be deleted from stack
			}
			//now all smaller stock price index has been deleted
			//so i will check if  that stack is empty or not
			if(s.isEmpty()) {
				span[i]=i+1;//this price is always higher in given stock array
				
			} else {
				int prevHigh=s.peek();
				span[i]=i-prevHigh;//here prevHigh is index of prevHigh priced stock
						
			}
			
			
			
			s.push(i);
		}
		
		
	}
	
	// function for Next greater element , t.c-O(N^2)
	 public static int[] nextGreaterElement(int arr[]) {
		 int n=arr.length;
		 int[] next=new int[n];
		 
		 for(int i=0;  i<n;  i++) {
			 for(int j=i+1;  j<n;  j++) {
				 if(arr[i]<arr[j]) {
					 next[i]=arr[j];
					 break;
				 } else {
					 next[i]=-1;
				 }
			 }
		 }
		 
		 return next;
	 }
	 
	 //functioN FOR NEXT gREATER element, t.c->O(n)-right
	 public static int[] nextGreater(int[] arr) {
		 int n=arr.length;
		 Stack<Integer> s=new Stack<>();
		 int nextGreater[]=new int[n];
		 
		 for(int i=n-1;  i>=0;  i--) {
			 
			 //step-1
			 while(!s.isEmpty() &&  arr[s.peek()]<=arr[i] ) {
				 s.pop();//remove all smaller elements present inside satck
			 }
			 
			 //if no element is bigger in right
			 //step-2
			 if(s.isEmpty()) {
				 nextGreater[i]=-1;
			 } else {
				 nextGreater[i]=arr[s.peek()];//top of stack will be next greater element
			 }
			 
			 //step-3
			 s.push(i);
			 
			 
		 }
		 
		 return nextGreater;
	 }
	 
	 //function for nextSmaller-right
	 public static int[] nextSmallerR(int arr[]) {
		 Stack<Integer> s=new Stack<>();
		 int[] nextSmallerR=new int[arr.length];
		 
		 for(int i=arr.length-1;  i>=0;  i--) {//here I am going from backward as for right we will calculate 
			                         //initially all right element and store them in stack to compare for smaller element
			 //step 1
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i] ) {
				 s.pop();
				 
			 }
			 
			 //step 2
			 if(s.isEmpty()) {
				 nextSmallerR[i]=-1;
			 } else {
				 nextSmallerR[i]=arr[s.peek()];
				 
			 }
			 
			 s.push(i);
			 
		 }
		 return nextSmallerR;
	 }
	 
//	 //function for nextSmallerleft
//	 public static int[] nextSmallerL(int[] arr) {
//		 Stack<Integer> s=new Stack<>();
//		 int[] nextSmall=new int[arr.length];
//		 
//		 for(int i=0;  i<arr.length;  i++) {
//			 //step 1
//			 while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
//				 s.pop();
//				 
//			 }
//			 //step2
//			 if(s.isEmpty()) {
//				 nextSmall[i]=-1;
//			 } else {
//				 
//			 }
//		 }
//	 }
	 
	 //function for valid parenthesis
	 public static boolean isvalid(String str) {
		int n=str.length();
		Stack<Character> s=new Stack<>();
		
		for(int i=0;  i<n;  i++) {
			char ch=str.charAt(i);
			//for ch is openning
			if(ch == '(' || ch=='{' || ch=='[') {
				s.push(ch);
			} else {//if ch is closing
				if(s.isEmpty()) {//means no openning then there is no point of closing, invalid parenthesis 
					return false;
				}
				//here ch is closing but stack is not empty means , there is some opening braces
				
				//Successful pair,as initially we have inserted opening braces inside stack
				//successful pair wii be deleted for further inspection
				if(s.peek()=='(' && ch==')'//()
				 || s.peek()=='{' && ch=='}' //{}
				 || s.peek()=='[' && ch==']') {//[]
					s.pop();
				} else {
					//means some braces are there which does not make successful pair leads to invalid parenthesis
					return false;
				}
			}
				
			
			
	    }	
		if(s.isEmpty()) {
			return true;//everything is fine
		} 
			
		return false;
	 }
	 
	 //Function for finding max area of histogram
	 public static int maxArea(int[] arr) {
		 
		 int maxArea=0;//as area can not be negative
		 //nsr-j
		 Stack<Integer> s=new Stack<>();
		 int nextR[]=new int[arr.length];
		 
		 //keep in mind i have to find index only
		 
		 for(int i=arr.length-1;  i>=0;  i--) {
			 
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				 s.pop();
			 }
			 
			if(s.isEmpty()) {
				nextR[i]=arr.length;
			}
			else {
				nextR[i]=s.peek();//index
			}
			s.push(i);
		 }
		 
		 //nsl-i
		 s=new Stack<>();//making stack empty again
		 int[] nextL=new int[arr.length];
		 
          for(int i=0;  i<arr.length;  i++) {
			 
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				 s.pop();
			 }
			 
			if(s.isEmpty()) {
				nextL[i]=-1;
			}
			else {
				nextL[i]=s.peek();//index
			}
			s.push(i);
		 }
		 
		 //calculate max area
          
          for(int i=0;  i<arr.length;  i++) {
        	  int height=arr[i];
        	  int width=nextR[i]-nextL[i]-1;
        	  int currArea=height*width;
        	  maxArea=Math.max(maxArea, currArea);
          }
          
          return maxArea;
        		  
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		int[] heights= {2,1,5,6,2,3};
		System.out.println("max area of histiogram is : "  +maxArea(heights));
//		int[] arr= {3,6,9,2,1};
//		int[] next=nextSmallerR(arr);
//		
//		for(int i=0;  i<arr.length;  i++) {
//			System.out.print(next[i] + " ");
//		}
//		String str="(((((){}[])";
//		System.out.println(isvalid(str));
		//{6,8,0,1,3}
//		int[] arr= {9,3,1,2,6,0};
//		int nArr[]=nextGreater(arr);
//		
//		for(int i=0;  i<nArr.length;  i++) {
//			System.out.print(nArr[i] + " ");
//		}
		
		//Stack<Integer> s=new Stack<>();
//		
//		int stock[]= {100,80,60,70,60,85,100};
//		int span[]=new int[stock.length];
//		stockSpan(stock, span);
//		
//		for(int i=0;  i<stock.length;  i++) {
//			System.out.println(span[i]);
//		}
		
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
//		reverseStack2(s);
//		
//		printStack(s);
//		
		//printStack(s);
		
//		Stack<Integer> s2=revrseStack1(s);
//		printStack(s2);
//		while(!s2.isEmpty()) {
//			System.out.println(s2.pop());
//		}
		
		
		
//		String str="ambuj is a good boy";
//		System.out.println(reverseString(str));
		
		//at spot reverse in a string
//		String  arr[]=str.split(" ");
//		for(int i=0;  i<arr.length;  i++) {
//			arr[i]=reverseString(arr[i]);
//		}
//		
//		for(int i=0;  i<arr.length;  i++) {
//			System.out.print(arr[i] + " ");
//		}
		//System.out.println();
		
//		Stack<Integer> s=new Stack<>();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		pushAtBottom(s, 5);
//		
//		while(!s.isEmpty()) {
//			System.out.println(s.pop());
//		}
		//here 5 is at bottom of stack		
		
		
		
		
		//Stack s=new Stack();
		
		//System.out.println(s.peek());
//		s.push(1);
//		s.push(2);
//		s.push(3);
		
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
		
		//iterating on stacks
//		while(!s.isEmpty()) {
//			System.out.println(s.peek());//see the top
//			s.pop();//remove the top
//			//then next top is next element
//		}
		
	}

}
