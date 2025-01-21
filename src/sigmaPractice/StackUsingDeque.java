package sigmaPractice;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
	
	static class Stack{
		
		static Deque<Integer> dq=new LinkedList<>();
		
		//isEmpty() operation
		public static boolean isEmpty() {
			if(dq.isEmpty()) {
				return  true;
			}
			
			return false;
		}
		
		//push() operation
		public static void push(int data) {
			dq.addLast(data);
			
		}
		
		//pop() operation
		public static int pop() {
			
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			int front=dq.getLast();
			
			dq.removeLast();
			
			return front;
		}
		
		//peek() operation
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			
			return dq.getLast();
		}
	}
	
	public static void main(String[] args) {
		
		Stack st=new Stack();
		st.push(1);
		st.push(3);
		st.push(5);
		st.push(8);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
