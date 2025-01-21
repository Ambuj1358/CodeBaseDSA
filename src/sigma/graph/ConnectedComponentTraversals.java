package sigma.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponentTraversals {
	
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
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//now initilise arraylist
		for(int i=0;  i<graph.length; i++) {//graph[i] is arraylist at ith index
			graph[i]=new ArrayList<ConnectedComponentTraversals.Edge>();
			
		}
		
		//now add each vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1,1));
		
		//for vertex 1
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,0,1));
		
		//for vertex 2
		graph[2].add(new Edge(2,3,1));
		graph[2].add(new Edge(2,1,1));
		
		//for vertex 3
		graph[3].add(new Edge(3,2,1));
		
		
		//for another subgraphs
		//for vertex 4
		graph[4].add(new Edge(4,5,1));
		
		//for vertex 5
		graph[5].add(new Edge(5,4,1));
		graph[5].add(new Edge(5,6,1));
		graph[5].add(new Edge(5,7,1));
		
		//for vertex 6
		graph[6].add(new Edge(6,5,1));
		
		//for vertex 7
		graph[7].add(new Edge(7,5,1));
		
		
		
	}
	
	//function for connected components(disjoint graph) traversals using BFS aaproach
	public static void bfsConnected(ArrayList<Edge> graph[]) {
		
		boolean visited[]=new boolean[graph.length];//as we are tracking the vertex index
		
		for(int i=0;  i<graph.length;  i++) {
			if(!visited[i]) {
				bfsUtil(graph, i, visited);;//normal bfs function to traverse on one  part of graph
			}
		}
	}
	
	//function for BFS traversal of graph
	public static void bfsUtil(ArrayList<Edge> graph[],int src,boolean visited[]) {//here src is starting vertex of traversal
		
		Queue<Integer> q=new LinkedList<Integer>();
		//here we will not track visited as we have a parameter visited which will tale care of visited vertex
		
		q.add(src);
		while(!q.isEmpty()) {
			int curr=q.remove();
			
			if(!visited[curr]) {//if curr vertex not visited
				//print curr,make it's visited true,add it's (curr) neighbour to queue
				System.out.print(curr + " ");
				visited[curr]=true;
				for(int i=0;  i<graph[curr].size();  i++) {
					Edge e=graph[curr].get(i);
					
					q.add(e.dest);//here e.dest is neighbout of that vertex
				}
				
			}
		}
		
	}
	
	//function for DFS traversal in disjoint graph
	public static void dfsConnected(ArrayList<Edge> graph[]) {
		boolean visited[]=new boolean[graph.length];
		
		//now iterate on each vertex
		for(int i=0;  i<graph.length;  i++) {
			if(!visited[i]) {
				dfsUtil(graph,i,visited);
			}
		}
	}
	
	//function for dfs traversals of graph modified for connected graph
	public static void dfsUtil(ArrayList<Edge> graph[],int src,boolean visited[]) {
		
		//concept is go to the first neighbour
		//print curr,make it's visted true,look for neighbour(visit if they are not visited)
		System.out.print(src+ " ");
		
		visited[src]=true;
		
		for(int i=0;  i<graph[src].size();  i++) {
			Edge e=graph[src].get(i);
			
			if(!visited[e.dest]) {
				//now visit each neighbour
				dfsUtil(graph, e.dest, visited);
				
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		int v=8;//look at max vertex num , then make v as v=max+1, to counter 0 as index we have added 1 in max
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		createGraph(graph);
		
		bfsConnected(graph);
		System.out.println();
		dfsConnected(graph);
		
//		for(int i=0;  i<graph[5].size();  i++) {
//			Edge e=graph[5].get(i);
//			System.out.print(e.dest + " ");
//		}
		
	}

}
