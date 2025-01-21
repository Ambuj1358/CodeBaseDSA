package leetCode;

public class LeetCodeProblems {
	
	//function for sqrt(x)->p.no->69(leetcode)
	//Binary search approch
	public static   int sqrt(int x) {
		if(x==0 || x==1){
			return x;
		}
		int low=1;
		int high=x;
		//int ans=0;
		while(low<high) {
			int mid=(low + high)/2;
			
			int res=mid*mid;
			if(res==x){//means mid is sqrt;
				return mid;
			}
			
			if(res>x) {
				high=mid-1;
			} else if(res<x) {
				low=mid+1;
			}
		}
		
		return Math.round(high);
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(8));
		
		Math.pow(0, 0);
		
	}

}
