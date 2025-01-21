package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers { 
	
//	public static boolean isPalindrome(int n) {
//		int reversedNum=0;
//		int temp=n;
//		while(temp>0){
//			int rem=temp%10;
//			reversedNum=reversedNum*10 +rem;
//			temp/=10;
//		}
//		if(n!=reversedNum) {
//			return false;
//		}
//		return true;
//	}
	public static void main(String args[]) {
		
		//program to find prime number between 2 to 30
		
		for(int i=2;  i<=30;  i++) {
			if(i==2  || i==3)System.out.print(i + " ");
			for(int j=4;  j<=i;  j++) {
				if(i%j!=0) {
					
				}
			}
		}
		//try {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//	
//		if(isPalindrome(n)) {
//			System.out.println("palindrome number");
//		} else {
//			System.out.println("Not a palindrome number");
//			
//			
//		}
//		} catch(InputMismatchException e) {
//			
//			System.out.println("wrong input, give only number as input");
//		}
//		System.out.println(isPalindrome(n));
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		if(isPrime(n)) {
//			System.out.println("Prime number");
//		} else {
//			System.out.println("Not a prime number");
//		}
		
		//System.out.println("is the given number prime number :" +isPrime(n) );
	//}
	// Function for prime number
//	public static boolean isPrime(int n) {
//		
//		if(n<=1) return false;
//		if(n==2 || n==3)return true;
//		
//		for(int i=2;  i<=Math.sqrt(n);  i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
		
//		boolean isPrime=true;
//		if(n<=1)isPrime=false;
//		
//		for(int i=2;  i<=Math.sqrt(n);  i++) {
//			if(n%i==0) {
//				isPrime=false;
//			}
//		}
//		return isPrime;
	}
	
	

}
