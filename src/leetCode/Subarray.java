package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Subarray {
	
	//Q->function for max length of subarray whose sum is equal to k
	
	//Approach 1->Brute force
	//Time->O(N^3),space->O(1) constant space
	public static int maxLength(int nums[],int x) {
		
		int n=nums.length;
		int len=0;//initially
		
		for(int i=0;  i<n;  i++) {
			for(int j=i;  j<n;  j++) {
				int sum=0;
				for(int k=i; k<=j;  k++) {
					sum+=nums[k];
					if(sum==x) {
						len=Math.max(len, j-i+1);
					}
				}
			}
		}
		return len;
		
		
	}
	
	//optimised max length of subarray whose sum is equal to k
	public static int maxLength2(int nums[],int k) {
		int n=nums.length;
		int len=0;
		
		for(int i=0;  i<n;  i++) {
			int sum=0;
			for(int j=i;  j<n;  j++) {
				sum+=nums[j];
				
				if(sum==k) {
					len=Math.max(len, j-i+1);
				}
			}
		}
		
		return len;
	}
	
	//Using Optimised Hashing approach for above problem
	public static int maxLength3(int nums[],int k) {
		int n=nums.length;
		int sum=0;
		int len=0;
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;  i<n;  i++) {
			sum+=nums[i];
			
			if(sum==k) {
				len=Math.max(len, i+1);
			}
			//else
			int rem=sum-k;//looking for the index upto which sum is sum -k so that curr sum and that inde will build k
			if(map.containsKey(rem)) {
				int j=map.get(rem);
				len=Math.max(len, i-j);//no +1 as we have toeliminate all element upto j whose sum is sum-k->the rem
			} else {
				map.put(sum, i);
			}
		}
		
		return len;
	}
	
	public static void main(String[] args) {
		int[] nums={-1, 2, 3};
		int k=6;
		
		System.out.println(maxLength3(nums, k));
		
	}

}
