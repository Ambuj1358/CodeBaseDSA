package sigma.graph;

import java.util.ArrayList;

public class HasPath {
	
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
		//now initialise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<HasPath.Edge>();
			
		}
		
		//now add each vertex info to graph
		//for vertex 0
		graph[0].add(new Edge(0,1,1));//arraylist at 0th index
		graph[0].add(new Edge(0,2,1));
		
		//for vertex 1
		graph[1].add(new Edge(1,0,1));
		graph[1].add(new Edge(1,4,1));
		
		//for vertex 2
		graph[2].add(new Edge(2,0,1));
		graph[2].add(new Edge(2,3,1));
		
		//for vertex 3
		graph[3].add(new Edge(3,2,1));
		
		//for vertex 4
		graph[4].add(new Edge(4,1,1));
		
		
		//for vertex 5
		graph[5].add(new Edge(5,6,1));
		
		//for vertex 6
		graph[6].add(new Edge(6,5,1));
		
		
	}
	
	//function for checking if path exist from src to dest or not
	public static boolean hasPath(ArrayList<Edge> graph[], int src,int dest,boolean visited[]) {//always take visited as parameter in case of recursion
		                                                                                    //because it will create new visited value set as false in each call
		
		//Base cases
		if(src==dest) {
			return true;//path exist
		}
		
		//mark the curr vertex visited
		visited[src]=true;
		
		//ask from ur neighbour if they have path
		//find ur neighbour and ask
		for(int i=0;  i<graph[src].size();  i++) {
			Edge e=graph[src].get(i);
			
			//now we have neighbour
			if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		int v=7;
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);
		
		System.out.println(hasPath(graph, 0, 5, new boolean[v]));
		
//		//accessing neighbour of given vertex
//		for(int i=0;  i<graph[0].size();  i++) {
//			Edge e=graph[0].get(i);
//			
//			System.out.print(e.dest + " ");
//		}
//		
	}

}
