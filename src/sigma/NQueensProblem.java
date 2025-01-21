package sigma;

public class NQueensProblem {
	
	public static void nQueens(char board[][],int row) {
		//base cases
		if(row==board.length) {
			//printBoard(board);
			count++;
			return ;
		}
		
		//recursive function
		
		//col loop
		for(int j=0;  j<board.length;  j++ ) {
			
			//now i have to think that i can place queens only at safe place so
			if(isSafe(board,row,j)) {
				//placing the queens on different row for j=0; and so on
				board[row][j]='Q';
				
				nQueens(board,row+1);//function call
				
				//backtracking step
				board[row][j]='X';//removing queen from this position to consider for next pos(next col)
			}
			
			
		}
	}
	
	public static boolean isSafe(char board[][], int row, int col) {
		//vertical up
		
		for(int i=row-1;  i>=0;  i--) {
			if(board[i][col]=='Q') {
				return false;//These place is unsafe
			}
		}
		
		//left up diagonal
		for(int i=row-1, j=col-1;  i>=0 && j>=0;  i--, j--) {
			if(board[i][j]=='Q') {
				return false;  //unsafe place
			}
		}
		
		//for right diagonal
		for(int i=row-1, j=col+1;  i>=0 && j<board.length;  i--, j++) {
			if(board[i][j]=='Q') {
				return false;  //unsafe place
			}
		}
		return true;  //rest position is safe
	}
	
	public static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		
		System.out.println("----------Chess Board -------------");
		for(int i=0;  i<board.length;  i++) {
			for(int j=0;  j<board.length;  j++) {
				System.out.print(board[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	
	static int count=0;

	public static void main(String[] args) {
		int n=5;
		
		char board[][]=new char[n][n];
		
		//initilizing board
		for(int i=0;  i<board.length;  i++) {
			for(int j=0;  j<board.length;  j++) {
				board[i][j]='X';
			}
		}
		
		nQueens(board,0);
		System.out.println("total no of ways in which we can solve N queems problem is  : " + count);
	}

	
	

}
