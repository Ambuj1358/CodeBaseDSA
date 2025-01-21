package sigma.graph;

import java.util.ArrayList;

public class GraphDemo2 {
	
	static class Edge{
		int src;
		int dest;
		int wt;
		
		public Edge(int src, int dest,int wt) {
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	public static void main(String[] args) {
		int v=5;
		
		//Here all vertices are array index and at each index arraylist is tored in which that vertex neighbours are stored with their info
		ArrayList<Edge>[] graph=new ArrayList[v];//here Arraylist is datatype
		
		//Now Arraylist is empty , so we have to initialize it
		for(int i=0;  i<v;  i++) {
			graph[i]=new ArrayList<>();//initilising arraylist with null values
		}
		
		//now add vertex neighbour info
		//for vertex 0
		graph[0].add(new Edge(0,1,5));
		
		//for vertex 1
		graph[1].add(new Edge(1,0,5));
		graph[1].add(new Edge(1,2,6));
		graph[1].add(new Edge(1,3,10));
		
		//for vertex 2
		graph[2].add(new Edge(2,3,9));
		graph[2].add(new Edge(2,1,6));
		
		//for vertex 3
		graph[3].add(new Edge(3,1,10));
		graph[3].add(new Edge(3,2,9));
		graph[3].add(new Edge(3,4,11));
		
		//now we have graph in the form of adjacent list
		
		//now iterate on graph to find info about neighbour
		for(int i=0;  i<graph[3].size();  i++) {//neighbour info of vertex stored as index 3
			Edge e=graph[3].get(i);
			
			System.out.println( e.dest);
			System.out.println(e.wt);
			
		}
		
		
	}

}
