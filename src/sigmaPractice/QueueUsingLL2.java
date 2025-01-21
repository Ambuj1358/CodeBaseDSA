package sigmaPractice;


//Asked in Microsoft
public class QueueUsingLL2 {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	static class Queue{
		
		static Node head=null;
		static Node tail=null;
		
		
		
		
		
		//here we will not make constructor of queue , we will use default constructor
		
		//isEmpty() operation-t.c->O(1)
		public static boolean isEmpty() {
			
			return head==null && tail==null;
			
		}
		
		//add() operation-tc->O(1)
		public static void add(int data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=tail=newNode;
				return ;
			}
			
			tail.next=newNode;
			tail=newNode;
		}
		
		//remove() operation
		public static int remove() {
			
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			int front=head.data;
			
			//if ll has only one element
			
			if(head==tail) {
				head=tail=null;
			} else {
			
			
			//remove in queue using ll is euiv to head removal of ll
			head=head.next;//next element is assigned to head
			}	
			return front;
		}
		
		//peek() operation
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			
			return head.data;
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Queue q=new Queue();//as ll is dynamic
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
		
		
	}

}
