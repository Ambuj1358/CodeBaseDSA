package sigma;

import java.util.Scanner;

public class BitManipulation {
	
	public static void evenOdd(int n) {
		int bitmask=1;
		
		if((n & bitmask)==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	//get ith bit code
	public static int getIthBit(int n, int i) {
		int bitmask=1<<i;
		if((n & bitmask)==0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	//setting ith bit to 1
	
	public static int setIthBit(int n, int i) {
		int bitmask=1<<i;
		
		return n| bitmask;
	}
	
	//clear ith bit
	
	public static int clearIthBit(int n, int i) {
	int bitmask=1<<i;
	
	return n & (~bitmask);
	}
	
	public static int clearIBits(int n, int i) {
		int bitmask=(~0)<<i;
		
		return n & bitmask;
	}
	
	//clear bit in range
	public static int clearBitInRange(int n, int i, int j) {
		int a=((~0)<<(j+1));
		int b=(1<<i)-1;
		
		int bitmask=a | b;
		
		
		return (n & bitmask);
		
	}
	
	//power of two
	public static boolean isPowerOfTwo(int n) {
		boolean res=(n & (n-1))==0;
		return  res;
	}
	
	//check set bits in a number
	public static int checkSetBits(int n) {
		int count=0;
		while(n>0) {
			//lsb=n & 1
			if((n & 1 )!=0) {
				count++;
			}
			n=n>>1;
		}
		
		return count;
	}
	
	//fast exponentiation
	
	public static int fastExpo(int a, int n) {
		int ans=1;
		
		while(n>0) {
			if((n & 1)!=0) {
				ans=ans*a;
			}
			a=a*a;
			n=n>>1;
		}
		
		return ans;
	}
	
	//Asignment question
	//Q1->XOR opeartor
	
//	public static int xor(int x) {
//		int res=x^x;
//		return res;
//	}
	
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int x=sc.nextInt();
		
		//swapping without using 3rd varible
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		//System.out.println(xor(x));
//		int a=sc.nextInt();
//		int n=sc.nextInt();
//		
//		System.out.println(fastExpo(a, n));
		
		
		//System.out.println(checkSetBits(n));
		
		//System.out.println(isPowerOfTwo(n));
//		int i=sc.nextInt();
//		int j=sc.nextInt();
		
		//System.out.println(clearBitInRange(n, i, j));
		
		//System.out.println(clearIBits(n, i));
		
		//System.out.println(clearIthBit(n, i));
		//System.out.println(setIthBit(n, i));
		//System.out.println(getIthBit(n, i));
		
	}

}
