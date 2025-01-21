package coreJavaPractice;

import java.util.Scanner;

public class DeadLocks {
	
	String lock1="Ambuj";
	String lock2="Kumar";
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no of star u want to print in a row and column");
		int n=sc.nextInt();
		
		//Diamond pattern
		//Here there are two parts->1st half and 2nd half,2nd one is basically reverse of 1st
		
		
		//for 1st half
		for(int i=1;  i<=n;  i++) {
			//for space
			for(int j=1;  j<=n-i;  j++) {
				System.out.print(" ");
			}
			
			//for star
			for(int j=1;  j<=2*i-1;  j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//for 2nd half
				for(int i=n;  i>=1;  i--) {
					//for space
					for(int j=1;  j<=n-i;  j++) {
						System.out.print(" ");
					}
					
					//for star
					for(int j=1;  j<=2*i-1;  j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
		
		
		//print palindromic pattern
//		for(int i=1;  i<=n;  i++) {
//			//for space
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print("  ");
//			}
//			
//			//for no(star)
//			for(int j=i;  j>=1;  j--) {
//				System.out.print(j + " ");
//			}
//			
//			//for next part of no
//			for(int j=2;  j<=i;  j++) {
//				System.out.print(j + " ");
//			}
//			
//			System.out.println();
//			
//		}
		
		//Hollow right angled triangle
//		for(int i=1;  i<=n;  i++) {
//			//for star inbuilt with space
//			for(int j=1;  j<=i;  j++) {
//				if(i==1 || j==1 || i==n || j==i) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");//double space as one to counter star with space and one itself
//				}
//				
//				
//			}
//			
//			System.out.println();
//		}
		
		//Twisted pattern where n->odd and increase + decrease in start no
		//for 1st half
//		for(int i=1;  i<=n/2 +1;  i++) {
//			//for star
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//				
//		}
//		
//		//for 2nd half
//		for(int i=1;  i<=n/2 ;  i++) {
//			//for star
//			for(int j=1;  j<=n/2 +1-i;  j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
		//number pyramid with space
//		int number=1;//for number printung at each place acc to logic given
//		for(int i=1;  i<=n;  i++) {
//			//for space
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for star
//			for(int j=1;  j<=i;  j++) {
//				System.out.print(number + " ");
//				number++;
//			}
//			
//			System.out.println();
//		}
//		
		//compact pyramid pattern,no space between star
//		for(int i=1;  i<=n;  i++) {
//			//for space
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			//for star
//			for(int j=1;  j<=2*i -1;  j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
		
		
		//pyramid pattern 
//		for(int i=1;  i<=n;  i++) {
//			//every time we are printing spce 1st as it comes 1st
//			
//			//for space
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for star 
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
//		
		
		//inverted right angled triangle
//		for(int i=1;  i<=n;  i++) {
//			//for space logic
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print("  ");
//			}
//			
//			//for start logic
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
		//inverted reverse right angled triangle strategy
//		for(int i=1;  i<=n;  i++) {
//			// space logic
//			for(int j=1;  j<=i-1;  j++) {
//				System.out.print(" ");
//			}
//			
//			//either  duble space print or do not print space in *
//			
//			//start logic
//			for(int j=1;  j<=n+1-i;  j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
		
		//reverse right angled triangle
//		for(int i=1;  i<=n;  i++) {
//			//for * printing
//			for(int j=1;  j<=n+1-i;  j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//right angled triangle  pattern
//		for(int i=1;  i<=n;  i++) {
//			//for * printing
//			for(int j=1;  j<=i;  j++) {//max * to be printed in a ith row  is i itself
//				System.out.print("* ");
//				
//			}
//			System.out.println();//for next line to produce row in a diff line
//		}
		
		//square pattern
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n;  j++) {
//				System.out.print("* " );
//			}
//			
//			System.out.println();
//		}
		
//		for(int i=1;  i<=20;  i++ ) {
//			for(int j=1;  j<=10;  j++) {
//				System.out.print(i*j + " ");
//			}
//			
//			System.out.println();
//		}
		
	//	int a=10;
		//System.out.println(a++);//output->10
		//System.out.println(++a);//output->11
//		
//		try {
//			synchronised(lock1){
//				Thread1.sleep(100);
//			}
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}{
//			
//		}
		
	}

}
