package sigma;

import java.util.Scanner;

public class TwoDArrayPractice {
	
	public static boolean search(int matrix[][], int key) {
		
		int arr[]=new int[2];
		for(int i=0;  i<3;  i++) {
			  for(int j=0;  j<3;  j++) {
				  if(matrix[i][j]==key) {
					 System.out.println("Key found at inedx :(" + i + "," + j+ ")");
					 return true;
				  }
			  }
		  }
		return false;
		
	}
	
	public static void spiral(int matrix[][]) {
		
		int sr=0;
		int sc=0;
		int er=matrix.length-1;
		int ec=matrix[0].length-1;
		
		while(sr<=er && sc<=ec) {
			
			//top
			for(int j=sc;  j<=ec;  j++) {
				System.out.print(matrix[sr][j] + " ");
			}
			
			//right boundary
			
			for(int i=sr+1;  i<=er;  i++) {
				System.out.print(matrix[i][ec] + " ");
			}
			
			//bottom
			
			for(int j=ec-1;  j>=sc;  j--) {
				if(er==sr  || sc==ec) {
					break;
				}
				System.out.print(matrix[er][j] + " ");
			}
			
			//left boundary
			for(int i=er-1;  i>=sr+1;  i--) {
				if(sc==ec || sr==er) {
					break;
				}
				System.out.print(matrix[i][sc] + " ");
			}
			sr++;
			sc++;
			er--;
			ec--;
			
		}
		
	}
	
	public static int diagonalSum(int matrix[][]) {
		int  n=matrix.length;
		int sum=0;
		//here time complexity is O(n^2)
		for(int i=0;  i<n;  i++) {
			sum+=matrix[i][i];
			
			//dealing with overlapping cases
			if(i!=n-1-i) {
				sum+=matrix[i][n-1-i];
			}
			
		}
		//Here time complexity is O(n^2)->bad code so we are going to oprimise it
//		for(int i=0;  i<n;  i++) {
//			for(int j=0;  j<n;  j++) {
//				if(i==j) {
//					sum+=matrix[i][j];//primary diagonal sum
//				}  else if(i+j==n-1) {
//					sum+=matrix[i][j];
//				}
//			}
//		}
		
		return sum;
	}

	  public static void main(String[] args) {
		
		  int matrix[][]=new int[3][3];
		  System.out.println("Please enter matrix element ");
		  
		  Scanner sc=new Scanner(System.in);
              for(int i=0;  i<3;  i++) {
			  
			      for(int j=0;  j<3;  j++) {
				  matrix[i][j]=sc.nextInt();
			  }
		  }
              
             System.out.println(diagonalSum(matrix));
//		 System.out.println("Please enter key ");
//		  int key=sc.nextInt();
//		   search(matrix, key);
//		  
		 
		 
		  
		//  output
//		  for(int i=0;  i<3;  i++) {
//			  for(int j=0;  j<3;  j++) {
//				  System.out.print(matrix[i][j] + " ");
//			  }
//			  System.out.println();
//		  }
	}
}
