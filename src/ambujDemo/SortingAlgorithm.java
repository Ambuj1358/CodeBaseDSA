package ambujDemo;

public class SortingAlgorithm {
	
	//Function for mergeSort algorithm->>Based on divide and conquer algorithm
	//keep dividing array untill base case->>means single elemnt left
	public static void mergeSort(int[] arr,int low,int high) {
		int n= arr.length;
		//Base case
		if(low>=high) return;
		
		//divide the array by mid(pivot)
		int mid=low + (high-low)/2;
		
		//Now for left part element->>call this rec function
		mergeSort(arr, low, mid);
		
		//for rightpart elem call this rec fun
		mergeSort(arr, mid+1, high);
		
		//upto now smaller problem solved ->>combine left and right part to produce the final sorted array
		merge(arr,low,mid,high);
		
		
		
	}
	
	//function to merge two array based in index
	public static void merge(int[] arr,int low,int mid,int high) {
		int[] temp=new int[high-low+1];
		int left=low;
		int right=mid+1;
		int k=0;//varible for temp index
		
		
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp[k]=arr[left];
				left++;
				
			} else {
				temp[k]=arr[right];
				right++;
			}
			k++;
			
		}
		
		//for leftover elemnt in left part
		while(left<=mid) {
			temp[k]=arr[left];
			left++;
			k++;
		}
		
		//for leftover elem in right part
		while(right<=high) {
			temp[k]=arr[right];
			right++;
			k++;
		}
		
		//now copy temp elem in arrat with inices from low to high
		for(int i=low;  i<=high;  i++) {
			arr[i]=temp[i-low];//as i=low->>temp index->0,i->low+1,temp->>data index->1
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {5,2,4,1,3};
		mergeSort(arr, 0, arr.length-1);
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
