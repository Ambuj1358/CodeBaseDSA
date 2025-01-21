package sigma.graph;

//disjoint data structure->union find ds->merge ds(diff name of same ds)
public class DisjointSetDS {
	
	static int n=7;//total element in all disjoint sets
	static int[] par=new int[n];
	static int[] rank=new int[n];//initially every element has rank 0,as no bonding between elements
	
	//function for init
	public static void init(int[] par) {//we have to initialise the par, no need to initialise the rank as it is already set to 0 ,which we want
		
		for(int i=0;  i<n;  i++) {
			par[i]=i;//initially every set element is parent to itself
		}
	}
	
	//function for find
	public static int find(int x) {//we have to find (find) of find of given sets element
		//Base case
		if(x == par[x]) {
			return x;//supreme parent or we can say leader
		}
		
		/*
		 * If any element is parent to itself then it is leader in that set or group(supreme leader)
		 */
		
		return par[x]=find(par[x]);//path compressetion-->means every step will store its par so that we do not have to go each recursive step while calling leader
		
	}
	
	//function for union of two elements in a set
	public static void union(int a,int b) {
		int parA=find(a);//supreme leader of a(leader of the set in which it is present)
		int parB=find(b);//supreme leader of b(leader of the set in which it is present)
		
		/*
		 * Union always happens with leaders of that set ,not with child
		 * if we want union of two elements ,1st find their leader in set and compare their rank then add accordingly
		 */
		
		//initially every element rank will be same
		if(rank[parA]==rank[parB]) {//if both element(leader) have same rank, u can assign any element par to other one 
			                  //and increse the par element rank by 1
			par[parA]=parB;//so leader of a will join to leader of b
			rank[parB]++;//as leader of b is parent of leader of a
			
		} else if(rank[parA]>rank[parB]) {
			parA=par[parB];//here parA is already have bigger rank so no change in rank will be seen
		} else {
			parB=par[parA];
		}
	}
	
	
	public static void main(String[] args) {
		
		init(par);
		union(1,3);
		System.out.println(find(3));
		
		union(2, 4);
		union(3, 6);
		System.out.println(find(2));
		union(4, 5);
		System.out.println(find(4));
		union(3, 4);
		System.out.println(find(3));
		
		
	}

}
