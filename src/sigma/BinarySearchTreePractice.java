package sigma;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinarySearchTreePractice {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
		
	}
	
	//function to build a 	BST-inserting a given element into a BST at proper position
	public static Node insert(Node root, int val) {//here we are returning root of resultant BST
		
		if(root==null) {
			root=new Node(val);
			return root;
		}
		//if root is not null
		if(root.data>val) {
			//left subtree
			root.left=insert(root.left, val);//from here we will get topmost node of left subtree
		} else {//here else means root.data<val, they can't be equal as we are not taking duplicates BST into account
			//right subtree
			root.right=insert(root.right, val);
		}
		
		return root;//the above function insert given value at proper position so that they can form a BST
		
	}
	
	//function for inorder traversal-here we will traverse and print the each element so no need to give any return statement
	public static void inorder(Node root) {
		if(root==null) return;
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
		
		
	}
	
	//function for searching a key in BST
	public static boolean search(Node root, int key) {
		//base case
		if(root==null) {
			return false;
		}
		
		if(key==root.data) {
			return true;
		} 
	    if(key>root.data) {//right subtree
			return search(root.right, key);
		} else {//left subtree as key<root.data
			return   search(root.left, key);
		}
		
		//once we will get a data==key , we will return true to parents and they will also return true to their ancestors
	}
	

    //function for delete a node from BST(after deleting , it must be a BST)
	public static Node delete(Node root,int val) {//return type is Node as we want to return root of modified BST after dleting element
		//step1-search the element to be deleted
		if(root.data>val) {
			//left
			root.left=delete(root.left,val);//perform delete operation in left part and modify the left part of BST
		} else if(root.data<val) {
			//right part
			root.right=delete(root.right, val);//perform delete operation in right part and modify the right part of BST
		} else {//voila case(root.data==val), means we found node which we want to delete
			     //to delete this node there can be 3 cases, either leaf node ,single child node, and double child node
			
			//case 1-leaf node
			if(root.left==null && root.right==null) {
				return null;//return null to it's parent , so that root is deleted from BST and ready for garbage collection
			}
			
			//case2-single child node-now both left and right can't be null as this case has been alrady dealt
			if(root.left==null) {
				return root.right;//return child of this root to it's parent so that root get deleted from BST
			} else if(root.right==null) {
				return root.left;
			}
			
			//case3-double child node
			//IS(inorder successer) is basically leftmost element in right subtree
			//in this case first find inorder successor(IS) of node(in right part) which has to be deleted,then replace node data with IS data
			//then delete IS
			Node IS=findInorderSuccessor(root.right);
			root.data=IS.data;
			//now delete IS
			root.right=delete(root.right, IS.data);
			
			
		}
		
		return root;
		
		
		
	}
	
	
	//function for finding Inorder Successer of a node
	public static Node findInorderSuccessor(Node root) {
		while(root.left!=null) {
			root=root.left;
		}
		//means now we have root whose left part is null, that means we found a leftmost part of that node
		return root;
	}
	
    
	
	//Function for print in range
	public static void printInRange(Node root,int k1, int k2) {
		
		//base case
		if(root==null) {
			return;
		}
		
		if(root.data>=k1 && root.data<=k2) {
			//print them in inorder to maintain incresing order
			printInRange(root.left, k1, k2);
			System.out.print(root.data + " ");
			printInRange(root.right, k1, k2);
		} else if(root.data<k1) {
			// go in right part
			printInRange(root.right, k1, k2);
		} else if(root.data>k2) {
			//go in left
			printInRange(root.left, k1, k2);
			
		}
	}
	
	//function for printing root to leaf path
	public static void root2Leaf(Node root, ArrayList<Integer> path) {
		
		//first of all , add curr root data to arrayList
		path.add(root.data);
		
		//check the curr root is leaf node
		if(root.left==null && root.right==null) {
			printPath(path);
		}
		
		root2Leaf(root.left, path);
		root2Leaf(root.right, path);
		
		
		
		
	}
	
	
	
	//function to print path
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;  i<path.size();  i++) {
			System.out.print(path.get(i) + "->");
		}
		System.out.println("Null");//when we encounter leaf node
	}
	
	
	//function to validate a BST
	public static boolean isValid(Node root) {
		
		return isValid(root, Integer.MIN_VALUE,Integer.MAX_VALUE);//here large range is given because root node can be anything possible
	}  //Basically here min and max is the range where root can lie ->,so to give all possible range for root we use that
	
	//helper function to validate BST
	public static boolean isValid(Node root, Integer min, Integer max) {
		if(root==null) return true;
		
		//now check that rest node is within allowable range
		if(root.data<=min || root.data>=max) return false;
		
		return isValid(root.left,min,root.data) && isValid(root.right,root.data,max);
		
	}
	
	
	
	public static void main(String[] args) {
		Node root=new Node(5);
		root.left=new Node(3);
		root.right=new Node(7);
		
		root.left.left=new Node(2);
		root.left.right=new Node(4);
		
		root.right.left=new Node(6);
		root.right.right=new Node(1);
		
		
		System.out.println(isValid(root));
		
		
//		int[] values= {6,8,2,1,3,5,4,7,9,10};
//		//int[] values= {5,1,3,4,2,7};//form a BST with this value as node data
//		                            //here 1st element of array will become root of BST
//		Node root=null;//initially no tree exist
//		
//		for(int i=0;  i<values.length;  i++) {
//			root=insert(root, values[i]);//this will create a BST with root node as root
//		}
//		
//		//now we have  a BST with given values as node data at proper position
//		//to print them properly , we need a inorder traversal function to make them sorted
//		
//		inorder(root);
//		System.out.println();
//		
//		System.out.println(search(root, 7));
//		
//		root=delete(root, 8);//now we have a modified binary tree
//		inorder(root);
//		System.out.println();
//		printInRange(root, 2, 9);
		
		
		
	}

}
