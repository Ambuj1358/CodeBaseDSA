package alpha;

import java.util.PriorityQueue;
import java.util.Stack;

public class CodePractice {
	
	//function for valid parenthesis calculator ->(),{},[]
	public static boolean isValid(String str) {
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			} else {
				if(st.isEmpty()) {
					return false;//ie we get a closing paremthesis without any opennig parenthesis leads to invalid parenthesis
				}
				if(ch==')' && st.peek()=='(' || ch=='}'  && st.peek()=='{' || ch==']' && st.peek()=='[') {
					st.pop();
				} else {
					return false;
				}
			}
		}
		
		return st.isEmpty();
	}
	
	//valid parenthesis using string based approach
	public static boolean isValid2(String str) {
		while(true) {//always run untill removed from call stack
			
			if(str.contains("()")) {
				str=str.replace("()", "");
			} else if(str.contains("{}")) {
				str=str.replace("{}", "");
			} else if(str.contains("[]")) {
				str=str.replace("[]", "");
			} else {
				return str.isEmpty();
			}
				
		}
	}
	
	//function of kth max element in array-->>time->O(N), space->O(N) due to eatra priorotyQueue
	public static int kthMax(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int kthMax=0;
		
		for(int i=0;  i<arr.length;  i++) {
			pq.add(arr[i]);//all elements added in priority queue
		}
		
		for(int i=0;  i<=arr.length-k;  i++) {
			kthMax=pq.remove();
		}
		
		return kthMax;
	}
	
	//optimised code for finding kth largest in an array-->time-O(Nlogk), space->O(K) as k sized prioroty queue
	public static int kthMax2(int[] arr,int k) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(k);//we can give fixed size also to priority queue
		
		for(int i=0; i<arr.length;  i++) {
			if(pq.size()<k) {//as 0+(k-1) element,total k element
				pq.add(arr[i]);
			} else if(arr[i]>pq.peek()) {//element after k
				pq.remove();
				pq.add(arr[i]);
			}
			
		}
		//now we have k largets element in min heap,that means where kth in context of array is root of min heap
		//so kth largest will be root of min heap
		return pq.peek();
		
		
	}
	
	//sum of digits
	public static int sum(int n) {
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		
		return sum;
	}
	
	public static int extSum(int n) {
		int sum1=0;
		for(int i=1;  i<=n;  i++) {
			sum1+=sum(i);
		}
		
		return sum1;
	}
	
	//function to find sum of prime numbers withing range->time->O(B-A)*SQRTN,space->O(1)
	public static int primeSum(int a,int b) {
		
		int sum=0;
		for(int i=a;  i<=b;  i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		
		return sum;
	}
	
	//function for checking a number is prime or not->time->O(SQRT N),space->O(1)
	public static boolean isPrime(int n) {
		
		if(n<2) return false;
		if(n==2 || n==3) return true;
		for(int i=2;  i<=Math.sqrt(n);  i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(primeSum(2, 100));
		
//		int n=Integer.MAX_VALUE;
//		System.out.println(n+10);
		
//		int[] arr= {1,2,3,4,5,6,7,8,9};
//		int k=5;
//		
//		System.out.println(kthMax(arr, 7));
//		System.out.println(kthMax2(arr, 7));
		
		
		//System.out.println(isValid2("({[]})"));
		
		//System.out.println(isValid("({[]})"));
		
//		for(String arg:args) {
//			System.out.println(arg);
//		}
//		
	}

}
