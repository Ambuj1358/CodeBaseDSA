package leetCode;

public class ContainsDuplicates2 {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {

        int n=nums.length;
        for(int i=0;  i<n;  i++){
            for(int j=i+1;  j<n;  j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        } 

        return false;       
    }
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,1}; 
		int k=1;
		System.out.println(containsNearbyDuplicate(nums,k));
		
	}

}
