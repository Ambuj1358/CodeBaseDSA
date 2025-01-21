package alpha;

public class MaxSubarraySum {
	
	public static void main(String[] args) {
		
		//Approach 2->Max subArray sum Optimisation->O(N^2)
		//time->O(N^2), space->O(1) constant
		int arr[]= {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		
		int currSum=0;
		int n=arr.length;
		
		int prefix[]=new int[n];
		
		prefix[0]=arr[0];//as prefix[i] is sum of all elements of array upto ith index
		                 //and before i=0 there is no element so prefix[0]->arr[0]
		
		for(int i=1;  i<n;  i++) {
			prefix[i]=prefix[i-1] + arr[i];
		}
		
		for(int i=0;  i<n;  i++) {
			for(int j=i;  j<n;  j++) {
				currSum=0;//as each time new array will be craeted
				
				currSum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];//as for middle bigger-smaller ==diff
				
				if(max<currSum) {
					max=currSum;
				}
			}
		}
		
		System.out.println("MAX subarray sum is :" + max);
		
		//Approach1 maxSubarray sum ->Brute force
		//time->O(N^2), space->O(1) constant space
//		int arr[]= {1,2,3,4,5};
//		int max=Integer.MIN_VALUE;
//		
//		int currSum=0;
//		int n=arr.length;
//		
//		for(int i=0;  i<n;  i++) {
//			for(int j=i;  j<n;  j++) {
//				currSum=0;//as each time here subarray will change
//				for(int k=i;  k<=j;  k++) {
//					currSum+=arr[k];
//				}
//				
//				if(max<currSum) {
//					max=currSum;
//				}
//			}
//		}
//		
//		System.out.println("Max sun=barray sum is:" + max);
	}

}
