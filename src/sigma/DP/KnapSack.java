package sigma.DP;

//knapsack means bag
public class KnapSack {
	
	//function for finding max profit from given knapsack containing items and their values and wt
	//time->O(2^N),space->O(1)
	public static int knapsack(int val[],int wt[],int W,int n) {//here is n is no of items we have
		//n->0 means same wt, n-1->last items whose val is  kept in val array->we can say n is basically index to track items
		//Base case
		if(n==0 || W==0) {
			return 0;
		}
		
		
		/*Actually what is happenning here we are analysing all possible cases of profit when including or excluding and comparing with
		 * them and taking the max profit out of them at each step
		 */
		
		//valid conditions
		if(wt[n-1]<=W) {//means if capacity is greater than or equal to wt of item being taken
			//There are two steps possible,1st is include it in knapsack or exclude it
			//include
			int maxProfit1=val[n-1]+knapsack(val,wt,W-wt[n-1],n-1);//if item is included ,capacity(W) of knapsack will decrease by item wt
			                                                         //n-1 as one item will decrease
			//Exclude
			int maxProfit2=knapsack(val,wt,W,n-1);//as it is excluded so capacity(W) will not decrease
			
			return Math.max(maxProfit1, maxProfit2);
		} else {//if wt of item is graete than capacity means can not be kept in knapsack
			return knapsack(val,wt,W,n-1);//as it is excluded it will check for next item that we should inckude or not
		}
		
		
		
	}
	
	  //function for 0/1 knapsack using memoisation->time->O(N*W) -2d array
	   public static int knapsackMemo(int val[],int wt[],int W,int n,int dp[][]) {
		   
		   //Base case
		   if(n==0 || W==0) {
			   return 0;
		   }
		   
		   
		   if(dp[n][W]!=-1) {//dp[n][W] is equal to max profit overall in given scanario,at last row and last col cell
			   //means already calculated then simply return
			   return dp[n][W];
		   }
		   //above block operation will provide faster result for further operation of same n and W as it can be accessed in constant time
		   if(wt[n-1]<=W) {
			   //include
			   int ans1=val[n-1] + knapsackMemo(val,wt,W-wt[n-1],n-1,dp);
			   
			   //exclude
			   int ans2=knapsackMemo(val,wt,W,n-1,dp);
			   dp[n][W]=Math.max(ans1, ans2);//1st store then return for further operation remember
			   
			   return dp[n][W];
			  
		   } else {//wt is smaller than capacity
			   dp[n][W]=knapsackMemo(val,wt,W,n-1,dp);
			   return dp[n][W];
			   
		   }
		   
	   }
	   
	   
	//function for knapsack using tabulation
	   public static int knapsackTabulation(int val[],int wt[],int W,int n,int dp[][]) {//W->capacity,n->item no
		   
		   for(int i=0;  i<=n;  i++) {//here n+1 is nth row element->row no is items no here
			   for(int j=0;  j<=W;  j++) {//capacity at each coulumn(j)
				   //dp[i][j] means max profit when i items and j capacity  of knapsack given will be stored here
				   
				   if(i==0 || j==0) {
					   dp[i][j]=0;
					   continue;
				   }
				   
				   //now valid condition
				   if(wt[i-1]<=j) {//then u can include items or exclude ,both steps can be taken into consideration
					   //ith item in dp row means i-1 th item in wt array as in dp extra 0 item is taken for base case
					   //include ->val[i-1]+ dp[i-1][j-wt[i-1]]
					   //exclude->dp[i-1][j] no wt reduce as it is excluded
					   dp[i][j]= Math.max( val[i-1]+ dp[i-1][j-wt[i-1]] , dp[i-1][j]);
				   } else {
					   dp[i][j]=dp[i-1][j];//as this is exclude case so item will decrease by 1 ->i-1,but no wt will decrease as it is excluded ->j
					   
				   }
			   }
			   
		   }
		   
		   return dp[n][W];
		   
	   }
	
	public static void main(String[] args) {
		int[] val= {15,14,10,45,30};
		int wt[]= {2,5,1,3,4};
		int W=7;
		int[][] dp=new int[val.length +1][W +1];//as 0,1,2->n-> n+1 length,u can also exchange row column ,no problem
		
		//initialising the given 2d array dp with -1
		for(int i=0;  i<dp.length;  i++) {//dp.length->row length of dp 2d array
			for(int j=0;  j<dp[0].length;  j++) {//dp[0].length ->col length of dp 2d array
				dp[i][j]=-1;
				
			}
		}
		
		System.out.println(knapsack(val, wt, W, val.length));//as it is no of items
		System.out.println(knapsackMemo(val, wt, W, val.length, dp));
		System.out.println(knapsackTabulation(val, wt, W, val.length, dp));
		
	}

}
