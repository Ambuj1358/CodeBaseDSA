package alpha;

import java.util.Scanner;

public class MagicNumber {
	
	//function for magic number
	public static boolean isMagic(int n) {
		//base case
		if(n/10==0) {
			return n==1;
		}  
		
		//recursion
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		return isMagic(sum);
	}
	
	//function to add natural numbers upto given value n
	public static int sum(int n) {
		
		//base case
		if(n==1) return 1;
		//recursion
		return n+sum(n-1);
	}
	
	//function for sum of even numbers upto n
	public static int evenSum(int n) {
		
		int sum=0;
		for(int i=1;  i<=n;  i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		
		return sum;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(evenSum(n));
		
		//System.out.println(sum(n));
		//System.out.println(isMagic(n));
		
	}

}
