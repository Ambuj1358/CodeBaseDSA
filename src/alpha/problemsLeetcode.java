package alpha;

public class problemsLeetcode {
	
	//function for 2 sum in array
	public static int[] target(int[] nums,int target) {
		//Brute force
		int[] arr=new int[2];
		
		for(int i=0;  i<nums.length;  i++) {
			for(int j=i+1;  j<nums.length;  j++) {//here j=i+1, as u can't repeat element
				if(nums[i] + nums[j]==target) {
					arr[0]=i;
					arr[1]=j;
					break;
				}
			}
		}
		return arr;
	}
	
	//optimised code for 2 sum problem (above code)
	public static int[] target2(int[] nums,int target) {
		//Optimised apprach->Two pointer approach
		int left=0;
		int right=nums.length-1;
		int[] arr=new int[2];
		
		while(left<right) {//in case of left ==right, same element will repeat ,which we do not want
			int sum=nums[left] + nums[right];
			if(sum==target) {
				arr[0]=left;
				arr[1]=right;
				break;
			} 
			
			if(sum<target) {
				left++;
			} else if(sum>target) {
				right--;
			}
			
		}
		
		return arr;
		
		
	}
	
	public static void main(String[] args) {
		
		int nums[]= {2,7,11,15};
		int target=9;
		int[] arr2=target2(nums, target);
		for(int i=0;  i<2;  i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}

}
