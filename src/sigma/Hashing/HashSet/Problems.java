package sigma.Hashing.HashSet;

import java.util.HashSet;

public class Problems {
	
	//Q1->>function for counting distinct or unique(if repeat count once) element in an array-->>t.c->O(N) overall, space -O(N) as HashSet takes O(N) auxilliary space
	
	public static int countDistinct(int arr[]) {
		
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;  i<arr.length;  i++) {//o(n)
			set.add(arr[i]);   //o(1)
		}
		
		return set.size();//o(1) 
	}
	
	//Q2-->>(a) Function for union of two arrays-->>>//print union and intersection-->.HW
	//O(N+M), N and M is size of both array
	public static void unionCount(int arr1[],int arr2[]) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;  i<arr1.length;  i++) {
			set.add(arr1[i]);
		}
		
		for(int i=0;  i<arr2.length;  i++) {
			set.add(arr2[i]);
		}
		
		System.out.println(set);
		
		//return set.size();//union means combined unique element that will be returned by this set size() fun
	}
	
	//function for intersection of two array count--unique common element
	public static void intersectionCount(int arr1[],int arr2[]) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		int count=0;
		
		for(int i=0;  i<arr1.length;  i++) {
			set.add(arr1[i]);
		}
		
		for(int i=0;  i<arr2.length;  i++) {
			if(set.contains(arr2[i])) {
				count++;
				System.out.print(arr2[i] + " ");
				set.remove(arr2[i]);
			}
		}
		
		//return count;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr1[]= {7,3,9};
		int arr2[]= {6,3,9,2,9,4};	
		
		unionCount(arr1, arr2);
		intersectionCount(arr1, arr2);
		
		//System.out.println(unionCount(arr1, arr2));
		
		//System.out.println(intersectionCount(arr1, arr2));
//		int[] arr= {4,3,2,5,6,7,3,4,2,1};//distinct ele-->>4,3,2,5,6,7,1
//		
//		System.out.println(countDistinct(arr));
		
	}

}
