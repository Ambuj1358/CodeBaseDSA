package sigmaPractice;

public class RemoveDuplicates {
	
	//function for remove duplicates
	public static int[] removeDuplicates(int[] arr) {
		int j=1;
		
		
		//Actually what will happen , unique element will come at starting of original array upto j
		//and duplicates will come at last
		//that's why we printed unique array as upto j the elemnt of original array
		for(int i=1;  i<arr.length;  i++) {
			if(arr[i]!=arr[i-1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		int arr1[]=new int[j];
		
		for(int i=0;  i<j;  i++) {
			arr1[i]=arr[i];
			
		}
		
		return arr;
		
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {2,2,2,5,6,7,7,8,8,8,9};
		
		int arr1[]=removeDuplicates(arr);
		for(int i=0;  i<arr1.length;  i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}

}
