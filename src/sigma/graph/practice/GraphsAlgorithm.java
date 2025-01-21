package sigma.graph.practice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class GraphsAlgorithm {
	
	static class Edge{
		int src;
		int dest;
		int wt;
		
		public Edge(int src,int dest,int wt) {
			this.src=src;
			this.dest=dest;
			this.wt=wt;	
			
		}
	}
	
	//function to create directed and weighted graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//now initialise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<GraphsAlgorithm.Edge>();
		}
		
		//now add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,2));
		
		//for vertex 1
		graph[1].add(new Edge(1,3,3));
		
		//for vertex 2
		graph[2].add(new Edge(2,4,2));
		
		//for vertex 3
		graph[3].add(new Edge(3,5,1));
		
		//for vertex 4
		graph[4].add(new Edge(4,5,3));
		//now graph created
		
		
	}
	
	//function for dijkstr'a algorithm
	public static void dijkstra(ArrayList<Edge> graph[],int src) {
		
		PriorityQueue<Pair> pq=new PriorityQueue<>();//pair,as we want to track node as well as their shortest dist from src
		boolean visited[]=new boolean[graph.length];
		
		//now we will initialise shortDist array to store shortest distance of all vertex from src
		int shortDistt[]=new int[graph.length];
		
		//initilise this shortDistt array with + infinity except src(as src shortest distt from src is 0)
		for(int i=0;  i<shortDistt.length;  i++) {
			if(i!=src) {
				shortDistt[i]=Integer.MAX_VALUE;//by default when i=src,shortDistt[i]=0,
			}
			
		}
		
		pq.add(new Pair(src,0));
		
		while(!pq.isEmpty()) {
			Pair curr=pq.remove();
			
			if(!visited[curr.node]) {
				visited[curr.node]=true;
		//	}->>we can't do this as we want to go for neighbur if and only if node is not visited ,if it is visited we already added them in pq 
			//this will create problem when my multiple neighbour has relation between them itselfneighbour 
			//neighbour
			for(int i=0;  i<graph[curr.node].size();  i++) {
				Edge e=graph[curr.node].get(i);
				
				int u=e.src;
				int v=e.dest;
				int wt=e.wt;
				
				//core logic for dijkstras
				if(shortDistt[u] + wt < shortDistt[v]) {//distt[v] will update to smaller one
					                                  //as initially we have neighbour short distt but we get another path with smaller distt
					                                   //so we will follow this path for overall shortest distt.
					shortDistt[v]=shortDistt[u] + wt;
					//add neighbours in pq for further node ,shortest distance finding
					pq.add(new Pair(v,shortDistt[v]));
				}
			}
		}
		}
		
		//now print all vertex shortest distt from src
		for(int i=0;  i<shortDistt.length;  i++) {
			System.out.print(shortDistt[i] + " ");
		}
	}
	//inner class pair to store data of node as well as their shorted distance from src
	//make this class sorted based on shortDistt
	static class Pair implements Comparable<Pair>{
		int node;
		int shortDistt;
		
		public Pair(int node,int shortDistt) {
			this.node=node;
			this.shortDistt=shortDistt;
		}
		
		@Override
		public int compareTo(Pair p) {
			return this.shortDistt-p.shortDistt;
		}
		
		//now this class will have dist based sorting approch(ascending)
	}
	
	public static void main(String[] args) {
		int v=6;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//here graph created in the memory finally
		
		dijkstra(graph, 0);
	}

}
