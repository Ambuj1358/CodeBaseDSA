package sigma;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;





public class BinaryTreePractice {
	
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
	
	//Building Binary Tree
	static class BinaryTree{
		//for updating idx in each recursive call
		 static int idx=-1;//for locating index,so that we can access idx of 0th node in next iteration 
		
		//function for finding root node of a binary tree
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			
			//generating root node
			Node newNode = new Node(nodes[idx]);
			
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
			
			
		}
		
		//function for preorder traversal on Binary tree
		public static void preorder(Node root) {//time complexity-O(N) LINEAR
			//base cases
			if(root==null) {
				return;
			}
			
			//step 1-print root
			System.out.print(root.data + " ");
			
			//recursion
			//step2-print left subtree
			preorder(root.left);
			
			//step3-print right subtree
			preorder(root.right);
			
		}
		
		//function for generating preorder sequence with -1
		public static void preorder2(Node root) {//time complexity-O(n)
			//base cases
			if(root==null) {
				//preorder sequence with -1
				System.out.print(-1 + " ");
				return;
			}
			
			//step 1-print root
			System.out.print(root.data + " ");
			
			//recursion
			//step2-print left subtree
			preorder2(root.left);
			
			//step3-print right subtree
			preorder2(root.right);
			
		}
		
		//Function for inorder traversal
		public static void inorder(Node root) {
			
			//Base case
			if(root==null) {
				return;
			}
			//step1->leftSubtree printing
			inorder(root.left);
			//step2->root printing
			System.out.print(root.data + " ");
			
			//step3->right subtree printing
			inorder(root.right);
			
		}
		
		//function for postorder traversal
		public static void postorder(Node root) {//time complexity-O(N) linear
			//base cases
			if(root==null) {
				return ;
			}
			
			//step1-left subtree printing
			postorder(root.left);
			
			//step2-right subtree printing
			postorder(root.right);
			
			//step3-root printing
			System.out.print(root.data + " ");//root.data means whatever data we are passing in function 
			                                //that shoul be printed here
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
//					q.add(root);
//					//steps
//					//remove root and add its left and right if they are not empty
//					
//					while(!q.isEmpty()) {
//						Node currNode=q.remove();
//						System.out.print(currNode.data + " ");
//						
//						if(currNode.left!=null) {
//							q.add(currNode.left);
//						}
//						if(currNode.right!=null) {
//							q.add(currNode.right);
//						}
//						
//						
//						
//					}
					
					
				}
		
		//FUNCTION FOR calculating height of a Binary tree node wise
		//for edge wise return only Math.max(lth , rth)
				public static int height(Node root) {//T.c=O(N) AS WE visited only once at each node
					//Base case
					if(root==null) {
						return 0;//as null child has no height
					}
					
					int lth=height(root.left);
					int rth=height(root.right);
					
					int height=Math.max(lth, rth) + 1;
					
					return height;
				}
				
		//function for counting nodes in Binary tree
		public static int countNodes(Node root) {//here I am passing node as symbol of BT
			//Base cases              t.c=O(N)
			if(root==null) {
				return 0;
			}
			
			int leftCount=countNodes(root.left);
			int rightCount=countNodes(root.right);
			
			return leftCount + rightCount +1;
			
		}
		
		//function for counting node sum using recursion
		public static int nodeSum(Node root) {//parameter as root to pass binary tree
			//Base cases                       t.c-O(N) AS we are visiting once on each node 
			if(root==null) {
				return 0;
			}
			
			int leftSum=nodeSum(root.left);
			int rightSum=nodeSum(root.right);
			
			return leftSum + rightSum +root.data;
			
			
		}
		
		//function for node sum in a binary Tree using iteration(level order traversal)
		public static int nodeSum2(Node root) {//t.c-O(N) as we have visited at each node at once
			int sum=0;                       //s.c-O(N) due to extra space used by queue
			Queue<Node> q=new LinkedList<>();
			
			q.add(root);
			
			
			while(!q.isEmpty()) {
				Node currNode=q.remove();
				
				if(currNode!=null) {
					sum+=currNode.data;
				}
				
				if(currNode.left!=null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
				}
				
				
				
			}
			
			return sum;
		}
		
