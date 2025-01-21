package sigma.BinarySearchTree;

import java.util.ArrayList;

public class BSTPractice2 {
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	//function to delete Node in a BST
	public static Node delete(Node root, int val) {
		
		if(root.data>val) {//left
			root.left=delete(root.left, val);//left part modified and stored inside left part
			
		} else if(root.data<val) {
			root.right=delete(root.right, val);//right part modified and stored inside right part
		} else {//voila case(root.data==val),we found the node where we want to delete node
			
			
			//case1-leaf node
			if(root.left==null && root.right==null) {
				return null;//to its parent,so that leaf node get deleted automatically by GC
			}
			
			//case2-single child
			//concept is ,return valid child to its parent so that it gets deleted from BST
			if(root.left==null) {
				return root.right;
			} else {
				if(root.right==null) {
					return root.left;
				}
			}
			
			//case 3-double child
			
			//By inorder predecessor
			Node IP=findInorderPredecessor(root.left);//because IP will be found in left part of tree only
			root.data=IP.data;
			
		root.left=delete(root.left, IP.data);//here left part will get modified
			
//			//find IS(inorder successor)
//			Node IS=findInorderSuccessor( root.right);//successor will be present in right side only
//			
//			root.data=IS.data;
//			root.right=delete(root.right, IS.data);//modified right tree will be stored here
		
		}
		
		
		return root;
	}
	
	//function for finding Inirder succesor-leftmost Node in right subtree
	public static Node findInorderSuccessor(Node root) {
		while(root.left!=null) {
			root=root.left;//untill we found leftmost node ,make root as root's left
		}
		
		return root;//this is leftmost node in BST
	}
	
	//function for inorder predecessor-rightmost node in left subtree
	public static Node findInorderPredecessor(Node root) {
		while(root.right!=null) {
			root=root.right;
		}
		return root;
	}
	
	//function for inorder traversal of BST
	public static void inorder(Node root) {
		//Base case
		if(root==null) {
			return ;
		}
		
		inorder(root.left);
		
		System.out.print(root.data + " ");
		
		inorder(root.right);
	}
	
	//function for printing in range(k1,k2)
	public static void printInRange(Node root, int k1, int k2) {
		if(root==null) {
			return ;
		}
		if(root.data>=k1 && root.data<=k2) {
			printInRange(root.left, k1, k2);//these are the sequence to print data in sorted order
			
			System.out.print(root.data + " ");
			
			printInRange(root.right, k1, k2);
		} else if(root.data<k1) {
			printInRange(root.right, k1, k2);
		} else if(root.data>k2) {
			printInRange(root.left, k1, k2);
			
		}
	}
	
	//function to print root to leaf element
	public static void root2Leaf(Node root,ArrayList<Integer> path) {
		
		//Base case
		if(root==null) {
			return;//remove fun from call stack
		}
		
		path.add(root.data);
		
		//if root is leaf node , print all stored node data in path(Because we found root leaf path data)
		if(root.left==null && root.right==null) {
			printPath(path);//function to  print path (arraylist)
		}
		
		//if root is not leaf node
		root2Leaf(root.left, path);
		root2Leaf(root.right, path);
		
		//if left and right both node sorted , remove arraylist path last element for next root2Leaf path finding
		path.remove(path.size()-1);
		
		
		
	}
	
	//function to print a arraylist
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;  i<path.size();  i++) {
			System.out.print(path.get(i) + "->");
		}
		System.out.println("null");
	}
	
	//function to mirror a BT
	public static Node mirror(Node root) {
		if(root==null) return root;
		
	  Node leftMirrored= mirror(root.left);
	  Node rightMirrored=mirror(root.right);
	  
	  root.left=rightMirrored;
	  root.right=leftMirrored;
	  
	  return root;
	   
	}
	
	//function
	public static Node mirror2(Node root) {
		if(root==null) return root;
		
		Node left=root.left;
		Node right=root.right;
		
		root.left=right;
		root.right=left;
		
		mirror2(root.left);
		mirror2(root.right);
		
		return root;
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(5);
		root.left=new Node(3);
		root.right=new Node(7);
		
		root.left.left=new Node(2);
		root.left.right=new Node(4);
		
		root.right.left=new Node(6);
		root.right.right=new Node(8);
		
		inorder(root);
		
		root=delete(root, 7);//modif
		System.out.println();
//		
		inorder(root);
		System.out.println();
		
//		printInRange(root, 4, 7);
//		System.out.println();
//		root2Leaf(root, new ArrayList<Integer>());
		System.out.println();
		
//		root=mirror2(root);
//		inorder(root);
		
		
	}
 
}
