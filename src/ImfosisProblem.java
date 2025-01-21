
public class ImfosisProblem {
	
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int m=matrix.length;
		int[][] matrix2=new int[m][m];
		
		for(int i=0;  i<m;  i++) {
			for(int j=0;  j<m;  j++) {
				matrix2[i][j]=matrix[j][m-1-i];
			}
		}
		
//		for(int i=0;  i<m;  i++) {
//			for(int j=0;  j<n;  j++) {
//				matrix2[i][j]=matrix[n-1-j][i];
//			}
//		}
		
//		for(int i=0;  i<m;  i++) {
//			for(int j=0;  j<m;  j++) {
//				System.out.print(matrix2[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}

}
