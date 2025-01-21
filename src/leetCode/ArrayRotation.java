package leetCode;

public class ArrayRotation {
	
	//function to rotate an array by k places(k>=0)
	public static int[] rotateArray(int nums[],int k) {
		int n=nums.length;
		for(int i=0;  i<n;  i++) {
			nums[(i+k)%n]=nums[i];
		}
		
		return nums;
		
		
	}
	
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		
		int arr[] =rotateArray(nums, 2);
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
