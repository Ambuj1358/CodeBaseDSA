package sigma.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GreedyPractice {
	
	//function for activity selection when end time is sorted(max activity that can be performed)
	public static void activitySelection(int[] start,int[] end) {
		int maxAct=1;//as 1st activity will always present as end time for this is smallest as end time is 
		             //end time is sorted
		
		ArrayList<Integer> list=new ArrayList<>();//for storing index of activity
		list.add(0);//1st acttivity is always taken
		
		int lastEnd=end[0];//1st activity last end
		
		for(int i=1;  i<start.length;  i++) {//here i started from 1 as 0th index element is first that already been taken
			
			if(start[i]>=lastEnd) {
				maxAct++;
				lastEnd=end[i];
				list.add(i);
			}
		}
		System.out.println(maxAct);
		//now we also have index of that element in list, we can print that also
		for(int i=0;  i<list.size();  i++) {
			System.out.print("A" + list.get(i) + " ");
		}
		
	}
	
	//function for activity selection when end time is not sorted
	public static void activitySelection2(int[] start, int[] end) {
		//here we will not take maxAct=1, for now as end time is not sorted
		
		//Now we will sort end time by ourselves
		//creating 2d array
		int[][] activities=new int[start.length][3];//col size is 3 as 1st is for index ,2nd is for start time
		                                            //3rd is for end time which we will sort
	  //Here before sorting, we have to create(fill data in 2d array) so
		for(int i=0;  i<start.length;  i++) {
			activities[i][0]=i;
			activities[i][1]=start[i];
			activities[i][2]=end[i];
			
		}
		
		//when we sort this then end time is sorted rest is according to end time adjust
	   Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
	   
	   int maxAct=1;//now sorted end time 1st activity will be taken
	   ArrayList<Integer> list=new ArrayList<>();
	   
	   list.add(activities[0][0]);//1st element of sorted 2d array(super)
	   int lastEnd=activities[0][2];
	   
	   for(int i=1;  i<start.length;  i++) {
		   //start[i]>=lastEnd
		   if(activities[i][1]>=lastEnd) {
			   maxAct++;
			   lastEnd=activities[i][2];
			   list.add(activities[i][0]);//storing index of activity
		   }
	   }
	   
	   //now we also have index of activity to print in list
	   for(int i=0;  i<list.size();  i++) {
		   System.out.print("A" + list.get(i) + " ");
	   }
	   
	   
	   
	}

	//function for fractional knapsack
	public static void fractionalKnapsack(int[] val, int[] weight,int capacity) {
		//Here 1st of all, we will find the ratio of val and weight and sort them , then access them in descending order
		double[][] ratio=new double[val.length][2];
		
		for(int i=0;  i<val.length;  i++) {//here val.length is row length,it may be wt.length also as both are same
			ratio[i][0]=i;//store index in 1st column
			ratio[i][1]=val[i]/(double)weight[i];//store val in  2nd column
			                    //here double to not loose even fractional val;
			
		}
		
		//now we will sort ratio using lambda and comparator
		Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));//rest every other column will take place accordingly as mapped before
		
		int finalValue=0;
		
		//here element is sorted in ascending , we want them in descending so reverse iterate over ratio
		for(int i=val.length-1;  i>=0;  i--) {
			int idx=(int) ratio[i][0];//storing index to track equivalent index in wt array
			if(capacity>=weight[idx]) {//fixed wt of every item is given in wt array
				capacity-=weight[idx];
				finalValue+=val[idx];
			} else {
				finalValue+=  capacity*ratio[i][1];//means if unit wt contains ratio[i][0] valus then capacity wt will conatin how much
				capacity=0;//set capacity to zero
				break;//get out of loop as no place left in bag for further operation
			}
		}
		
		System.out.println(finalValue);
		
	}
	
	//function for minimum absolute difference sum finding
	public static void minAbsDif(int[] A, int[] B) {
		
		
		//concept is ->for min absolute diff closeness element should be min, for this if small element
		         //makes pair with small element then closeness will be min
		Arrays.sort(A);
		Arrays.sort(B);
		int minDiff=0;
		for(int i=0;  i<A.length;  i++) {
			minDiff+=Math.abs(A[i]-B[i]);
		}
		
		System.out.println("Sum of min absolute diff is :"+ minDiff);
		
	}
	
	//Function for maximum ansolute diff
	public static void maxAbsDiff(int[] A,int[] B) {
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		//concept is -> to achieve max abs diff , colesness of element should be max
		 //for this purpose pair smaller element with bigger one
		//i.e one is sorted in ascending and other descending(if not use reverse)
		
		int maxDiff=0;
		for(int i=0;  i<A.length;  i++) {//both array have same length
			maxDiff+=  Math.abs(A[i]-B[A.length-1-i]);
			
		}
		
		System.out.println("sum of max absolute diff is :" + maxDiff);
		
	}
	
	//function for max length chain of pairs
	public static void maxLength(int[][] pairs) {//t.c->O(NLOGN)
		
		Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
		
		int chainLength=1;//as 1st will be selected
		int chainEnd=pairs[0][1];
		for(int i=1;  i<pairs.length;  i++) {//here i started from 1 as i=0 already taken into consideration
			                                 //pairs.length===row length in 2 d array
			
			if(pairs[i][0]>chainEnd) {
				chainLength++;
				chainEnd=pairs[i][1];
			}
		}
		
		System.out.println("Max chain length of pair is :" + chainLength);
	}
	
	//function for max length of pairs including index also
	public static void maxLengthWithIndex(int[][] pairs) {
		int[][] arr=new int[pairs.length][3];
		
		for(int i=0;  i<pairs.length;  i++) {
			arr[i][0]=i;//storing index 
			arr[i][1]=pairs[i][0];
			arr[i][2]=pairs[i][1];
		}
		
		Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
		
		int chainLen=1;//as 1st will be taken
		int chainEnd=arr[0][2];
		ArrayList<Integer> list=new ArrayList<>();
		list.add(arr[0][0]);
		
		for(int i=1;  i<pairs.length;  i++) {
			if(arr[i][1]>chainEnd) {
				chainLen++;
				chainEnd=arr[i][2];
				list.add(arr[i][0]);
			}
		}
		
		System.out.print("Max Chain Length is :" + chainLen + " ");
		
		//for index Storing
		for(int i=0;  i<list.size();  i++) {
			System.out.print("P" + list.get(i) + " ");
		}
		
	}
	
	// function for INDIAN COINS PROBLEMS IN GREEDY
	//min coin to give to someone for change purpose
	public static void indianCoins(Integer coins[],int amount) {
		int count=0;
		
		Arrays.sort(coins,Comparator.reverseOrder());
		
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(int i=0;  i<coins.length;  i++) {
			if(coins[i]<=amount) {
				while(coins[i]<=amount) {
					count++;
					amount=amount-coins[i];
					list.add(coins[i]);
				}
			}
		}
		
		System.out.println("Min no of coins given :" + count);
		System.out.print("denominations are :");
		for(int i=0;  i<list.size();  i++) {
			System.out.print( list.get(i) + " " );
		}
		
		
	}
	
	static class Job{
		int id;
		int deadline;
		int profit;
		
		public Job(int id,int d, int p) {
			this.id=id;
			deadline=d;
			profit=p;
		}
	}
	
	
	//function for Job sequencing problems
	public static void jobSequencingProblems(int jobInfo[][]) {
		ArrayList<Job> jobs=new ArrayList<>();
		
		for(int i= 0;  i<jobInfo.length;  i++) {
			jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
		}
		
		//sorting jobs object based on profit
		//descending order
		Collections.sort(jobs, (obj1,obj2)-> obj2.profit -obj1.profit);
		
		ArrayList<Integer> seq=new ArrayList<>();
		int time=0;
		int maxProfit=0;
		
		for(int i=0;  i<jobs.size();  i++) {
			Job curr=jobs.get(i);
			if(curr.deadline > time) {
				
				maxProfit+=curr.profit;
				seq.add(curr.id);
				time++;
				
			}
		}
		
		System.out.println("Max Jobs :" + seq.size());
		
		//for printing size of job
		for(int i=0;  i<seq.size();  i++) {
			System.out.print(seq.get(i) + " ");
		}
		System.out.println();
		System.out.println("Max profit is :" + maxProfit);
		
	}
	
	
	
	public static void main(String[] args) {
		
		int jobInfo[][]= { {4,20},{1,10},{1,40},{1,30} };
		jobSequencingProblems(jobInfo);
		
//		Integer coins[]= {1,2,5,10,20,50,100,200,500,2000};
//		
//		indianCoins(coins, 1430);
//		
		
		
//		int[][] pairs= {{5,24},{39,60},{5,28},{27,40},{50,90}};
//		
//		maxLength(pairs);
//		maxLengthWithIndex(pairs);
		
//		int[] A= {1,2,3};
//		int[] B= {2,3,1};
//		
//		minAbsDif(A, B);
//		maxAbsDiff(A, B);
		
		
//		int[] val= {60,100,120};
//		int[] wt= {10,20,30};
//		int capacity=50;
//		
//		fractionalKnapsack(val, wt, capacity);
//		int[] start= {1,3,7,4,9};
//		int[] end= {2,5,9,11,23};
//		
//		activitySelection(start, end);
//		System.out.println();
//		activitySelection2(start, end);
		
	}

}
