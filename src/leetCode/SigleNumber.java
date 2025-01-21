package leetCode;

//leetcode 137->single number 2->Medium
public class SigleNumber {
	
	//function for single number 2
	public static int singleNumber(int[] nums) {
		/*
		 * There are multiple ways to solve it
		 * 1.-> Find occurrence using nested loop in O(N^2) time and if occurrence is one then return that element
		 * 2.-> Using Hashing
		 *               a.->using Array Hashing
		 *               b.->Hashing using Map data Structure
		 *               
		 * 3.->              
		 */
		
		//Aproach 2->Using Array Hashing
		//here array hashing is not possible as 
		
//		//Approach 1->Find occurrence in O(N^2) TIME
//		for(int i=0;  i<nums.length;  i++) {
//			int count=0;//every time for every element set count to 0 for finding corrext occurence for ecery element, right
//			for(int j=0;  j<nums.length;  j++) {
//				if(nums[i]==nums[j]) {
//					count++;
//					
//				}
//			}
//			
//			if(count==1) return nums[i];//as nums[i] has occurrence as 1
//		}
//		
		return -1;//we will never come here if there is element of 1 occurence
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		
		System.out.println(singleNumber(nums));
	}
	
	

}
