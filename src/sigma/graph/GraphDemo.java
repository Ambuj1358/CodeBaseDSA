package sigma.graph;

import java.util.ArrayList;

public class GraphDemo {
	
	//inner Edge class
	static class Edge{
		
		int src;
		int dest;
		int wt;
		
		Edge(int src,int dest,int wt){
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	public static void main(String[] args) {
		
		int v=5;
		
		ArrayList<Edge>[] graph=new ArrayList[v];//here arraylist is empty not null, null means data not defined what will be stored
		
		//initialising arraylist of graph
		for(int i=0;  i<v;  i++) {
			graph[i]=new ArrayList<>();
		}
		
		//here graph[i] is arraylist at index i
		
		//for vertex 0
		graph[0].add(new Edge(0, 1, 5));
		
		//for vertex 1;
		graph[1].add(new Edge(1, 0, 5));
		graph[1].add(new Edge(1, 2, 1));
		graph[1].add(new Edge(1, 3, 3));
		
		//for vertex 2
		graph[2].add(new Edge(2, 1, 1));
		graph[2].add(new Edge(2, 3, 1));
		graph[2].add(new Edge(2, 4, 2));
		
		//for vertex 3
		graph[3].add(new Edge(3, 1, 3));
		graph[3].add(new Edge(3, 2, 1));
		
		//for vertex 4
		graph[4].add(new Edge(4, 2, 2));
		
		//there are 10 operations of adding into arraylist as we are adding each edge two time ,bi directional
		
		//let's iterate over them
		for(int i=0;  i<graph[1].size();  i++) {//graph[0] is arraylist at whic edge object is stored
			Edge e=graph[i].get(i);//src,dest,wt
			System.out.println(e.dest);//get info of neighbour of 1,like this we can get any vertex neighbour info like src,dest,wt
		}
		
	}

}
