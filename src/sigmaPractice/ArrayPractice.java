package sigmaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayPractice {
	
	//function for absolute difference of corresponding element of array
	public static void absDiff(int A[], int B[]) {
		
		int absDiff=0;
		
		for(int i=0;  i< A.length;  i++) {
			absDiff+=Math.abs(A[i]-B[i]);
		}
		
		System.out.println(absDiff);
	}
	
	//Function for Indian coins problem practice
	//min no of coins/notes to be given to make a change at shops/anywhere
	public static void indianCoins(Integer coins[], int amount) {
		
		int count=0;//for counting no of coins.notes given
		
		ArrayList<Integer> list=new ArrayList<>();//to store denominations being given
		//if u want to use Comparator, use it on object , if primitive wrap it
		//coins in descending order, means bigger curremcy will come first in use for min coins/notes given
		Arrays.sort(coins,Comparator.reverseOrder());
		
		for(int i=0;  i<coins.length;  i++) {
			if(coins[i]<=amount) {//if equal, change will be done in one coin.notes
				
				while(coins[i]<=amount) {//cases where multiple coins/notes we may have to give
					count++;
					list.add(coins[i]);
					amount=amount-coins[i];
				}
			}
		}
		
		System.out.println("Min no of coins given is :" + count);
		System.out.print("Denominations are :" + " ");
		//for denominations printing
		for(int i=0;  i<list.size();  i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Integer coins[]= {1,2,5,10,20,50,100,200,500,2000};
		
		indianCoins(coins, 1190);
		
//		int A[]= {2,5,6,1,3};
//		int B[]= {1,9,5,3,2};
//		
//		absDiff(A, B);
		
		
	}

}
