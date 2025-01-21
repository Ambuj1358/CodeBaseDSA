package sigmaPractice;

public class CircularQueueImpl {
	
	static class Queue{
		static int[] arr;
		static int size;
		static int rear;
		static int front;
		
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
			front=-1;
		}
		
		//isEmpty() operation-t.c->O(1)
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		//isFull() operation
		public static boolean isFull() {
			return (rear+1)%size ==front;//i.e if rear's next element is front in circular rotation 
		}
		
		//add() operation-t.c->O(1)
		public static void add(int data) {
			//isFull()
			if(isFull()) {
				System.out.println("Queue full");//no need to add anything
			}
			
			//if we add anything front will not be affected , only rear will be affected
			//that's why updating rear in circular way
			
			rear=(rear+1)%size;
			arr[rear]=data;
			
		}
		
		//remove() operation
		public static int remove() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			int front=arr[0];
			
			//if only one element is there
			if(front==-1) {//if remove operation occurs , then only front will be affected
				rear=front=-1;
				
			} else {
				front=(front+1)%size;
			}
			
			return front;
		}
		
		//peek() operation
		public static int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			return arr[0];
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
