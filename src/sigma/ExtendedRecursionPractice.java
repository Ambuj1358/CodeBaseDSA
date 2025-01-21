package sigma;

import java.util.Scanner;

public class ExtendedRecursionPractice {
	
	//print number from 1 to n in increasing order
	public static void printInc(int n) {
		
		//Defining base cases
		if(n==1) {
			System.out.print(1 + " ");
			return;
		}
		printInc(n-1);
		System.out.print(n + " ");
	}
	
	//factorial of number using recursion
	public static int fact(int n) {
		
		//defining base cases
		if(n==0) return 1;
		fact(n-1);
		return n*fact(n-1);
	}
	
	//sum of first n naturals numbers using recursion
	public static int sumRec(int n) {
		//defining base cases
		if(n==1) return 1;
		sumRec(n-1);
		return n+sumRec(n-1);
	}
	
	//fibonacci number using recursion
	public static int fib(int n) {
		//defining base cases
		if(n==0 || n==1) {
			return n;
		}
		
		int a=fib(n-1);
		int b=fib(n-2);
		
		return a+b;
	}
	
	//first occurance of  a number in array using recursion
	public static int firstOccurance(int arr[], int key,int i) {
		if(i==arr.length-1) {
			return -1;
		}
		
		if(arr[i]==key) {
			return i;
		}
		
		return firstOccurance(arr, key, i+1);
	}
	
	public static int lastOccurance(int arr[], int key,int i) {
		
		//base cases
		if(i==arr.length) {
			return -1;
		}
		int isFound=lastOccurance(arr, key, i+1);
		//look forward
		if(isFound!=-1) {
			return isFound;
		}
		
		//compare with self
		if(arr[i]==key) {
			return i;
		}
		return isFound;
	}
	
	//program for finding x^n using recursion
	public static int powerRec(int x, int n) {
		if(n==0) return 1;
		
		return x*powerRec(x, n-1);
	}
	
	//optimised power function using recursion
	public static int powRec(int x, int n) {
		if(n==0) return 1;
		
		int halfpowsqr=powRec(x, n/2);
		
		if(n%2!=0) return x*powRec(x, n/2)*powRec(x, n/2);
		
		return powRec(x, n/2)*powRec(x, n/2);
	}
	
	//Q-11->Tilling problem(Asked in amazon )
	
	public static int tilling(int n) {
		if(n==0  || n==1) return 1;
		
		return tilling(n-1) + tilling(n-2);
	}
	//sum of digit of number using recursion
	public static int sum(int n) {
		//base cases
		if(n==0) {
			return 0;
		}
		
		return n%10+sum(n/10);
	}
	//prime using recursion
//	public static boolean isPrime(int n) {
//		
//		//base cases
//		if(n==2 || n==3) return true;
//		//kaam
//		if(n%2==0  || n%3==0) {
//			return false;
//		}
//		
//		return isPrime(n-1);
//	}
	
	// Simple Binary search using recursion
	public static int binarySearch(int arr[], int key,int si, int ei) {
		int mid=(si+ei)/2;
		//base cases
		if(si>ei) {
			return -1;
		}
		
		//kaam
		
		if(arr[mid]==key) {
			return mid;
		} else if(arr[mid]>key) {
			return binarySearch(arr,key,si,mid-1);
		} else {
			return binarySearch(arr,key,mid+1,ei);
		}
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		
		int arr[]= {1,4,7,9};
		if(binarySearch(arr, 9, 0, 3)==-1) {
			System.out.println("Not found");
		} else {
			System.out.println(binarySearch(arr, 9, 0, 3));
		}
		
		
//		if(isPrime(n)) {
//			System.out.println("prime no");
//		} else {
//			System.out.println("not a prime no");
//		}
		
		//System.out.println(sum(n));
		//System.out.println(tilling(n));
//		int x=sc.nextInt();
//		int n=sc.nextInt();
//		System.out.println(powRec(x, n));
		
		//int arr[]= {6,5,3,6,1,7,2,6};
		
		//System.out.println(lastOccurance(arr, 6, 0));
		
//		if(firstOccurance(arr, 0, 0)==-1) {
//			System.out.println("key not found");
//		} else {
//			System.out.println(firstOccurance(arr, 0, 0));
//			
//		}
//		
		
		//System.out.print(fib(n));
		
		//System.out.println(sumRec(n));
		
		//System.out.println(fact(n));
		//printInc(n);
		
	}

}
