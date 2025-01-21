package sigma.BinarySearchTree;

public class BSTPractice3 {
	
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
	
	//function finding IS(inorder successor)
	public static Node IS(Node root) {
		if(root.left==null && root.right==null) {
			return root;
		}
		else {
			if(root.left!=null) {
				return IS(root.left);
			} 
			return root;
		}
	}
	
	//function for IS
	public static Node IS2(Node root) {
		while(root.left!=null) root=root.left;
		return root;
	}
	
	
	
	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(6);
		root.right=new Node(12);
		
		root.left.left=new Node(4);
		root.left.right=new Node(8);
		
		root.right.left=new Node(11);
		root.right.right=new Node(14);
		
		root=IS(root.right);
		System.out.println(root.data);
	}

}
