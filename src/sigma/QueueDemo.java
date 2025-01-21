package sigma;

import java.util.Scanner;

public class QueueDemo {
	
	//implementation of queue from Scratch using arrays
	static class Queue{
		static int arr[];
		static int size;
		static int rear;
		
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
		}
		
		//isEmpty()	function-O(1)
		public static boolean isEmpty() {
			return rear==-1;
			
		}
		
		//add(), function to add element in queue->no need to return anything-O(1)
		public static void add(int data) {
			
			//as we are implementing queue from array , so we need to check array is empty or not
			if(rear==size-1) {
				System.out.println("queue is full");
				return ;
			}
			
			rear=rear+1;
			arr[rear]=data;
			
		}
		
		//remove() operation, function to remove the front->T.c -O(N)
		//return type is int as we have to return whatever we are removing
		//no args as we know we have to remove front first
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			
			
			int front=arr[0];
			
			//here rear is last element, and we have gone upto next to last element to
			//access prev to last for i+1 calculation
			for(int i=0;  i<rear;  i++) {
				arr[i]=arr[i+1];
				
			}
			//as elemnt will be removed , then rear will change
			
			rear--;
			
			//as array has been changed now
			
			return front;
			
		}
		
		//peek() operation,int as we have to  return the front
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				
				return -1;
			}
			
			return arr[0];//as it is front;
		}
		
	}
	public static void main(String[] args) {
//		
//		Queue q=new Queue(5);
//		
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
//		
//		
//		while(!q.isEmpty()) {
//			System.out.println(q.remove());
//			
//		}
//		
//		for(int i=0;  i<20;  i++) {
//			System.out.print("_");
//		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter no of line u want");
//		int n=sc.nextInt();
//		
//		System.out.println("please enter the symbol u want to print");
//		
//		char ch=sc.next().charAt(0);
//		for(int i=1;  i<=n;  i++) {
//			System.out.print( "" +ch);
//		}
		
	}

}
