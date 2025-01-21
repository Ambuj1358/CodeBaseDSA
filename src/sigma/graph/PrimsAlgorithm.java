package sigma.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
	
	static class Edge implements Comparable<Edge>{
		int src;
		int dest;
		int wt;
		
		//for using pq with it ,sort based of wt
		
		
		Edge(int src,int dest,int wt){
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
		
		@Override
		public int compareTo(Edge e) {
			return this.wt-e.wt;
		}
	}
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//initialise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<PrimsAlgorithm.Edge>();
		}
		
		//now add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,2,15));
		graph[0].add(new Edge(0,3,30));
		
		//for vertex 1
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,3,40));
		
		//for vertex 2
		graph[2].add(new Edge(2,0,15));
		graph[2].add(new Edge(2,3,50));
		
		//for vertex 3
		graph[3].add(new Edge(3,0,30));
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
		
		
		
		
	}
	
	//function for prims Algorithm for minimum cost analysisi
	public static void primsAlgorithmCost(ArrayList<Edge> graph[]) {
		
		boolean visited[]=new boolean[graph.length];
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		
		//now add any vertex with cost 0 as vertex has no cost only edge has
		pq.add(new Pair(0,0));
		int finalCost=0;
		
		while(!pq.isEmpty()) {
		  Pair curr=pq.remove();
		  
		  if(!visited[curr.vertex]) {
			  visited[curr.vertex]=true;
			  finalCost+=curr.cost;
			  
			  
			  //neighbours
			  for(int i=0;  i<graph[curr.vertex].size();  i++) {
				  Edge e=graph[curr.vertex].get(i);//neighbour at vertex i
				  
				  pq.add(new Pair(e.dest,e.wt));
				  /*
				   * here all the neighbours of curr vertex is added so that 
				   *one which has min cost between 0(starting vertex,it's cost is taken as 0  for calculation)
				   * to e.dest will come 1st in pq
				   * ->if we take any one as starting vertex ,same minimum spanning tree we will get
				   */
				   
			  }
		  }
		}
		
		//now print final cost of minimum spanning tree;
		System.out.println(finalCost);
		
		
	}
	
	//function for prims Algorithm for Edge of minimum spanning tree
		public static void primsAlgorithmEdge(ArrayList<Edge> graph[]) {
			
			boolean visited[]=new boolean[graph.length];
			PriorityQueue<Edge> pq=new PriorityQueue<>();
			
			//now add any vertex with cost 0 as vertex has no cost only edge has
			pq.add(new Edge(0,0,0));
			ArrayList<Edge> mst=new ArrayList<PrimsAlgorithm.Edge>();
			
			while(!pq.isEmpty()) {
			  Edge curr=pq.remove();
			  
			  if(!visited[curr.src]) {
				  visited[curr.src]=true;
				  mst.add(new Edge(curr.src,curr.dest,curr.wt));
				  
				  
				  //neighbours
				  for(int i=0;  i<graph[curr.src].size();  i++) {
					  Edge e=graph[curr.src].get(i);//neighbour at vertex i
					  
					  pq.add(new Edge(e.src,e.dest,e.wt));
					  /*
					   * here all the neighbours of curr vertex is added so that 
					   *one which has min cost between 0(starting vertex,it's cost is taken as 0  for calculation)
					   * to e.dest will come 1st in pq
					   * ->if we take any one as starting vertex ,same minimum spanning tree we will get
					   */
					   
				  }
			  }
			}
			
			//now print mst
			for(int i=0;  i<mst.size();  i++) {
				Edge e=mst.get(i);
				System.out.println(e.src + "->" + e.dest + " and wt is "+ e.wt);
			}
			
			
		}
		
	//inner class for pair
	static class Pair implements Comparable<Pair>{
		int vertex;
		int cost;
		
		 Pair(int vertex,int cost){
			 this.vertex=vertex;
			 this.cost=cost;
		 }
		 
		 @Override
		 public int compareTo(Pair p2) {
			 return this.cost-p2.cost;//ascending order of cost sorting
		 }
	}
	
	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//now graph created successfully
		primsAlgorithmCost(graph);
		primsAlgorithmEdge(graph);
		
	}

}
