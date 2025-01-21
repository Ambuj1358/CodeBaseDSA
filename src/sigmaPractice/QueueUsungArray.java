package sigmaPractice;

public class QueueUsungArray {
	
	static class Queue{
		static int[] arr;
		static int size;
		static int rear;
		
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;//initialising variables
		}
		
		//isEmpty() operation->T.C-O(1)
		public static boolean isEmpty() {
			return rear==-1;
		}
		
		//add() operation->t.c-O(1)
		public static void add(int data) {
			//check if queue is full
			if(rear==size-1) {
				System.out.println("Queue is full");
				return;
			}
			
			rear=rear+1;//shift rear to right
			arr[rear]=data;
			
		}
		
		//remove() operation->t.c-O(N)
		public static int remove() {//no need to pass argument as we know we have to remove front only
			//isEmpty
			if(isEmpty()) {
				System.out.println("Queue is empty");//that's why we can not remove anything
				return -1;//invalid index shows the same
			}
			
			int front=arr[0];
			for(int i=0;  i<rear;  i++) {
				arr[i]=arr[i+1];
			}
			rear--;//shifting rear to left
			
			return front;
			
		}
		
		//peek() operation
		public static int peek() {
			//isEmpty
			if(isEmpty()) {
				System.out.println("Queue is empty");//that's why we can't see anything in queue
				return -1;//invalid index shows the same;
			}
			
			return arr[0];
		}
	}
	
	public static void main(String[] args) {
		
		Queue q=new Queue(5);
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(9);
		
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
		
		
	}

}
