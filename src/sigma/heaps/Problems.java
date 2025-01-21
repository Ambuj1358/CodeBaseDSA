package sigma.heaps;

import java.util.PriorityQueue;

public class Problems {
	
//	static class Rope implements Comparable<Rope>{
//		int length;
//		int cost;
//		
//		//constructor
//		public Rope(int length,int cost) {
//			this.length=length;
//			this.cost=cost;
//		}
//		
//		@Override 
//		public int compareTo(Rope r) {
//			return this.cost-r.cost;//gives ascending order of cost
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		int rope[]= {4,3,2,6};
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;  i<rope.length;  i++) {//O(nlogn)
			pq.add(rope[i]);
		}
		
		int cost=0;
		
		while(pq.size()>1) {//if size==1 means we got the one connected rope ,no need to add further
			int min=pq.remove();
			int min2=pq.remove();
			
			cost+=min+min2;//now we have a rope of length min+min2, that should be inside priority queue
			pq.add(min+min2);
			
		}
		
		System.out.println(cost);
		
		
		
		
		
	}

}
