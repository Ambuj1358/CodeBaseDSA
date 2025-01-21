package coreJavaPractice;

public class MultithreadingPractice {
	
	public static void main(String[] args) {
		
		System.out.println("main thread is starting");
		
		Thread1 thread1=new Thread1();//user thread
		thread1.start();
		
		//Thread2 using runnable interface example demonstartion
		Thread thread2=new Thread(new Thread2(),"thread2");
		
		thread2.start();
		
		
		System.out.println("Exitting main thread");
		
	}

}
