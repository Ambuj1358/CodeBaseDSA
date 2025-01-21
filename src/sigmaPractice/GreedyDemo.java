package sigmaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyDemo {
	
	//function for activity Selection(when end time is sorted)
	public static void activitySelection(int start[], int end[]) {
		int maxAct=1;//as end time is sorted so 1st activity is always taken because it has less end time
		ArrayList<Integer> list= new ArrayList<>();//for activity index storing
		
		int lastEnd=end[0];//for tracking the last end time
		list.add(0);//storing the index for 1st activity
		
		
		//here i is starting from 1 as 0th index is 1st element which is already taken into consideration
		for(int i=1;  i<end.length;  i++) {
			if(start[i]>=lastEnd) {
				maxAct++;
				lastEnd=end[i];
				list.add(i);
			}
		}
		
		System.out.println("Max activity possible is :" +maxAct);
		
		//for index of activity
		for(int i=0;  i<list.size();  i++) {
			System.out.print("A" + list.get(i) + " "); 
			
		}
		
		System.out.println();
		
		
		
	}
	
	//function for activity Selection when end time is not sorted
	public static void activitySelection2(int[] start, int[] end) {
		//now for sorting end time, we will take 2d array
		int[][] activities=new int[start.length][3];//column is 3 as 1 is for index , 2nd is for start time storing
		                                            //3rd is for end time storing
		
		//now we will store the corresponding element into 2d array
		for(int i=0;  i<start.length; i++) {
			activities[i][0]=i;//0th column is for storing index
			activities[i][1]=start[i];//1st column is for storing start time;
			activities[i][2]=end[i];//2nd column is for storing end time
			
		}
		
		//now we want to sort end time using lambda function and comparator
		Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));//sorting the 2nd column and 
		                                                           //copying the other parameter respectively
		
		int maxAct=1;//as after sorting end time,1st activity will be taken
		int lastEnd=activities[0][2];//1st element of sorted end time
		ArrayList<Integer> list=new ArrayList<>();//for storing the index of activity
		list.add(activities[0][0]);
		
		for(int i=1;  i<start.length;  i++) {
			if(activities[i][1]>=lastEnd) {
				//Activity Selection
				maxAct++;
				lastEnd=activities[i][2];//last index will be updated according to end time ith position
				list.add(activities[i][0]);//index storing
				
			}
		}
		
		System.out.println("Max activity is "+ maxAct); 
		
		//for Activity index
		for(int i=0;  i<list.size();  i++) {
			System.out.print("A" + list.get(i) + " "); 
			
		}
		
		
		
	}
	
	//function for indian coins problems-give min coins possible
	public static void indianCoins(int coins[], int amount) {
		//Arrays.sort(coins);//ascending order sorting
		
		int count=0;
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=coins.length-1;  i>=0;  i--) {
			if(coins[i]<=amount) {
				while(coins[i]<=amount) {// for multiple single denominations
				  count++;
				  list.add(coins[i]);
				  amount-=coins[i];
				}
			}
		}
		
		System.out.println("Min no of coins given :" + count);
		System.out.print("Denominations are :" + " ");
		//for Denominations information
		for(int i=0;  i<list.size();  i++) {
			System.out.print( + list.get(i) + " ");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int coins[]= {1,2,5,10,20,50,100,200,500,2000};
		indianCoins(coins, 605);
		
		
//		int[] start= {9,4,7,3,1};
//		int[] end= {23,11,9,5,2};
//		
//		//activitySelection(start, end);
//		activitySelection2(start, end);
//		
		
	}

}
