package sigma;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import practice.anagrams;

public class QueueDemo2 {
	
	//asked in FLIPCART
	//function for first non repeating characters in stream of characters
	public static void nonRepeatingChar(String str) {
		Queue<Character> q=new LinkedList<>();
		int freq[]=new int[26];
		
		for(int i=0;  i<str.length();  i++) {
			char ch=str.charAt(i);
			
			q.add(ch);
			freq[ch-'a']++;
			
			while(!q.isEmpty() && freq[ch-'a']>1 ) {
				q.remove();
				
			}
			
			//only 2 conditions are there where while loop will break
			//1.if queue becomes empty, then print -1
			//2.if freq of that element is ==1, then return that number
			if(q.isEmpty()) {
				System.out.print(-1 + " ");
			}
			else {
				System.out.print(q.peek() + " ");
			}
		}
	}
	
	//function to interleave two halves of queue
//	public static Queue<Integer> interleave(Queue<Integer> q1){
//		Queue<Integer> q2=new LinkedList<>();
//		
//	}
	
	//function to reverse A queue
	public static void interLeave(Queue<Integer> q){
		Queue<Integer> firstHalf=new LinkedList<>();
		int n=q.size();
		for(int i=0;  i<n/2;  i++) {//as size will change according to change in q so don'T use it directly
			firstHalf.add(q.remove());
			
			
		}
		//now we have first half element in another queue named firstHalf
		while(!firstHalf.isEmpty()) {//here we can also write if q is not empty condition->BIG NO, as q is getting bigger
			
			
			q.add(firstHalf.remove());//here element will be removed from first half and will be added to original queue from last
			q.add(q.remove());//here ele. will be removed from original queue front and will be added to last to interleave concepts
			
		}
		
		
		
		
	}
	
	//function to reverse a queue->tc -O(N),S.CO(N)
	public static void reverseQueue(Queue<Integer> q) {
		
		//the order in which element goes in stack , when coming out it gets reversed
		Stack<Integer> s=new Stack<>();
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		
//		int n=q.size();
//		//Queue<Integer> rq=new  LinkedList<>();
//		
//		
//		Stack<Integer> st=new Stack<>();
//		
//		for(int i=0;  i<n;  i++) {
//			st.push(q.remove());
//		}
//		
//		while(!st.isEmpty()) {
//			System.out.print(st.pop() + " ");
//		}
////		while(!st.isEmpty()) {
////			rq.add(st.pop());
////		}
//		
//		
////		return rq;
		
	}
	
	
	//function to REVERSE A NUMBER 
	public static void reverseNum(int n) {
		Stack<Integer> st=new Stack<>();
      String num=String.valueOf(n);
		
		for(int i=0;  i<num.length();  i++) {
			st.push(Character.getNumericValue(num.charAt(i)));
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}
		
		
	}
	
	//function for anagrams
	public static boolean angrams(String str1, String str2 ) {
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int n1=str1.length();
		int n2=str2.length();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(n1!=n2) {
			return false;
		} else {
			for(int i=0;  i<n1;  i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
		}
		
		
		
		
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		
		String str1="ambuj";
		String str2="jumba";
		System.out.println(angrams(str1,str2));
//
//		Queue<Integer> q=new LinkedList<>();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
		
//		reverseQueue(q);
//		while(!q.isEmpty()) {
//			System.out.println(q.remove());
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter a number to reverse");
//		int n=sc.nextInt();
		
		//reverseNum(123);
		
		
//		Queue<Integer> q=new LinkedList<>();
//		
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
//		q.add(6);
//		q.add(7);
//		q.add(8);
//		q.add(9);
//		q.add(10);
		
	//	Queue<Integer> rq=reverseQueue(q);
	//	reverseQueue(q);
		
//		while(!rq.isEmpty()) {
//			System.out.println(rq.remove());
//		}
		
		//calling function
		//Queue<Integer> iq=interLeave(q);
		//i.e we can make fun void or queue whatever we want
//		interLeave(q);
//		
//		while(!q.isEmpty()) {
//			System.out.println(q.remove());
//		}
	
//		String str="aabbccddx";
//		nonRepeatingChar(str);
		
	}

}
