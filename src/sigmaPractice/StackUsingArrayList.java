package sigmaPractice;

import java.util.ArrayList;

public class StackUsingArrayList {
	
	//create a Stack class
	
	static class Stack{
		
		static ArrayList<Integer> list=new ArrayList<>();
		
		
		//isEmpty()->O(1)
		public static boolean isEmpty() {
			
			return (list.size()==0);
		}
		
		//push() operation
		public static void push(int data) {
			list.add(data);
		}
		
		//pop()-->O(1)
		public static int pop() {
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		//peek() opearation->O(1)
		public static int peek() {
			return list.get(list.size()-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		Stack st=new Stack();
		
		//now stack is empty
		System.out.println(st.isEmpty());
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		
	}

}
