package sigma;



//Stack implementation using linkedList
public class StackUsingLL  {
	
	//inner class node
	static class Node{
		
		 int data;
		 Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		
	}
	//inner class stack
	static class Stack{
		static  Node head=null;
		
		public static boolean isEmpty() {
			return head==null;
		}
		
		//method for push operation->O(1)-> it is equiv to addFirst in ll
		public static void push(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
		}
		
		//function for pop operation ->O(1) , this is equiva to removeFirst from ll
		public static int pop() {
			
			//if ll is empty
			if(head==null) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			
			return  top;
		}
		
		//function for peek operation->O(1)
		public static int peek() {
			//if ll is empty
			if(head==null) {
				return -1;
			}
			int top=head.data;
			return top;
		}
				
		
	}
	
	
	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}
	
	

}
