package alpha;

public class ProductArray {
	
	//function for product of array
	public static int[] product(int arr[]) {
		
		int[] arr2=new int[arr.length];
		int res=1;
		for(int i=0;  i<arr.length; i++) {
			for(int j=0;  j<arr.length; j++) {
				if(j!=i) {
				res*=arr[j];
				
				}
			}
			arr2[i]=res;
			
			res=1;
			
		}
		
		return arr2;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};//{120,60,40,30,24}
		
		int[] arr2=product(arr);
		
		for(int i=0;  i<arr2.length;  i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}

}
