import java.util.Arrays;

public class MissingNumber {
	
	//function to find missing no between 1 to n
	//1st method
	public static int missingNum(int n,int[] arr) {
		int actualSum=0,expectedSum=0;
		
		for(int i=0;  i<arr.length;  i++) {
			actualSum+=arr[i];//sum of all elem of array
		}
		expectedSum=n*(n+1)/2;//sum of 1st n natural num
		
		//missing num is ->>exptedsum-actual sum
		
		return expectedSum-actualSum;
		
		
	}
	//2nd method->>sorting method
	public static int missingNum2(int n,int[] arr) {
		Arrays.sort(arr);//now we have soted array so we can easily check that which is missing num
		
		for(int i=0;  i<arr.length;  i++) {
			if(arr[i]==i+1) {
				continue;//num present at it;s place
			} else {
				return i+1;
			}
		}
		
	//return -1;//counter will never come here as one missing num is always there so it is just for the format of return
		return n;//as if nothing returned it mean n is missing as arr can't reach value of n as n-1 elem they have
		
		
	}
	
	
	//check for prime fun
	public static Boolean isPrime(int n) {
		if(n<=1) return false;
		
		if(n==2 || n==3) return true;
		
		for(int i=2;  i<=Math.sqrt(n);  i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	//function to check the any given number is sum of two prime numbers or not
	public static Boolean sumOfPrime(int n) {
		//n/2 + n/2 ==n->>this concept we will use here
		for(int i=2;  i<=n/2;  i++) {//as prime num starts from 2
			if(isPrime(i)) {
				if(isPrime(n-i)) {//complementary sum
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfPrime(17));
//		int[] arr= {3,2,6,9,5,1,8,4,10};
//		int n=arr.length+1;
//		
//		System.out.println(missingNum2(n, arr));
		
		//System.out.println(missingNum(n, arr));
	}

}
