package sigma.graph.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversals {
	
	static class Edge{
		int src;
		int dest;
		//here we will not take wt as it is undirected graph
		
		
		public Edge(int src,int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	
	//Function for creating graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//now we will initialise arraylist with null values of every element/vertex/neighbour
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<GraphTraversals.Edge>();
		}
		
		//now add vertex to graphs
		//for vertex 0
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,3));
		
		//for vertex 1
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		
		//for vertex 3
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		
		//for vertex 2
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,5));
		
		//for vertex 4
		graph[4].add(new Edge(4,5));
		graph[4].add(new Edge(4,3));
		
		//for vertex 5
		graph[5].add(new Edge(5,2));
		graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		
		//for vertex 6
		graph[6].add(new Edge(6,5));
		//now graph created
		
		
	}
	
	//function for BFS traversal of undirected graph-->>time->O(V+E),SPACE->O(V) as extra queue and visited array taken
	public static void bfsTraversal(ArrayList<Edge> graph[],int src) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		boolean visited[]=new  boolean[graph.length];
		
		q.add(src);
		
		
		
		while(!q.isEmpty()) {
			int curr=q.remove();
			
			if(!visited[curr]) {//if curr is already visited, it will get remove without doing any changes in our visited and output console
				visited[curr]=true;
				System.out.print(curr + " ");
				
				
				
				//check for neighbour
				for(int i=0;  i<graph[curr].size();  i++) {
					Edge e=graph[curr].get(i);
					
					
					if(!visited[e.dest]) {//we can directly add e.dest to queue without applying any condition of visited
						                   //but there is not benefit of adding any vertex which is already visted as it will get removed without any creating any changes
						q.add(e.dest);
					}//by applying this check our code is little bit optimised
				}
				
			}
			
		}
		
	}
	//function for DFS in undirected graph
	public static void dfsTraversal(ArrayList<Edge> graph[],boolean visited[],int src) {//recursive function
		/*
		 * DFS APPROACH->
		 *    ->Mark visited true;
		 *    ->print node/vertex if required
		 *    ->look for neighbour, if they are not visited, visit them by calling recursive function
		 */
		visited[src]=true;
		
		System.out.print(src+ " "); 
		
		//look for neighbour if they are not visited
		for(int i=0;  i<graph[src].size();  i++) {
			Edge e=graph[src].get(i);
			
			if(!visited[e.dest]) {
				dfsTraversal(graph, visited, e.dest);
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int v=7;
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//now graph created in memory
		
		bfsTraversal(graph, 0);
		System.out.println();
		dfsTraversal(graph, new boolean[v], 0);
		
	}

}
