package ambujDemo;

public class RecursionPracticeDemo {
	
	//function to sort an array using recursion
	public static void sort(int[] arr,int i,int n) {
		//Base case
		if(i> n-2) return;
		
		if(arr[i]>arr[i+1]) {//swap as we want smaller ele at start
			//swap both
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
	}
	
	public static void main(String[] args) {
		
	}

}
