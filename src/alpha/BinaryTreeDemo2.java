package alpha;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDemo2 {
	
	//First of all we have to build Binary tree from given Preorder sequence
	
	static class  Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;
		    right=null;
		}
	}
	
	static class BinaryTree{
		static int idx=-1;
		
		//function for generating Binary Tree and returning its root node
		//root,left,right
		public  static Node buildTRee(int nodes[]) {//t.c-O(N), as to create each node , we went through each node
			idx++;
			//base case
			if(nodes[idx]==-1) return null;//no need to return any node as there is no node there at root
			
			//creating root node
			Node newNode=new Node(nodes[idx]);
			
			//creating left node
			newNode.left=buildTRee(nodes);//as when build Tree function will be called for next idx , left subtree willl be created
			
			
			//creating right node
			newNode.right=buildTRee(nodes);//After creating all left node , we will create right node now
			
			
			return newNode;
		}
		
		//function for preorder traversal-root,left,right
		public static void preorder(Node root) {//t.c-O(N), as to print root, we have to go at each root
			//Base case                           if no of root is n then
			if(root==null) {
				//System.out.print(-1 + " ");
				return ;
			}
			
			//step1-root printing
			System.out.print(root.data + " ");
			
			//recursion
			//step2-left subtree printing
			preorder(root.left);
			
			//step3-right subtree printing
			preorder(root.right);
		}
		
		//function for inorder sequence-left,root,right
		public static void inorder(Node root) {//t.c-O(N)
			//Base case
			if(root==null) {
				//System.out.print(-1 + " ");//right concept, think on it if u have time
				return ;
			}
			
			//recursion
			//step1-left subtree printing
			inorder(root.left);
			
			//step2-print root
			System.out.print(root.data + " ");
			
			//step3-right subtree printing
			inorder(root.right);
		}
		
		//function for postorder traversal-left,right,root
		public static void postorder(Node root) {
			//Base case
			if(root==null) return ;
			
			//recursion
			//step1-left subtree printing
			postorder(root.left);
			
			//step2-right subtree printing
			postorder(root.right);
			
			//step3-root printing
			System.out.print(root.data + " ");
		}
		
		//function for level order Traversal-Breadth first search
		public static void levelorder(Node root) {//t.c-O(2*N) IS EUIV. TO O(N)
			//Base case
			if(root==null) return ;
			
			Queue<Node> q=new LinkedList<>();
			
			//with new line
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currNode=q.remove();
				
				if(currNode!=null) {
					System.out.print(currNode.data + " ");
					
					if(currNode.left!=null) {
						q.add(currNode.left);
					}
					if(currNode.right!=null) {
						q.add(currNode.right);
					}
				} else {
					System.out.println();
					
					if(q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				}
				
			}
			
			//level order without new line
//			q.add(root);
//			//steps
//			//remove root and add its left and right if they are not empty
//			
//			while(!q.isEmpty()) {
//				Node currNode=q.remove();
//				System.out.print(currNode.data + " ");
//				
//				if(currNode.left!=null) {
//					q.add(currNode.left);
//				}
//				if(currNode.right!=null) {
//					q.add(currNode.right);
//				}
//				
//				
//				
//			}
			
			
		}
		
		//FUNCTION FOR calculating height of a Binary tree
		public static int height(Node root) {//tc.O(N)
			//Base case
			if(root==null) {
				return 0;//as null child has no height
			}
			
			int lth=height(root.left);
			int rth=height(root.right);
			
			int height=Math.max(lth, rth) + 1;
			
			return height;
		}
		
	//Function for diameter of a Binary tree
		public static int diameter(Node root) {//T.C-O(N^2)
			
			//Base case
			if(root==null) return 0;
			int leftD=diameter(root.left);
			int rightD=diameter(root.right);
			
			int lh=height(root.left);
			int rh=height(root.right);
			int selfD=lh + rh + 1;
			
			int diameter=Math.max(selfD, Math.max(leftD,rightD) );
			
			return diameter;
		}
		
		//Optimised function for diameter of a Binary Tree calculation
		//first of all we will build a inner class which will together contain diameter and height of ech node
		
		static class Result{
			int diameter;
			int height;
			
			public Result(int diameter, int height) {
				this.diameter=diameter;
				this.height=height;
			}
		}
		
		//t.c -O(N)-OPTIMISED Time complexity
		public static Result diameter2(Node root) {
			//Base case
			if(root ==null) {
				return new Result(0, 0);//i.e for null ,ht and diam both are 0
				
			}
			
			Result lres=diameter2(root.left);//left subtree, ht and diam
			Result rres=diameter2(root.right);//right subtree, ht and diam
			
			int selfD=lres.height + rres.height +1;//lh +rh +1, this is diameter passing through root
			
			int ld=lres.diameter;
			int rd=rres.diameter;	
			
			return new Result(Math.max(selfD, Math.max(ld, rd)),Math.max(lres.height, rres.height) +1);
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,7,-1,-1,8,-1,-1,5,-1,-1,3,-1,6,-1,9,-1,-1};
		
		BinaryTree tree=new BinaryTree();
		//As this function is called in main method , a Binary Tree will be created and it will return that tree's root
		Node root=tree.buildTRee(nodes);
		//System.out.println(root.data);
		
//		BinaryTree.preorder(root);
//		System.out.println();
//		BinaryTree.inorder(root);
//		System.out.println();
//		BinaryTree.postorder(root);
//		System.out.println();
//		
//		BinaryTree.levelorder(root);
//		System.out.println();
//		
//		System.out.println(BinaryTree.height(root));
		
		System.out.println(BinaryTree.diameter(root));
		
		System.out.println(BinaryTree.diameter2(root).diameter);//here we can calculate ht also
		
		
		
		
	}

}
