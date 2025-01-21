package sigma;

import java.util.ArrayList;

public class GreedyDemo {
	
	public static void main(String[] args) {//O(n)
		//program for activity selection
		int[] start= {1,3,0,5,5,8};
		int[] end= {2,4,6,7,9,9};//sorted on basis of end time
		
		ArrayList<Integer> list=new ArrayList<>();//It will store index of activity selected
		int maxAct=0;//max activity counter
		
		//activity1-always selected as it will end very first
		list.add(0);
		maxAct=1;//here we can initially do this , no problem but for more clarity of concepts 
		//,we have updated after
		
		int lastEnd=end[0];
		
		for(int i=1;  i<end.length;  i++) {
			if(start[i]>=lastEnd) {//non overlapping i.e start time of next activity should be greater than or equal 
				//to end time of prev activity
				maxAct++;
				list.add(i);
				lastEnd=end[i];//here lastEnd got updated according to latest activity end time
				
			}
		}
		
		System.out.println(maxAct);
		System.out.print("Activities are ");
		
		for(int i=0;  i<list.size();  i++) {
			System.out.print("A"+ list.get(i) + " ");
		}
	}

}
