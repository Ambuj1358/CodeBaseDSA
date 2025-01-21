package sigma.BinarySearchTree;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BSTPractice {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			//no need to write left and right as they are initially null;
		}
	}
	
	//function to build a BST using given values
	public static Node insert(Node root,int val) {
		if(root==null) {
			root=new Node(val);
			
			return root;
		}
		
		//if root is not null
		if(val>root.data) {//go right
			root.right=insert(root.right,val);
		}
		if(val<root.data) {
			root.left=insert(root.left, val);
		}
		
		return root;
	}
	
	//function for inorder traversal of tree to treverse and find sorted order for BST roots
	public static void inorder(Node root) {
		if(root==null) {
			return ;
		}
		//left->root->right(inorder)
		inorder(root.left);
		
		System.out.print(root.data + " ");
		
		//right
		inorder(root.right);
		
		
	}
	
	//function for inserting element in a tree such that they become BST
	public static Node insert2(Node root, int val) {//Time complexity is O(N)
		
		//step1
		if(root==null) {
			root=new Node (val);
			return root;
		}
		
		if(val>root.data) {
			root.right=insert(root.right, val);//it becomes right part of root
		} 
		if(val<root.data) {
			insert(root.left, val);
		}
		//now we have right part anf left part both built so we will return the tree
		
		return root;
	}
	//function for searching a element in BST
     public static boolean search(Node root, int key) {
    	 //4 steps are there
    	 //step1
    	 if(root==null) {
    		 return false;//no key can be found as no tree exist
    		 
    	 }
    	 
    	 //step2
    	 if(key==root.data) {
    		 return true;
    	 }
    	 
    	 if(key<root.data) {
    		 return search(root.left, key);
    	 } else {
    		 return search(root.right, key);
    	 }
    	 
    	 
     }
     
     //function to delete a node from BST using inorder predecessor
     public static Node delete2(Node root, int val) {
    	 if(root.data>val) {//left
    		root.left= delete2(root.left, val);
    		 
    	 } else if(root.data<val) {
    		 root.right=delete2(root.right, val);
    	 } else {//voila case -we found the node which will get deleted
    		 //3 cases are possible -which is leaf node, single child node, double child node
    		 
    		 //case1-leaf node
    		 if(root.left==null && root.right==null) {
    			 return null;
    		 }//when this code part will execute , function will be removed from call stack
    		 
    		 //case2-single child node
    		 if(root.left==null) {
    			 return  root.right;
    		 } else if(root.right==null) {
    			 return root.left;
    		 }
    		 
    		 //case 3-double child
    		 //two concepts -one is find inorder successor , other is inorder predecessor
    		 //IS is done alreday, so will go with IP
    		 Node IP=findInorderPredecessor(root.left);
    		 root.data=IP.data;
    		 
    		 root.left =delete2(root.left, IP.data);
    		 
    	 }
    	 
    	 return root;
     }
     
     //function to find Inorder predecessor(rightmost node in left subtree)
     public static Node findInorderPredecessor(Node root) {
    	 while(root.right!=null) {
    		 root=root.right;
    	 }
    	 
    	 return root;
     }
     
     //function for printing element from root to leaf
     public static void root2Leaf(Node root, ArrayList<Integer> path) {
    	 if(root==null) {
    		 return;//remove fun from call stack
    	 }
    	 
    	 path.add(root.data);
    	 //now we will check it is leaf node or not-if it is leaf then o need to go further
    	 if(root.left==null && root.right==null) {
    		 printPath(path);
    	 }
    	 
    	 root2Leaf(root.left, path);
    	 root2Leaf(root.right, path);
    	 
    	 path.remove(path.size()-1);
     }
     
     //function for printing elemnt in arraylist
     public static void printPath(ArrayList<Integer> path) {
    	 for(int i=0;  i<path.size();  i++) {
    		 System.out.print(path.get(i) + "->");
    	 }
    	 System.out.println("Null");
     }
	
	//function for finding mirror of a BST
     public static Node mirror(Node root) {
    	 //Base case
    	 if(root==null) return root;//or return null, both are same as root==null
    	 
    	Node leftM= mirror(root.left);
    	Node rightM= mirror(root.right);
    	
    	root.left=rightM;
    	root.right=leftM;
    	
    	return root;
    	
     }
     
     //sorted array to balanced BST parent-actual function structure
     public static Node balancedBST(int[] arr) {
    	 return balancedBST(arr,0,arr.length-1);
     }
     
     //Sorted array to a balanced BST
     public static Node balancedBST(int[] arr,int st,int end) {
    	 //every recursive function must have base case to solve
    	 //Base case
    	 if(st>end) return null;
    	 
    	 int mid=(st+end)/2;
    	 Node root=new Node(arr[mid]);
    	 
    	 //now build left and right subtree
    	 //for left subtree
    	root.left= balancedBST(arr, st, mid-1);//for left end=mid-1;
    	//for right subtree
    	 root.right= balancedBST(arr, mid+1, end);//for right st=mid+1;
    	 
    	 
    	 return root;
     }
     
     //function for sorted array to right skewed tree
     public static Node rightSkewedBST(int[] arr,int st) {//st is start index of array which is currently 0
    	 
    	 //Base case
    	 if(st>arr.length-1) return null;
    	 Node root=new Node(arr[st]);
    	 
    	 
    	 //for right subtree
    	root.right= rightSkewedBST(arr, st+1);
    	
    	return root;
    	 
     }
     
     //function for postorder traversal of BT
     public static void postOrder(Node root) {
    	 
    	 if(root==null) return;
    	 
    	 postOrder(root.left);
    	 postOrder(root.right);
    	 
    	 System.out.print(root.data + " ");
     }
     
     
     //function to get balanced BST from a BST
     public static Node balanceBst(Node root) {
    	 
    	 //two steps are there to solve this
    	 //step1-inorder sequence to get sortde array/arraylist
    	 ArrayList<Integer> inorder=new ArrayList<Integer>();
    	 
    	 getInorder(root, inorder);//now we have inorder which is sorted with given BST node data
    	 
    	 //step2-Create a balanced BST from tis sorted array/arraylist
    	 
    	root= createBST(inorder, 0, inorder.size()-1);
    	
    	return root;
    	 
     }
     
     //function for creating a balanced BST from sorted Arraylist
     public static Node createBST(ArrayList<Integer> alpha,int st, int end) {
    	 //Base case
    	 if(st>end) return null;
    	 
    	 int mid=(st+end)/2;
    	 
    	 
    	 Node root=new Node(alpha.get(mid));
    	 
    	 //for left subtree creation
    	root.left= createBST(alpha, st, mid-1);
    	
    	//for right subtree creation
    	root.right=createBST(alpha, mid+1, end);
    	
    	return root;
    	 
     }
     
     //function for inorder traversal on BT and storing their root data to arraylist
     public static void getInorder(Node root, ArrayList<Integer> inorder){
    	 
    	 //Base case
    	 if(root==null) return ;
    	 getInorder(root.left, inorder);
    	 
    	 inorder.add(root.data);
    	 
    	 getInorder(root.right, inorder);
     }
	
	public static void main(String[] args) {
		
		
		Node root=new Node(8);
		root.left=new Node(6);
		root.right=new Node(10);
		
		root.left.left=new Node(5);
		root.right.right=new Node(11);
		
		root.left.left.left=new Node(3);
		root.right.right.right=new Node(12);
		
		postOrder(root);
		
		root=balanceBst(root);//this modified root is balanced tree
		
		System.out.println();
		postOrder(root);
		
		
		
//		int[] arr= {3,5,6,8,10,11,12};
//		
//		Node root=balancedBST(arr);
//		
//		inorder(root);
//		System.out.println();
//		postOrder(root);
//		
		
		
//		Node root =rightSkewedBST(arr, 0);
//		
//		postOrder(root);
//		Node root=balancedBST(arr, 0, arr.length-1);
//		
//		inorder(root);
		
//		Node root=new Node(5);
//		root.left=new Node(3);
//		root.right=new Node(7);
//		
//		root.left.left=new Node(2);
//		root.left.right=new Node(4);
//		
//		root.right.left=new Node(6);
//		root.right.right=new Node(8);
//		
//		inorder(root);
//		root=mirror(root);
//		System.out.println();
//		inorder(root);
		
		
		
//		int[] values= {5,7,2,1,8};
//		
//		Node root=null;//initially root was pointing towards null
//		for(int i=0;  i<values.length;  i++) {
//			root=insert(root, values[i]);
//		}
		
//		inorder(root);
//		System.out.println();
		
	//	root2Leaf(root, new ArrayList<>());	//	delete2(root, 5);
	//	inorder(root);
		
	//	System.out.println(search(root, 1));
		
//		Integer[] values= {7,2,9,4,3};
//		List<Integer> l=Arrays.asList(values);
//		List<Integer> ans=l.stream().mapToObj(Integer->int)
//		for(Integer x:ans)
//		{
//			System.out.println(x);
//		}
		
//		Node root=null;
//		
//		for(int i=0;  i<values.length;  i++) {
//			root=insert(root, values[i]);
//		}
//		inoredr(root);
	}

}
