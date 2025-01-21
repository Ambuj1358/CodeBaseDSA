package sigma;

public class Random {
	
	
	//Brute force->O(N), SC->O(1)
	public static boolean search(int arr[], int target) {
		
		int n=arr.length;
		for(int i=0;  i<n;  i++) {
			if(arr[i]==target) {
				return true;
			} 
		}
		
		return false;
		
	}
	
	//search optimised only for sorted array->O(logn)
	public static boolean search2(int arr[], int target) {
		int n=arr.length;
		int si=0;
		int ei=n-1;
		
		while(si<=ei) {
			int mid=(si+ei)/2;
			
			if(arr[mid]==target) return true;
			
			if(arr[mid]<target) {
				si=mid+1;
			} else {
				ei=mid-1;
			}
		}
		
		return false;
	}
	
	//make upper case to 1st letter of every word in a string
	public static String upperCase(String str) {
		StringBuilder sbr=new StringBuilder();
		
//		if(str.charAt(0)!=' ') {
//			sbr.append(Character.toUpperCase(str.charAt(0)));
//		} else {
//			sbr.append(str.charAt(0));
//		}
//		
		
		sbr.append(Character.toUpperCase(str.charAt(0)));
		for(int i=1;  i<str.length();  i++) {
			if(str.charAt(i)==' ' && i<str.length()) {
				sbr.append(str.charAt(i));
				i++;
				sbr.append(Character.toUpperCase(str.charAt(i)));
			} else {
				sbr.append(str.charAt(i));
			}
		}
		
		return sbr.toString();
	}
	
	//mergesort for arrays
	public static void mergesort(int arr[], int si, int ei) {
		
		//base case
		if(si>=ei) {
			return ;
		}
		
		int mid=si + (ei-si)/2;
		
		//here assumption is whenever we call mergesort function it will sort that part of array recursively
		
		//recursion
		//calling mergesort for left part of array
		mergesort(arr,si, mid);
		
		//calling mergesort for right part of the array
		mergesort(arr, mid+1, ei);
		
		//now merging both sorted part
		//helper function
		merge(arr,si,mid,ei);
	}
	
	//Function for mergeing both part
	public static void merge(int arr[], int si, int mid, int ei) {
		/*here why we are taking mid as parameter 
		 * because main work of this function is to merge left and right part
		 * so mid is the boundary between them
		 */
		
		int temp[]=new int[ei-si+1];//length of arr same as temp
		
		int i=si;  //si for 1st part(left part) of array
		int j=mid+1;  //si for 2nd part that is right part of the array
		
		int k=0;  //starting of temp index(si)
		
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];//we will add in temp whiever is lower for acending order sorting
				i++;
			} else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		//for leftover element for left part
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		
		//for leftover element for right part
				while(j<=ei) {
					temp[k++]=arr[j++];
				}
				
				//now copying bboth part from temp to original array
				
		for(k=0,i=si;  k<temp.length;  k++, i++) {
			arr[i]=temp[k];
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {56,23,12,90,56,34,66,11};
		
		mergesort(arr, 0, arr.length-1);
		
		for(int i=0;  i<arr.length;  i++) {
			System.out.print(arr[i] + " ");
		}
		
//		String str="ambuj  kumar sharma is a good guy";
//		
//		System.out.println(upperCase(str));
		
//		int arr[]= {1,2,3,4,5};
//		
//		int target=9;
//		
//		if(search2(arr, target)) {
//			System.out.println("Found");
//		} else {
//			System.out.println("Not found");
//		}
	}

}
