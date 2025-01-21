package sigma;

import java.util.Scanner;

public class PowerFunctionUsingRecursion {
	
	//normal power function(1) using recursion
	public static int power(int a,int n) {
		
		//base cases
		if(n==0) {
			return 1;
		}
		//kaam
		return a*power(a,n-1);
	}//it's time complexity is 0(N)
	
	
	//power function by different approach
	public static int power2(int a, int n) {
		
		//base cases
		if(n==0) {
			return 1;
		}
		//kaam
		int halfPowerSq=power2(a, n/2) * power2(a, n/2);
		
		//checking for odd
		if(n%2!=0) {
			return a*halfPowerSq;
		}
		
		return halfPowerSq;
				
				
	}//it's time complexity is O(N) and space complexity is O(logn)
	
	//optimised power function
	
	public static int power3(int a, int n) {
		//base cases
		if(n==0) {
			return 1;
		}
		
		int hp=power3(a, n/2);
		
		int hps=hp*hp;
		
		//odd case
		if(n%2!=0) {
			return a*hp*hp;
		}
		
		return hp*hp;//it's time complexity is O(logn) and space complexity is O(logn)
	}
	
	//for(int i=0;  i<n;  i=i*3)
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		
		int a=sc.nextInt();
		System.out.println("enter enter power no");
		int n=sc.nextInt();
		
		System.out.println(power3(a, n));
		//System.out.println(power2(a, n));
		//System.out.println(power(a, n));
		
	}

}
