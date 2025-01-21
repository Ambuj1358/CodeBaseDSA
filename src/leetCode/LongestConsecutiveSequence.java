package leetCode;

public class LongestConsecutiveSequence {
	
	//function for longest consecutive sequence
	public static int longestConsSeq(int nums[]) {
		
		int n=nums.length;
		int count=0;
		
		for(int i=0;  i<n;  i++) {
			for(int j=0;  j<n;  j++) {
				if(nums[j]==nums[i]+1 || nums[j]==nums[i]-1) {
					count++;
					break;
					
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int nums[]= {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsSeq(nums));
		
	}

}
