import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.stream.Stream;

public class GoDaddyProblems {
	
	//function to find 2nd largest
	public static int secLargest(int[] arr) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());//max heap
		
		for(int a:arr) {
			pq.add(a);
		}
		
		pq.poll();
		
		return pq.peek();
		
	}
	
	//function to reverse the array of string inside out
	public static String reverse(String str) {
		Stack<Character> st=new Stack<>();
		
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			
			st.push(ch);
		}
		
		StringBuilder sbr=new StringBuilder();
		
		while(!st.isEmpty()) {
			sbr.append(st.pop());
		}
		
		return sbr.toString();
		
	}
	public static void main(String[] args) {
		
		int[] arr= {-3,2,4,-2,-9,0,3};
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int i=0;  i<arr.length;  i++) {
			if(arr[i]<0) {
				pq.add(arr[i]);
				
			}
			
		}
		for(int i=0;  i<arr.length;  i++) {
			if(arr[i]<0) {
				arr[i]=pq.poll();
			}
			
		}
		
		for(int ar:arr) {
			System.out.print(ar + " ");
		}
		
		
		
		
		//int[] arr2=new int[arr.length];
//		
//		for(int i=0;  i<arr.length;  i++) {
//			if(arr[i]!=0) {
//				pq.add(arr[i]);
//			}
//		}
//		
//		for(int i=0;  i<arr2.length;  i++) {
//			if(!pq.isEmpty()) {
//				arr2[i]=pq.poll();
//			
//			}
//			
//		}
//		
//		for(int ar:arr2) {
//			System.out.print(ar + " ");
//		}
//		
		
		
		
		
//		String str="Hello This is ambuj";
//		
//		
//	//	String res=reverse(str);
//		String[] arr=str.split(" ");
//		
//		for(int i=0;  i<arr.length;  i++) {
//			arr[i]=reverse(arr[i]);
//		}
//		
//		for(String st:arr) {
//			System.out.print(st + " ");
//			
//		} 
//		
		
		
		
		
		
//		int[] arr= {2,4,9,1,4};
//		
//		System.out.println(secLargest(arr));
//		
		
//		int[] arr3= {-9,2,0,-3,-2,0,3};
//
//		
//		Stream.concat(Arrays.stream(arr3).boxed().filter(e->e!=0).sorted(), Arrays.stream(arr3).boxed().filter(e->e==0)).forEach(System.out::println);
//		
//		
	}

}
