package coreJavaRevision;

import java.util.InputMismatchException;
import java.util.Scanner;

class YoungerAgeException extends Exception{
	
	YoungerAgeException(){
		super();//calling super class constructor
		
	}
}

class UnderAgeException extends RuntimeException{
	
	public UnderAgeException( ) {
		super();
	}
}

public class ExceptionPractice {
	
	//function to divide two numbers
	public static int divide(int a,int b) throws ArithmeticException {
		
		try {
			return a/b;
			
		} catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
	
		
		
		return 1;
		//either this method should handle exception or it's calling method should
		
	}
	
	
	public static void main(String[] args) {
		
		//Demonstration of custome Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age");
		int age=sc.nextInt();
		
		try {
			if(age<18) {
				throw new UnderAgeException();
			} else {
				System.out.println("Welcome Mr Ambuj, You are good to go");
			}
		
	
		
		
	}
		catch(UnderAgeException e) {
			System.out.println("UnderAgeException incountered");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("We are in finally block");
		}
		
		
		//System.out.println(divide(10,0));
		//throws demonstration
//		try {
//			System.out.println(divide(10,0));
//			
//		} catch(Exception e) {
//			System.out.println("Exception occured");
//			e.printStackTrace();
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your  age");
//		int age=sc.nextInt();
//		
//		
//		try {
//			if(age<18) {
//				throw new YoungerAgeException("Age must be greater than or equal to 18");//throwing exception object and we can"t write anything after this
//			} else {
//				System.out.println("Your age is good for this");
//				
//			}
//			
//		} catch(InputMismatchException e) {
//			System.out.println("Enter a valid age");
//			e.printStackTrace();
//			
//		} catch(YoungerAgeException e) {
//			System.out.println("YoungerAgeException occured in our program");
//			e.printStackTrace();
//		
//			
//		
//		} catch(Exception e) {
//			System.out.println("Exception occured in our program");
//			e.printStackTrace();
//		}
//		//Demonstartion of throw keyword by throwing custom exception
//		
//		
////		System.out.println("Hello ambuj");
////		
////		//Demonstration of finally block
////		try(Scanner sc=new Scanner(System.in)) {
////			System.out.println("Enter two integers");
////			int a=sc.nextInt();
////			int b=sc.nextInt();
////			int c=a/b;
////			System.out.println(c);
////		}catch(ArithmeticException e) {
////			System.out.println("We can't devide any number by 0");
////			e.printStackTrace();
////		}
////		catch(InputMismatchException e) {
////			System.out.println("Enter only Integers");
////			e.printStackTrace();
////		}
////		
////		catch(Exception e) {
////			System.out.println("Exception occured");
////			e.printStackTrace();
////			
////		}
////		
////		finally {
////			System.out.println("we are in finally block");
////		}
////		System.out.println("Hi");
//		//Ques 2->.
//		//ArrayIndexOutOfBoundException
////		int[] arr= {1,2,3,4,5};
////		
////		try {
////			for(int i=0;  i<100;  i++) {
////				System.out.println(arr[i]);
////			}
////		}
////		catch(ArrayIndexOutOfBoundsException e) {
////			System.out.println("we can't access element outside of array");
////			e.printStackTrace();
////		}
////		catch(Exception e) {
////			System.out.println("Exception occured in our program");
////			e.printStackTrace();
////		}
////		
//		//ques 1->
//		
////		try {
////			Scanner sc=new Scanner(System.in);
////			int a=sc.nextInt();
////			int b=sc.nextInt();
////			int c=a/b;
////			System.out.println(c);
////			
////		}
////		catch(ArithmeticException e) {
////			System.out.println("We can't divide any number by 0");
////		}
////		//what if any other exception like numberformat exception occurs
////		catch(Exception e) {
////			//System.out.println("Exception occured in your program");
////			e.printStackTrace();
////		}
//		
//		
	}

}
