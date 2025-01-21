package sigmaPractice;


//Stack implementation using ll from scratch
public class StackUsingLL {
	
	//first of all Node class->these are blueprint of nodes
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	//static before any field means it can access all static and non static method inside parent class
	
	static class Stack {
		static Node head;
		//isEmpty() function->O(1)
		public static boolean  isEmpty() {
			
			return head==null;
		}
		
		//push() operation->O(1)-eqv to addFirst() in ll
		public static void push(int data) {
			//create node object
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
			
			//it does not return anything, it just perform operations
		}
			
		//pop() operation->O(1)-eqv to removeFirst() in ll
		public static int pop() {
			
			if(head==null) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			
			return top;
			
		}
		
		public static int peek() {
			if(head==null) {
				return -1;
			}
			
			return head.data;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Stack st=new Stack();
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
