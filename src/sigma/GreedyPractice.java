package sigma;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyPractice {
	
	//function for fractional knapsack(bag)
	public static void fractionalKnapsack(int[] val, int[] weight,int wt) {
		
		double[][] ratio=new double[val.length][2];
		
		for(int i=0;  i<val.length; i++) {
			ratio[i][0]=i;//index stored
			ratio[i][1]=val[i]/(double)weight[i];//typecasted to double to avoid loosing even fractional value
			
		}
		
		//now sorting ratio, ascending order
		Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
		
		int capacity=wt;
		int finalVal=0;
		//here val.length is row length, it can also be written as rati.length
		for(int i=val.length-1;  i>=0;  i--) {//as we want descending order,
			                                  //so that we can include high value pruduct first
			int idx=(int)ratio[i][0];//index of specific element
			if(capacity>=weight[idx]) {//complete include
				capacity-=weight[idx];//capacity will decrese by that element weight
				finalVal+=val[idx];
				
			} else {//fractional include
				finalVal+=capacity*ratio[i][1];//1 column as we are multiplying ratio
				//now
				capacity=0;
				break;
			}
		}
		
		System.out.println(finalVal);
	}
	
	
	public static void main(String[] args) {
		
		int[] val= {60,100,120};
		int[] weight= {10,20,30};
		int w=50;
		
		fractionalKnapsack(val, weight, w);
		
		
		
		
	}

}
