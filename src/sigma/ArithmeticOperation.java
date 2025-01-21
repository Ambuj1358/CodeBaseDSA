package sigma;

import java.util.Scanner;

public class ArithmeticOperation {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void sum(String a, int b) {
		
	}
	
	//function overloading occurs with difference in type of parameter or number of parameter doesn't depend on return type of method
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int factorial(int n) {
		
		int result=1;
		for(int i=1;  i<=n;  i++) {
			result=result*i;
		}
		
		return result;
	}
	
	//Function for binomial coefficient
	
	  public static double binomialCoefficient(int n, int r) {
		  
		  int a=factorial(n);
		  int b=factorial(r);
		  int c=factorial(n-r);
		  
		  int res=a/(b*c);
		  return res;
	  }
	  
	  //sum of digit using recursion
	 // public static int sum(int n) {
//		 //base case
//		  if(n%10==0) {
//			  return 0;
//		  }
//		  
//		  //kaam
//		  
//		  return sum(n%10);
		  
		  //here time complexity is O(N)
//		  int sum=0;
//		  while(n>0) {
//			  sum+=n%10;
//			  n/=10;
//		  }
//		  
//		  return sum;
	//  }
	
	
	public static void main(String[] args) {
		
//		int n=23456;
//		System.out.println(sum(n));
		
//		//System.out.println("Please enter a number for which u want to calculate factorial");
//		
//		System.out.println("Please enter numbers for binomial coefficient");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int r=sc.nextInt();
//		
//		 double result=binomialCoefficient(n, r);
//		System.out.println(result);
	}
	

}
