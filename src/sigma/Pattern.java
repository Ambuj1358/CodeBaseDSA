package sigma;

import java.util.Scanner;

public class Pattern {
	//function for hollow rectangle
	public static void hollow_rectangle(int totRow, int totCol) {
		
		for(int i=1;  i<=totRow;  i++) {
			for(int j=1;  j<=totCol;  j++) {
				//boundary condition
				if(i==1  || i==totRow  ||  j==1  || j==totCol) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
	//	hollow_rectangle(6,4);
		
		//Speacial pattern
		System.out.println("Please enter no of row u want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=1;
		for(int i=1; i<=n;  i++) {
			//inner loop
			for(int j=1;  j<=i;  j++) {
				System.out.print(num + " ");
				num=num+2;
			}
			System.out.println();
		}
		
		
		//Star pyramid
		
//		for(int i=1;  i<=5;  i++) {
//			//for spaces
//			for(int j=1;  j<=5-i;  j++) {
//				System.out.print( " ");
//			}
//			
//			//for star
//			for(int j=1;  j<=2*i-1;  j++) {
//				
//				System.out.print(j);
//				
//			}
//			System.out.println();
//		}
		//Again palindromic pattern with number pattern
		
//		for(int i=1;  i<=5;  i++) {
//			//for spaces
//			for(int j=5-i;  j>=1;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for number pattern
//			for(int j=2*i-1;  j>=1;  j++) {
//				System.out.print(j);
//			}
//			
//			//for next half part
//			
//			for(int j=2;  j<=i;  j++) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
		
		//Palindromic pattern with number system
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			//for space
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for number logic
//			for(int j=i;  j>=1;  j--) {
//				System.out.print(j);
//			}
//			
//			for(int j=2;  j<=i;  j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//Number pyramid pattern
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		for(int i=1;  i<=n;  i++) {
//			//for space
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for star printing
//			for(int j=1;  j<=i;  j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			
//		}
		
		//Diamond pattern printing
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		
//		for(int i=1;  i<=n; i++) {
//			//for space
//			
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for star
//			
//			for(int j=1;  j<=2*i-1;  j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		for(int i=n;  i>=1; i--) {
//			//for space
//			
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for star
//			
//			for(int j=1;  j<=2*i-1;  j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		//HOLLOW RHOMBUS PATTERN
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//				for(int i=1;  i<=n;  i++) {
//					//for space
//					for(int j=1;  j<=n-i;  j++) {
//						System.out.print(" ");
//					}
//					
//					//for star printing
//					
//					for(int j=1;  j<=n;  j++) {
//						if(i==1  || i==n  || j==1  || j==n) {
//							System.out.print("*");
//						} else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
//				
		
		//Solid rhombus pattern
		
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			
//			//for space printing
//			for(int j=1;  j<=n-i;  j++) {
//				System.out.print(" ");
//			}
//			
//			//for star printing
//			
//			for(int j=1;  j<=n;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Butterfly Pattern
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		//for first half
//		
//		for(int i=1;  i<=n;  i++) {
//			
//			//for star
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("*");
//			}
//			//for space
//			
//			for(int j=1;  j<=2*(n-i);  j++) {
//				System.out.print(" ");
//			}
//			//for other star
//			
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//         for(int i=n;  i>=1;  i--) {
//			
//			//for star
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("*");
//			}
//			//for space
//			
//			for(int j=1;  j<=2*(n-i);  j++) {
//				System.out.print(" ");
//			}
//			//for other star
//			
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		
//		//0-1 Triangle
//		Scanner sc=new Scanner(System.in);
//		int n =sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=i; j++) {
//				if((i+j)%2==0) {
//					System.out.print("1");
//				} else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
		//Floyds triangle
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int num=1;
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=i;  j++) {
//				System.out.print(num);
//				num++;
//			}
//			System.out.println();
//		}
		
		//inverted half pyramid with number system
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n+1-i;   j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//printing inverted and rotated half pyramid
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		for(int i=1;  i<=n;  i++) {
//			//for inner space printing logic
//			for(int j=1;  j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			//For inner star logic
//			
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
		
		//Hollow rectangle pattern
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//				
//		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=m; j++) {
//				if(i==1 || i==n || j==1 || j==m) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
		
		//-------------------------------
		
		//Printing pattern with ABC
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		
//		for(int i=1;  i<=n;  i++) {
//			char number='A';
//			for(int j=1;  j<=i;  j++) {
//				System.out.print(number);
//				number++;
//			}
//			
//			System.out.println();
//		}
//		
		
		//Priniting Half pyramid pattern
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=n;  i>=1;  i--) {
//			for(int j=1;  j<=i;  j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
			
		
//		//Inverted start pattern
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=n+1-i;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//Star printing
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for(int i=1;  i<=n;  i++) {
//			for(int j=1;  j<=i;  j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}	
	}

}
