package basics;

import java.util.*;




import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class EmployeeDemo implements Comparable<EmployeeDemo>  {
	private String empName;
	private int empAge;
	private String empAddress; 
	
	public EmployeeDemo(String empName, int empAge, String empAddress){
		this.empName=empName;
		this.empAge=empAge;
		this.empAddress=empAddress;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge=empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setempAddress(String empAddress) {
		this.empAddress=empAddress;
	}
	
	public String toString() {
		return "Employee [ empName= " + empName + " , empAge= " + empAge + " ,empAddress= " + empAddress + "]";
	}
	@Override
	public int compareTo(EmployeeDemo o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}

	
//	@Override
//    public int compareTo(EmployeeDemo o) {
//        // Compare the empNames of the two objects
//        return this.empName.compareTo(o.empName);
//    }
	
}

//interface Example{
//	void show();
//	
//	default void display() {
//		System.out.println("Hello ambuj");
//	}
//}

public class Demo {
	
	
	
	
	
	

	
	//que36:review
	//que37 done
	
	
	
//	private String name;
//	private int age;
//	
//	Demo(String name, int age){{
//		this.name=name;
//		this.age=age;
//	}
//	
	
		
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//function for prime numbers
//	public static boolean isPrime(int n) {
//		
//		if(n<=1)return false;
//		
//		for(int i=2;  i<=Math.sqrt(n);  i++) {
//			if(n%i==0)return false;
//		}
//				return true;
//		
//	}
	
	//function for prime num
	public static boolean isPrime(int n) {
		
		if(n<=1)return false;
		for(int i=2;  i<=Math.sqrt(n);  i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		
		if(!(isBirthday)) {
			if(speed<=60) {
				return 0;
			}
			if(speed>=61 & speed<=80) {
				return 1;
			}
			if(speed>=81) {
				return 2;
			}
		} else {
			if(speed<=65) {
				return 0;
			}
			if(speed>=66 & speed<=85) {
				return 1;
			}
			if(speed>=86) {
				return 2;
			}
			
		}
		return 0;
		

	}
	
	public static   void main(String[] args) {
		
		
		//ques->1
		/*
		 * System.out.println(caughtSpeeding(60, false));
		 * System.out.println(caughtSpeeding(65, false));
		 * System.out.println(caughtSpeeding(65, true));
		 */
		 Scanner sc=new Scanner(System.in);
		 boolean isBirthday=sc.nextBoolean();
		System.out.println(caughtSpeeding(85, isBirthday));
		
		//que2->write a program to to Check the given number is divisible by 7 or not(434)
		
		int n=434;
		if(n%7==0) {
			System.out.println("The given number is divisible by 7");
		} else {
			System.out.println("The given number is not divisible by 7");
		}
		//que->3
		
		int[] arr={2,4,2,1,9,4};
		
		for(int i=0;  i<arr.length; i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]*arr[i]);
			}
		}
		
		//list.stream().filter(e)
		
		
//		
//		String str="amb8j";
//		String rev="";
//		for(int i=0;  i<str.length();  i++) {
//			if(Character.isAlphabetic(str.charAt(i))) {
//				rev=rev + str.charAt(i);
//			}
//		}
//		System.out.println(rev);
		
		
		
		//char c='u005CuFF10';
		
//		String str="cap567gemin123";
//		int sum=0;
//		for(int i=0;  i<str.length();  i++) {
//			if(Character.isDigit(str.charAt(i))) {
//				//sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
//				
//				
//			}
//		}
//		System.out.println(sum);
		
		//int str=(int)a;
		
		//System.out.println(Integer.parseInt(a));
		
//		try 
//		{ 
//		    int x = 0; 
//		    int y = 5 / x; 
//		    
//		}
//		
//		
//		
//		catch (ArithmeticException ae) 
//		{
//		    System.out.println(" Arithmetic Exception"); 
//		} 
//		catch (Exception e) 
//		{
//		    System.out.println("Exception"); 
//		} 
//		
//		System.out.println("finished");
		
//		String str="capgemini123";
//		
//		String str2="";
//		
//		for(int i=0;  i<str.length();  i++) {
//			if(!(Character.isDigit(str.charAt(i)))){
//				str2 +=String.valueOf(str.charAt(i));
//			}
//		}
//		System.out.println(str2);
		
		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt();
		 * 
		 * for(int i=1; i<=n; i++) { for(int j=1; j<n-i; j++) { System.out.print(" "); }
		 * for(int j=1; j<=2*i-1; j++ ) { System.out.print("*"); } System.out.println();
		 * }
		 */
		
		
		
		
		
		//QUE->41
		
		/*
		 * Scanner sc=new Scanner(System.in); String str=sc.nextLine();
		 * 
		 * int n=str.length();
		 * 
		 * for(int i=0; i<n; i++) { int count=0;
		 * 
		 * for(int j=i+1; j<n; j++) { if(str.charAt(i)==str.charAt(j)) { count++; } }
		 * if(count==0) { System.out.println("Non matching character is :" +
		 * str.charAt(i)); } }
		 * 
		 */
		//QUE->40(done)
	
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		
//		int n=str.length();
//		for(int i=0;  i<n;  i++) {
//			int count=0;
//			
//			for(int j=i+1;  j<n; j++ ) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//			}
//			if(count>=1) {
//				System.out.println(" Matching characterS in string is :" + str.charAt(i));
//				
//			}
//			
//			
//		}
	
		
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
		//str.equalsIgnoreCase(str);
		//String str2=str.equalsIgnoreCase();
		
//		for(int i=0;  i<str.length();  i++) {
//			//char c=str.charAt(i);
//			int count=0;
//			for(int j=i+1;  j<str.length();  j++) {
//				if(str.charAt(i)==(str.charAt(j))) {
//					count++;
//				}
//				
//				
//			}
//			if(count==0) {
//				System.out.println("First non repeated character is :" + str.charAt(i));
//				break;
//			}
//			
			
//			if(c=='a' || c=='e'  || c=='i' || c=='o' ||  c=='u') {
//				count++;
//				
//			}
		
		//System.out.println("Num of vowels in given String is :" + count);
		
//		TreeSet<EmployeeDemo> set=new TreeSet<>();
//		
//		set.add(new EmployeeDemo("ambuj", 23, "Texas"));
//		set.add(new EmployeeDemo ("alpha", 56, "Europe") );
//		set.add(new EmployeeDemo("abhishek",25, "Washington DC"));
//		
//		
//		for(EmployeeDemo e: set) {
//			System.out.println(e);
//		}
		//System.out.println(set);
		
//		set.forEach((e->{
//			System.out.println(e);
//			
//		}));
		
		//que38 done
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		
//		
//		for(int i=0;  i<str.length();  i++) {
//			int count=0;
//			for(int j=i+1;  j<str.length();  j++) {
//				if(str.charAt(i)==(str.charAt(j))) {
//					count++;
//					
//				}
//			}   
//			if(count==0) {
//				System.out.print(str.charAt(i) + " ");
//				//break;
//			}
//			
//		}
		
		//Que37 done
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		int count=0;
//		
//		
//		for(int i=0;  i<str.length();  i++) {
//			char c=str.charAt(i);
//			if(c=='a'  || c=='e' || c=='i' || c=='o' || c=='u' ) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		String str1="hello";
//		String str2="elloh";
//		
//		String[] arr1 = str1.split("");
//		String[]	arr2 =str2.split("");
//		Arrays.sort(arr1);
//		String s1="";
//		for(String s: arr1) {
//			s1+=s;
//		}
//		Arrays.sort(arr2);
//		String s2="";
//		for(String s: arr2) {
//			s2+=s;
//		};
//		
//		if (s1.equals(s2)) {
//			System.out.println("the words are Anagrams...");
//		}
//		else {
//			System.out.println("the words are NOT Anagrams...");
//		}
		
//		int n=34;
//		
//		for(int i=1;i<=34;  )
		//ques40
//		String str="capgeminifgggfi";
//		
//		for(int i=0;  i<str.length();  i++) {
//			int count=0;
//			
//			for(int j=i+1;  j<str.length();  j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//					break;
//				}
//			}
//			if(count>=1) {
//				System.out.println(str.charAt(i));
//			}
//		}
		
//		char s='z';
//		int n=s;
//		System.out.println(n);
		//ques -38
//		String str="Ccpgeminic";
//		
//		str=str.toLowerCase();
//		
//		for(int i=0;  i<str.length(); i++) {
//			int count=0;
//			for(int j=i+1;  j<str.length();  j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//				
//			}
//			if(count==0) {
//				System.out.println("first non repeated character is :" +str.charAt(i));
//				break;
//			}
//		}
		
		
		
//		 Scanner scanner = new Scanner(System.in);
//
//	        System.out.println("Enter a string: ");
//	        String line = scanner.nextLine();
//
//	        int vowelCount = 0;
//	        for (char c : line.toLowerCase().toCharArray()) {
//	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//	                vowelCount++;
//	            }
//	        }
//
//	        System.out.println("The number of vowels in the string is: " + vowelCount);
		
//		String[] vwl= {"a","e","i","o","u"};
//		
//		String str="capgemini training";
//		
//		String[] str2=str.split("");
//		
//		for(String v:vwl) {
//			int count=0;
//			for(String s:str2) {
//				if(s.equals(v)) {
//					count++;
//				}
//			}
//			System.out.println(v +":" +count );
//		}
//		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the length of pyramid:");
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			
//			//for spaces
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;  j<=2*i-1;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n=sc.nextInt();
//		
//		int rev=0;
//		int temp=n;
//		while(temp>0) {
//			rev=rev*10 + temp%10;
//			temp/=10;
//		}
//		System.out.println(rev);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n=sc.nextInt();
		//finding prime num between two num using function
//		for(int i=2;  i<=30;  i++) {
//			
//			if(isPrime(i)) {
//				System.out.print(i + " ");
//			}
//		}
		
		
//		for(int i=2;  i<=30;  i++) {
//			boolean isPrime=true;
//			
//			for(int j=2;  j<=Math.sqrt(i);  j++) {
//				if(i%j==0) {
//					isPrime=false;
//					//break;
//				}
//				
//				
//			}
//			if(isPrime) {
//				System.out.print(i + " ");
//			}
//		}
		
		
//		ArrayList<Integer> list =new ArrayList<>();	
//		//adding elements in arraylist
//		list.add(2);
//		list.add(9);
//		list.add(1);
//		list.add(5);
//		list.add(0);
//		
//		
//		
//		System.out.println(list);
		//System.out.println("Hello");
	
//		String str="Ambuj   kumar";
//		int count=0;
//		
//		for(int i=0;  i<str.length();  i++) {
//			if(str.charAt(i)!=' ') {
//				count++;
//			}
//			count++;
//		}
	//	public static final int x=7;
	//	System.out.println(count);
		//Set<String> trs=new TreeSet<>();
		
		
		
		//Ques 35-> pyramid symbol
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;  j<=2*i-1;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//ques34->reverse of a number
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int revNum=0;
//		while(n!=0) {
//			revNum= revNum*10 + n%10;
//			n/=10;
//		}
//		System.out.println(revNum);
		
		//code for L shape  * symbol-> ques 33
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			System.out.println("*");
//			
//			if(i==n) {
//				for(int j=1;  j<=n/2;  j++) {
//					System.out.print("*" + " ");
//				}
//			}
//		}
//		
		//Code for magic number-> ques 32
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int sum=0;
//		while(n>0) {
//			int rem=n%10;
//			sum+=rem;
//			n/=10;
//		}
//		int finalSum=0;
//		while(sum>0) {
//			finalSum+=sum%10;
//			sum/=10;
//		}
//		if(finalSum==1) {
//			System.out.println("Magic number");
//		} else{
//			System.out.println("Not a magic number");
//		}
		//ques 30->prime num between 2 and 30
//		for(int i=2; i<=30;  i++) {
//			boolean isPrime=true;
//			
//			for(int j=2;  j<=Math.sqrt(i);  j++) {
//				if(i%j==0) {
//					isPrime=false;
//		        
//				}
//			}
//			if(isPrime) {
//				System.out.print(i +" ");
//			}
//		}
		//ques 31 => Swap two num without using 3rd variable
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a + " "+ b);
//		
		//
	//	try {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(isPrime(n)) {
