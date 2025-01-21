package sigma;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	//function for finding food of choice
	public static int foodFinder(String str[], String str2) {
	
		for(int i=0;  i<str.length;  i++) {
			if(str[i].equalsIgnoreCase(str2)) {
				return i;
			}
		}
		return -1;
	} 
	
	//function for printing subarray
	public static void printSubarray(int numbers[]) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;  i<numbers.length;  i++) {
			int start=i;
			for(int j=i;  j<numbers.length;  j++) {
				int end=j;
				int sum=0;
				for(int k=start;  k<=end;  k++) {
					sum+=numbers[k];
					System.out.print(numbers[k] + " ");
				}
				
				
				if(largest<sum) {
					largest=sum;
				}
				if(smallest>sum) {
					smallest=sum;
				}
				
				System.out.println("->sum of subarray is :"+sum);
				System.out.println();
				
			}
			System.out.println();
		}
		System.out.println("Largest subarray sum is :" + largest);
		System.out.println("Smallest subarray sum is :" + smallest);
	}
	
	
	//function for finding max subarray sum by brute force
	public static void maxSubarraySum(int numbers[]) {
		int currSum=0;
		int maxSum=0;
		
		for(int i=0;  i<numbers.length;  i++) {
			for(int j=i;  j<numbers.length;  j++) {
				currSum=0;
				for(int k=i;  k<=j;  k++) {
					currSum+=numbers[k];
				}
				System.out.println(currSum);
				
				if(maxSum<currSum) {
					maxSum=currSum;
				}
			}
		}
		System.out.println("Max sum is :"+ maxSum);
	}
	
	
	//function for binary Search
	public static int binarySearch(int numbers[],  int key) {
		int n=numbers.length;
		int start=0,end=n-1;
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(numbers[mid]==key) {
				return mid;
			}
			if(mid>key) {
				end=mid-1;
			} else {
				start=mid+1;
			}
			
			
		}
		return -1;
		
	}
	
	
	//function for finding max subarray sum by using prefix array
	public static void maxSubarraySumUsingPrefixArray(int numbers[]) {
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		
		int prefix[]=new int[numbers.length];
		
		prefix[0]=numbers[0];
		
		for(int i=1;  i<numbers.length;  i++) {
			prefix[i]=prefix[i-1] + numbers[i];
		}
		
		for(int i=0;  i<numbers.length;  i++) {
			int start=i;
			for(int j=i;  j<numbers.length;  j++) {
				int end=j;
				currSum=0;
				
				currSum=(start==0)? prefix[end]:(prefix[end]-prefix[start-1]);
				if(maxSum<currSum) {
					maxSum=currSum;
				}
			}
		}
		System.out.println("Max sum is :" + maxSum);
	}
	//function  for finding max subarray sum using Kadanes algorithm->most optimised O(n)
	public static void maxSubarraySumByKadens(int numbers[]) {
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		
		for(int i=0;  i<numbers.length;  i++) {
			
			currSum+=numbers[i];
			if(currSum<0) {
				currSum=0;
			}
			if(maxSum<currSum) {
				maxSum=currSum;
			}
		}
		System.out.println("max sum is :" + maxSum);
	}
	
	
	public static void simpleMaxSubarraySum(int numbers[]) {
		int cs=0;
		int ms=Integer.MIN_VALUE;
		
		for(int i=0;  i<numbers.length;  i++) {
			cs+=numbers[i];
			
			if(ms<cs) {
				ms=cs;
			}
		}
		System.out.println("Max sum is :" + ms);
	}
	//Array assignment  questions
	//q1 done
	public static boolean repeat(int nums[]) {
		
		
		int count=0;
		for(int i=0;  i<nums.length;  i++) {
			
			for(int j=i+1;  j<nums.length;  j++) {
				
				if(nums[i]==nums[j]) {
					count++;
					return true;
				}
			}
		}
		return false;
	}
	
	//q2->DONE
	//Binary search applied
	public static int index(int nums[], int target) {
		//int count=0;
		
		//here time complexity is 0(n), we want time complexity to be O(logn)
//		for(int i=0; i< nums.length;  i++) {
//			if(nums[i]==target) {
//				System.out.println(i);
//				count++;
//			} 
//		}
//		
//		if(count==0) {
//			System.out.println("-1");
//		}
//		
		
		//Here we are going to use binary search
		int n=nums.length;
		int start=0;
		int end=n-1;
		
		while(start<=end) {
			int mid=(start + end)/2;
			
			if(target==nums[mid]) {
				return mid;
			}
			if(target>mid) {
				start=mid+1;
			} else {
				end=mid-1;
			}
			
			
		}
		return -1;
		
		
	}
	
	//Q3->done
	
	public static int maxProfit(int prices[]) {
		
		int mp=0;
		int bp=Integer.MAX_VALUE;
		
		for(int i=0;  i<prices.length;  i++) {
			if(bp<prices[i]) {
				int profit=prices[i]-bp;
				
				if(mp<profit) {
					mp=profit;
				} 
			} else {
				bp=prices[i];
			}
		}
		  
		return mp;
	}
	
	//Q4->TRAPPING OF RAINWATER->done
	
	public static int trappedWater(int height[]) {
		
		int n=height.length;
		int tp=0;
		
		int leftMax[]=new int[n];
		int rightMax[]=new int[n];
		
		leftMax[0]=height[0];
		rightMax[n-1]=height[n-1];
		
		for(int i=1;  i<n;  i++) {
			leftMax[i]=Math.max(height[i], leftMax[i-1]);
		}
		
		for(int i=n-2;  i>=0;  i--) {
			rightMax[i]=Math.max(height[i], rightMax[i+1]);
		}
		
		for(int i=0;  i<n;  i++) {
			int wl=Math.min(leftMax[i], rightMax[i]);
			tp=tp+(wl-height[i]);
		}
		return tp;
	}
 	//armstrong number finding
	
	public static void isArmstrong(int n) {
		
		int temp=n;
	    int res=0;
	    
	    while(temp>0) {
	    	int rem=temp%10;
	    	
	    	res+=rem*rem*rem;
	    	temp/=10;
	    }
	    
	    if(res==n) {
	    	System.out.println("The given no is armstrong number");
	    } else {
	    	System.out.println("Not a armstrong no");
	    }
	}
	
	//Array assn q5 print triplet
	public static void triplet(int arr[]) {
		int n=arr.length;
		
		System.out.print("[");
		for(int i=0; i<n;  i++) {
			for(int j=i+1;  j<n;  j++) {
				for(int k=j+1;  k<n;  k++) {
					if((arr[i] + arr[j] + arr[k])==0) {
						System.out.print("[" +arr[i] + "," + arr[j] + ", " + arr[k] + "]" +", " );
					}
				}
			}
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		
		int arr[]= {-1, 0,  1, 2, -1, -4};
		triplet(arr);
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		isArmstrong(n);
//		
		//int height[]= {4, 2, 0, 3, 2, 5};
		
		
		//System.out.println(trappedWater(height));
		
	//	simpleMaxSubarraySum(numbers);
		
	  // maxSubarraySumByKadens(numbers);
		
		//maxSubarraySumUsingPrefixArray(numbers);
		
		//maxSunarraySum(numbers);
		
//		Arrays.sort(numbers);
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter a key u want to search index");
//		int key=sc.nextInt();
//		int index=binarySearch(numbers, key);
//		
//		if(index==-1) {
//			System.out.println("Key is not found");
//		} else {
//			System.out.println("Key is found at index :" + index);
//		}
//		
		
		
//		for(int i=0;  i<numbers.length;  i++) {
//			if(key==numbers[i]) {
//				System.out.println("Key os found at index i :" + i);
//			}
//		}
		
		//printSubarray(numbers);
		
		
//		int largest=Integer.MIN_VALUE;
//		System.out.println(largest);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter food u want");
//		
//		String str[]= {"samosa","sandwitch","coke","pizza","Burger"};
//		String str2=sc.nextLine();
//		
//		
//		int index=foodFinder(str,str2);
//		
//		if(index==-1) {
//			System.out.println("Food not found");
//		} else {
//			System.out.println("Food is at index :" + index);
//		}
		
		
		
		//int marks[]= {2,9,1,3,8,4};
		
		//Concept of subarray->total no of subarray
		
		
		
		
//		int n=marks.length;
//		//pairs in an array
//		int nop=0;
//		for(int i=0;  i<n;  i++) {
//			if(i==n-1) {
//				break;
//			}
//			for(int j=i+1;  j<n;  j++) {
//				System.out.print("(" + marks[i] + "," + marks[j] + ")" + " ");
//				nop++;
//			}
//			System.out.println();
//		}
//		System.out.println("Numbers of pairs formed is :"+nop);
		
		//Reversing an array
		
		//for actual reverse operation
		
		//using while loop
		
//		int start=0;
//		int end=marks.length-1;
		//we can also solve it without using third varible like temp
		
//		while(start<end) {
////			int temp=marks[start];
////			marks[start]=marks[end];
////			marks[end]=temp;
//			
//			marks[start]=marks[start] + marks[end];
//			marks[end]=marks[start]-marks[end];
//			marks[start]=marks[start]-marks[end];
//			start++;
//			end--;
//		}
//		
//		for(int i=0;  i<marks.length;  i++) {
//			System.out.print(marks[i] + " ");
//		}
		//using for loop
//		int n=marks.length;
//		
//		for(int i=0;  i<=n/2;  i++ ) {
//			int temp=marks[n-1-i];
//			marks[n-1-i]=marks[i];
//			marks[i]=temp;
//		}
//		
//		for(int i=0;  i<n;  i++) {
//			System.out.print(marks[i]+ " ");
//		}
		
		//for only printing
//		for(int i=0;  i<marks.length;  i++) {
//			System.out.print(marks[i] + " ");
//		}
//		System.out.println();
//		for(int i=marks.length-1;  i>=0;  i--) {
//			System.out.print(marks[i] + " ");
//		}
		
//		int largest=Integer.MIN_VALUE;//negative infinity
//		
//		int smallest=Integer.MAX_VALUE;
//		for(int i=0;  i<marks.length;  i++) {
//			if(smallest>marks[i]) {
//				smallest=marks[i];
//			}
//			if(largest<marks[i]) {
//				largest=marks[i];
//			}
//		}
//		System.out.println(largest);
//		System.out.println(smallest);
//		
//		if(largest==smallest) {
//			System.out.println("All elements are same");
//		}
		
//		int key=8;
//		
//		//find index of element key in an array
//		//int count=0;
//		
//		int largestNum=0;
//		for(int i=0;  i<marks.length;  i++) {
//			if(marks[i]>largestNum) {
//				largestNum=marks[i];
//			}
//		}
//		System.out.println(largestNum);
//			if(marks[i]==key) {
			
//				
//				System.out.println(i);
//				//count++;
//				
//			}
//		}
////		if(count==0) {
////			System.out.println("No such element exist in an array");
	}

}
