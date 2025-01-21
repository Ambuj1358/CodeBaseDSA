package sigma;

public class DivideAndConquer {
	
	//Function for MergeSort using recursion
	public static void mergeSort(int arr[], int si,int ei) {
		
		//base cases
		if(si>=ei) {
			return;
		}
		//kaam-recursion
		int mid=si+ (ei-si)/2;//equ to mid=(si+ei)/2
		//for left part merging
		mergeSort(arr, si, mid);
		//for right part merging
		mergeSort(arr, mid+1, ei);
		
		//merging left and right part
		//calling merge function
		merge(arr, si,mid, ei);
	}
	
	//creating merge function to merge left and right part of array
	public static void merge(int arr[], int si,int mid, int ei) {
		
		//creating temp array
		int temp[]=new int[ei-si+1];
		
		int i=si;//starting idx for 1st sorted array
		int j=mid+1;//starting idx for 2nd sorted array
		int k=0;// idx for temp array initialisation
		
		while(i<=mid && j<=ei ) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			} else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		//for leftover element of left part
		while(i<=mid) {
			temp[k++]=arr[i++];// this is equivalent to ->temp[k]=arr[i] then ->i++ and k++
		}
		
		//for leftover element for right part or 2nd sorted array
		while(j<=ei) {
			temp[k++]=arr[j++];
		}
		
		//coping element from temp to original array
		
		for(k=0,i=si;  k<temp.length;  k++,i++) {
			arr[i]=temp[k];
		}
				
	}
	
	//quick sort implementation using recursion
	public static void quickSort(int arr[], int si, int ei) {
		//base case
		if(si>=ei) {
			return ;
		}
		//kaam
		int pivot=arr[ei];
		int pidx=partition(arr,si,ei);
		
		//calling recursive function as quick sort
		//for left part
		quickSort(arr, si, pidx-1);
		quickSort(arr, pidx+1, ei);
	}
	
	//function for partition to find actual right postion of pivot
	public static int partition(int arr[], int si, int ei) {
		int pivot=arr[ei];//difining pivot
		int i=si-1;//for making places for smaller number than pivot
		
		
		for(int j=si; j<ei;  j++) {
			
			if(arr[j]<=pivot) {
				i++;
				//swap arr[i] and arr[j]
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
			
			//for assigning right position to pivot
			i++;
			//swap arr[i] with arr[j], here arr[ei] is pivot,b/c we are out of loop
			int temp=pivot;
			arr[ei]=arr[i];
			arr[i]=temp;
		
		return i;
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {2,6,5,8,4,3};
		quickSort(arr, 0, arr.length-1);
		//mergeSort(arr, 0, arr.length-1);
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
