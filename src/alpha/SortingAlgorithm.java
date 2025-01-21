package alpha;

public class SortingAlgorithm {
	
	//Bubble sort
	public static void bubbleSort(int[] nums) {
		int n=nums.length;
		
		for(int i=n-1;  i>=0;  i--) {
			int swap=0;
			for(int j=0;  j<i;  j++) {//as i is last ele in start->>or normal i=>0->n=>>j->o->n-1-i
				if(nums[j]>nums[j+1]) {
					//swap
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					swap=1;
				}
			}
			
			if(swap==0) break;
		}
	}
	
	//Function for merge sort
//	public static void mergeSort(int)
	
	
	public static void main(String[] args) {
//		int n=1234;
//		int res=(int)Math.floor(Math.log10(Math.abs(n)) +1);
//		System.out.println(res);
				
//		int[] nums= {5,2,3,4,1};
//		bubbleSort(nums);
//		
//		for(int i=0;  i<nums.length;  i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		
		
	}

}
