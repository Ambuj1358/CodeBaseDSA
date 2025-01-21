package sigma.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KrushkalAlgorithm {
	
	static class Edge implements Comparable<Edge>{
		int src;
		int dest;
		int wt;
		
		Edge(int src,int dest,int wt){
			this.src=src;
			this.dest=dest;
			this.wt=wt;
			
		}
		
		//now write sorting logic of Edge class based on wt
		@Override
		public int compareTo(Edge e) {
			return this.wt-e.wt;
		}
	}
	
	//Function to create given graph
	public static void createGraph(ArrayList<Edge> edges) {//here we will create al of edge type graph
		
		edges.add(new Edge(0, 1, 10));
		edges.add(new Edge(0, 2, 15));
		edges.add(new Edge(0, 3, 30));
		edges.add(new Edge(1, 3, 40));
		edges.add(new Edge(2, 3, 50));
		
//		//initialise arraylist at each array index of graph with null values
//		for(int i=0;  i<graph.length;  i++) {
//			graph[i]=new ArrayList<KrushkalAlgorithm.Edge>();
//		}
//		
//		//add vertex to grapg 
//		//for vertex 0
//		graph[0].add(new Edge(0,1,10));
//		graph[0].add(new Edge(0,2,15));
//		graph[0].add(new Edge(0,1,30));
//		
//		//for vertex 1
//		graph[1].add(new Edge(1,0,10));
//		graph[0].add(new Edge(1,3,40));
//		
//		//for vertex 2
//		graph[2].add(new Edge(2,0,15));
//		graph[2].add(new Edge(2,3,50));
//		
//		//for vertex 3
//		graph[3].add(new Edge(3,1,40));
//		graph[3].add(new Edge(3,2,50));
//		graph[3].add(new Edge(3,0,30));
//		
//		//now grapg created
	}
	
	static int n=4;
	static int par[]=new int[n];
	static int[] rank=new int[n];
	
	//function to initialise the par array
	public static void init() {
		for(int i=0;  i<n;  i++) {
			par[i]=i;
		}
	}
	
	//function for find(find algorithm)
	public static int find(int a) {//a will be any vertex of graph
		//base case
		if(a==par[a]) return a;//means if it is par to self then it must be supreme par in its subset
		
		return par[a]=find(par[a]);//here we have done path compression as finding the supreme par of a and storing them to local par will reduce time to search it for next time
		//par[a]=find(par[a]) ->path compression    
	}
	
	//function for union
	public static void union(int a, int b) {
		int sla=find(a);//sla->supreme leader of a
		int slb=find(b);//slb->supreme leader of b
		
		/*
		 * Basically everything a, b, sla, slb all are vertex of graph
		 * so we are taking them for assigning the head of subset in which they are present
		 */
		
		if(rank[sla]==rank[slb]) {
			//if both have same rank, so we can make anyone to anyone's par, but we have to increase their rank by 1
			sla=par[slb];//here we have made sla as par of slb
			rank[sla]++;
		} else if(rank[sla]>rank[slb]) {
			sla=par[slb];//if one vertex has more rank then make that vertex as par of lower rank vertex but no need to increase the rank 
			         //as rank is already more
		} else {//rank[sla]<rank[slb]
			slb=par[sla];
		}
	}
	
	
	//function for krushkals algorithm
	public static void krushkalsAlgorithmMST(ArrayList<Edge> edges,int V) {
		//1st of all initialise par
		init();
		
		Collections.sort(edges);//now we have edge in sorted format
		
		//so we will loop V-1 times(worst case) to get Our mst
		int count=0;
		int mstCost=0;
		
		/*
		 * Steps of Krushkals algorithm
		 * 1->Sort all edges based on cost or requirement
		 * 2->take  edges of min cost if they are not forming cycle
		 * 3.->include edges cost to ans
		 * 
		 * for cycle we can use DSU algorithm as if their supreme leader is same means they are in same set and calling union function on them will form cycle
		 * so if their supreme leader are not same then only keep them in our mst(by calling union function)
		 * for a graph of V vertices ,max edge can be V-1 ,so track count upto <V-1
		 */
		
		for(int i=0;  count<V-1;  i++) {//we are tracking edges with i,here we can also write i<edges.size()-1,
			                           //but in this case our loop will run some extra time
			
			Edge e=edges.get(i);//at every index there is edge
			int a=find(e.src);
			int b=find(e.dest);
			
			//check for cycle condition with union
			//if(a==b) cycle will be found ,so we will not add them into mst set
			if(a!=b) {//if supreme leader are not equal means they are not forming cycle after union of both of them
				union(a, b);
				mstCost+=e.wt;
				count++;//count is tracking num of edges(max count is V-1 for mast forming)
			}
			
		}
		
		System.out.println(mstCost);
		
	}
	
	public static void main(String[] args) {
		int v=4;
	    ArrayList<Edge> graph=new ArrayList<KrushkalAlgorithm.Edge>();
	    createGraph(graph);
	    krushkalsAlgorithmMST(graph, v);
	   
		
	}

}
