package sigmaPractice;

public class CircularQueue {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear;
		static int front;
		
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1; 
			front=-1;
		}
		
		//isEmpty()
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		//isFull
		public static boolean isFull() {
			return (rear+1)%size == front;//here circular updation of rear happens
			//it means if next element of rear is front then queue is full
		}
		
		//add() operation
		public static void add(int data) {
			if(isFull()) {
				System.out.println("queue is full");
				return;
			}
			//add 1st element
			if(front==-1) {
				front=0;//after 1st element addition , front will be 0
			}
			rear=(rear+1)%size;//circular updation,initially rear=-1
			arr[rear]=data;
		}
		
		//remove() operation
		public static int remove() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			int res=arr[front];
			//last element delete
			if(rear==front) {
				rear=front=-1;
			} else {
				front=(front+1)%size;//as we have to remove front that's why we have performed circular updation of front
			}
			
			return res;
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
		
		Queue q=new Queue(4);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
		
		
		
	}
	

}
