package sigma.heaps;

public class HeapSortPractice {
	
	
	//Function for sorting an array in descending order using heap
	public void heapsort(int arr[]) {
		int n=arr.length;
		
		//step1-creating min heap- O(nlogn))
		for(int i=n/2;  i>=0;  i--) {//bottom to top approach for node acting as root of subtree
			heapify(arr,n,0);//heapify(arr,size,index)-top to bottom approach for heapifying
		}
		//above operation will create min heap by given array(By 1st element root,2nd left child,3rd right,4th,left.left like this complete binary tree will be created from array)
		
		//step2-extracting min element(for descending order sorting) and placing it on last index of array (after it will ignore last element of array and work on left part
		//that's how we get descending order
		for(int i=n-1;  i>0;  i--) {//for i==0 case ,no need to swap as in last only one element is left ,and one element is always sorted
			
			//swap 1st and last element of array
			int temp=arr[0];
			arr[0]=arr[i];//here arr[i] is last element
			arr[i]=temp;
			
			//now curr root element is prev last of array, that may have distroyed heap property ,so we will store it by calling heapify function
			heapify(arr,i,0);//i-size on which heap creation occurs,0-index from which it will occur
			//as n sized heap already formed
			//initially it was n sized ,now it is n-1 sized(as i ==n-1 here)
			
		}//O(nlogn)
		
		//total tc=O(2*nlogn) which is equiv to O(nlogn)
	}
		
		//function for heapify to create a min heap
		private void heapify(int arr[],int size,int i) {//size-size of array from which  heap will be created, i-index from which heapify fun will start operating
			int min=i;
			
			int left=2*i +1;
			int right=2*i + 2 ;
			
			//base case for recursion if left<size and right <size
			if(left<size && arr[left]<arr[min]) {//here we are looking for smaller element
				min=left;//min index will update to left
			}
			
			if(right<size && arr[right]<arr[min]) {//here we are looking for smaller element
				min=right;//min index will update to right
			}
			
			if(min!=i) {//means i must have changed, i.e we have child which is smaller than parent 
				
				//now swap min indexed element with ith element
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
				
				//now subroot losses min heap property so will restore by calling heapify fun(recursion)
				heapify(arr,size,min);
			}
			
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {100,1,500,4,1000};
		//sort in using heap sort in descending order
		
		//can't make static reference to non static data field
		HeapSortPractice hp=new HeapSortPractice();
		
		hp.heapsort(arr);
		
		for(int i=0;  i<arr.length;  i++) {
			
		
			System.out.print(arr[i] + " ");
		}
		
	}

}
