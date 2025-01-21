package sigma;

import java.util.Scanner;

public class Sample {
	
	//binary search
	public static int index(int arr[], int key ) {
		int si=0, ei=arr.length-1;
		while(si<=ei) {
			int mid=(si+ei)/2;
			
			if(arr[mid]==key) { 
				return mid;
			}
			
			if(arr[mid]>key) {
				ei=mid-1;
			} else {
				si=mid+1;
			}
		}
		
		return -1;
		
	}
	
	//tilling problems isung recursion
	public static int totalWays(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		
		return totalWays(n-1) + totalWays(n-2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		int n=sc.nextInt();
		
		System.out.println(totalWays(n));
		
//		int[] arr= {1,2,3,4,5,6,7,8};
//		int key=6;
//		int result=index(arr, key);
//		
//		if(result==-1) {
//			System.out.println("Key not found");
//			
//		} else {
//			System.out.println("key is found at index :" +result); 
//			
//		}
		
	}

}
