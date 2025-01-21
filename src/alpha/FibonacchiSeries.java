package alpha;

public class FibonacchiSeries {
	
	//function for fibonachhi series using iteration
	public static void fibonachi(int n) {
		int a=0,b=1;
		System.out.print(a + " " + b);
		
		for(int i=3;  i<=n;  i++) {
			int c=a+b;
			System.out.print( " " + c);
			
			a=b;//now b becomes in a->new a is havind data b
			b=c;//now c becomes b,one unit shifting ahead(new b have data of c)
			
		}
	}
	
	//function for fibonachhi series using recursion
	public static int fib2(int n) {
		//base case
		if(n<=1) return n;
		
		return fib2(n-1) + fib2(n-2);
	}
	
	
	
	public static void main(String[] args) {
		fibonachi(5);
		System.out.println();
		int n=5;
		
		for(int i=0;  i<n;  i++) {
			System.out.print(fib2(i) + " ");
		}
		
		
	}

}
