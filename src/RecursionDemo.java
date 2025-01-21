
public class RecursionDemo {
	
	//function for infinite recursion
	public static void infiniteRecursion(int n) {
		System.out.println(n);
		infiniteRecursion(n);
	}
	
	//function to print number from n->1 decreasing order using recursion
	public static void printReverse(int n) {
		//Base case
		if(n==1) {
			System.out.println(1);
			return;//to remove fun from recursive call stack
		}
		
		System.out.println(n);
		
		 printReverse(n-1);//keep calling rec fun with decresing n ->> and stops when n==1 with printing 1 also
	}
	
	//function to print 1->n increasing order using recursion
	public static void printIncresing(int n) {
		//Base case
		if(n==1) {
			System.out.println(1);
			return;//fun will be removed from call stack;
		}
		printIncresing(n-1);
		System.out.println(n);
	}
	
	//function to calculate factorial of n using iteration and recursion both
	//iteration
	public static int factorialItreation(int n) {
		int res=1;
		for(int i=n;  i>=1;  i--) {
			res=res*i;
		}
		
		return res;
	}
	
	//factorial using recursion
	public static int factRecursion(int n) {
		//Base case
		if(n==0 || n==1) return 1;
		
		return n* factRecursion(n-1);
	}
	
	//function for sum of 1st n natural numbers
	public static int sum(int n) {
		//Base case
		if(n==1) return 1;
		
		return n + sum(n-1);
	}
	
	//function for nth fibonacci number
	//as we have started from o as n=0 so for nth fibonacci->>pass n+1 in function parameter if u start counting fibonacci from 1
	public static int nthFibonacci(int n) {
		//Base case
		if(n==0 || n==1) return n;
		
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
	
	//check given array is sorted in ascending
	public static boolean isSorted(int[] arr,int i) {//for calculation from start we will assume i will start from 0->>but this algorithm will also work for any value of i to check from that i to
		int n=arr.length;
		//base case
		if(i==n-1) return true;//if no sorted property   violation found
		if(arr[i]>arr[i+1]) {//curr ele >next->>which violates the ascending order property of array
			return false;
			
		}
		
		return isSorted(arr, i+1);//calling this fun for  next ele as we are looking for sorted nature in every ele 
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,7,3,4,5};
		System.out.println(isSorted(arr, 0));
		
		
	//	System.out.println(nthFibonacci(7));
		//System.out.println(sum(8));
//		System.out.println(factRecursion(6));
//		System.out.println(factorialItreation(6));
		//printIncresing(30);
		//printReverse(100);
		//infiniteRecursion(1);
		
	}

}
