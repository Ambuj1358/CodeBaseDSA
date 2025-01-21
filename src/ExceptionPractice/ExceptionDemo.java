package ExceptionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;



class UnderAgeException1 extends RuntimeException{
	
	public UnderAgeException1(String msg) {
		super(msg);
	}
}
public class ExceptionDemo {
	  
	public static void main(String[] args) {
		//Demo of Custom exception
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
	    try {
	    	int age=sc.nextInt();
	    	
	    	if(age<18) {
	    		throw new UnderAgeException1("You are under age");
	    	} else {
	    		System.out.println("Hi Ambuj->>You are good to go for this age");
	    	}
	    } catch(UnderAgeException1 ex) {
	    	System.out.println("Abhi tum chhota ho bhai");
	    	System.out.println(ex.getMessage());
	    }
	    catch(InputMismatchException ex) {
	    	System.out.println("Input galat hain");
	    	ex.printStackTrace();
	    }
	    finally {
	    	sc.close();
	    }
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter two integers");
//		
//		
//		try {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int c=a/b;
//			System.out.println(c);
//			
//		} catch(ArithmeticException ex) {
//			System.out.println("Exception aa gya na->aur karo meeting,aluaa meeting");
//			ex.printStackTrace();
//		}
//		catch(InputMismatchException ex) {
//			System.out.println("Input to sahi dalo be");
//			ex.printStackTrace();
//		}
//		
//		finally {
//			sc.close();
//			System.out.println("Hi ambuj,we are finally in finally block");
//		}
//		
	}

}
