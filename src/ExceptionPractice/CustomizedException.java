package ExceptionPractice;

import java.util.Scanner;

//Customized checked Exception
class OverAgeException extends Exception{
	OverAgeException(){
		super("you are over age");
		
	}
	OverAgeException(String msg){
		super(msg);
	}
	
	
}
public class CustomizedException {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
			try {	
		if(age>50) {
			throw new OverAgeException("your age is more than required");
		} else {
			System.out.println("You are good to go");
		}
	} catch(OverAgeException e) {
		//System.out.println("your age is far more than required");
		e.printStackTrace();
	}
			System.out.println("hello");
		
	}

}
