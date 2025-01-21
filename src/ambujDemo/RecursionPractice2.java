package ambujDemo;

import java.util.ArrayList;

public class RecursionPractice2 {
	
	//Q1->>print all subsequences of given array
	public static void printAllSubSeq(int i,int[] arr,ArrayList<Integer> list,int n) {//n is the length of array
		//Base case
		if(i==n) {//when counter crosses ->>array limit
			System.out.println(list);
			return ;//we are removing the fun from call stack as this is the specified possiblity of ele when a ele is taken/not taken
			
			
		}
		//Take/pick->>add curr arr index ele to list and call the recursive function for other ele->index
		list.add(arr[i]);
		printAllSubSeq(i+1, arr, list, n);
		
		//Not take->>not pick
		//remove already taken ele from list ->>as we don't want to take them with us
		list.remove(list.size()-1);//as when we keep obj in parameter then it will remove it's 1st occurence only->>so last index
		printAllSubSeq(i+1, arr, list, n);
		
		
	}
	
	//Q2->Print all subsequence whose sum is equal to k
	public static void printSubSeqSumK(int i,int[] arr,ArrayList<Integer> list,int sum,int n,int k) {
		//Base case
		if(i==n) {//i has crossed array limit->>no need to go further
			if(sum==k) {//whatever sum that fun is carrying->>equal to k or not
				System.out.println(list);
				
			}
			return;//always write return statement outside as either sum ==k or not we have to return as no index left to visit in array
			
		}
		//Take ->pick
		list.add(arr[i]);
		//update sum with curr arra index element
		sum+=arr[i];
		printSubSeqSumK(i+1, arr, list, sum, n, k);
		
		//Not pick->>not take
		list.remove(list.size()-1);
		//update sum ->>as we don't want this ele and  already prevly sum has taken this
		sum-=arr[i];
		printSubSeqSumK(i+1, arr, list, sum, n, k);
	}
	
	//Q3->>print only once subsequence whose sum is equal to k->>any order is valid
	public static Boolean printOnlyOnceSubSeqSumK(int i,int[] arr,ArrayList<Integer> list,int sum,int n,int k) {
		//Base case
		if(i==n) {
			if(sum==k) {
				System.out.println(list);
				return true;//as we found this so ret true so that we do not have to print any other seq
				
			}
			return false;//counter is here means sum!=k->>so return false done ,all set
		}
		
		        //take
				list.add(arr[i]);
				sum+=arr[i];
				if(printOnlyOnceSubSeqSumK(i+1, arr, list, sum, n, k)==true) {
					return true;
				}
				
				//not take
				list.remove(list.size()-1);
				sum-=arr[i];
				if(printOnlyOnceSubSeqSumK(i+1, arr, list, sum, n, k)==true) {
					return true;
				}
		
		//for not take printing 1st
		
//		//not take
//		
//		
//		if(printOnlyOnceSubSeqSumK(i+1, arr, list, sum, n, k)==true) {
//			return true;
//		}
//		
//		// take
//		list.add(arr[i]);
//		sum+=arr[i];
//		if(printOnlyOnceSubSeqSumK(i+1, arr, list, sum, n, k)==true) {
//			return true;
//		}
		
		//means we will return true ->>which will indicates we found our 1st subseq whose sum is k and also already printed
		//if not found return false
		return false;
	}
	
	//Q4->>print the count of all subseq whose sum is equal to k
	public static int printCountSumK(int i,int[] arr,ArrayList<Integer> list,int sum,int n,int k) {
		//Base case
		if(i==n) {
			if(sum==k) {
				return 1;//just like counter in terms of return statement which will be added with take and not take fun and return result of both in that parent function
				
			}
			
			return 0;//counter is here means->>no prev ret executed->>so no summ==k->so 0
		}
		//take
		list.add(arr[i]);
		sum+=arr[i];
		int take=printCountSumK(i+1, arr, list, sum, n, k);
		
		//not take
		list.remove(list.size()-1);
		sum-=arr[i];
		int notTake=printCountSumK(i+1, arr, list, sum, n, k);
		
		return take+notTake;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int k=3;
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println(printCountSumK(0, arr, list,0, arr.length, k));
		//printOnlyOnceSubSeqSumK(0, arr, list, 0, arr.length, k);
//		printAllSubSeq(0, arr, list, arr.length);
//		System.out.println("Separated");
//		printSubSeqSumK(0, arr, list, 0, arr.length, k);
		
	}

}