//			System.out.println("Prime no");
//		} else {
//			System.out.println("Not a prime no");
//		}
//		}catch(InputMismatchException e) {
//			System.out.println("Enter only numbers");
//		}
//		catch(Exception e) {
//			System.out.println("Exception found, Please check your code again");
//		}
//		finally {
//			System.out.println("Thanks for checking out this code");
//		}
		
		
//		String str="Reverse words in a given string";
//		String arr[]=str.split(" ");
//		
//		for(int i=arr.length-1;  i>=0;  i--) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		//finding max of two numbers using terniary operator
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		int result=(a>b)?a:b;
		//System.out.println(result);
		//for(int i=0;  i<n;  i++) {
//			System.out.println(arr[n-2]);
		//}
//			String ans = Arrays.asList(arr).stream().toString();
		//int no = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		//	System.out.println(no);
//		System.out.println(ans);
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			System.out.println("*");
//			if(i==n) {
//				for(int j=1;  j<=n;  j++) {
//					System.out.print( "* " );
//				}
//			}
//		}
//		
		
		
		
		//ques no 17
//		String str="ambuj kumar is going to delhi";
//		String arr[]=str.split(" ");
//		System.out.println(arr.length);
	}
	
	
//	public static boolean isPalindrome(int number) {
//		int originalNumber=number;
//		int reversedNumber=0;
//		
//		while(number!=0) {
//			int rem=number%10;
//			reversedNumber=reversedNumber*10 +rem;
//			number=number/10;
//		}
//		return originalNumber==reversedNumber;
//	}
	//optimised code for prime no.
