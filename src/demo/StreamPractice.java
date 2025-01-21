package demo;

import java.util.*;
import java.util.stream.*;

public class StreamPractice {
	
	public static boolean isPerfect(int n) {
		
		int sum=0;
		
		for(int i=1;  i<=n/2;  i++) { 
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;  i<=n;  i++) {
			for(int j=1;  j<=n+1-i;  j++) {
				System.out.print(" ");
			}
			for(int j=1;  j<=i;  j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n+1;  j++) {
//				
//				if(i==1  || i==n || j==1  ||  j==n+1) {
//					System.out.print("*");
//
//				} else {
//					System.out.print(" ");
//				}
//				
//			//	System.out.print("*");
////				if(i==1  ||  i==n  || j==1  ||  j==n) {
////					System.out.print("*");
////				}
//			}
//			System.out.println();
//		}
		
//		String str="Ambuj Kumar SHARMA";
//		String str2="";
//		
//		for(int i=0;  i<str.length();  i++) {
//			
//			if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90 ){
//				str2=str2 + Character.toLowerCase(str.charAt(i));			
//			} else {
//				str2=str2 + Character.toUpperCase(str.charAt(i));
//			}
//		}
//		System.out.println(str2);
		//System.out.println(str);
		
		
//		String str="bat";
//		
//		String str1="@"+str.substring(1,str.length());
//		
		//Stream.of(str1).map(e->new StringBuilder(e).reverse()).forEach(e->System.out.println(e));
		
		
		
//		String str="A B C D";
//		
//		String[] arr=str.split(" ");
//		String rev="";
//		
//		for(int i=0;  i<arr.length;  i++) {
//			 
//			rev =rev + arr[arr.length-1-i];
//		}
//		System.out.println(rev + " ");
		
		
		
//		for(int i=1;  i<=1000;  i++) {
//			if(isPerfect(i)) {
//				System.out.println(i+ " ");
//			}
//		}
//		
		
//		  Scanner sc=new Scanner(System.in);
//		  int n=sc.nextInt(); 
//		  int sum=0;
//		  for(int i=1; i<=n/2; i++) {
//			  System.out.println(i); if(n%i==0) { 
//				  sum=sum+i;
//				  } }
//		  if(sum==n) { 
//			  System.out.println("perfect number");
//		  } else {
//		 System.out.println("not a perfect number"); }
		 
		
		
		
		//Arrays.equals
//		List<String> list =Arrays.asList("P:Q","A,B,C");
//		
//		String str=list.stream().collect(Collectors.joining(" "));
//		
//		System.out.println(str);
		
		//int[] arr= {2,7,1,9,5,3,9};
		
		//String[] str= {"ambuj","kumar","pandey"};
//		
//		Arrays.stream(str).forEach(e->{
//			System.out.println(e);
//		});
		/*
		 * Stream.of(str).forEach(e->{ System.out.println(e); });
		 */
		
		/*
		 * IntStream stream=Arrays.stream(arr);
		 * 
		 * stream.forEach(e->{ System.out.println(e); });
		 */
		//Arrays.stream(arr).filter(n->n%2==0).forEach(System.out::println);
		/*
		 * String[] arr= {"ambuj","kumar","","sharma",""};
		 * 
		 * int count=(int) Arrays.stream(arr).filter(n->n.isEmpty()).count();
		 * System.out.println(count);
		 */
	}

}
