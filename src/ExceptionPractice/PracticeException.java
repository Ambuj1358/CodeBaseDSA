package ExceptionPractice;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
	
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class PracticeException {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		try {
		if(age<18) {
			throw new YoungerAgeExceptionDemo("You can't vote");
		} else {
			System.out.println("You can vote");
		}
		
		} 
		catch(YoungerAgeExceptionDemo e) {
			System.out.println(e);
			
		}
		System.out.println("Hello world");
//		try {
//			
//		}
//		System.out.println("Hello");
//		catch(Exception e) {
//			
//		}
		
	//try {
		
//		try {
//			
//		}
//		catch(Exception e) {
//			
//		}
		
//	}
//	System.out.println("hello");
//	catch(Exception e) 
//	
//	{
//         try {
//			
//		}
//		catch(Exception ae) {
//			
//		}
//		
//		
//	}
//	
//	finally {
//         try {
//			
//		}
//		catch(Exception e) {
//			
//		}
//		
//	}
		
//		int a=100,b=2, c;
//		
//		try {
//			c=a/b;
//			
//			System.out.println(c);
//			System.exit(0);
//			
//		} catch(ArithmeticException e) {
//		e.printStackTrace();
			
			//System.out.println(e);
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("hello ambuj");
//		}
//		
//		try {
//			int x=100, y=0,z;
//			
//			
//			
//		}
//		finally {
//			
//		}

		
		
	}

}
