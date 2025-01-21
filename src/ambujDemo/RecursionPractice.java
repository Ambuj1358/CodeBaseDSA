package ambujDemo;


import java.util.ArrayList;

//CLASS FOR PRACTICING RECURSION ,DIVIDE AND CONQUER AND BACKTARCKING PROBLEM

//Sigma practice questions Recursion
public class RecursionPractice {
	
	//QS->1
	//function for printing all indices of given element(key) in array using recusrion
	public static void printIndices(int arr[],int key,int i) {
		//Base case
		if(i==arr.length) return ;//if i is out of array->>return or remove call stack
		
		if(arr[i]==key) {
			System.out.print(i + " ");
		}
		
		 printIndices(arr, key, i+1);
	}
	
	//QS->2=>> Function for converting given number into String using recursion
	public static String convert(int n) {
		//using iteration
		StringBuilder sbr=new StringBuilder();
		
		while(n>0) {
			int rem=n%10;
			if(rem==0) sbr.append("zero ");
			else if(rem==1) sbr.append("one ");
			else if(rem==2) sbr.append("two ");
			else if(rem==3) sbr.append("three ");
			else if(rem==4) sbr.append("four ");
			else if(rem==5) sbr.append("five ");
			else if(rem==6) sbr.append("six ");
			else if(rem==7) sbr.append("seven ");
			else if(rem==8) sbr.append("eight ");
			else if(rem==9) sbr.append("nine ");
			
			n=n/10;
		}
		String str=sbr.toString().trim();
		String[] arr= str.split("/s+");
		
		int left=0,right=arr.length-1;
		
		while(left<right) {
			//swap left array ele with right array element
			String temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		String str2=String.join(" ", arr);
		
		return str2;
		
		
		
		
		
		
		
		
	}
	static String[] digits= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	//Recursive approach for qs-2
  public static String convertString(int n) {
	 //Base case
	  if(n==0) return "" ;
	  
	//First of all keep going upto end so that we can collect character from last
	  String result=convertString(n/10);
	  
	  if(!result.isEmpty()) {
		  result+=" ";
		  
	  }
	  int lastDigits=n%10;
	  
	  
	  return result + digits[lastDigits];
	 
	  
  }
  
  //Striver problem sheet->>LEC2
  //q1->>print your name  5 times->>normal recursion->>done
  //Q2->>print linearly 1 to n->>normal Recursion->>Done
  //Q3->>Print linearly n to 1 ->>normal Recursion->>Done
  //Q4->>print 1 to N using backtracking
  //Normal Recursion=>>base case->kaam ->recursive fun
  //Backtracking->>Base case->>recursive call->>kaam
  
  //function for printing 1 to n using Backtracking
  public static void printBack(int n) {
	  //Base case
	  if(n==0) return;
	  
	  printBack(n-1);//keep calling this function untill we are done 
	  System.out.print(n + " ");
  }
  
    //Q5->>Print N to 1 using Backtracking
    //function for printing N to 1 using Backtracking
    public static void printBackRev(int i,int n) {
    	//Base case
    	if(i>n) return;
    	
    	printBackRev(i+1, n);
    	System.out.print(i + " ");
    }
    
    //Reverse an array using Recursion
    public static void reverse(int[] arr,int left,int right) {
    	//Base case
    	if(left==right) return;
    	
    	//swap left ele with right
    	int temp=arr[left];
    	arr[left]=arr[right];
    	arr[right]=temp;
    	left++;
    	right--;//as updating this inside function will not work->>as ++,or -- executrs in next line
    	
    	//recursive function
    	reverse(arr, left, right);//rec fun with updated parameter for further work
    	return;
    }
    //function for finding a string is palindrome using Recursion
    public static Boolean isPalindrome(String str,int left,int right) {
    	//Base case
    	if(left==right) return true; //no need to do anything when left==right,counter is here means no diff char detected from corresponding index from start and end
    	
    	//now we will try to detect one char for which their identity as pallindrome is vanished
    	if(str.charAt(left)!=str.charAt(right)) {
    		return false;//whenever diff observed/detected->>yes ->>we vanished palindrome nature or detected
    	}
    	
    	return isPalindrome(str, left+1, right-1);//call for next iteration of next character
    }
    
    //Printing subsequences using recursion(Backtracking)
    public static void printSubsequences(int ind,ArrayList<Integer> list,int[] arr,int n) {//n->>arr length,list ->data structure to carry the subsequeneces
    	//Base case
    	if(ind==n) {//we are increasing linearly so ind will never cross n
    		System.out.println(list);
    		return;
    	}
    	//->>pick
    	list.add(arr[ind]);
    	//subsequences are generated based on data that u are taking element or not but order should be preserved
    	printSubsequences(ind+1, list, arr, n);//go for next ele upto last then backtrack
    	//list.add(arr[ind]);//Not pick initially
    	
    	//list.remove(list.size()-1);//trying out all possible combos 
    	list.remove(list.size()-1);//trying out all possible combos 
    	
    	printSubsequences(ind+1, list, arr, n);//looking for data with next permutation
    	
    	
    	
    }
    
    
    
    //printing subsequence whose sum is equal to k
    public static void printSubSumK(int ind,ArrayList<Integer> list,int[] arr,int n,int k,int sum) {//adding extra sum to look for curr ds sum
    	
//    	//Base case
//    	if(ind==n) {
//    		if(sum(list)==k) {//whenever we have list with sum k->>print it
//    			System.out.println(list);
//    		}
//    		return;
//    	}
//    	
    	
    	//we can also do sum operation in constant time as updating sum with every ele pick or not pick
    	//Base case
    	if(ind==n) {
    		if(sum==k) {
    			System.out.println(list);
    		}
    		
    		return;
    		
    	}
    	//Take (ind)ele 
    	list.add(arr[ind]);
    	//and also update the sum variable
    	sum+=arr[ind];
    	//go for the next ele possibilities
    	printSubSumK(ind+1, list, arr, n,k,sum);
    	
    	//Not take ind index ele
    	list.remove(list.size()-1);//if this ind ele is not coming ->remove this from list/car
    	//also update sum variable
    	sum-=arr[ind];
    	
    	//go for further possibilities
    	printSubSumK(ind+1, list, arr, n,k,sum);
    	
    }
    
    //for printing subsequences only once ->>take boolean flag  as global varible(instance static variable) and we we are printing set flag==true
    //inside base case if(sum==k && flag==false)->then only print the list otherwise don't
    
    //function for sum of elements inside list
    public static int sum(ArrayList<Integer> list) {
    	int sum=0;
    	for(int i=0;  i<list.size();  i++) {
    		sum+=list.get(i);
    		
    	}
    	
    	return sum;
    }
    
    //function check for return statement
    public static Boolean print(int n) {
    	System.out.println(n);
    	return true;
    }
    
    //function for printing subsequence whose sum is k only one time->>subsequence may be any
    public static Boolean printSubSeqSumKSingle(int i,ArrayList<Integer> list,int[] arr,int n,int k,int sum) {
    	//Base case
    	if(i==n) {
    		if(sum==k) {
    			System.out.println(list);
    			return true;//no need to print further
    		}
    		return false;
    	}
    	//pick this index element
    	list.add(arr[i]);
    	sum+=arr[i];
    	//call recursive function for further operations
    	if(printSubSeqSumKSingle(i+1, list, arr, n, k, sum)) return true;
    	
    	//Do not pick this index element
    	//so ele is already in list at last of list->>remove them
    	list.remove(list.size()-1);
    	//update sum
    	sum-=arr[i];//as arr[i] ele is added in this sum
    	
    	
    	//call recursive function for for generating possibilities without this index element
    	if(printSubSeqSumKSingle(i+1, list, arr, n, k, sum)) return true;
    	
    	return false;//if no rec call fun is returning true ->>then it means no such subsequences exist with sum k->>so return false
    }
    
    //function for count subsequences with sum k
    public static int countSubsequences(int i,ArrayList<Integer> list,int[] arr,int n,int k,int sum,int count) {
    	
    	//Base case
    	if(i==n) {
    		if(sum==k) {
    			count++;
    			return count ;
    		}
    	}
    	
    	//pick the element
    	list.add(arr[i]);
    	//update sum
    	sum+=arr[i];
    	//call recursive function
    	int a=countSubsequences(i+1, list, arr, n, k, sum,count);
    	
    	//do not pick this elment
    	list.remove(list.size()-1);
    	sum-=arr[i];
    	
    	//call recursive function for further operation
    	int b=countSubsequences(i+1, list, arr, n, k, sum,count);
    	return a+b;
    	
    }
    
    
   
     
  
	public static void main(String[] args) {
		
		int[] arr= {1,2,1};
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println(countSubsequences(0, list, arr, arr.length, 2, 0, 0));
		//System.out.println(printSubSeqSumKSingle(0, list, arr, arr.length, 2, 0));
		//print(10);
//		int[] arr= {1,2,1};
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		printSubSumK(0, list, arr, arr.length, 2,0);
		
//		int[] arr= {1,2,3,4,5};
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		printSubsequences(0, list, arr, arr.length);
//		String str="ambma";
//		System.out.println(isPalindrome(str, 0, str.length()-1));
		
		
//		int[] arr= {1,2,3,4,5};
//		reverse(arr, 0, arr.length-1);//now arr is revrsed
//		for(int i=0;  i<arr.length;  i++) {
//			System.out.print(arr[i]+ " ");
//		}
//		printBack(5);
//		System.out.println();
//		printBackRev(1, 5);
		
	//	System.out.println(convertString(2026));
		
//		 String str= convertString(2019);
//		 System.out.println(str);
		//System.out.println(convert(2019));
//		int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key=2;
//		printIndices(arr, key, 0);
		
	}
	
	

}