	//Function for finding diameter of a binary tree
		public static int diameter(Node root) {//t.c-O(N^2) AS we visited once at each node
			                                  //and at each node we call height function which takes O(N) time
			//Base cases                         s.c-O(1)
			if(root==null) {
				return 0;
			}
			
			int ld=diameter(root.left);
			int rd=diameter(root.right);
			
			int lh=height(root.left);
			int rh=height(root.right);
			
			return Math.max(Math.max(ld, rd),lh+rh+1);
		}
		
		//optimised function for diameter calculation in O(N)
		public static Info diameter2(Node root) {
			//Base 
			if(root==null) {
				return new Info(0,0);
			}
			
			Info lInfo=diameter2(root.left);
			Info rInfo=diameter2(root.right);
			
			int diam=Math.max(Math.max(lInfo.diameter, rInfo.diameter ),lInfo.height + rInfo.height +1);
			int height=Math.max(lInfo.height, rInfo.height) + 1;
			
			
			return new Info(diam,height);
		}
		
		
		
	}
	static class Info{
		int diameter;
		int height;
		
		public  Info(int diameter,int height) {
			this.diameter=diameter;
			this.height=height;
					
		}
	}
	
	//function for subtree of a tree
		public static boolean isSubtree(Node root, Node subRoot) {//here subRoot is non empty
			//Base cases
			if(root ==null) {
				return false;//ie given subtree is not part of the tree 
			}
			
			//if root and subroot have same value
			if(areIdentical(root, subRoot)) {
				return true;
			}
			
			//if not identical
			return isSubtree(root.left, subRoot) ||  isSubtree(root.right, subRoot);
			
		}
	
	//function for checking two tree are identical or not
		public static boolean areIdentical(Node node1, Node node2) {
			//Base case
			if(node1==null && node2==null) {
				return true;
			}
			
			if(node1==null || node2==null || node1.data!=node2.data) {
				return false;//here I am looking for one instance of non identity
			}                //step1,2 of non identity checked
			
			return areIdentical(node1.left, node2.left) && areIdentical(node1.right, node2.right);
			//here we are checking all leftsubtree and right subtree for non identity , if nothing found then 
			//it will finally go to null, and return true and if from both part we get true then overall both tree are identical
		}
		
		

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	         Node root=BinaryTree.buildTree(nodes);
	         BinaryTree.preorder(root);
	         System.out.println();
	         BinaryTree.levelorder(root);
		
//		Node root=new Node(5);
//		root.left=new Node(3);
//		root.right=new Node(6);
//		
//		root.left.left=new Node(2);
//		root.left.right=new Node(8);
//		
//		root.right.left=new Node(7);
//		root.right.right=new Node(5);
//		
//		Node subRoot=new Node(3);
//		subRoot.left=new Node(2);
//		subRoot.right=new Node(8);
		
		
		//System.out.println(isSubtree(root, subRoot));
//		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
//		BinaryTree tree=new BinaryTree();
//		 Node root= tree.buildTree(nodes);//here root is a basically a binary Tree, 
//		                                  //root connected with all left and right node
//		 
//		 System.out.println(BinaryTree.diameter(root));
//		 System.out.println(BinaryTree.diameter2(root).diameter);
//		 tree.preorder(root);
//		 System.out.println();
//		 tree.preorder2(root);
//		 System.out.println();
//		 
//		 tree.inorder(root);
//		 
//		 System.out.println();
//		 
//		 tree.postorder(root);
//		 
//		 System.out.println();
//		 BinaryTree.levelorder(root);
//		 System.out.println();
//		 
//		// System.out.println(root.data);
//		 System.out.println(BinaryTree.height(root));
//		 
//		 System.out.println(BinaryTree.countNodes(root));
//		 
//		 System.out.println("Node sum is :");
//		 System.out.println(BinaryTree.nodeSum(root));
//		 
//		 System.out.println(BinaryTree.nodeSum2(root));
//		
	}

}
