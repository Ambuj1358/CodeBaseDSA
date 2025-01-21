package sigma.graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
	
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
			graph[i]=new ArrayList<>();//initilised with null values
		}
		
		/*Creating a directed graph
		 * now add vertex
		 * for vertex 0,1->>not pointing anywhere
		 */
		
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
		
		
		
		
		
	}
	//function for topological sorting(DFS approach)
	public static void topSort(ArrayList<Edge> graph[]) {
		boolean visited[]=new boolean[graph.length];
		Stack<Integer> st=new Stack<>();//to keep the less dependent vertex first so that highly dependent data should be released in last
		
		//now iterate through each vertex to tackle disjoint graph
		for(int i=0;  i<graph.length;  i++) {
			if(!visited[i]) {
				topSortUtil(graph,i,visited,st);
			}
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+ " ");
		}
		
	}
	
	//actual function for topological sort using DFS
	public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> st) {
		
		/*
		 * DFS APPROACH IS->>
		 *            mark curr vertex true
		 *            print curr vertex if reuired
		 *            visit neighbour if not visited
		 * now in case of topological sorting ,after visiting neighbour if not visited ,store curr in stack so that highly dependent 
		 * vertex can be stored 1st(as recursion keep calling the dependenet vertex through recursive call again and again) ,so we can access them in last as stack is LIFO
		 * each time when recursion happens , neghbour becomes curr and execute code
		 */
		
		visited[curr]=true;
		
		for(int i=0;  i<graph[curr].size();  i++) {
			Edge e=graph[curr].get(i);
			
			if(!visited[e.dest]) {
				topSortUtil(graph, e.dest, visited, st);//(vvi)recursion on neighbour, will store the most dependent data in stack first
			}
		}
		
		//when we get a vertex which have no neighbour then that vertex will be the most dependent node/vertex ,which will be stored in stack 
		
		st.push(curr);
		
	}
	
	public static void main(String[] args) {
		
		int v=6;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//now desired graph is created
		
		topSort(graph);
		
	 }

 }
