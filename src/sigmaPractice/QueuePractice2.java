package sigmaPractice;

public class QueuePractice2 {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear;
		
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
		}
		
		//isEmpty() operation
		public static boolean isEmpty() {
			return  rear==-1;
		}
		
		//add() operation
		public static void add(int data) {
			//first of all , in case of array we have to check queue is full or not
			if(rear==size-1) {
				System.out.println("Queue is full");
			}
			
			rear=rear+1;
			arr[rear]=data;
		}
		
		//remove() operation
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			
			int front=arr[0];
			for(int i=0;  i<rear;  i++) {
				arr[i]=arr[i+1];
			}
			rear--;//after removing element , we have to shift rear
		
		
		return front;
	 }
		
		//peek() operation
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			
			return arr[0];
		}
		
	}
	
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(5);
		q.add(6);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
		
		
	}

}
