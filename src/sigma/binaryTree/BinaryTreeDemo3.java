package sigma.binaryTree;

public class BinaryTreeDemo3 {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			left=null;//initially pointing to null;
			right=null;
		}
	}
	
	//function for finding a subroot is part of root or not-assume subroot is non emoty
	public static boolean isSubroot(Node root,Node subroot) {
		if(root==null) {
			return false;//as subroot is not null and root is null, they can't be same
		}
		//now root is not null
		
		//now we will call helper function to comapre two tree are identical or not
		if(areIdentical(root,subroot)) {
			return true;
		}
		
		//now if they are not identical on root basis ,then check int left subtree and rightsubtree for identicity
		
		return isSubroot(root.left, subroot) || isSubroot(root.right, subroot);
	}
	
	//function for checking two tree are identical or not
	public static boolean areIdentical(Node node1, Node node2) {
		//concept is-if two tree are identical , they can't be non identical at any part of subtree
		//for checking if=dentical we have to check at every point but for non identrical one point of difference is suffiecient to prove them non identical
		
		if(node1==null && node2==null) {
			return true;
		}
		//if u put 1st condition after 2nd condition , node.data is not defined error we will get in case of both node null
		if(node1==null && node2!=null || node1!=null && node2==null || node1.data!=node2.data ) {
			return false;
		}
		
		//now we have non of them are null, and their data are equal->search for left and right to find either they are identical or not
		
		
		
		return areIdentical(node1.left, node2.left)  && areIdentical(node1.right, node2.right);
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		
		root.left=new Node(2);
		root.right=new Node(4);
		
		root.left.left=new Node(3);
		root.left.right=new Node(6);
		
		root.right.left=new Node(7);
		root.right.right=new Node(5);
		
		Node subroot=new Node(2);
		 subroot.left=new Node(3);
		 subroot.right=new Node(6);
		 
		System.out.println( isSubroot(root, subroot));
		
		
		
	}

}
