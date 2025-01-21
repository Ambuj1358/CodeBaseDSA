package sigma.binaryTree;

public class BinaryTreeDemo2 {
	
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
	
	//function for height of a binary tree in terms of node
	public static int height(Node root) {
		//Base cases
		if(root==null) return 0;
		
		//recursion
		int lth=height(root.left);
		int rth=height(root.right);
		
		return Math.max(lth, rth) + 1;
	}
	//function for height of a binary tree in terms of edges
	public static int height2(Node root) {
		//Base cases
		if(root==null) return 0;
		
		//recursion
		int lth=height(root.left);
		int rth=height(root.right);
		
		return Math.max(lth, rth);
	}
	
	//Function for finding subtree matches with  any part of  another tree
	public static boolean isSubtree(Node root,Node subroot) {
		
		//Base cases
		if(root==null) {
			return false;//assuming given subtree is non empty,that's why there root doesn't match hence false;
		}
		
		if(areIdentical(root,subroot)) {
			return true;
		}
		//if we don't find them identical on root basis , we will go towards left and right for checking if they are identical or not
		
		return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
	}
	
	//function for identical tree
	public static boolean areIdentical(Node node1,Node node2) {
		//for checking for identical ,they are a lots of steps but one condition is sufficient for making them non identical
		//Base cases
		//always place node ==null case of both node before to handle null cases other wise u will get error like node1 is null, data field cam't be read
		
		if(node1==null && node2==null) {
			return true;
		}
		if(node1.data!=node2.data || node1==null && node2!=null || node1!=null && node2==null ) {
			return false;
		}
		
		
		//here we get root wise equality so now we will check for identical with left and right
		
		return areIdentical(node1.left, node2.left) && areIdentical(node1.right, node2.right);
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		root.left.left.left=new Node(8);
		root.left.left.right=new Node(9);
		
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(11);
		
		root.right.left.left=new Node(12);
		root.right.left.left=new Node(13);
		
		root.right.right.left=new Node(14);
		root.right.right.right=new Node(15);
		
		//creating a subtree
		Node subroot=new Node(4);
		subroot.left=new Node(8);
		subroot.right=new Node(9);
		
		
		System.out.println(isSubtree(root, subroot));
//		System.out.println(height(root));
//		System.out.println(height2(root));
		
		
		
		
	}

}
