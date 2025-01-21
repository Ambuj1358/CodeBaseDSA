package sigma.graph.practice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkshtraAlgorithm {
	
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
	
	//function to create graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		//initilise arraylist
		for(int i=0;  i<graph.length;  i++) {
			graph[i]=new ArrayList<DijkshtraAlgorithm.Edge>();//Arraylist initialised with null values
	
		}
		
		//now add vertex to graph
		//for vertex 0
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));
		
		//for vertex 1
		graph[1].add(new Edge(1,2,0));
		graph[1].add(new Edge(1,3,6));
		
		//for vertex 2
		graph[2].add(new Edge(2,4,3));
		
		//for vertex 3
		graph[3].add(new Edge(3,5,4));
		
		//for vertex 4
		graph[4].add(new Edge(4,5,5));
		
		
		
		
	}
	
	//function for dijkshtra algorithm
	public static void dijkshtra(ArrayList<Edge> graph[],int src) {
		//create pq,visited array,dist array(initialise it with + infinity except src)
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		
		boolean[] visited=new boolean[graph.length];
		int[] shortDistt=new int[graph.length];
		
		//now initialise shortDistt array with +infinity except src
		for(int i=0;  i<shortDistt.length;  i++) {
			if(i!=src) {
				shortDistt[i]=Integer.MAX_VALUE;
			}
		}
		
		pq.add(new Pair(src,0));//here node is src, and its distance from src is 0
		
		while(!pq.isEmpty()) {
			Pair curr=pq.remove();
			
			if(!visited[curr.node]) {
				
				visited[curr.node]=true;//visit the node if not visited
				
				//neighbours
				for(int i=0;  i<graph[curr.node].size();  i++) {
					Edge e=graph[curr.node].get(i);
					
					int u=e.src;
					int v=e.dest;
					int wt=e.wt;
					
				//now core logic for dijkshtra(compare the prev and curr distance of node to get shortest distance)
					if(shortDistt[u] + wt<shortDistt[v]) {
						shortDistt[v]=shortDistt[u] + wt;
						
						//here nieghbour is v(e.dest), and we have its shortest dis so we will wdd this into pq if it is not visited
						//this is very imp to check for visit ,(if u have undirected graph then it is must)
						if(!visited[v]) {
							pq.add(new Pair(v, shortDistt[v]));
						}
					}
					
				}
			}
			
			
		}
		//now print every node short dist from src,which is stored inside shortDistt array
		for(int i=0;  i<shortDistt.length;  i++) {
			System.out.print(shortDistt[i] + " ");
		}
	}

	
	//inner class pair to store node and its distance from src
	//we are using Piar inner class as we want node and its pre assigned distance also
	static class Pair  implements Comparable<Pair>{
		int node;//node(vertex) data
		int dist;
		
		public Pair(int node,int dist) {
			this.node=node;
			this.dist=dist;
			
		}
		@Override
		public int compareTo(Pair p) {
			return this.dist-p.dist;//ascending order sorting based on distance
					
		}
		
		
	}
	
	public static void main(String[] args) {
		int a=Integer.MIN_VALUE;
		System.out.println(a);
		System.out.println(a-10);
		
//		int v=6;
//		ArrayList<Edge> graph[]=new ArrayList[v];
//		
//		createGraph(graph);//now graph data structire created inside memory
//		
//		dijkshtra(graph, 0);
	}

}
