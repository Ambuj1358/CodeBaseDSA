package sigma.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkshtras {
	
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
	
	//Function to create a directed graph
	public static void createGraph(ArrayList<Edge>graph[]) {
		
		//now initialise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<Dijkshtras.Edge>();
			
		}
		
		//now add vertex to graph
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		
		//for vertex 1
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,7));
		
		//for vertex 2
		graph[2].add(new Edge(2,4,3));
		
		//for vertex 3
		graph[3].add(new Edge(3,5,1));
		
		//for vertex 4
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
		
		
	}
	
	  //function for dijkshtra's algorithm(shortest path/dist finder from src to given vertex)
	  public static void dijkshtra(ArrayList<Edge> graph[],int src) {
		  //now create 3 data structures,visited array,priority queue,shortest dist from src array
		  boolean visited[]=new boolean[graph.length];//as it will store ,visited data for all vertex
		  
		  PriorityQueue<Pair> pq=new PriorityQueue<>();
		  
		  //now create shortest distance from src array(in array all vertex shortest distance from src is stored)
		  int shortestDist[]=new int[graph.length];//(length justification)as all vertex shortest dist from src stored here
		  
		  //except src,initialise all shortest dist element from positive infiny
		  for(int i=0;  i<shortestDist.length;  i++) {
			  if(i!=src) {
				  shortestDist[i]=Integer.MAX_VALUE;//+INFINITY
			  }
		  }
		  
		  //now add pair data of src in pq
		  pq.add(new Pair(src,0));//initially we have node src and its shortest dist from src means itself is 0
		  
		  while(!pq.isEmpty()) {
			  Pair curr=pq.remove();
			  
			  if(!visited[curr.node]) {//if curr node (which is removed) is not visited yet->first visit then look for their neighbour
				  visited[curr.node]=true;
				  
				  //neighbour
				  for(int i=0;  i<graph[curr.node].size();  i++) {
					  Edge e=graph[curr.node].get(i);
					  
					  int u=e.src;
					  int v=e.dest;
					  int wt=e.wt;
					  
					  //for any neighbour
					  if(shortestDist[u]+ wt< shortestDist[v]) {// as we found more shortest path,means if d[u] +wt(u,v)<d[v],then update d[v]=d[u]+wt(u,v)
						  shortestDist[v]=shortestDist[u]+ wt;//as we are finding shortest distance from src
						  pq.add(new Pair(v,shortestDist[v]));
					  }
				  }
				  
			  }
		  }
		  
		  //now we will print all shortest distance from src to all vertex
		  for(int i=0;  i<shortestDist.length;  i++) {
			  System.out.print(shortestDist[i] + " ");
			  
		  }
		  
	  }
	  
	  //Pair inner class
	  static class Pair implements Comparable<Pair>{
		  int node;
		  int shortPath;//it will store shortest path data value
		  
		  public Pair(int node,int shortPath) {
			  this.node=node;
			  this.shortPath=shortPath;
		  }
		  
		  @Override
		  public int compareTo(Pair p) {
			  return this.shortPath-p.shortPath;//sorted in ascending order(1st -2nd)
		  }
	  }
	
	public static void main(String[] args) {
		int v=6;
		
		ArrayList<Edge> graph[]=new ArrayList[v];
		
		createGraph(graph);//now grapg created in memory
		
		dijkshtra(graph, 0);
	}

}
