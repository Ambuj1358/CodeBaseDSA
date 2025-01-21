package sigma;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxWater {
	
	
	//using arrays->O(N^2)
	public static int maxWater(int height[]) {
		
		int maxWater=Integer.MIN_VALUE;
		for(int i=0;  i<height.length;  i++) {
			for(int j=i+1;  j<height.length;  j++) {
				int height1=Math.min(height[i], height[j]);
				int width=j-i;
				
				int waterStored=height1*width;
				maxWater=Math.max(maxWater, waterStored);
			}
		}
		
		return maxWater;
	}
	
	//using arraylist->Brute force-time complexity ->O(n^2)
	
	public static int max(ArrayList<Integer> height) {
		int maxWater=Integer.MIN_VALUE;
		
		for(int i=0;  i<height.size();  i++) {
			for(int j=i+1;  j<height.size();  j++) {
				int height1=Math.min(height.get(i), height.get(j));
				
				int width=j-1;
				int currWater=height1*width;
				maxWater=Math.max(maxWater, currWater);
			}
		}
		
		return maxWater;
	}
	
	//optimised container with most water->time complexity->O(N)- 2 POINTER APPROACH
	public static int maxWaterStored(ArrayList<Integer> height) {
		int max	=0;
		int lp=0;
		int rp=height.size()-1;
		
		while(lp<rp) {
			
			//calculate water area
			int ht=Math.min(height.get(lp), height.get(rp));
			int width=rp-lp;
			
			int currWater=ht*width;
			
			max=Math.max(max, currWater);
			//update pointer
			if(height.get(lp)<height.get(rp)) {
				lp++;
			} else {
				rp--;
			}
		}
		
		return max;
				
				
		}
	
	//all possible piars in an array
	
	public static void pair(int arr[]) {
		int n=arr.length;
		for(int i=0;  i<n;  i++) {
			for(int j=i+1;  j<n;  j++  ) {
				System.out.print( "(" + arr[i] + " ," + arr[j] + ")");
			}
			System.out.println();
		}
	}
	
	//pair sum problem using arraylist->O(N^2) ->BRUTE FORCE
	
	public static boolean pairSum(ArrayList<Integer> list,int target) {
		int n=list.size();
		
		for(int i=0;  i<n;  i++) {
			for(int j=i+1;  j<n;  j++) {
				if((list.get(i) + list.get(j))==target) return true;
			}
		}
		return false;
	}
	
	//optimised pair sum problem using 2 pointer approach->O(N) linear time
	
	public static boolean pairSumOptimised(ArrayList<Integer> list, int target) {
		int lp=0;//left most part
		int rp=list.size()-1;//right most part
		
		while(lp<rp) {//or while(lp!=rp)
			
			//checking condition
			//case 1
			if((list.get(lp) + list.get(rp))==target) return true;
			
			//updating pointer
			//case 2
			if((list.get(lp) + list.get(rp)< target)){
				lp++;//as arraylist is sorted and increasing lp will increase sum
			}  else {//case 3
				rp--;//it will decrease the sum as arraylist is sorted
			}
					
			
		}
		return false;
		
	}
	//this problem can also be solved using brute force very easily
	//pair sum2 ->sorted and rotated Arraylist-> optimised code
	public static boolean pairSum2(ArrayList<Integer> list, int target) {
		int n=list.size();
		int bp=-1;//breaking point set to -1 , an invalid index to indicate no bp found if it remains
		for(int i=0;  i<list.size();  i++) {
			if(list.get(i)>list.get(i+1)) {//generally later elemnet is bigger in increasing order sorted arraylist
				bp=i;//breaking point
				break;//assuming only one time rotation
			}
		}
		
		int lp=bp+1;
		int rp=bp;
		
		while(lp!=rp) {
			
			//doing operation
			
			
			int sum=list.get(lp) + list.get(rp); 
			//case1
			if(sum==target) return true;
			
			//updating pointer
			
			//case 2
			if(sum<target) {//then increase sum by increasing lp
				lp=(lp+1)%n;
			} else {//then decrease sum by decreasing rp
				//case 3
				rp=(n+rp-1)%n;
			}
					
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> height=new ArrayList<>();
		int target=100;
		
		height.add(11);
		height.add(15);
		height.add(6);
		height.add(8);
		height.add(9);
		height.add(10);
		
		System.out.println(pairSum2(height, target));
//		int target=10;
//		for(int i=1;  i<=6;  i++) {
//			height.add(i);
//		}
//		System.out.println(pairSumOptimised(height, target));
		
		//System.out.println(pairSum(height,target));
		
//		int arr[]= {2,8,3,1,7};
//		
//		pair(arr);
		
	//		int height2[]= {1,8,6,2,5,4,8,3,7};
//		ArrayList<Integer> height=new ArrayList<>();
//		height.add(1);
//		height.add(8);
//		height.add(6);
//		
//		height.add(2);
//		height.add(5);
//		height.add(4);
//		
//		height.add(8);
//		height.add(3);
//		height.add(7);
//		
//		System.out.println(maxWaterStored(height));
		
	//	System.out.println(max(height));
		
//		int height[]= {1,8,6,2,5,4,8,3,7};
//		
//		System.out.println(maxWater(height));
		
	}

}
