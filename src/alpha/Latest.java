package alpha;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Latest {
	
	//character and their freequency in a string
	
	public static void main(String[] args) {
		
		String str="123";
		System.out.println(str.charAt(0)-'0');
//		//System.out.println("ambuj" + "\n" + "kumar");
//		String str1="madam kumari ";
//		Map<Character, Integer> map=freequencyMap(str1);
//		
//		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
//			System.out.println("Character :" + entry.getKey() + ", freequency :" +  entry.getValue());
//		}
//		
		
	}
	
	//function to rearrange array according to requirement
		//input->[9,-1,7,2,-8,3,-4]   ->>output->>[2,-1,3,7,-8,9,-4]
		public static void  rearrange(int arr[]) {
			int n=arr.length;
			
			PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
			
			
			for(int i=0;  i<n;  i++) {
				if(arr[i]>=0) {
					pq.add(arr[i]);
					arr[i]=0;
				}
			}
			
			for(int i=0;  i<n;  i++) {
				if(arr[i]==0) {
					arr[i]=pq.remove();
				}
			}
			
			for(int i=0; i<n;  i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
	
	public static Map<Character, Integer> freequencyMap(String str){
		
		Map<Character, Integer> repeat=new HashMap<>();
		
		for(char c: str.toCharArray()) {
			repeat.put(c, repeat.getOrDefault(c, 0)+1);
			
		}
		return repeat;
		
	}

}
