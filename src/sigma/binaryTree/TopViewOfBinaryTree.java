package sigma.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBinaryTree {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		//constructor
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	static class Info{
		Node node;
		int hd;//horizontal distance
		
		
		//constructor
		public Info( Node node,int hd) {
			this.node=node;
			this.hd=hd;
			
		}
	}
	
	//function for top view of a binary tree
	public static void topView(Node root) {
		Queue<Info> q=new LinkedList<>();//for level order
		HashMap<Integer, Node> map=new HashMap<>();
		int min=0, max=0;//for iteration on hd and top view elements
		
		
		q.add(new Info(root,0));
		q.add(null);
		
		while(!q.isEmpty()) {
			Info curr=q.remove();
			
			//null condition
			if(curr==null) {
				if(q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				
				if(!map.containsKey(curr.hd)) {
					map.put(curr.hd, curr.node);
				}
				if(curr.node.left!=null) {
					q.add(new Info(curr.node.left,curr.hd-1));
					min=Math.min(min, curr.hd-1);//as hd is decresing so only min finding makes sense
				}
				if(curr.node.right!=null) {
					q.add(new Info(curr.node.right,curr.hd+1));
					max=Math.max(max, curr.hd+1);//as hd is increasing here so  max finding makes sense
				}
				
			}
		}
		
		//now printing top view
		for(int i=min;  i<=max;  i++) {
			System.out.print(map.get(i).data + " ");
		}
		System.out.println();
		
	}
	
	//function for printing element of kth level of binary tree;
	//Home work(using iteration)-t.c-O(N)
	public static void kthLevel(Node root,int k) {
		int level=1;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node curr=q.remove();
			
			if(curr==null) {
				level++;
				if( q.isEmpty()) {
					break;
				} else {
					
					q.add(null);
				}
			} else {
				if(curr.left!=null) {
					q.add(curr.left);
					
				}
				if(curr.right!=null) {
					q.add(curr.right);
					
				}
				
				if(level==k) {
					System.out.print(curr.data + " ");
				}
			}
			
		}
	}
	
	//function for kth level using recursion-t.c=O(N)
	public static void kthLevel2(Node root,int k,int level) {
		//Base cases
		if(root==null) {
			return;
		}
		
		if(level==k) {
			System.out.print(root.data + " ");
			return;//Because we found the level for which we are searching, no need to go down
		}
		
		kthLevel2(root.left, k,level+1);
		kthLevel2(root.right, k,level+1);
		
		
		
	}
	
	
	
	
	
	//function for lowest common ancestors(LCA) in a Binary tree(nearest common ancestors)
	public static Node lca( Node root, int n1, int n2) {
		ArrayList<Node> path1=new ArrayList<>();
		ArrayList<Node> path2=new ArrayList<>();
		
		getPath(root,n1,path1);
		getPath(root,n2,path2);
		
		//finding lca
		int i=0;//making i as local var to get lca, if it is inside for loop, we can not find (i-1)th element
		for(; i<path1.size() && i<path2.size();  i++) {//loop will run upto smaller size path
			
			if(path1.get(i)!=path2.get(i)) {//first uncommon node at i, so nearest common node at i-1 th node
				break;
			}
		}
		
		//lca is at=i-1 th place
		Node lca=path1.get(i-1);
		
		return lca;
		
		
	}
	
	//function to store ancestors node from root to given node
	public static boolean getPath(Node root, int n,ArrayList<Node> path) {//t.c-O(N),SC-O(N)
		//Base case
		if(root==null) {
			return false;//means no node fount, empty path
		}
		
		path.add(root);
		if(root.data == n) {
			return true;
		}
		
		boolean founfLeft=getPath(root.left, n, path);
		boolean foundRight=getPath(root.right, n, path);
		
		if(founfLeft || foundRight ) {
			return true;
		}
		//return true in any cases means , we will not go ahead, we have found the node already and stored element from root to that node in path
		
		
		path.remove(path.size()-1);//i.e this is not correct path from root to given node
		
		return false;
	}
	
	//optimised function for lca calculation-t.c-O(N), s.c -O(N) IN terms of rec call stack
	                                     //but in terms of auxilliary soace it is O(1)
	public static Node lca2(Node root, int n1, int n2) {
		//Base case
		if(root==null || root.data==n1 || root.data==n2) {
			return root;//here root is nearest common node means lca
		}
		Node leftLca=lca2(root.left, n1, n2);
		Node rightLca=lca2(root.right, n1, n2);
		
		//now checking valid and null value condition
		if(rightLca==null) {
			return leftLca;//ie both node are in left subtree , that's why lca is also in left subtree
		}
		if(leftLca==null) {
			return rightLca;//i.e both nodes are there in right tree that's why lca are also there in right tree
		}
		
		return root;//if both left and right part return valid value as lca , there commom ancestors must be root itself 
		             //means root is lca
		
	}
	
	//function for minimum distance between two nodes
	public static int minDist(Node root, int n1, int n2) {
		Node lca=lca2(root, n1, n2);
		int dist1=lcaDist(lca,n1);
		int dist2=lcaDist(lca,n2);
		
		return dist1 + dist2;
		
	}
	
	//function for distance between two nodes
	public static int lcaDist(Node root, int n) {
		if(root==null) return -1;
		
		if(root.data==n) return 0;
		
		int leftDist=lcaDist(root.left, n);
		int rihtDist=lcaDist(root.right, n);
		
		if(leftDist ==-1 && rihtDist==-1 ) {
			return -1;//means no (n data) node exist
		} else if(leftDist==-1) {//any node dist->-1 means no n data carrying node found
			return rihtDist +1;//parent will add one more dist from data coming from child
		} else {
			return leftDist +1;
		}
		
		
	}
	
	//function for finding kth ancestors of a fiven node
	public static int kthAncestors(Node root, int n, int k) {
		//Base case
		if(root==null) return -1;//no valid dist exist
		
		if(root.data==n) return 0;//n and root data overlap
		
		int leftDist=kthAncestors(root.left, n, k);//searching distt in left subtree
		int rightDist=kthAncestors(root.right, n, k);//searching distance in right subtree
		
		if(leftDist==-1 && rightDist==-1 ) {
			return -1;
		}
		
		int max=Math.max(leftDist, rightDist);//if one of them is -1 then other will be more than that , that's how we can easily find 
		                                      //valid dist betweem them
		if(max+1==k) {//if ancestors found , print them
			System.out.print(root.data + " ");
		}
		
		
		return max+1;
	}
	
	//function for transform to sum tree
	public static int sumTree(Node root ) {
		
		//Base case
		if(root==null) {
			//return null;
		}
		int data=root.data;
		 root.data=nodeSum(root);
		 
		 sumTree(root.left);
		 sumTree(root.right);
		 
		 return  data;
		
	}
	
	//function for adding left and right tree data
	public static int nodeSum(Node root) {
		if(root==null) return 0;
		
		return nodeSum(root.left) + nodeSum(root.right);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		System.out.println(sumTree(root));
		
		//kthAncestors(root, 5, 1);
		
		//System.out.println(minDist(root, 2, 6)); 
		
		
	//	System.out.println(lca2(root, 4, 7).data);
		
	//	System.out.println(lca(root, 4, 7).data);
		
		//topView(root);
//		kthLevel(root, 3);
//		System.out.println();
//		kthLevel2(root, 3,1);
		
		
		
	}

}
