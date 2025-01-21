package sigma.graph;

import java.util.ArrayList;

public class BellManFordAlgorithm {
	
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
	
	//create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//initialise arralist with null values
		for(int i=0;  i<graph.length;i++) {
			graph[i]=new ArrayList<>();//arraylist at ith index initialised with nulll values
			
		}
		
		//now add vertex
		//for vertex 0
		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 4));
		
		//for vertex 1
		graph[1].add(new Edge(1,2,-4));
		
		//for vertex 2
		graph[2].add(new Edge(2,3,2));
		
		//for vertex 3
		graph[3].add(new Edge(3,4,4));
		
		//for veretx 4
		graph[4].add(new Edge(4,1,-1));
		
		
	}
	//create graph in the form of arraylist of edges
		public static void createGraph2(ArrayList<Edge> graph) {
			//now no need to initialise graph
			//now we do not need vertex based implementation,we will directly add edges inside graph 
			//here only edges info are there
			graph.add(new Edge(0, 1, 2));
			graph.add(new Edge(0, 2, 4));
			graph.add(new Edge(1,2,-4));
			graph.add(new Edge(2,3,2));
			graph.add(new Edge(3,4,4));
			graph.add(new Edge(4,1,-1));
			
			
		}
	
	//function for Bellman ford algorithm->>time->O(VE)
	public static void bellmanFord(ArrayList<Edge> graph[],int src) {
		
		int distt[]=new int[graph.length];
		//now Initialise distt array with+infinity value except for src
		for(int i=0;  i<graph.length; i++) {
			if(i!=src) {
				distt[i]=Integer.MAX_VALUE;
			}
		}
		
		//Now loop v-1 time to find shortest distance from src(for negative wt and positive wt also)
		int V=5;
		for(int i=0;  i<V-1;  i++) {//TIME->O(V)
			
			//now loop on each vertex and find their neighbour to compare with src dist
			//the given two loops will loop through all edges so time is O(E)
			for(int j=0;  j<graph.length;  j++) {
				for(int k=0;  k<graph[j].size();  k++) {
					Edge e=graph[j].get(k);
					
					int u=e.src;
					int v=e.dest;
					int wt=e.wt;
					
					if(distt[u]!=Integer.MAX_VALUE && distt[u] + wt <distt[v]) {//as adding something in +infinity leads to -ve value,which will prevent
						                                                       //distt[v] to get updated that's what i wanted,why to update d[v] if it is small
						distt[v]=distt[u] + wt ;
					}
					
					
				}
			}
		}
		//now find shortest distt
		for(int i=0;  i<distt.length;  i++) {
			System.out.print(distt[i] + " ");
		}
		
	}
	
	//FUNCTION FOR BELLMAN ford algorithm in the form of arraylist of edges
	public static void bellmanFord2(ArrayList<Edge> graph ,int src, int V) {
		
		int[] distt=new int[V];
		
		for(int i=0;  i<distt.length;  i++) {
			if(i!=src) {
				distt[i]=Integer.MAX_VALUE;
			}
		}
		
		//now loop V-1 TIMES to find shorted distt for every vertex(v-1 because for 1 (src) ,we already have shortest distt)
		for(int i=0;  i<V-1;  i++) {//V-1==E,E=no of edges in worst case,means we are going on  each edge for ralaxiation
			
			//now all edges are stored in arraylist, so we will aceess then and their neighbour at a time
			for(int j=0; j<graph.size();  j++ ) {//in graph arraylist edge object is stored which is carrying src,dest and wt
				Edge e=graph.get(j);
				int u=e.src;
				int v=e.dest;
				int wt=e.wt;
				
				if(distt[u]!=Integer.MAX_VALUE && distt[u] + wt < distt[v]) {//as if we add anything in +infinity then it will produce -ve no
					
					distt[v]=distt[u] + wt ;
				}
			}
		}
		
		//now loop through it to shortest distt of every vertex
		for(int i=0;  i<distt.length;  i++) {
			System.out.print(distt[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int v=5;
		//ArrayList<Edge> graph[]=new ArrayList[v];
		ArrayList<Edge> graph=new ArrayList<BellManFordAlgorithm.Edge>();
		
		createGraph2(graph);//now graph created
		
		bellmanFord2(graph, 0,5);
		
	}

}
