package sigma;

import java.io.Serial;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class RecursionPractice {
	
	//print number in decreasing order using Recursion
	public static void printDec(int n) {
		
		//defining base case
		if(n==1) {
			System.out.println("1");
			return;
		}
		System.out.print(n + " ");
		printDec(n-1);
	}
	
	//print number in increasing order using recursion
	public static void printInc(int n) {
		
		if(n==1) {
			System.out.print(n + " ");
			return ;
		}
		
		printInc(n-1);
		
		System.out.print(n + " ");
		
	}
	
	//Factorial of number using recursion
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		fact(n-1);
		int res=n*fact(n-1);
		return res;
	}
	
	//sum of n natural numbers using recursion
	
	public static int sumRec(int n) {
		//base case
		if(n<=0) return -1;
		if(n==1) {
			return 1;
		}
		
		sumRec(n-1);
		int res=n+sumRec(n-1);
		return res;
	}
	
	//fibonacci number using iteration
	public static void fibNum(int n) {
		int a=0; 
		int b=1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=3;  i<=n;  i++) {
			int c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
		
	}
	
	//sum of fibonacci number using iteration
	public static int fibSum(int n) {
		int a=0;  
		int b=1;
		int sum=a+b;
		for(int i=3;  i<=n;  i++) {
			int c=a+b;
			sum+=c;
			a=b;
			b=c;
			
			
		}
		return sum;
	}
	
	// nth Fibonacci num using recursion
	public static int fib(int n) {
		//writing base cases
		if(n==0 || n==1) {
			return n;
		}
		
		int fibnm1=fib(n-1);
		int fibnm2=fib(n-2);
		
		int fibn=fibnm1 + fibnm2;
		return fibn;
		
	}
	
	//checking a array is sorted or not
	
	public static void sorted(int arr[]) {
		int count=0;
		
		for(int i=0;  i<arr.length;  i++) {
			for(int j=i+1;  j<arr.length;  j++) {
				if(!(arr[i]<=arr[j])) {
					count++;
				}
			}
			
		}
		if(count==0) {
			System.out.println("Sorted");
		} else {
			System.out.println("Not sorted");
		}
	}
	
	//checking array is sorted or not(increasing order)
	public static boolean isSorted(int arr[] ,int i) {
		
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		
		return isSorted(arr, i +1);
		
	}
	
	//checking index of a key in an array
	public static int index(int arr[], int key) {
		int n=arr.length;
		for(int i=0;  i<n;  i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	//checking index of a key in an array using recursion
	public static int indexRec(int arr[], int key,int i) {
		
		if(i==arr.length-1) {
			return -1;
		}
		if(key==arr[i]) {
			return i;
		}
		
		return indexRec(arr, key,i+1);
	}
	
	//find index of last occurance of key in array
	public static int lastOccurance(int arr[], int key, int i) {
		
		int res=0;
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[arr.length-1-i]==key) {
			return arr.length-1-i;
		}
		return lastOccurance(arr, key, i +1);
	}
	
	//calculating x to the pow n
	public static int pow(int x,int n) {
		
		//reducing some lones of code
		if(n==0) return 1;
		return x*pow(x,n-1);
//		if(n==1) {
//			return x;
//		}
//		
//		int res=pow(x, n-1);
//		return x*res;
	}
	
	//calculating x to the power n optimised
	public static int powerOptimised(int x,int n) {
		if(n==0) {
			return 1;
		}
		int halfsqr=powerOptimised(x, n/2);
		halfsqr=halfsqr*halfsqr;
		
		//n is odd
		if(n%2!=0) {
			halfsqr=x*halfsqr;
		}
		
		return halfsqr;
	}
	
	//tilling problem(Asked in Amazon)
	public static int tillingWays(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return tillingWays(n-1) + tillingWays(n-2);
	}
	
	
	
	//remove duplicates in a String using recursion(Asked in Google, Microsoft)
	public static void removeDuplicates(String str, int idx, StringBuilder sbr,boolean[] arr) {
		//base case
		if(idx==str.length()) {
			System.out.println(sbr);
			return;
		}
		
		//work
		char currChar=str.charAt(idx);
		if(arr[currChar-'a']==true) {
			removeDuplicates(str, idx+1, sbr, arr);
		} else {
			arr[currChar-'a']=true;
			removeDuplicates(str, idx+1, sbr.append(currChar), arr);
		}
		
	}
	
	//friends pairing problems(Asked in Goldman Sachs)
	public static int friendsPairing(int n) {
		//base cases
		if(n==1 || n==2) {
			return n;
		}
		//sigle choice
		//friendsPairing(n-1);
		//pair choice->one friend can pair with n-1 ways
		//(n-1)*friendsPairing(n-2);
		
		return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
	}
	
	//print all binary string of size n without having consecutive ones
	public static void printBinStrings(int n,int lastPlace, String str) {
		//base cases
		if(n==0) {
			System.out.println(str);
			return;
		}
		
		//kaam
		//this function will be called either lastplace is 0 or 1
		printBinStrings(n-1,0,str + "0");
		
		//this will be called for only lp=0
		if(lastPlace==0) {
			printBinStrings(n-1,1,str+ "1");
			
			
		}
		
	}
	
	//Search in rotated sorted array
	//modified inary search-Binary search using recursion
	//time complexity O(nlogn)
	public static int search(int arr[],int tar, int si, int ei) {
		//base cases
		
		if(si>ei) {
			return -1;//invalid index indicates target not found
		}
		
		//kaam
		
		
		int mid=si+(ei-si)/2;
		
		//target found
		if(arr[mid]==tar) {
			return mid;
		}
		
		
		//case 1-mid on line 1
		if(arr[si]<=arr[mid]) {
			
			//case a->target is in left
			if(arr[si]<=tar && tar<=arr[mid]) {
				return search(arr,tar,si,mid-1);
			} else {// target may be anywhere in right upto ei 
				return search(arr,tar,mid+1,ei);
			}
			
			
		} else {// case 2- mid on L2
			
			//target in right part
			if(arr[mid]<=tar && tar<=arr[ei]) {
				return search(arr, tar, mid+1, ei);
			}
			
			else {//tar can be anywhere in left part upto si
				return search(arr,tar,si,mid-1);
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {4,5,6,7,0,1,2,3};
		int target=9;
		if(search(arr, target, 0, 7)==-1) {
			System.out.println("target not found");
		} else {
			System.out.println(search(arr, target, 0, 7));
		}
		
		
		
		//System.out.println("Please enter number for which u want decresing order");
		//Scanner sc=new Scanner(System.in);
		
		//int n=sc.nextInt();
		
		//printBinStrings(n, 0, new String(""));
		
	//	System.out.println(tillingWays(n));
		
		//System.out.println(totalWays(n));
		
		//System.out.println("Enter a string to remove duplicates");
//		
//		String str=sc.nextLine();
//		removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
//		int x=sc.nextInt(); 
//		int n=sc.nextInt();
//		
//		System.out.println(powerOptimised(x, n));
		
		
//		int arr[]= {1,7,3,5,2,8,9,5};
//		
//		if(lastOccurance(arr, 5, 0)!=-1) {
//			System.out.println("index is found at :" + lastOccurance(arr, 5, 0));
//		}
		
//		if(index(null, n))
//		
//		int[] arr=new int[n];
//		arr=
//		for(int i=0;  i<n;  i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;  i<n;  i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		
//		if(isSorted(arr, 0)) {
//			System.out.println("Sorted");
//		} else {
//			System.out.println("Not sorted");
//		}
		
		//System.out.println(isSorted(arr, 0));
		//System.out.println(fib(n));
		//System.out.println(fibSum(n));
		
		//fibNum(n);
		
//		if(sumRec(n)==-1) {
//			System.out.println("Please enter positive number only");
//		} else {
//			System.out.println(sumRec(n));
//		}
//		
	//	printDec(n);\
		//printInc(n);
		
		//System.out.println(fact(n));
		
		
	}

}
