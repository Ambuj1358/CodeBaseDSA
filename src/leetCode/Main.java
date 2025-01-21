package leetCode;

import java.util.Stack;

public class Main {
	
	//Function for Best time to buy and sell stock
	public static int buyAndSellStock(int[] prices) {
		int n=prices.length;
		int maxProfit=Integer.MIN_VALUE;
		int profit=0;
		for(int i=0;  i<n;  i++) {
			for(int j=i+1;  j<n;  j++) {
				if(prices[i]<prices[j]) {//condition for profit
					profit=prices[j]-prices[i];
					if(maxProfit<profit) {
						maxProfit=profit;
					}
				}
			}
		}
		
		return (maxProfit>0)?maxProfit:0;
	}
	
	//Find even or odd no based on bit manipulation
	public static void evenOrOdd(int n) {
		int bitmask=1;
		
		if((n & bitmask )==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	//function to get ith bit of a number in binary system
	public static int getIthBit(int n,int i) {
		int bitmask=1<<i;
		
		if((bitmask & n)==0) {
			return 0;
		}
		
		else {
			return 1;
		}
	}
	
	//function to set ith bit to 1 ovbiously
	public static int setIthBit(int n,int i) {
		int bitmask=1<<i;
		
		return bitmask | n;
	}
	
	//function to clear ith bit
	public static int clearIthBit(int n,int i) {
		int bitmask=1<<i;
		
		return ~(bitmask) & n;
	}
	
	//function for updating ith  bit
	//if it is 0->update it to 1
	//if it is 1-> update it to 0
	
	public static int updateIthBit(int n,int i) {
		int newBit=getIthBit(n, i);//from this I knew what is at ith index
		
		if(newBit==0) {
			return setIthBit(n, i);
		} else {//else it is 1
			return  clearIthBit(n, i);
			
		}
		
		
	}
	
	//function to find even or odd based on right shift operation
//	public static boolean evenFun(int n) {
//		
//	}
	
	//function to clear i bits
	public static int clearIBits(int n,int i) {
		int bitmask=(~0)<<i;
		
		return n & bitmask;
	}
	
	//clear bit in range
	public static int clearIBits(int n,int i,int j) {
		int a=(~0)<<(j+1);//all 1's after j+1
		int b=(1<<i)-1;//all 1's upto i-1
		
		int bitmask=a | b;
		
		return n & bitmask;
	}
	
	//function to check given number is power of 2 or not
	public static boolean ispowerOfTwo(int n) {
		if((n & (n-1) )==0) return true;
		
		return false;
	}
	
	//function to count set bits in a number->means no of 1's bit
	public static int NoOfSetBits(int n) {
		int count=0;
		
		while(n>0) {
			if((n & 1)!=0) {//means as lasb we habe 1
				count++;//one detector
			}
			n=n>>1;//remove 1 from lsb 
		}
		
		return count;
	}
	
	//function to reverse an array
	public static void reverse(int[] nums) {
		
		
		int n=nums.length;
		
		//right approach
		for(int i=0;  i<n/2;  i++) {
			//swap 1st with last and so on
			int temp=nums[i];
			nums[i]=nums[n-1-i];
			nums[n-1-i]=temp;
		}
//		for(int i=0; i<n;  i++) {
//			nums[i]=nums[n-1-i];
//		}//wrong approach
		
		for(int i:nums) {
			System.out.print(i + " ");
		}
	}
	
	//functio
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		reverse(arr);
		//System.out.println(NoOfSetBits(15));
		
//		System.out.println(clearIBits(15, 2));
//		System.out.println(clearIBits(1196, 2, 6));
		
		
//		int[] prices = {7,6,4,3,1};
//		
//		System.out.println(buyAndSellStock(prices));
		
//		System.out.println(getIthBit(70, 6));
//		 System.out.println(setIthBit(6, 0));
//		System.out.println(clearIthBit(6, 1));
//		
//		System.out.println(updateIthBit(36, 1));
		//evenOrOdd(24);
		
		//System.out.println("Main nhi bataunga");
		
		
		
//		Stack<String> st=new Stack<>();
//		String[] arr= {"ambuj","kumar","sharma"};
//		
//		for(String str:arr) {
//			st.push(new StringBuilder(str).reverse().toString());
//		}
		
		//System.out.println(st);
		
		
		//int nums[]= {1,2,2,3,3,4,4};
		
//		int arr[] = { 2, 4, 4, 4 };
//		
//		System.out.println(Arrays.stream(arr).mapToObj(Integer::valueOf)
//				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet().stream()
//				.min(Map.Entry.comparingByValue()).get().getKey());
//		
		

	}

}
