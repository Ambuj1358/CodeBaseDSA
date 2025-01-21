package sigma.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSortingPractice {
	
	static class Edge{
		int src;
		int dest;
		
		public Edge(int src,int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//now inilise arraylist
		for(int i=0;  i<graph.length; i++) {
			graph[i]=new ArrayList<TopologicalSortingPractice.Edge>();
		}
		
		//now add vertex into graph
		//for vertex 0,1 have no neighbout so no need to add them directly , will be added by their incoming edge vertex
		
		//for vertex 2
		
		graph[2].add(new Edge(2,3));
		
		//for vertex 3
		graph[3].add(new Edge(3,1));
		
		//for vertex 4
		graph[4].add(new Edge(4,0));
		graph[4].add(new Edge(4,1));
		
		//for vertex 5
		graph[5].add(new Edge(5,0));
		graph[5].add(new Edge(5,2));
		
		//now desired graph craeted
		
		
	}
	
	//function for topological sorting using DFS(disjoint graph)
	//time complexity->>O(V+E) as it follows dfs approach and space is O(V) as extra visited and stack created so ->O(2*V) which is equiv to O(V)
	public static void topSortDFS(ArrayList<Edge> graph[]) {
		boolean visited[]=new boolean[graph.length];
		Stack<Integer> st=new Stack<>();//to track the  most dependent node first
		
		//now iterate on each vertex so that we can cover all subgraphs(one vertex of subgrapg can iterate over full subgraph) but for another subgraph we need at leanst one vertex of that subgraph
		for(int i=0;  i<graph.length;  i++) {
			if(!visited[i]) {
				topSortUtilDFS(graph,i,visited,st);//graph,curr,vis,stack
				                                //this is core function for DFS in topological sorting
			}
		}
		
		//when we get stack full of vertex, then we will remove element one by one from stack and print them
		while(!st.isEmpty()) {
			System.out.print(st.pop() + " ");
			
		}
		
		
	}
	
	//core function for topological sorting
	public static void topSortUtilDFS(ArrayList<Edge> graph[], int curr,boolean visited[],Stack<Integer> st) {
		
		/*
		 * DFS APPROACH
		 * ->make visited true for curr
		 * ->print curr if required
		 * ->visit curr neighbour if not visited by calling topSortUtil fun
		 * ->at last, in case of topologocal sorting , add(push) the most dependent vertex which has come after recursion again and again
		 */
		visited[curr]=true;
		
		//now look for curr's neighbour if they are not visited
		for(int i=0;  i<graph[curr].size();  i++) {
			Edge e=graph[curr].get(i);
			
			if(!visited[e.dest]) {//if neighbour of curr not visited
				topSortUtilDFS(graph, e.dest, visited, st);//here e.dest is updated curr as we are visiteing e.dest ,(neighbour)
			}
		}
		
		//now add(push) curr in stack as this curr after recursuin again and again becomes most dependent node/vertex
		st.push(curr);
	}
	
	//FUNCTION FOR topological sorting Based on BFS approach(inDegree, outDegree based)
	public static void topSortBFS(ArrayList<Edge> graph[]) {
		
		int inDegree[]=new int[graph.length];//no need of visited as it will take care of viisted works
		
		calcIndegree(graph, inDegree);//now we have inDegree of every node/vertex
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		
		//now we will traverse through each vertex and add vertex in queue if their indegree is 0
		for(int i=0;  i<inDegree.length;  i++) {
			if(inDegree[i]==0) {
				q.add(i);
				
			}
		}
		
		//U->>>>>V DEPENDENCY CONCEPTS
		
		//now we have queue of vertex whose indegree is 0
		while(!q.isEmpty()) {
			int curr=q.remove();
			
			System.out.print(curr + " "); 
			
			//now look for curr's neighbour
			for(int i=0;  i<graph[curr].size();  i++) {
				Edge e=graph[curr].get(i);
				
				//if the parent of a nighbour is removed, so it's indegree will decrease by 1
				inDegree[e.dest]--;
				
				//The vertex for which indegree is 0 means ,that becomes U(last vertex for which no inciming edges are there)
				if(inDegree[e.dest]==0) {//after reducing inDegree by 1, if it becomes 0 then(U)
					q.add(e.dest);
					
					
				}
			}
			
		}
		
		
		
	}
	
	//function to calculate inDegree for a vertex
	public static void calcIndegree(ArrayList<Edge> graph[],int inDegree[]) {
		
		for(int i=0;  i<graph.length;  i++) {//graph array traversal
			//at each vertex
			int v=i;//not mandatory but for clarity
			
			for(int j=0;  j<graph[v].size();  j++) {//arraylist (at index v) traversal
				Edge e=graph[v].get(j);
				
				inDegree[e.dest]++;//increase the indegree of neighbour with one because at least one incoming vertx is there for neighbour
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int v=6;
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//niw graph created
		
		topSortDFS(graph);
		System.out.println();
		
		topSortBFS(graph);
		
	}

}
