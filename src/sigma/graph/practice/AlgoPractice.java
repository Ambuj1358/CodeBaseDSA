package sigma.graph.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AlgoPractice {
	
	static  class Edge{
		int src;
		int dest;
		int wt;
		
		public Edge(int src,int dest,int wt) {
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//initialise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<>();//arraylist initialise with null value
		}
		
		//add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,3,2));
		
		//for vertex 1
		graph[1].add(new Edge(1,2,3));
		
		//for vertex 2
		graph[2].add(new Edge(2,5,3));
		
		//for vertex 3
		graph[3].add(new Edge(3,4,1));
		
		//for vertex 4
		graph[4].add(new Edge(4,5,2));
		
		
		
	}
	
	//function for dijkstra algorithm
	public static void dijkstra(ArrayList<Edge> graph[],int src) {
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		boolean visited[]=new boolean[graph.length];
		
		//array for storing shortest distance of each vertex from src
		int[] sd=new int[graph.length];
		
		for(int i=0;  i<sd.length;  i++) {
			if(i!=src) {
				sd[i]=Integer.MAX_VALUE;
			}
		}
		
		pq.add(new Pair(src, 0));
		
		while(!pq.isEmpty()) {
			Pair curr=pq.remove();
			
			if(!visited[curr.node]) {
				visited[curr.node]=true;
				
				//neighbour
				for(int i=0;  i<graph[curr.node].size();   i++) {
					Edge e=graph[curr.node].get(i);
					
					int u=e.src;
					int v=e.dest;
					int wt=e.wt;
					
					//core logic
					if(sd[u] + wt < sd[v]) {
						sd[v]=sd[u] + wt;
						if(!visited[e.dest]) {//if u do not use this if condition ,it will work but no need to add something which is already visite
							                  //as it will be removed in next pq removal
							pq.add(new Pair(v, sd[v]));
						}
						
					}
					
				}
			}
		}
		
		//print all shotest distt from src to all vertx
		
		for(int i=0;  i<sd.length;  i++) {
			System.out.print(sd[i]  + " ");
		}
		
	}
	
	//innee class for pair
	 static class Pair implements Comparable<Pair>{
		int node;
		int dist;
		
		public Pair(int node,int dist) {
			this.node=node;
			this.dist=dist;
			
				
		}
		@Override
		public int compareTo(Pair p) {
			return this.dist-p.dist;
		}
	}
	
	public static void main(String[] args) {
		
//		int a=Integer.MAX_VALUE;
//		System.out.println(a+10);
//		
		int v=6;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);
		
		dijkstra(graph, 0);
		//int curr=2;
		
//		for(int i=0;  i<graph[curr].size();  i++) {
//			Edge e=graph[curr].get(i);
//			System.out.println(e.dest);
//		}
		
		
		
		
	}

}
 