//	public static boolean isPrime(int n) {
//		boolean isPrime=true;;
//		
//		if(n<=1)isPrime=false;
//		
//		for(int i=2;  i<=Math.sqrt(n); i++) {
//			if(n%i==0) {
//				isPrime=false;
//			}
//		}
//		
//		return isPrime;
//	}

	
		
		//display();
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(isPrime(n)) {
//			System.out.println("Given no is prime no"  );
//		} else {
//			System.out.println("Given no is not a prime no");
//		}
		
		
		
//		List<Integer> list=Arrays.asList(2,34,678,3);
//		
//		list.stream().map(n->n%2==0).forEach(n->System.out.println(n)) ;
		
		
//		Scanner sc=new Scanner(System.in);
//		int number=sc.nextInt();
//		
//		
//		double originalNumber=0;
//		int digits =String.valueOf(number).length();
//		while(number!=0) {
//			int digit=number%10;
//			
//			sum+=Math.pow(digit, digits);
//			number/=10;
//		}
//		if(originalNumber==number) {
//			System.out.println("armstrong number");
//		} else {
//			System.out.println("not a armstrong number");
//		}
		
//		if(isPalindrome(1321)) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not a plaindrome");
//		}
		
		
//		String str="Hello world";
//		 
//		String[] arr=str.split(" ");
//		System.out.println(arr.length);
//		
//		String str="capgemini";
//		System.out.println(str.length());
		
		//ques 12 done
//		int arr[]= {2,3,5,6,1,0};
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-2]);
		//ques 11 done
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int a=0; 
//		int b=1;
//		System.out.print(a + " "+ b);
//		
//		for(int i=3;  i<=n;  i++) {
//			int c=a+b;
//			System.out.print( " "+c + " ");
//			a=b;
//			b=c;
//		}
		
		//ques 10 done
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(n%2==0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//		//ques9 done
//		String str[]={"Capgemini","Accenture","TCS","EPAM"};
//		
//		Arrays.sort(str);
//		for(int i=0;  i<str.length;  i++ ) {
//			System.out.print( str[i] + ",");
//		}
		//ques8 done
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		boolean isPrime=true;
//		
//		if(n<=1) isPrime=false;
//		for(int i=2;  i<=Math.sqrt(n);  i++) {
//			if(n%i==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		if(isPrime) {
//			System.out.println("prime no");
//		} else {
//			System.out.println("not a prime no");
//		}
			
		
		//ques7 done
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int arr[]=new int[n];
//		for(int i=0;  i<n;  i++) {
//			arr[i]=sc.nextInt();
//		}
//		Arrays.sort(arr);
//		for(int i=0;  i<n;  i++) {
//			System.out.print(arr[i] + " ");
		//}
//		Arrays.sort(arr);
//		for(int i=0;  i<arr.length-1;  i++) {
//			System.out.print(arr[i] + " ");
//		}
		//ques6 done
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		String reverse="";
//		
//		for(int i=str.length()-1;  i>=0;  i--) {
//			reverse +=str.charAt(i);
//		}
//		if(reverse.equals(str)) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("no");
		//}
		//ques5 done-below is extendede form
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		char letter=sc.next().charAt(0);
//		
//		int count=0;
//		
//		for(int i=0;  i<str.length();  i++) {
//			if(str.charAt(i)==letter) {
//				count++;
//			}
//		}
		//System.out.println(count);
		
		
		//ques3 done
//		String str="capgemini";
//		String reverse="";
//		
//		for(int i=str.length()-1;  i>=0;  i--) {
//			reverse+=str.charAt(i);
//		}
//		System.out.println(reverse);
//		
		//List<Integer> list=Arrays.asList(7,2,4,8,1);
		
		//Stream<Integer> sortedData=list.stream().sorted();
		//sortedData.forEach(n-> System.out.print(n + " "));
		//Stream<Integer> data =list.stream();
		//Stream<Integer> mappedData=data.map(n->n*3);
		//mappedData.forEach(n->System.out.println(n));
		
//		System.out.println("Hello world");
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		
//		
//		String str2="";
//		
//		for(int i=0;  i<str.length();  i++) {
//			str2+=str.charAt(str.length()-1-i);
//		}
//		for(int i=0;  i<str2.length();  i++) {
//			System.out.print(str2.charAt(i));
//		}
		//que2 done
//		Scanner sc=new Scanner(System.in);
//		int arr[]= {2,7,5,3,8};
//		Arrays.sort(arr);
//		
//		
//		
//			System.out.println(arr[arr.length-3]);
			
		//int num[]=new int[4];
//		int num[]= new int[]{1,2,3};
//		System.out.println(num[2]);
		
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
//		int num[]=new int[8];
//		System.out.println(num[1]);
		
//		int num[]=new int[0];
//		
//		
//		for(int i=0;  i<5;  i++) {
//			num[i]=i;
//		}
//		int res=num.length;
//		System.out.println(res);
//		
//		for(int i=0;  i<5;  i++) {
//			System.out.println(num[i]);
//		}
		//Ques-1->done
//		for(int i=1;  i<=10;  i++) {
//			System.out.println("Hello World " + i);
//		}
		
//		try {
//			Scanner sc=new Scanner(System.in);
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			double res=a/b;
//			System.out.println(res);
////			
//		} catch(ArithmeticException e) {
//			System.out.println("can't divide by Zero");
//		}catch(InputMismatchException e) {
//			System.out.println("wrong type of input");
//		}
		//ques1
//		for(int i=1;  i<=10;  i++) {
//			System.out.println("Hello world " + i);
//		}
		//reversing String
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		
//		String str2="";
//		int n=str.length();
//		for(int i=0;  i<n;  i++) {
//			str2+=str.charAt(n-1-i);
//		}
//		System.out.println(str2);
		//Swapping numbers without using 3rd variable
//        int a=10; 
//        int b=30;
//        
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a + " "+ b);
//			Scanner sc=new Scanner(System.in);
//
//		int m=sc.nextInt();
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=m;  i++) {
//			if(i>=1  && i<m) {
//			System.out.println("*");
//			} else {
//				for(int j=1;  j<=n;  j++) {
//					System.out.print("*");
//				}
//			}
				
			
			
		

//@Override
//public void show() {
//	System.out.println("Hello ravish");
//	// TODO Auto-generated method stub
//	
//}
//   @override
//   public    void display() {
//	System.out.println("hi ambuj");
//}

  		
}
