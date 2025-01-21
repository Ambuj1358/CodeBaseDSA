package alpha;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamApiPractice {
	
	public static boolean isPrime(int n) {
		
		if(n<=1) return false;
		
		
		for(int i=2;  i<n;  i++) {
			if(n%i==0) {
				return false;
			}
		}
		
	return true;
	}

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int temp=0;
		
		//swapping without using 3rd varible
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a + " "+ b);
		//swaping using 3rd variable
//		temp=a;
//		a=b;
//		b=temp;
		
		//System.out.println(a + " " + b);
		
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int temp=n;
//		int res=0;
//		
//		while(temp>0) {
//			int rem=temp%10;
//			 res=res +;
//			 temp=temp/10;
//		}
//		if(n==res) {
//			System.out.println(" Given No is armstrong no");
//		} else {
//			System.out.println("Not a armstrong no");
//		}
		
		//List<Integer> list=List.of(2,14,18,34,67,23,90,12);
		//method1
		//List<Integer> list1= list.stream().filter(n->isPrime(n)).collect(Collectors.toList());
		
		
		//method  2
//		 List<Integer> list1= list.stream().filter(StreamApiPractice::isPrime).collect(Collectors.toList());
//		System.out.println(list1 );
		
		  
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt(); 
//		
//		if(isPrime(n)) {
//			System.out.println(n);
//			
//		} else {
//			System.out.println("Given no is not prime no");
//		}
		
		 //Find all no starting with 1 using stream function
		
		 //List<Integer> list=List.of(2,14,18,34,67,23,90,12);
		
		

		
//		  List<Integer> list=List.of(2,6,1,8,4,3,9,20,35);
//		  
//		  //Code for finding even no
//		 
//		  List<Integer> list1=  list.stream().filter(n->(n%2)==0).collect(Collectors.toList());
//		
//		  List<Integer> list2=list.stream().filter(e->(e%2)!=0).collect(Collectors.toList());
//		 
//		  System.out.println(list1);
//		  System.out.println(list2);
		  

	}

}
