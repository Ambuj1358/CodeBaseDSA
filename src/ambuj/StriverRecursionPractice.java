package ambuj;

import java.util.ArrayList;
import java.util.List;

public class StriverRecursionPractice {
	
	//function to print subsequences
	public static void printSubseq(int ind,int[] arr,int n,List<Integer> list) {
		//Base case
		if(ind>=n) {//means we have crossed the array limit->>no need to go further->>just print them->>done
			//print the list 
			for(int i=0;  i<list.size();  i++) {
				System.out.print(list.get(i)+ " ");//space for proper looking
			}
			
			
			//if list is empty
			if(list.size()==0) System.out.print("{}");
			System.out.println();
			return;
			
		}
		//take or pick condition
		list.add(arr[ind]);
		//now call the rec fun for next ele
		printSubseq(ind+1, arr, n, list);
		
		//not take or not pick condition
		//as elem is already taken so remove them from list to justify not take
		list.remove(list.size()-1);//as the ele which i will not take is [resent in last only
		//call rec fun for next elem
		printSubseq(ind+1, arr, n, list);
		
	}
	
	//function to print subsequences whose sum is k(or something)
	public static void printSubseqWithSumK(int ind,int[] arr,int n,List<Integer> list,int sum,int k) {
		//Base case
		if(ind>=n) {
			
			if(sum==k) {
				//print list
				for(int i=0;  i<list.size();  i++) {
					System.out.print(list.get(i) + " ");
				}
				if(list.size()==0) System.out.println("{}");
				System.out.println();
				
			}
			
			
			return;
		}
		
		
		//Take or pick
		list.add(arr[ind]);
		sum+=arr[ind];
		//call rec fun for next elem
		printSubseqWithSumK(ind+1, arr, n, list, sum, k);
		
		//not take or not pick
		list.remove(list.size()-1);
		sum-=arr[ind];
		//call rec fun for next elem
		printSubseqWithSumK( ind +1, arr, n, list, sum, k);
		
	}
	
	//function for printing only one subseq whose sum k
	public static boolean printOnlySubSeqWithSumK(int ind,int[] arr,int n,List<Integer> list,int sum,int k) {
		//Base case
		if(ind>=n) {
			//check for sum equality with k
			if(sum==k) {
				//print list
				for(int i=0;  i<list.size();  i++) {
					System.out.print(list.get(i) + " ");
				}
				return true;
			}
			
			return false;//else
		}
		
		//take
		list.add(arr[ind]);
		sum+=arr[ind];
		//call rec fun for next elem
		if(printOnlySubSeqWithSumK(ind+1, arr, n, list, sum, k)==true) {
			return true;
		}
		
		//not take or not pick
		list.remove(list.size()-1);
		sum-=arr[ind];
		if(printOnlySubSeqWithSumK(ind+1, arr, n, list, sum, k)==true) return true;
		
		return false;//if no such subseq found
	}
	
	//function to count no of subsequences->no need to take data structure as we don't want to print we only want to count the no of possible subseq wjich satisfies the given condition
	public static int countSubSeqWithSumK(int ind,int[] arr,int n,List<Integer> list,int sum,int k) {
		
		//Base case
		if(ind>=n) {
			if(sum==k) {//one such subseq found
				return 1;
			}
			return 0;
		}
		//take
		sum+=arr[ind];
		//call rec fun for next elem
		int l=countSubSeqWithSumK(ind+1, arr,n, list, sum, k);
		
		//not take
		sum-=arr[ind];
		int r=countSubSeqWithSumK(ind+1, arr,n, list, sum, k);
		
		return l+r;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,1};
		List<Integer> list=new ArrayList<Integer>();
		System.out.println(countSubSeqWithSumK(0, arr, arr.length, list, 0, 2));
		//printOnlySubSeqWithSumK(0, arr, arr.length, list, 0, 2);
	//	printSubseqWithSumK(0, arr, arr.length, list, 0, 0);
		
		//printSubseq(0, arr, arr.length, list);
		
	}

}
