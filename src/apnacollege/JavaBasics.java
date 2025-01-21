package apnacollege;

import java.util.Scanner;

public class JavaBasics {
	
	public static boolean isPrime(int n) {
		
		
		
		for(int i=2;  i<=Math.sqrt(n);  i++) {
			if(n%i==0) {
				return false;	
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		
		
//		String str="ambuj";
//		
//		System.out.println(str.length()-1);
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		
//		if(isPrime(n)) {
//			System.out.println("Given number is prime number");
//		} else {
//			System.out.println("Given number is not a prime number");
//		}
//		
//		
		
		
		//display all numbers entered by user except multiple of 10
		
//		Scanner sc=new Scanner(System.in);
//		
//		do {
//			System.out.println("Please enter a number");
//			int n=sc.nextInt();
//			
//			if(n%10==0) {
//				continue;
//			}
//			System.out.println(n);
//			
//		} while(true);
		
		//Keep entering numbers until user enters number multiple of 10
		
		
		
//		while(true) {
//			System.out.println("Please enter a number");
//			Scanner sc=new Scanner(System.in);
//			int i=sc.nextInt();
//			if(i%10==0) {
//				break;
//			}
//		}
//		System.out.println("Program finished");
		
//		System.out.println("Please enter a number to check it is prime or not");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		
		
		
		//prime number checking
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		boolean isPrime=false;
//		
//		for(int i=2;  i<n; i++) {
//			if(i==2) isPrime=true;
//			
//			if(n%i==0) {
//				isPrime=false;
//				break;
//			} else {
//				isPrime=true;
//			}
//		}
//		
//		
//			System.out.println("Given number is prime number :" + isPrime);
		
		
		
		//use of continue and break statement
//		for(int i=1;  i<=10;  i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.print(i + " ");
//			
//		}
		
		//reverse of  A GIVEN NUMBER
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int rem=0,reverse=0;
//		
//		while(n>=1) {
//			rem=n%10;
//			reverse=reverse*10 +rem;
//			n/=10;
//		}
//		System.out.println("Reverse of a given number is :" + reverse);
		
		
		//Star pattern printing taking n as input from user
		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n;  j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		int sum=0;
//		
//		for(int i=1;  i<=n;  i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
			
		
//		//solution
//		
//		int number;
//		int evenSum=0;
//		int oddSum=0;
//		int choice;
//		
//		
//		do { 
//			
//			Scanner sc=new Scanner(System.in);
//			number=sc.nextInt();
//			
//			if(number%2==0) {
//				evenSum+=number;
//				
//			} else {
//				oddSum+=number;
//			}
//			
//			System.out.println("Do u want to continue? Press 1 for yes or 0 for no");
//			choice=sc.nextInt();
//			
//			}while(choice==1);
//		
//		System.out.println("Sum of even number is :" + evenSum);
//		System.out.println("Sum of odd number is :" + oddSum);
//		
		//ques4->multiplication table
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		
//		for(int i=1;  i<=10;  i++) {
//			System.out.println(N + " X " + i + " = " + N*i);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		long res=1;
//		for(int i=n;  i>=1;  i--) {
//			res*=i;
//		}
//		
//		System.out.println(res);
		
//		int evenSum=0;
//		int oddSum=0;
//		int arr[]=new int[n];
//		
//		for(int i=0;  i<n;  i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		
//		
//		for(int i=0;  i<n;  i++) {
//			if(arr[i]%2==0) {
//				evenSum+=arr[i];
//			}
//			if(arr[i]%2!=0) {
//				oddSum+=arr[i];
//			}
//		}
//		System.out.println("Sum of even number is : " + evenSum + "\n" + "sum of odd number is :" + oddSum);
//		Scanner sc=new Scanner(System.in);
//		int marks=sc.nextInt();
//		
//		
//		 String str=(marks>=33)?"Pass":"Fail";
//		 
//		 System.out.println(str);
		
		//Income tax calculator
		
//		System.out.println("Enter your income in lacs");
//		double tax=0;
//		Scanner sc=new Scanner(System.in);
//		int income=sc.nextInt();
//		
//		if(income<=5) {
//			tax=0;
//			System.out.println("You don't have to pay taxes");
//		} else if(income>5 && income<=10) {
//			tax=(double)(income-5)*20/100;
//			
//		} else {
//			tax= 1+ (double)(income-10)*30/100;
//		}
//		System.out.println("Your net tax is :" + tax);
		//tax percentage calculator
//		if(income<5) {
//			System.out.println("Your tax is 0%");
//		} else if(income>=5 && income<=10) {
//			System.out.println("Your tax is 20%");
//		} else {
//			System.out.println("Your tax is 30%");
//		}
		//Operator practice question
		
		//ques5
		
		//Leap year finding
		
//		Scanner sc=new Scanner(System.in);
//		int year=sc.nextInt();
//		
//		if(year%4==0 && ((year%100==0)&& (year%400==0)|| year%100!=0) ) {
//			System.out.println("Given is a Leap Year");
//		} else {
//			System.out.println("Given is not a Leap Year");
//		}
//		
		
		//ques3->done and ques 4 also done mcq
		//name of day using number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the two number");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		System.out.println("Which operation do you want to perform. Please Specify with opeartion symbol");
//		char operator=sc.next().charAt(0);
//		
//		
//		
//		switch(operator) {
//		case '+' : System.out.println(a+b);
//		break;
//		case '-' : System.out.println(a-b);
//		break;
//		case '*' : System.out.println(a*b);
//		break;
//		case '/' : System.out.println(a/b);
//		break;
//		case '%' : System.out.println(a%b);
//		break;
//		default : System.out.println("I can't perform this operation");
//		
//		}
		
//		switch(num) {
//		case 1 : System.out.println("Sunday");
//		break;
//		    
//		case 2 : System.out.println("Monday"); 
//		break;
//		
//		case 3 : System.out.println("Tuesday");
//		break;
//		case 4 : System.out.println("Wednesday");
//		break;
//		case 5 : System.out.println("Thursday");
//		break;
//		case 6 : System.out.println("Friday");
//		break;
//		case 7 : System.out.println("Saturday");
//		break;
//		default : System.out.println("Not a valid day");
//		}
//		
//		
//		
//		}
//		
		//ques2->done
		//fever finding
		
		//double temp=103.5;
		//taking user input for temperature
//		Scanner sc=new Scanner(System.in);
//		double temp=sc.nextDouble();
//		if(temp>100) {
//			System.out.println("You have a fever");
//		} else {
//			System.out.println("You don't have a fever");
//		}
		
		//que1->done
		//java program to take inout from user and print either it is positive or negative
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		
//		if(a>0) {
//			System.out.println("Positive");
//		} else if(a<0) {
//			System.out.println("Negative");
//		} else {
//			System.out.println("Neither Positive nor negative");
//		}
		
//		int x,y,z;
//		x=y=z=9;
//		System.out.println(x+"" +y +"" + z);
		
		// TODO Auto-generated method stub
		//variable and data types
		
		//ques3-total bill amount
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter pencil cost");
//		int pencilCost=sc.nextInt();
//		System.out.println("Enter no of pencil purchased");
//		int p1=sc.nextInt();
//		
//		System.out.println("Enetr pen cost");
//		int penCost=sc.nextInt();
//		System.out.println("Enter no of pen purchased");
//		int p2=sc.nextInt();
//		
//		System.out.println("Eneter erasor cost ");
//		int eraserCost=sc.nextInt();
//		System.out.println("Enter no of erasor purchased");
//		int p3=sc.nextInt();
//		
//		int totalBill=pencilCost*p1+penCost*p2+eraserCost*p3;
//		//actual amount after gst
//		float finalAmount=totalBill*18/100f +totalBill;
//		System.out.println(finalAmount);
		
		
		
		//que2-area of square->done
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int area=a*a;
//		System.out.println(area);
//		
		
		//que1->done
		
//		Scanner sc=new Scanner(System.in);
//		int A=sc.nextInt();
//		int B=sc.nextInt();
//		int C=sc.nextInt();
//		
//		float average=(A+B+C)/3;
//		System.out.println(average);
		
		//pattern printing
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n+1-i;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	//	byte a=128;
		
		

	}

}
