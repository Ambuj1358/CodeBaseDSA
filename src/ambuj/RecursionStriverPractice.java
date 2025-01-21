package ambuj;

public class RecursionStriverPractice {
	
	//function to check if array is sorted in ascending or not using recursion
	public static Boolean isSorted(int[] arr) {
		int n=arr.length;
		return sorted(arr,n,0);
	}
	
	//recursive func to check for array soting nature
	public static Boolean sorted(int[] arr,int n,int i) {
		//Base case
		if(i==n-1) return true;
		
		//kaam->>check recursive nature
		if(arr[i]>arr[i+1]) {//here concept is if array is sorted in ascending then 1st ele will always be smaller than 2nd if not ->>then not ascending
			return false;
			
		}
		
		return sorted(arr,n,i+1);
		
	}
	

	
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,9};
		System.out.println(isSorted(arr));
		
		
	}

}
