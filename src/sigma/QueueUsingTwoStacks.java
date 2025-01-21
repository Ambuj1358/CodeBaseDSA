package sigma;

import java.util.Stack;

public class QueueUsingTwoStacks {
	static class  Queue{
		static Stack<Integer> s1=new Stack<>();
		static Stack<Integer> s2=new Stack<>();
		
		//isEmpty() operation-O(1)
		public static boolean isEmpty() {
			return s1.isEmpty();//here finally we are looking at s1 for final static of queue
			//as final data will be stored here
		}
		
		//add() operation-O(N)
		public static void add(int data) {
			while(!s1.isEmpty()) {//from this step I am dumping the si data to s2
				s2.push(s1.pop());
			}
			s1.push(data);//from this step I am adding my element to s1
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());//from this step queue order is getting maintained
			}
		}
		
		//remove() operation-O(1)
		public static int remove() {
			if(s1.isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			return s1.pop();//from here s1 top element is removed and we got the value which is getting removed
		}
		
		//peek() operation-O(1)
		public static int peek() {
			if(s1.isEmpty()) {
				System.out.println("queue is empty");
				return -1;
				
			}
			
			return s1.peek();
		}
		
		
		
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(8);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
	}
	

}
