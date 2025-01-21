package sigma;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class BasicSorting {
	
	//Bubble sort
	
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		boolean swapped;
		//time complexity of this sorting algorithm is O(n*n)
		for(int i=0;  i<n-1;  i++) {
			swapped=false;
			
			for(int j=0; j<n-1-i;  j++) {
				//swapping
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
		for(int i=0;  i<n;  i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void selectionSort(int arr[] ) {
		
		for(int i=0;  i<arr.length-1;  i++) {
			int minPos=i;
			
			for(int j=i+1; j<arr.length;  j++) {
				if(arr[minPos]>arr[j]) {
					minPos=j;
				}
			}
			int temp=arr[minPos];
			arr[minPos]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1; i<n;  i++) {
			int curr=arr[i];
			int prev=i-1;
			
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
		
		//Array is already sorted
		//Now going to print array element
		
		for(int i=0;  i<n;  i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= {5,2,8,3,1,9};
		
		//this reverse sorting works for object type only
		  Arrays.sort(arr,0,4,Collections.reverseOrder());
		  
		  for(int i=0;  i<arr.length;  i++) {
			  System.out.print(arr[i]+ " ");
		  }
//		bubbleSort(nums);
		//selectionSort(nums);
		//insertionSort(nums);
		
	}

}
