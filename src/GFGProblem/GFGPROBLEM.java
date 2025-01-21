package GFGProblem;

import java.util.Arrays;
import java.util.HashMap;

public class GFGPROBLEM {
	
	 static int majorityElement(int a[], int size)
	    {
	        // your code here
	        HashMap<Integer,Integer> map=new HashMap<>();
	        
	        for(int i=0;  i<a.length; i++){
	            map.put(a[i],map.getOrDefault(a[i],0)+1);
	        }
	        
	       for(int i=0;  i<a.length; i++){
	           int n=a.length;
	           if(map.get(a[i])>(n/2)){
	               return a[i];
	           }
	        }
	        
	        return -1;
	        
	    }
	 
	 static long validPair(int a[],int n) {
		 int count=0;
		 for(int i=0;  i<n;  i++) {
			 for(int j=i+1;  j<n;  j++) {
				 if(a[i]+a[j]>0) {
					 count++;
				 }
			 }
		 }
		 return count;
	 }
	 
	 //modified valid pair function->O(NlogN)
	 static long validPair2(int a[],int n) {
		 Arrays.sort(a);
		 
		 //now use two pointer approch
		 int left=0;
		 int right=n-1;
		 
		 int count=0;
		 while(left<right) {
			if(a[left] +a[right]>0) {
				count++;
			}
			
			left++;
		 }
		
		 return count++;
	 }
	
	public static void main(String[] args) {
		
		int a[]= {3,-2,1};
		System.out.println(validPair(a, a.length));
		System.out.println(validPair2(a, a.length));
		
		
//		int arr[]= {3,1,3,3,2};
//		System.out.println(majorityElement(arr, arr.length));
		
	}

}
