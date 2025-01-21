package sigma.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionPractice {
	
	static class Edge{
		int src;
		int dest;//here we will not take wt as it is code for cycle detection in undirected graph\
		
		public Edge(int src, int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	
	//function to craete graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//now inilise arraylist with null value;
		for(int i=0;  i<graph.length; i++) {//as graph is array basically, at each index if this array ,we have arraylist which we will inilise
			graph[i]=new ArrayList<CycleDetectionPractice.Edge>();//arraylist initilis with null values
		
		}
		
		//now add vertex info to graph
		//for vertex 0
		graph[0].add(new Edge(0,1));
		
		//for vertex 1
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,4));
		
		//for vertex 2
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		
		
		//for vertex 3
		graph[3].add(new Edge(3,2));
		graph[3].add(new Edge(3,5));
		
		//for vertex 4
		graph[4].add(new Edge(4,1));
		graph[4].add(new Edge(4,5));
		
		//for vertex 5
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
	}
	
	//function for cycle detection in undirected graph using DFS for disjoint set
	public static boolean cycleDetectionUndirectedGraph(ArrayList<Edge> graph[]) {
		
		boolean visited[]=new boolean[graph.length];
		
		for(int i=0;  i<graph.length;  i++) {
			
			
			if(!visited[i]) {
				//call recursive fun dfsUtil to visit them and detect if they have cycle or not
				if(dfsUtil(graph,i,visited,-1)){//here -1 is parent of 1st vertex from where we will start traversal
					return true;//if any vertex detect cycle return true
				}
			}
		}
		
		return false;//if no vertex is able to detect cycle
		
	}
	
	//utility function to detect cycle in undirected  graph
	public static boolean dfsUtil(ArrayList<Edge> graph[],int src,boolean visited[],int parent) {//here src is starting index of vertex of traversal to find cycle 
		
		visited[src]=true;//visit src(starting vertex)
		
		//look for it's neighbour if they are visited 
		//if they are visited check for their equality with parent
		
		for(int i=0;  i<graph[src].size();  i++) {
			Edge e=graph[src].get(i);//found the neighbour at ith index
			
			if(!visited[e.dest]) {
				if(dfsUtil(graph,e.dest,visited,src)){//here e.dest starting vertex and src is vertex for which e.dest is neighbour or we can say that src is parent of e.dest
					return true;
				}
			}
			else if(e.dest != parent) {//if e.dest(neighbour already visited) and it's not my parent 
				return true;//if any vertex gives me true; maens it has cycle we will retur our calling function ture;that we have found cycle in one of the subgraph
			}
		}
		
		return false;
	}
	
	
	//function to find if a graph is BIPARTITE OR NOT using BFS approach in disjoint set
	public static boolean isBipartite(ArrayList<Edge> graph[],int src) {
		
		//concept is coloring the graph to find biprtite or not
		//1) if neighbour have no color ->color it with opposite color
		//2) if neighbour->diff color ->>>continue (no concrete action will be taken)
		//3) if neighbour ->samecolor->>>return false;
		
		Queue<Integer> q=new LinkedList<Integer>();
		int color[]=new int[graph.length];
		//initilise color with -1
		for(int i=0;  i<color.length;  i++) {
			color[i]=-1;
		}
		
//		q.add(src);
//		color[src]=0;//yellow color assigned
		
		//for disjoint set we have to iterate through vertx for any disjoint graph
		for(int i=0;  i<graph.length;  i++) {
			
			if(color[i]==-1) {
				color[i]=0;//color assigned
				q.add(i);
			
		
		   while(!q.isEmpty()) {
			  int curr=q.remove();
			
			
			for(int j=0; j<graph[curr].size();  j++) {//we are traversing on arraylist present at index curr
				Edge e=graph[curr].get(j);
				
				if(color[e.dest]==-1) {//it means no color assigned yet to neighbour
					//assign opp color to neighbour
					int nextCol=(color[src]==0)?1:0;
					color[e.dest]=nextCol; 
					q.add(e.dest);
							
				} //else if color of neighbour is assigned and opposite to parent then well and good
				else if(color[e.dest]==color[curr]) {//here curr is dynamic src,keep changing
					return false;
				}
			}
		}
	}
  }
		
		//now initilise color array with -1 , which means it is not colored yet(assume-1->>no color assigned,0->yellow color,1->black color)
		return true;
	}
	
	public static void main(String[] args) {
		
		int v=6;
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);
		
		System.out.println(cycleDetectionUndirectedGraph(graph));
		
		
		System.out.println(isBipartite(graph, 0));
		
		
		
	}

}
