package alpha;

import java.util.HashSet;

public class Freequency {
	
	//function for magic number
	public static boolean magic(int n) {
		
		//base case
		if(n/10==0) return n==1;
		
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		return magic(sum);
	}
	//using iteration
	public static boolean magic2(int n) {
		
		while(n/10!=0) {
			int sum=0;
			while(n>0) {
				sum+=n%10;
				n/=10;
			}
			n=sum;
		}
		
		return n==1;
	}
	
	//Function for removing duplicates from String
	public static String removeDuplicates(String str) {
		
		HashSet<Character> set=new HashSet<>();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
			
			
		}
//		char[] arr=str.toCharArray();
//		String str2="" + str.substring(0,1);
//		
//		int j=1;
//		
//		for(int i=1;i<arr.length;  i++) {
//			if(arr[i]!=arr[i-1]) {
//				str2=str2+arr[i];
//			}
//		}
//		
//		return str2;
		
		return sb.toString();
	}
	
	//function for factorial of a number using recursion
	public static int factorial(int n) {
		//Base cases
		if(n==0) return 1;
		
		return n* factorial(n-1);
	}
	
	//optimised factorial using recursion
	public static int fact(int n, int res) {
		//base case
		if(n==0) return 1;
		
		return fact(n-1,res*n);
		
		
	}
	//Building a binary tree
	static class Node{
		int data;
		Node left;
		Node right;
		
		//Generating Parameterised constructor
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;//no need to use this as there is no confusion in case of left and right
			
		}
	}
	
	
	static class BinaryTree{
		
	  static int idx=-1;
		
		//function for generating Binary Tree and returning root node
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;//means no valid tree found
			}
			
			//Otherwise generate Binary Tree
			Node newNode=new Node(nodes[idx]);
			
			//recursion
			//step1
			newNode.left=buildTree(nodes);//it will generate all the left node
			
			//step2
			newNode.right=buildTree(nodes);//it will generate right node after generating all left node
			
			
			return newNode;//here we are returning root node as return statement
		}
		
		//function for generating preorder sequence of binary tree
		public static void preorder(Node root) {//here we are taking root as its parameter assuming root is conncted
			                                     //with all other left and right node to track preorder
			//Base cases
			if(root==null) {
				//for in place of null print -1
				System.out.print(-1 + " ");
				return ;
			}
			
			//step1-print root data
			System.out.print(root.data + " ");
			
			//recursion
			//step2-print all left node data
			preorder(root.left);//will print all left node data
			
			//step3-print all right node data
			preorder(root.right);
			
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);//this root is basically connected with all node, which is a binary tree
		System.out.println(root.data);
		
		tree.preorder(root);//inserting root means inserting a binary tree here
		//this function is static but for Binary Tree class only, so apart from binary tree , we have to call on object of this binaryTree class only
		
		
		
		
//		System.out.println(factorial(12));
//		System.out.println(fact(12, 1));
//		
//		String str="ambujjjkkkurkkk";
//		System.out.println(removeDuplicates(str));
		//System.out.println(magic2(1234));
		
	}

}
