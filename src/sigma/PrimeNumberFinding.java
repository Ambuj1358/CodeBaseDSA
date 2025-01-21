package sigma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberFinding {
	
	public static int buyAndSellStocks(int prices[] ){
	
		
		int mp=0;
		int bp=Integer.MAX_VALUE;
		
		for(int i=0;  i<prices.length;  i++) {
			if(bp<prices[i]) {
				int profit=prices[i]-bp;
				mp=Math.max(profit, mp);
			} else {
				bp=prices[i];
			}
		}
		
		return mp;
	}
	
	public static void decToBin(int dec) {
		int num=dec;
		int pow=0;
		int bin=0;
		
		
		while(dec>0) {
			int rem=dec%2;
			bin=bin+ rem*(int)Math.pow(10, pow);
			pow++;
			dec/=2;
			
		}
		System.out.println("Bin number of " + num +" is = " + bin);
	}
	
	public static void binToDec(int binNum) {
		int myNum=binNum;
		int pow=0;
		int dec=0;
		
		while(binNum>0) {
			int ld=binNum%10;
			dec=dec+ ld*(int)Math.pow(2, pow);
			pow++;
			binNum/=10;
		}
		
		System.out.println("Decimal no of " + myNum + " is =" + dec);
	}
	
	public static boolean isPrime(int n) {
		
		if(n<=1) return false;
		
		for(int i=2;  i<=Math.sqrt(n);  i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int prices[]= {9,1,5,3,6,20};
		
		System.out.println(buyAndSellStocks(prices));
		
//		System.out.println("Enter a decimal number ");
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		decToBin(n);
//		
//		System.out.println("Please enter a binary number");
//		
//		Scanner sc=new Scanner(System.in);
//		int n =sc.nextInt();
//		
//		
//		binToDec(n);
		
		//Binary to decimal number conversion
		
		//print prime in a range
		
//		System.out.println("Please enter two number between which to find prime no");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		for(int i=a;  i<=b;  i++) {
//			if(isPrime(i)) {
//				System.out.print(i + " ");
//			}
//			
//		}
		
//		System.out.println("Please enter a number");
//		try {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(isPrime(n)) {
//			System.out.println("Given number is prime no");
//		} else {
//			System.out.println("Given number is not a prime no");
//		}
//		}catch (InputMismatchException e) {
//			System.out.println("The given format is invalid");
//		}
//		System.out.println("Hello ambuj");
		
	}
	

}
