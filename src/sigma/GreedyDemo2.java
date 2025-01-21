package sigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//when we don't have end time sorted
public class GreedyDemo2 {
	
		
	public static void main(String[] args) {
		
		int[] start= {1,3,0,5,8,5};
		int[] end= {2,4,6,7,9,9};//unsorted end time
		
		//we will make 2d array to sort end time and copy start time according to adjusted value
		int activities[][]=new int[start.length][3];//here column is 3 as one is for index, 2nd is for start time 
		                                            //3rd is for end time
        for(int i=0;  i<start.length; i++) {
			activities[i][0]=i;//storing index value to preserve previous order
			activities[i][1]=start[i];//storing start time
			
			activities[i][2]=end[i];//storing end time
			
		}
        
        
		ArrayList<Integer> list=new ArrayList<>();
		//sorting activity using lambda function
		Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
		
		int maxAct=1;//as first is already in present in activity(less time to complete)
		
		list.add(activities[0][0]);
		int lastEnd=activities[0][2];
		
		for(int i=1;  i<start.length;  i++) {
			if(activities[i][1]>=lastEnd) {
				maxAct++;
				list.add(activities[i][0]);
				lastEnd=activities[i][2];
			}
		}
		
		System.out.println("Max activity is :" + maxAct);
		
		for(int i=0;  i<list.size();  i++) {
			System.out.print("A" + list.get(i) + " ");
		}
		
		
		
		
		
	}

}
