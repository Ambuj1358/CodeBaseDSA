package sigma.generics;

public class BubbleSort {
	
	//function for bubble sort
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		
		
		//if we want ascending order sorting, then bigger element will come out as bubble and go to last in array
		//outer loop 
		for(int i=0;  i<arr.length;  i++) {
			
			boolean swapped=false;//flag to detect any swap
			
			//inner loop
			for(int j=0;  j<n-1-i;  j++) {//j<n-1-i, means when we get one bigger elemnt in last then we will ignore them for nwxt iteration
				if(arr[j]>arr[j+1]) {
					//swap element if 1st is greater than 2nd
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;//flag is true means swapping occured
				}
				
				
			}
			if(swapped==false) {//i.e no swapping done means ,array is already sorted according to requirement
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5,1,90,23,3};
		
		bubbleSort(arr);//as array is pass by reference means , whatever changes are done in array will reflect in original array
		                //that's why here array is modified by bubbleSort() method ,i.e array got sorted in ascending order
		
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
