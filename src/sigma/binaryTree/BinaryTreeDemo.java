package sigma.binaryTree;

import java.lang.module.ModuleDescriptor.Builder;

public class BinaryTreeDemo {
	
	static class  Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			
			this.left=null;
			this.right=null;
					
		}
	}
	
	static class BinaryTree{
		static int idx=-1;
		
		public static Node buildTree(int nodes[]) {
			
			idx++;
			if(nodes[idx]==-1) return null ;
			
			
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);//Building the left part of tree
			newNode.right=buildTree(nodes);//building the right part of tree
			
			
			return newNode;
			
			
			
			
		}
		
		//function for preorder traversal in  tree-root,left,right
		public static void preorder(Node root) {//T.C-O(N) linear
			
			//base case
			if(root==null) {
				return;
			}
			
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
			
		}
		
		//function for inorder traversal in tree-left,root,right
		public static void inorder(Node root) {//t.c-O(N) linear
			if(root==null) return;
			
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
		
		//function for postorder traversal in tree-left,right,root
		public static void postorder(Node root) {
			if(root==null)return;
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
			
		}
		
		
		
		
		
		
	}
	
//	//function for checking two tree identical or not
//	public static boolean isIdentical(Node node, Node subroot) {
//		if(node==null && subroot==null) {
//			return true;//In starting subroot is non empty , but when we call Identical function recursively
//			            //it's child may be null , that's why I am comparing both of them with null
//		} else if(node==null || subroot==null || node.data!=subroot.data) {
//			return false;
//		}
//		
//		//calling isIdentical function for next left subtree
//		if(!isIdentical(node.left, subroot.left)) {
//			return false;
//		}
//		//calling isIdentical function for next left subtree
//		
//		if(!isIdentical(node.right, subroot.right)) {
//			return false;
//		}
//		
//		return true;//Here basically what we are doing , we are analysing all possible cases for getting non identical tree
//		            //Because checking for non identical is much more easy than checking for identical
//	}
//	
//	//function for checking Subtree of a tree
//	//here subroot is non empty
//	public static boolean isSubTree(Node root, Node subroot) {
//		//Base case
//		if(root==null) {
//			return false;//assuming subroot is non empty tree
//		}
//		
//		if(root.data == subroot.data) {
//			if(isIdentical(root, subroot)) {
//				return true;
//			}
//		}
//		
//		
//		
//		return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
//	}
//	
	
	//function for checking a suntree part of tree or not
	//here subroot is non empty tree
	public static boolean isSubtree(Node root, Node subroot) {//t.c-O(N),NOT AFFECTED BY areIdentical function introduction
		                                     //think about this by yourself, Bcs both function is moving at each node at once
		
		//Base case
		if(root==null) {
			return false;//as subRoot is non empty
		}
		
		//if both have same root value
		if(areIdentical(root,subroot)){//comparing the two tree are identical or not
			return true;
		}
		
		//if both have different root value
		return isSubtree(root.left, subroot)  || isSubtree(root.right, subroot) ;
		
		
	}
	
	//function for checking two tree identical or not
	public static boolean areIdentical(Node node1, Node node2) {
		if(node1==null && node2==null)
			return true;
		
		if(node1==null || node2 ==null || node1.data!=node2.data)
			return false;
		
		return areIdentical(node1.left, node2.left) && areIdentical(node1.right, node2.right);
		
	}
	
	//function for counting nodes
	public static int nodeCount(Node root) {//rrot as parameter to pass tree
		//Base case
		if(root==null) {
			return 0;
		}
		
		int leftCount=nodeCount(root.left);
		int rightCount=nodeCount(root.right);
		
		return leftCount + rightCount +1;//in place of 1 , write root.data for node sum
		
	}
	
	//function for printing kth level of a binary tree
	public static void kthLevel(Node root,int k) {
		int level=1;//level of root from where we start analysing
		//Base case
		if(root==null) {
			return;//no need to print if root is null
			
		}
		
		if(level==k) {
			System.out.print(root.data + " ");
			return ;//no need to print anything else down
		}
		
		//recursion
		kthLevel(root.left, k);
		kthLevel(root.right, k);
		
		return;
	}
	
	//optimised function for finding lca of two nodes->t.c-O(N), S.C->O(N) In trems of rec call satck
	                                                                //in terms of auxilliary space O(1)
	public static Node lca(Node root, int n1, int n2) {
		//Base case
		if(root==null || root.data==n1 || root.data==n2) {
			return root;
		}
		
		Node leftLca=lca(root.left, n1, n2);
		Node rightLca=lca(root.right, n1, n2);
		
		if(rightLca==null) {//ie no given node found in right part
			return leftLca;
		}
		if(leftLca==null) {//ie no given node found in left part of tree of tree
			return rightLca;
		}
		
		return root;  //1st common ancestors of both node is root
		
	}
	
	
	public static void main(String[] args) {
		//Manual creation of Binary tree using Node
		
		//original tree
		Node root=new Node(5);
		root.left=new Node(3);
		root.right=new Node(6);
		
		root.left.left=new Node(2);
		root.left.right=new Node(8);
		
		root.right.left=new Node(7);
		root.right.right=new Node(5);
		
		System.out.println(lca(root, 2, 7).data);
		
		//for node counting
		//System.out.println(nodeCount(root));
		
		//subtree
//		Node subroot=new Node(6);
//		subroot.left=new Node(7);
//		subroot.right=new Node(5);
		
		
		
		//System.out.println(isSubtree(root, subroot));
		
		//int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
//		BinaryTree tree=new BinaryTree();
//		
//		Node root=tree.buildTree(nodes);//Here Binary tree generated
//		BinaryTree.preorder(root);
//		System.out.println();
//		BinaryTree.inorder(root);
//		
//		System.out.println();
//	    BinaryTree.postorder(root);
//		
		
		//System.out.println(root.data);
				
		
	}

}
