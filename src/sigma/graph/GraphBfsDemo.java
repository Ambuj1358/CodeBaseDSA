package sigma.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class GraphBfsDemo {
	
	//inner class for edge
	static class Edge{
		int src;//source
		int dest;//destination
		int wt;//weight
		
		public Edge(int src,int dest,int wt) {
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	//function to create graph using adjacency list
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		//first of all initilise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<>();//at every index there is arraylist,that we are initialising
		}
		
		//now put all vertex of graph manually
		
		//for vertex 3
		graph[3].add(new Edge(3,5,1));
		graph[3].add(new Edge(3,6,1));
		
		//for vertex 5
		graph[5].add(new Edge(5,9,1));
		graph[5].add(new Edge(5,3,1));
		
		//for vertex 9
		graph[9].add(new Edge(9,5,1));
		graph[9].add(new Edge(9,2,1));
		
		//for vertex 2
		graph[2].add(new Edge(2,9,1));
		graph[2].add(new Edge(2,1,1));
		graph[2].add(new Edge(2,3,1));
		
		//for vertex 1
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,6,1));
		
		//for vertex 6
		graph[6].add(new Edge(6,3,1));
		graph[6].add(new Edge(6,1,1));
		
		//for vertex 3
		graph[3].add(new Edge(3,2,1));
		
	}
	
	//Function for BFS
	public static void bfs(ArrayList<Edge> graph[],int src) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		boolean visited[]=new boolean[graph.length];//to make sure each element visited once
		
		q.add(src);
		
		while(!q.isEmpty()) {
			int curr=q.remove();
			
			if(!visited[curr]) {//means if curr vertex is not visited
				//1->print curr
				//2->make it's visited true
				//add it's neighbour to queue for further visisting if not visited
				System.out.print(curr + " ");
				visited[curr]=true;
				
				//neighbour ,add in queue
				for(int i=0;  i<graph[curr].size();  i++) {
					Edge e=graph[curr].get(i);//ith neighbour at curr index of graph array
					
					q.add(e.dest);//here dest is neighbour, all will be added to queue
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int v=10;//as highest vertex is 9 ,including 0 so take 10 to include all vertex as index in array 
		         //the index for which vertex is not found ,there is null in the form of arraylist
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);
		bfs(graph, 3);
		
//		//now find the neighbour of given vertex
//		for(int i=0;  i<graph[3].size();  i++) {
//			Edge e=graph[3].get(i);
//			
//			System.out.println(e.dest);//dest is the immediate neighbours
//		}
		
	}

}
