package ExceptionPractice;

import java.util.Scanner;
//class alpha{
//	
//}

class YoungerAgeExceptionDemo extends RuntimeException{
	
	YoungerAgeExceptionDemo(String msg){
		super(msg);
	}
}
public class SamplePractice {
	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age<18) {
				throw new YoungerAgeException("you can't vote");
				//System.out.println("hi");
			} else {
				System.out.println("You can vote");
			}
		} catch(YoungerAgeException e) {
			
			System.out.println(e);
			//System.out.println("Your age is less for voting");
			//System.out.println("hI AMBUJ");
		}
		 
		
//		try {
//			int a=20, b=10, c=a/b;
//			
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		
		//use of System.exit() method in try block
		
//		try {
//			//System.exit(0);
//			System.out.println("Hi ambuj");
//		}
//		finally {
//			//System.out.println("Hi ambuj");
//			int a=12, b=0, c=a/b;
//			System.out.println(c);
//			
//		}
//		try {
//			for(int i=1;  i<10;  i++) {
//				if(i==5) {
//					break;
//				}
//				if(i==3) {
//					continue;
//				}
//				System.out.println(i);
//			}
//			
//		}
//		finally {
//			System.out.println("Good job ambuj");
//		}
		
//		try {
//			int a=10, b=0, c=a/b;
//			System.out.println(c);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("great");
//		}
//		try {
//			int a=89,b=34, c=a/b;
//			System.out.println(c);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Hello ambuj");
//		}
//		try {
//		int a=100;
//		int  b=0;
//		int c=a/b;
//		System.out.println(c);
//		//System.out.println("Program runs fine");
//		} catch(ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("Program after exception handalled");
//		}
//		
//		System.out.println("Program runs fine");
}

}
 
