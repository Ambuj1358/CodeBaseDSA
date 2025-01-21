package practice;

import java.util.Scanner;



public class Calculator {
	
	
	
	
	
	public static void main(String[] args) {
		
		Democalcaultor cd=new Democalcaultor();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("please enter the operation u want");
		
		char op=sc.next().charAt(0);
		
		
		
		if(op=='+') {
			System.out.println(cd.add(a, b));
		} 
		if(op =='-') {
			System.out.println(cd.substract(a, b));
		}
		if(op =='*') {
			System.out.println(cd.multiply(a, b));
		}
		if(op =='/') {
			System.out.println(cd.divide(a, b));
		}
		
		
		
		
		
		
	}
	
	
}



class Democalcaultor{
	
	
	
	public static  int add(int a, int b) {
		return a+b;
	}
	public static int substract(int a, int b) {
		return a-b;
	}
	
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
}
