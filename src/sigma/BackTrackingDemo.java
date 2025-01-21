package sigma;

public class BackTrackingDemo {
	
	//Function for Backtracking on array
	public static void changeArr(int arr[], int i, int val) {
		
		
		//base cases
		if(i==arr.length) {
			printArr(arr);
			return;
		}
		//recursion
		arr[i]=val;
		changeArr(arr, i+1, val+1);
		//backtracking step
		arr[i]=arr[i]-2;
	}
	//function to print array elements
	public static void printArr(int arr[]) {
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//function for finding all possible subsets of a string
	public static void subset(String str, int i, String ans) {
		//base cases
		if(i==str.length()) {//crossed string length
			System.out.println(ans);
			
			return;
		}
		//System.out.println("alpha");
		
		//recursion
		//yes case
		subset(str, i+1, ans+str.charAt(i));
		//case no
		subset(str, i+1, ans);
	}
	
	//function to find all permutations of String
	public static void findPermutation(String str, String ans) {
		
		//base cases
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		//recursion
		for(int i=0;  i<str.length();  i++) {
			char curr=str.charAt(i);
			
			String newStr=str.substring(0,i) + str.substring(i+1);//it will go upto last(last wala string)
			findPermutation(newStr, ans + curr);
		}
	}
	
	public static void main(String[] args) {
		
		findPermutation("abc", "");
		
		//String str="abc";
		
		
		//subset(str, 0, "");
		//int arr[]=new int[5];
		//changeArr(arr, 0, 1);
		//System.out.println();
		//printArr(arr);
	}

}
