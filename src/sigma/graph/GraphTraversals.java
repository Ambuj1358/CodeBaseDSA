package sigma.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversals {
	
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
	
	//function to create a graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//initilising arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<>();
		}
		
		//take wt=1 as for generalisation or standarization, we can also remove wt from everywhere for unweighted graph
		//for vertex 0
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));
		
		//for vertex 1
		graph[1].add(new Edge(1,0,1));
		graph[1].add(new Edge(1,3,1));
		
		//for vertex 2
		graph[2].add(new Edge(2,0,1));
		graph[2].add(new Edge(2,4,1));
		
		//for vertex 3
		graph[3].add(new Edge(3,1,1));
		graph[3].add(new Edge(3,5,1));
		graph[3].add(new Edge(3,4,1));
		
		
		//for vertex 4
		graph[4].add(new Edge(4,2,1));
		graph[4].add(new Edge(4,5,1));
		graph[4].add(new Edge(4,3,1));
		
		
		//for vertex 5
		graph[5].add(new Edge(5,3,1));
		graph[5].add(new Edge(5,4,1));
		graph[5].add(new Edge(5,6,1));
		
		//for vertex 6
		graph[6].add(new Edge(6,5,1));
		
	}
	
	//function for BFS(Breadth first search)
	public static void bfs(ArrayList<Edge> graph[],int src) {
		Queue<Integer> q=new LinkedList<Integer>();
		boolean visited[]=new boolean[graph.length];//as we have to show every vertex is visited or not as true or false
		                                            //visited array is taken to make sure every vertex is visited max at once
		                                             //if we do not make this array, then graph may be cyclic ,so one vertex will be printed many times
		q.add(src);
		
		while(!q.isEmpty()) {
			int curr=q.remove();
			
			if(!visited[curr]) {//if visited[curr] is false means curr vertex is not visted any time(visiting step)
				//now 3 step, print curr,make visited true,add all neighbour of vertex into queue
				
				System.out.print(curr + " ");
				visited[curr]=true;
				
				for(int i=0;  i<graph[curr].size();  i++) {//graph[curr] is arraylst of neighbour at index/vertex curr
					Edge e=graph[curr].get(i);//it will give every neighbour edge info stored on vertex curr
					q.add(e.dest);
							
				}
			}
		}
		
		
		
	}
	
	
	//function for dfs
	public static void dfs(ArrayList<Edge> graph[],int curr,boolean[] visited) {//here curr is from where traversals will start
		//1->print curr
		//make visited true for curr which is initially set false;
		//search nieghbour which is not visited and call recursive function dfs fro visiting neighbour which is not visited
		
		System.out.print(curr + " ");
		visited[curr]=true;//visiting steps
		
		//finding neighbour and checking if they are visited or not, if not call dfs function for visiting
		for(int i=0;  i<graph[curr].size();  i++) {
			Edge e=graph[curr].get(i);
			
			if(!visited[e.dest]) {//here e.dest is list of neighbours
				dfs(graph, e.dest, visited);//here recursion is happening and base case for recursions are handeled by visited which will remove vertex from call stack once their neighbour is visited
				
			}
		}
		
	}
	
	//function for hasPath beteween two vertices->>time complexity-O(V+E), controlled by max(v,e)
	public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean visited[]) {
		
		//base cases
		if(src==dest) {
			return true;
	    }
		
		//make src visited is src!=dest
		visited[src]=true;
		
		//now look at neighbour of src
		for(int i=0;  i<graph[src].size();  i++) {
			Edge e=graph[src].get(i);
			
			//recursion
			if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {//here e.dest is neighbour of src(calling func) becomes src for searching the path for dest
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		createGraph(graph);
		
		bfs(graph, 6);
		System.out.println();
		
		dfs(graph, 0, new boolean[v]);
		
		System.out.println();
		
		System.out.println(hasPath(graph, 5, 1, new boolean[v]));
		
		

		
	}

}
