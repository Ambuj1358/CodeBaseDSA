package alpha;

public class LearnWithGoogleEngineerProblems {
	
	//function to sum of two elements adds upto target(optimised)->given array is sorted
	public static boolean target(int[] arr,int target) {
		
		int i=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {//as we can not add same element
			int sum=arr[left] +arr[right];
			
			if(sum==target) {
				return true;//we found match
			} else if(sum<target) {
				left++;
			} else if(sum>target) {
				right--;
			}
			
			
			
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {2,9,34,245};//aray is sorted
		
		String str="ambuj";
		//int a=10;
		System.out.println(str+10);
		
		//System.out.println(target(arr, 279));
	}

}
