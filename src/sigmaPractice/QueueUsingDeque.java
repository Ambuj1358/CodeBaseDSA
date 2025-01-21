package sigmaPractice;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
	
	static class Queue {
		static Deque<Integer> dq=new LinkedList<>();
		
		//isEmpty() operation
		public static boolean isEmpty() {
			if(dq.isEmpty()) {
				return true;
			}
			
			return false;
		}
		
		//add() operation-t.c->o(1)
		public static void add(int data) {
			dq.addLast(data);
		}
		
		//remove() operation-t.c->O(1)
		public static int remove() {
			int front=dq.getFirst();
			dq.removeFirst();
			return front;
		}
		
		//peek() operation
		public static int peek() {
			return dq.getFirst();
		}
	}
	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
