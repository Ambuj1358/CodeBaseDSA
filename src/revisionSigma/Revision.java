package revisionSigma;

public class Revision {
	
	public static void main(String[] args) {
		
		//Max subArray sum optimised to O(N^2)
		int arr[]= {2,4,6,8,10};
		
		int max=Integer.MIN_VALUE;
		int currSum=0;
		int[] prefix=new int[arr.length];
		prefix[0]=arr[0];
		
		for(int i=1;  i<arr.length;  i++) {
			prefix[i]=prefix[i-1] +arr[i];
		}
		
		for(int i=0;  i<arr.length;  i++) {
			int start=i;
			for(int j=i;  j<arr.length;  j++) {
				int end=j;
				currSum=0;//set to 0 for every subarray start currsum with 0
				
				currSum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];//what if start=0,start==0->prefix[end] means simply add everything of original array
				
				if(max<currSum) {
					max=currSum;
				}
				
			}
		}
		System.out.println("Max sum is :" + max);
		
		
		
		//Print subarray
		//max subarray sum->Brute force->O(N^3)
//		int[] arr= {2,4,6,8,10};
//		int count=0;
//		int max=Integer.MIN_VALUE;
//		
//		for(int i=0;  i<arr.length;  i++) {
//			for(int j=i;  j<arr.length;  j++) {
//				int sum=0;
//				for(int k=i;  k<=j;  k++) {//this loop will build one subarray
//					System.out.print(arr[k] + " ");
//					sum+=arr[k];
//					
//				}
//				if(sum>max) {
//					max=sum;
//				}
//				count++;
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
//		System.out.println(max);
//		
//		System.out.println("Total subarray count:" + count);
		
		
		//pairs in an array->Time->O(N^2)
//		int[] arr= {2,4,6,8,10};
//		int count=0;
//		
//		for(int i=0;  i<arr.length;  i++) {
//			for(int j=i+1;  j<arr.length;  j++) {
//				System.out.print("(" + arr[i] + "," + arr[j] + ")");
//				count++;
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println("Total pairs:" +count);
		
		
	}

}
