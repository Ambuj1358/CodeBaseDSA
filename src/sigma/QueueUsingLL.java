package sigma;

public class QueueUsingLL {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;//as initially it is pointing towards null;
		}
		
	}
	//I am making all var as static  to make them class level var and so that we can access them directly using or
	//so that we don't have to make instance of that class to access them
	
	static class Queue{
		
		static Node head=null;
		static Node tail=null;
		
		//isEmpty() operation
		public static boolean isEmpty() {
			return head==null && tail==null;
			//& will check both condition and do AND operation
			//but && is Conditional AND, AS if one fails then it will not check other that will save our computational time
		}
		
		//no need of isFull() method as ll is of dynamic size, whatever element we want to add we can add
		
		//add() operation
		public static void add(int data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=tail=newNode;
			}
			
			tail.next=newNode;
			tail=newNode;
		}
		
		//remove() operation
		public static int remove() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;//invalid index signifies queue is empty so we can not remove any elements
			}
			
			int front=head.data;
			
			//if ll has only one element
			if(head==tail) {//node equality
				head=tail=null;//means 1st element got removed
			} else {
				head=head.next;//means 1st element got removed
			}
			
			return front;
		}
		
		//peek() operation
		public static int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			return head.data;
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Queue q=new Queue();//no args required as ll is of dynamic size
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
