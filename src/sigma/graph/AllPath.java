package sigma.graph;

import java.util.ArrayList;

import sigma.graph.TopologicalSorting.Edge;

public class AllPath {
	
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
		
		//for vetex 0
		graph[0].add(new Edge(0,3));
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
	//function to create graph
		public static void createGraph2(ArrayList<Edge> graph[]) {
			//now inilise arraylist
			for(int i=0;  i<graph.length; i++) {
				graph[i]=new ArrayList<>();//initilised with null values
			}
			
			//now we will add vertex to graph
			//for vertex 0
			graph[0].add(new Edge(0,1));
			
			//for vertex 1
			graph[1].add(new Edge(1,2));
			graph[1].add(new Edge(1,6));
			graph[1].add(new Edge(1,0));
			
			//for vertex 2
			graph[2].add(new Edge(2,1));
			graph[2].add(new Edge(2,3));
			graph[2].add(new Edge(2,5));
			
			//for vertex 3
			graph[3].add(new Edge(3,2));
			graph[3].add(new Edge(3,4));
			
			//for vertex 4
			graph[4].add(new Edge(4,3));
			graph[4].add(new Edge(4,5));
			
			//for vertex 5
			graph[5].add(new Edge(5,2));
			graph[5].add(new Edge(5,4));
			graph[5].add(new Edge(5,6));
			
			//for vertex 6
			graph[6].add(new Edge(6,1));
			graph[6].add(new Edge(6,5));
			
		}
	
	//function to all path from source to destination in a directed graph
	public static void printAllPath(ArrayList<Edge> graph[], int src,int dest,String path) {
		
		
		//Base case
		if(src==dest) {
			System.out.println(path +dest);//or path+src as both are same;
			return;
		}
		
//		//mark src visited
//		visited[src]=true;
//		
		//if src!=dest, check for ur neighbour
		for(int i=0;  i<graph[src].size();  i++) {
			Edge e=graph[src].get(i);
			
			printAllPath(graph, e.dest, dest, path+src);//dfs function
			                                            //no need to track visited as it is idrected graph
		}
		
		
	}
	
	//function to reverse String in linear time and constant space
//	public static String reverse(String str) {
//		
//		char left=str.charAt(0);
//		char right=str.charAt(str.length()-1);
//		
//		
//		//while(left)
//	}
//	
	public static void main(String[] args) {
		
		int v=7;
		ArrayList<Edge> graph[] =new ArrayList[v];
		createGraph(graph);
		
		printAllPath(graph,5,1, "");
		
	}

}
