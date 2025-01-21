package sigma.graph;

import java.util.ArrayList;

public class CycleDetectionDirectedGraph {
	
	static class Edge {
		int src;
		int dest;//here we will not take wt(we can take no isuue but not reuired)
		
		public Edge(int src,int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//initilise arraylist with null value
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<>();
		}
		
		//new add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,2));
		graph[0].add(new Edge(0,3));
		
		//for vertex 1
		graph[1].add(new Edge(1,0));
		
		//for vertex 2
		graph[2].add(new Edge(2,3));
		
		//for vertex 3
		//graph[3].add(new Edge(3,0));
	}
	
	//function to detect cycle in disjoint grapg(directed one)
	public static boolean isCycle(ArrayList<Edge> graph[]) {
		boolean visited[]=new boolean[graph.length];
		boolean stack[]=new boolean[graph.length];
		
		//now go on each vertex to traverse through each subgraph
		for(int i=0;  i<graph.length;  i++) {
			if(!visited[i]) {
				//call recursive fun to check for cycle
				if(isCycleUtil(graph,i,visited,stack)){
					return true;
					
				}
			}
		}
		return false;
	}
	
	//function for finding cycle in directed graph
	public static boolean isCycleUtil(ArrayList<Edge> graph[],int curr,boolean visited[],boolean stack[]) {
		
		visited[curr]=true;
		stack[curr]=true;//in the two lines ,we visited the curr node/vertex and stored the footprint in stack so that we can identify that foorprint to detect cycle\
		
		//go to neighbour to check for their visiting status and footprint
		for(int i=0;  i<graph[curr].size();  i++) {
			Edge e=graph[curr].get(i);
			
			if(stack[e.dest]) {
				/*
				 * it is a directed graph(one way possible) and if it's traces found in a stack means their is alternate way to me from curr
				 * and their is way from me to my nieghbour
				 * this all conditions make it a cycle for sure
				 */
				return true;
				
			}
			//if it is in stack it must be visited
			else if(!visited[e.dest] && isCycleUtil(graph, e.dest, visited, stack)) {//here only if is okay,and else if is also okay
				return true;
			}
		}
		stack[curr]=false;//in each recursive call ,we are tracking the footprint of it's neighbour to detect cycle,if not found then we are
		                  //removing that node/vertex from stack for detecting cycle in other vertex
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);
		
		System.out.println(isCycle(graph));
		
	}


}
