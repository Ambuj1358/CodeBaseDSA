package alpha;

import java.util.Scanner;

public class PlaindromeUsingRecursion {
	
	//function for palindrome
	public static boolean isPalindrome(int n) {
		
		int temp=n;
		int revNum=0;
		
		while(n>0) {
			revNum=revNum*10 + n%10;
			n/=10;
		}
		
		return revNum==temp;
	}
	
	//as we have to calculate revNum once so no need of recursion
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(isPalindrome(n)); 
		
		
	}

}
