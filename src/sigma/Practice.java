package sigma;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Practice {
	
	
	//Program for Palindromic string
	public static void isPalindromicString(String str) {
		String rev="";
		
		for(int i=0;  i<str.length();  i++) {
			rev=rev+ str.charAt(str.length()-i-1);
		}
		
		if(rev.equals(str)) {
			System.out.println("Given String is palindromic string");
		} else {
			System.out.println("NoT a palindromic string");
		}
	}
	//Program for palindromic number
	public static void isPalindromicNumber(int n) {
		int temp=n;
		
		int rev=0;
		
		while(temp>0) {
			int rem=temp%10;
			
			rev=rev*10 + rem;
			temp/=10;
		}
		
		if(rev==n) {
			System.out.println("Palindromic number");
		} else {
			System.out.println("Not a palindromic number");
		}
	}
	
	public static void reverseString(String str) {
		String rev="";
		int n=str.length();
		int i=0;
		while(i<n) {
			rev=rev+ str.charAt(n-1-i);
			i++;
		}
		
		System.out.print(rev + " ");
	}
	
	public static void positionChange(String str) {
		String str1[]=str.split(" ");
		
		for(int i=0;  i<str1.length;  i++) {
			System.out.print(str1[str1.length-1-i] + " ");
		}
	}
	
	public static void reverseNumber(int n) {
		int temp=n;
		
		int rev=0;
		
		while(temp>0) {
			int rem=temp%10;
			
			rev=rev*10  + rem;
			temp/=10;
		}
		System.out.println(rev);
	}
  //code for leap year
	
	public static void isLeap(int year) {
		if((year%4==0 && year%100!=0) || (year%100==0  && year%400==0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
	
	public static int binarySearch(int arr[], int key) {
		int n=arr.length;
		int start=0,end=n-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(key==arr[mid]) {
				return mid;
			}
			
			if(key>arr[mid]) {
				start=mid+1;
			} else {
				end=mid-1;
			}
//			start++;
//			end--;
		}
		
		//System.out.println("Key not found");
		
		return -1;
	}
	//Method 1, taking (n-1,0) key(last first) as reference
	public static boolean stairCase(int matrix[][], int key) {
		int n=matrix.length;
		int m=matrix[0].length;
		
		int row=n-1,col=0;
		
		while(row>=0 && col<m) {
			
			if(key==matrix[row][col]) {
				System.out.println("Key is found at (" + row + " , " + col + " )");
				return true;
			} else if(key>matrix[row][col]) {
				col++;
			      } else {
			    	  row--;
			      }
			
			
		}
		System.out.println("key is not found");
		return false;
	}
	
	public static boolean stairCase2(int matrix[][],int key) {
		int n=matrix.length;
		int m=matrix[0].length;
		
		int row=0, col=m-1;  
		
		while(row<=n-1 && col>=0) {
			if(key==matrix[row][col]) {
				System.out.println("Key is found at (" +row + " , " + col + " )");
				return true;
			}
			
			else if(key>matrix[row][col]){
				row++;
			} else {
				col--;
			}
		}
		System.out.println("Key not found");
		return false;
	}
	
	//Assignment questions
	
	//Q1-NO OF 7'S IN 2D ARRAY->done
	
	public static int countNo(int matrix[][], int key) {
		int n=matrix.length;
		int m=matrix[0].length;
		
		int count=0;
		
		
		
		for(int i=0;  i<n;  i++) {
			for(int j=0; j<m;  j++) {
				if(key==matrix[i][j]) {
					count++;
				}
			}
		}
		
		//we are not iterating on jth loop for every ith loop
//		while(i<n && j<m) {
//			if(key==matrix[i][j]) {
//				count++;
//			}
//			
//			i++;
//			j++;
//		}
//		
		
		return count;
	}
	
	//Q2-DONE
	
	  public static int secondRowSum(int matrix[][]) {
		  int n=matrix.length;
		  int m=matrix[0].length;
		  int sum=0;
		  
		  for(int i=0;  i<n;  i++) {
			  for(int j=0;  j<m;  j++) {
				  if(i==1) {
					  sum+=matrix[i][j]; 
							  
				  }
			  }
		  }
				  
		  
		  return sum;
	  }
	  
	  //Q3-Transpose of a matrix
	  
	  public static void transpose( int matrix[][]) {
		  //transpose
		  
		  for(int j=0;  j<matrix[0].length;  j++) {
			  for(int i=0;  i<matrix.length;  i++) {
				  System.out.print(matrix[i][j] + " ");
			  }
			  System.out.println();
		  }
	  }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of row");
		int n=sc.nextInt();
		
		System.out.println("enter no of column");
		int m=sc.nextInt();
		
		//input matrix
		int matrix[][]=new int[n][m];
		for(int i=0;  i<n;  i++) {
			for(int j=0;  j<m;  j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		//print original matrix
		for(int i=0;  i<n;  i++) {
			for(int j=0;  j<m;  j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		//print transpose
		transpose(matrix);
		
	//	System.out.println("sum of 2nd row is :" +  secondRowSum(matrix));
				         
		
//		int matrix[][]= {{4,7,8},
//				          {8,8,7}
//		                 };
//		      Scanner sc=new Scanner(System.in);
//		      System.out.println("Enter key");
//		      int key=sc.nextInt();
//		      
//		    int count=  countNo(matrix, key);
//		    
//		    if(count==0) {
//		    	System.out.println("Key not found");
//		    } else {
//		    	System.out.println("Key is present " + count + " times");
//		    }
		    
		 //   System.out.println(count);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter key");
//		int key=sc.nextInt();
//		
//		stairCase(matrix, key);
//		stairCase2(matrix, key);
				         
		
//		int arr[]= {1,2,3,4,5,6,10};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter key");
//		int key=sc.nextInt();
		
		//System.out.println(binarySearch(arr, key));
		
//		int a=10;
//		int b=90;
		
		//swapping without third variable
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+ " "+ b);
		
		//swapping of 2 numbers using third variable
//		int temp=a;
//		a=b;
//		b=temp;
		
		//System.out.println(a + " "+ b);
		
		//Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		//int n=sc.nextInt();
		
		//isLeap(n);
		
		
		
		//reverseNumber(n);
		
//		String[] str2=str.split(" ");
//		
//		for(int i=0;  i<str2.length;  i++) {
//			reverseString(str2[i]);
//		}
		//reverseString(str);
		
		//int n=sc.nextInt();
		
		//isPalindromicNumber(n);
		//reverseString(str);
		
		//positionChange(str);
		

	}

}
