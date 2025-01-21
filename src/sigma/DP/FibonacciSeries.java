package sigma.DP;

public class FibonacciSeries {
	
	//function for fibonacci using dp->time->O(N)->linear time
	//in case of recursion it was ->O(2^N)->Exponential
	//Memoization in dp concepts used here
	public static int fib(int n, int f[]) {
		if(n==0 || n==1) return n; 
		
		if(f[n]!=0) {//means initially f array has all elements set to 0,so if nth element is not 0 means we have calculated f[n]->
			      //no need to calculate again ->This is called optimised recursion(dynamic Programming)
			return f[n];
		}
		
		//Basically what we will happen is->left skewed tree will calculate all the fibonacci num and store in f[] ->so that from next time
		//we don't need to calculate them again ->we will directly access them
		
		f[n]=fib(n-1, f) + fib(n-2, f);
		
		return f[n];
		
		
	}
	//oth fibb,1th fibb,nth fibb
	//function for nth fibbonacci using tabulation->time-O(N),SPACE->O(N) due to dp array
	public static int fibTabulation(int n) {
		
		int dp[]=new int[n+1];//as we have to store(0 to 1,2,3,upto n)->so container size must be atleast-> n+1
		//from convention
		//dp[0]=0;as it is 0 in array itself in java
		//dp[1]=1; it will not work for a test case where n=1, as for n=1, only 0 carrying dp array will be there
		//so to compensate write 1's logic if n>1 inside loop
		
		for(int i=2;  i<dp.length;  i++) {
			
			if(i==1) {
				dp[1]=1;
				continue;//to go for next i, as further going will give u array index out of bound for length-1, as i-2 term is there
				
			}
			dp[i]=dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n=9;
		System.out.println(fibTabulation(n));
		
//		int f[]=new int[n+1];//n+1 is size of array to access f(n) as fibonacci starts from 0 and to find fib(n)->means n+1 th element of array
//		                      //that's why size is n+1
//		
//		System.out.println(fib(n, f));
	}

}
