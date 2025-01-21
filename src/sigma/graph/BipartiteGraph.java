package sigma.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
	
	//we will ignore wt here
	static class Edge {
		int src;
		int dest;
		
		public Edge(int src,int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//now we will initialise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<BipartiteGraph.Edge>();//arraylist initialised with null value
		}
		
		//now add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,4));
		
		//for vertex 1
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		
		//for vertex 2
		graph[2].add(new Edge(2,3));
		graph[2].add(new Edge(2,1));
		
		//for vertex 3
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,2));
		
		//for vertex 4
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,0));
		
	}
	
	//function for checking if a grapg is Bipartite graph or not-->>TIME->>O(V+E)
	public static boolean isBipartite(ArrayList<Edge> graph[]) {
     Queue<Integer> q=new LinkedList<Integer>();
		
		int color[]=new int[graph.length];//to track vertex/node color
		
		//now we will initialise color with-1
		for(int i=0;  i<color.length;  i++) {
			color[i]=-1;//means no color assigned yet
		}
		
		for(int i=0;  i<graph.length;  i++) {
			//now add starting vertex in queue to traverse to each part of graph or subgraph
			//BFS
			if(color[i]==-1) {//if color is not assigned to any vertex
				q.add(i);
				color[i]=0;//yellow color assigned
				            //1 is for blue ,only assumption
				
			
			
			
			while(!q.isEmpty()) {
				int curr=q.remove();
				
				//now we will find its neighbour
				for(int j=0;  j<graph[curr].size();  j++) {
					
					Edge e=graph[curr].get(j);
					
					//here e.dest is neighbour
					//now we will check diff conditions of coloring node
					if(color[e.dest]==-1) {//means if neighbour has no color yet
						                  //give ur opposite color
						
						int nextCol=(color[curr]==0)?1:0;
						color[e.dest]=nextCol;
						q.add(e.dest);//as neighbour is also a vertex
						
					} //if both color ie curr and its nieghbour have diff color , no problem ,no concreate action will be taken
					else if(color[curr]==color[e.dest]) {
						return false;
						
					}
				}
			}
			
		}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int v=5;
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//now graph created
		
	    System.out.println(isBipartite(graph));
		
		
		
	}

}
