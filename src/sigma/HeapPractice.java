package sigma;

import java.util.ArrayList;

public class HeapPractice {
	
	static class Heap{
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 
		 //The below logic is for min heap, for max heap change slite condition
		
		//function to insert/add data in  heap(min Heap)
		public    void add(int data) {//we can not access non static memebers in static method, rest cases can access
			list.add(data);//data will be added at last index by default
			
			int x=list.size()-1;//child index 
			int par=(x-1)/2;//parent index as ch=2*par +1;
			
			//for min heap, child node should be greater than or equal to parent node,
			 //untill we achive this keep swapping child node with their parent
			
			//as for min heap , parent is always less than or equal to child
			while(list.get(x)<list.get(par)) {//O(logn), keep swapping
				
				
				int temp=list.get(x);//store child node in temp
				list.set(x, list.get(par));//set parent at child node index
				list.set(par, list.get(x));//set child at parent index
				
				//now updating the index for funrther operation with node
				x=par;
				par=(x-1)/2;
				
			}
			
		}
		
		//for peek() operation on heap-seeing the top element in heap(min Heap)
		public  int peek() {
			return list.get(0);//1st node is top element
		}
		
		//function to remove top element from Heap(min and max heap )
		public int remove() {//always removes top element from heap
		//1st of all ,find which element to remove(always 1st element in arraylist(root of heap tree)
			int data=list.get(0);//1st element from heap will be deleted
			
			//Step1-swap the element which u want to delete from last element (as stored in ArrayList)
			int temp=data;
			list.set(0, list.get(list.size()-1));//putting last element at 0th index
			list.set(list.size()-1, temp);
			//it's time complexity is O(1)
			
			
			//step2-remove last element from arraylist
			list.remove(list.size()-1);//last element removed in O(1) time
			
			//Heapify the Binary tree to make them proper heap(as per our requirement)
			heapify(0);//O(logn)
			
			return data;
		}
		
		//Heapify will be private function because we want that only this class can access this method not other class
		private void heapify(int i) {//i is index from where we want to heapify the BT
			int min=i;
			int left=2*i+1;
			int right=2*i+2;
			
			//now parent is at i, okay, so it will compare itself from left and right and Swap the smallest element with parent node
			
			//comparison with Left child
			if(left<list.size() && list.get(left)<list.get(min)) {
				min=left;
			}
			
			//comparison with right child
			if(right<list.size() && list.get(right)<list.get(min)) {
				min=right;
			}
			
			if(min!=i) {//as if min==i, no need to swap as no changes occurs
				//swap min index data with parent and call recursion for further heapify the new node as indexed as min
				int temp=list.get(i);
				list.set(i, list.get(min));
				list.set(min, list.get(i));//as min has been exchanced from either left or right
				
				//so heapify the min to get a proper heap
				heapify(min);//recursion
				
			}
			
			
			
			
			
		}
		
		public boolean isEmpty() {
			return list.size()==0;
		}
		
		//function for heap sort
		public void heapSort(int arr[]) {
			int n=arr.length;
			
			//step1-Build heap(max/min) from given array ,will decide on heapify function
			//leaf nodes are already a heap,so leave leaf node(if u take leaf node also no problem,heapify will not work anything on it ,will be ignored)
			
			for(int i=n/2;  i>=0;  i--) {
				heapify(arr,n,i);//n is size of array from which heap is being created,i is index from which we want heapification
			}
			
			//now extract the largest element and store it in last of array and call heapify function upto 2nd last element
			for(int i=n-1;  i>0;  i--) {//as heap has been created for i=0 in starting(step1),here loop is running for n-2 times
				
				//swap 1st element with last(here i is last element index)
				int temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
				
				//now last element came at 1st element at array i.e at roots, so heap property may have distroyed, so restoring heap property
				heapify(arr,i,0);//size is i and indez is 0, here heapify is recursive fun as i will reduce at each operation
			}
			
		}
		
		//Building max heap for ascending order sorting
		private void heapify(int arr[],int n, int i) {//(size and index)
			
			int largest=i;
			int left=2*i+1;
			int right=2*i +2;//0 based indexing
			
			if(left<n && arr[left]>arr[largest]) {//left index should be in the range of array size
				largest=left;
			}
			
			if(right<n && arr[right]>arr[largest]) {
				largest=right;
			}
			
			if(largest!=i) {//means we found bigger element than root so we will swap with that element and will restore heap property also
				
				//swap largest element and ith element
				int temp=arr[largest];
				arr[largest]=arr[i];
				arr[i]=temp;
				
				//now the subroot which have root index as largest may have distroyed  heap property,so we will restore that by calling heapify function on that
				heapify(arr,n,largest);
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {89,23,10,100,300,34};
		
		Heap hp=new Heap();
		
		hp.heapSort(arr);
		
		for(int i=0; i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
		
		
//		
//		Heap hp=new Heap();
//		
//		hp.add(6);
//		hp.add(2);
//		hp.add(1);
//		hp.add(99);
//		hp.add(0);
//		
//		
//	if(!hp.isEmpty()) {
//		System.out.println(hp.peek());
//		hp.remove();
//	}
//		
//		
		
	}

}
