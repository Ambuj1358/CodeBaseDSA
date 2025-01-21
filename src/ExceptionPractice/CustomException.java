package ExceptionPractice;

import java.util.Scanner;

public class CustomException {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
			if(age<18) {
				throw new UnderAgeException("You are under age");
			} else {
				System.out.println("Hi Ambuj,You are good to go");
			}
		} catch(UnderAgeException ex) {
			System.out.println("Exception occured in ur application");
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}

class UnderAgeException extends RuntimeException{
	
	public UnderAgeException(String msg) {
		super(msg);
	}
}
