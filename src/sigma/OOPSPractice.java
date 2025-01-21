package sigma;

import java.util.Scanner;

public class OOPSPractice {
	
	//Polymorphism( recall+ practice)
	
	//method overloading(compile time Polymorphism)
	
	public static int res(int a, int b) {
		
		
		return a+b;
	}
	
	public static int res(int a,int b, int c ) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(res(a, b));
		
	}

}
