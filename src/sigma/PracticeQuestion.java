package sigma;

import java.util.Scanner;

public class PracticeQuestion {
	
	//q5->program to calculate sum of digits in an integer
	
	    public static int digitSum(int n) {
	    	int sum=0;
	    	while(n>0) {
	    		int rem= (n%10);
	    		sum=sum+rem;
	    		n/=10;
	    	}
	    	
	    	return sum;
	    	
	    }
	
	//q3->Function to check for palindrome
       public static boolean isPalindrome(int n) {
    	   int temp=n;
    	   int revNum=0;
    	   
    	   while(n>0) {
    		   int rem=n%10;
    		   
    		   revNum=revNum*10 + rem;
    		   n/=10;
    	   }
    	   if(revNum==temp) {
    		   return true;
    	   } else return false;
       }
	//q2->program to test even
	
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	//q1-> --Function to compute average of three numbers(done)
	
	public static float average(int a, int b, int c) {
		return (a+b+c)/3;
	}
	
	public static void main(String[] args) {
		
		
		//q4 done
//		System.out.println("Please enter a number");
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		System.out.println(digitSum(n));
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		int min=Math.min(a,b);
//		int max=Math.max(a, b) ;
//		int srt=(int)Math.sqrt(a);
//		int power=(int)Math.pow(a, b);
//		int abs=Math.abs(a);
//		
//		
//		System.out.println(abs);
		
//		System.out.println("Enter a number to check for palindrome");
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(isPalindrome(n)) {
//			System.out.println("The given number is palindrome number");
//			
//		} else {
//			System.out.println("The given number is not a palindrom number");
//		}
		//System.out.println(average(2,3, 4));
		
		//System.out.println(isEven(9));
		
	}

}
