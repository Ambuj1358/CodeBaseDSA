package coreJavaPractice;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
//		System.out.println("Thread1 is running");
		for(int i=0;  i<5;  i++) {
			System.out.println("The thread is :" + i);
		}
	}

}
