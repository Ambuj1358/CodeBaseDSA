package sigma;

import java.util.LinkedList;
import java.util.Queue;

//asked in INTUIIT interview
public class StackUsingTwoQueue {
	
	static class Stack{
		static Queue<Integer> q1=new LinkedList<>();
		static Queue<Integer> q2=new LinkedList<>();
		
		//isEmpty()-O(1)
		public static boolean isEmpty() {
			return q1.isEmpty() && q2.isEmpty();//here both have to be empty in order to check stack is empty or not
		}//as we don't know which one is primary or whicj=h on eis secondary
		
		//push() operation-O(1)
		public static void push(int data) {
			if(!q1.isEmpty()) {
				q1.add(data);
			} else {
				q2.add(data);
			}
		}
		
		//pop() operation ->O(N) time
		public static int pop() {
			if(isEmpty()) {
				System.out.println("stack is empty");
				return -1;
			}
			
			int top=-1;
			
			if(!q1.isEmpty()) {
				while(!q1.isEmpty()) {
					top=q1.remove();
					if(q1.isEmpty()) {//if q1 is not empty
						break;
					} else {
						q2.add(top);//else add data in q2, last top element will jnot be printed as it will be removed
					}
					
				}
			} else {
				while(!q2.isEmpty()) {
					top=q2.remove();
					if(q2.isEmpty()) {//if q1 is not empty
						break;
					} else {
						q1.add(top);//else add data in q2, last top element will jnot be printed as it will be removed
					}
					
				}
				
			}
			
			return top;
			
		}
		
		//peek() operation-O(N)
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}
			
			//we will perform the operation on queue which has already data
			int top=-1;
			if(!q1.isEmpty()) {
				while(!q1.isEmpty()) {
					top=q1.remove();
					q2.add(top);
				}
			} else {
				while(!q2.isEmpty()) {
					top=q2.remove();
					q1.add(top);
				}
				
			}
			
			return top;
			
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(1);
		s.push(3);
		s.push(5);
		s.push(8);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
	}
	
	

}
