package sigma;

import java.util.PriorityQueue;

public class HeapsProblems {
	
	static class Point implements Comparable<Point>{
		int x;
		int y;
		int distSq;
		int idx;
		
		public Point(int x,int y,int distSq,int idx) {
			this.x=x;
			this.y=y;
			this.distSq=distSq;
			this.idx=idx;
		}
		//now we have to compare based on distance so we will implement Comparable in this Point class
		
		@Override
		public int compareTo(Point p) {
			return this.distSq - p.distSq;//returns ascending order of distance
		}//lesser distSq ,more priority
	}
	
	
	
	public static void main(String[] args) {
		int pts[][]= {{3,3},{5,-1},{-2,4},{4,3}};
		int k=3;
		
		
		PriorityQueue<Point> pq=new PriorityQueue<Point>();
		
		for(int i=0;  i<pts.length;  i++) {//pts.length=row length of 2 d array
			
			int distSq=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];//col=0-x coordinates,col=1,y coordinates of given point
			
			pq.add(new Point(pts[i][0], pts[i][1], distSq, i));//here i is for index
		}
		
		for(int i=0;  i<k;  i++) {
			System.out.println( "C"+pq.remove().idx);
		}
		
		
		
		
	}

}
