package sigma.graph;

import java.util.ArrayList;

//for undirected graph(no need of wt)
public class CycleDetection {
	
	static class Edge{
		int src;
		int dest;//here we are writing code for cycle detection in graph so we will not use wt;
		
		public Edge(int src,int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//now initilise graph's arraylist
		for(int i=0;  i<graph.length;  i++) {
		   graph[i]=new ArrayList<CycleDetection.Edge>();	
		}
		
		//now add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		//for vertex 1
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		//for vertex 2
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		//for vertex 3
		graph[3].add(new Edge(3,1));
		//graph[3].add(new Edge(3,5));
		
		//for vertex 4
		graph[4].add(new Edge(4,2));
	//	graph[4].add(new Edge(4,5));
		
		//for vertex 5
//		graph[5].add(new Edge(5,3));
//		graph[5].add(new Edge(5,4));
		
	}
	
	//function for cycle detectin in undirected graph
	public static boolean cycleDetection(ArrayList<Edge> graph[]) {
		boolean visited[]=new boolean[graph.length];
		
		//now go to every index to search for cycle unless found or return not found
		for(int i=0;  i<graph.length;  i++) {//we are going on each vertex to check for every condition either graph is connected or disjoint
			if(!visited[i]) {
				if(cycleDetectionUtil(graph,visited,i,-1)){//initially 1st vertex parent is -1,as no parent exist so take -1
					//visit it for checking if it contains cycle or not
					return true;
					//main work of (cycleDetectionUtil)  fun is to visit the each vertex and check if cycle exist or not 
				}
			}
		}
		
		//if they do not contain cycle return false
		
		return false;
		
	}
	//utility/helper function for finding if graph has cycle or not
	public static boolean cycleDetectionUtil(ArrayList<Edge> graph[],boolean visited[],int curr,int par) {
		
		visited[curr]=true;//visisting that vertex for which it is called
		
		//look for its neighbour
		for(int i=0;  i<graph[curr].size();  i++) {
			Edge e=graph[curr].get(i);
			
			if(!visited[e.dest]) {
				if(cycleDetectionUtil(graph, visited, e.dest, curr)) {//do visit if neighbour not visited to check for cycle
					return true;
					
				}
				
			}
			
			//for neighbour visited condition ->no need to take concreate action->continue(may be cycle or not)
			//main condition to find cycle in graph
			else if( e.dest!=par ) {//if neighbour visited and neighbour not equal to  parent
				return true;//recursive final of first if condition
			}
		}
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		int v=6;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//now graph has been successfully created
		
		System.out.println(cycleDetection(graph));
		
		
	}

}
