package sigma.trie;

import java.util.Arrays;

public class TriePractice {
	
	static class Node {
		Node children[]=new Node[26];
		boolean eow=false;//eow->(end of word)instance var initialised here, so no need to initialize using cinstructor
		
		public Node() {//no need for parameter as var already iniatialised
			
			for(int i=0;  i<26;  i++) {
				children[i]=null;
			}
		}
	}
	
	public static Node root =new Node();
	
	//function to insert data in trie
	public static void insert(String word) {//t.c-->>O(L) where L is length of largest word
		Node curr=root;//initially curr is root
		
		//first of all find index of child  array at which we have to add character of word
		//each character will be stored at each level of trie
		for(int level=0;  level<word.length();  level++) {
			int idx=word.charAt(level)-'a';
			
			if(curr.children[idx]==null) {//at this specific index if null is there, means no characters
				//create new node
				curr.children[idx]=new Node();//at given index no as idx, it is well known that only specific character will be stored
			}//no need to do anything if char is already present at that index
			
			curr=curr.children[idx];//new parent will be initial child node
		}
		
		curr.eow=true;//now curr is last character node as every time curr get updated with their child value
		
		
		
	}
	
	//function for serach in  a trie
	
	
	public static void main(String[] args) {
		String[] arr= {"the","a","there","their","any","thee"};
		
		for(int i=0;  i<arr.length;  i++) {
			insert(arr[i]);
		}
		//now trie is created
		
	}

}
