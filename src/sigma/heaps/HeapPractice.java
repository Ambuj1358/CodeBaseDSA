package sigma.heaps;

import java.util.ArrayList;

public class HeapPractice {
	
	static class Heap {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//we have to create function add(data)/insert, peek(),remove(),isEmpty()
		//add() function add/insert data in heap in last and rearrange heap for heap property-O(1)
		
		//peek() function returns top element from heap(root of heap tree)-O(1)
		
		//remove() funtion removes top element of heap(root of heap tree) and returns the removed root data-O(logn)
		
		//isEmpty() function checks if heap is empty or not
		
		//for min heap
		public void add(int data) {//tc-O(1)
			
			//add the data in list from last
			list.add(data);
			
			//rearrange tree to satisfy heap property
			int ch=list.size()-1;//child index
			int par=(ch-1)/2;//parent index as if parent index is i, then left child is 2*i+1,right=2*i +2
			
			while(list.get(ch)<list.get(par)) {//loop untill parent is bigger than child
				//now swapp child with parent and update their index
				int temp=list.get(ch);
				list.set(ch, list.get(par));
				list.set(par, temp);
				
				//now update child and parent index
				ch=par;//now parent becomes child for grandparents
				par=(ch-1)/2;
				
				
			}
		}
		
		//peek() function 
		public int peek() {//O(1)
			return list.get(0);//return root of heap
		}
		
		//remove()  function -removes root and return the root value of 
		public int remove() {
			//for this 3 steps are their
			//1st whome to remove, in thsi case root will be removed that is equiv to 1st element of list
			//swap 1st with last element of list to remove in O(1)
			//restore heap property if disturbed by calling heapify function
			
			//step1
			int data=list.get(0);//so that it can easily be returned in last
			
			//step2-swap last element with first in list
			int temp=data;
			list.set(0, list.get(list.size()-1));
			list.set(list.size()-1, temp);
			
			list.remove(list.size()-1);//last data is deleted
			
			//now we have last element at heap root which may have distroyed heap property, so we will fix that by calling heapify function
			heapify(0);//index from where we want heapification
			
			
			return data;
			
			
		}
		
		private void heapify(int i) {//private as it os for this class only, heapify the tree from ith index
			int min=i;
			int left=2*i +1;
			int right=2*i +2;
			
			//now checking root,left and right which one is smaller (for min heap, in case of max heap check for larger)
			if(left<list.size() && list.get(left)<list.get(min)) {//if left is smaller than root data
				min=left;
				
			}
			
			if(right<list.size() && list.get(right)<list.get(min)) {//if left is smaller than root data
				min=right;
				
			}
			
			if(min!=i) {//if min==i, no need to heapify as heap property already stored
				//swap min indexed data with ith index element as min has changed to store heap proerty
				int temp=list.get(min);
				list.set(min, list.get(i));
				list.set(i, temp);
				
				//now may be that subtree heap is disturbed so calling recursive function heapify for subtree root index
				heapify(min);//as min is subtree root index
				
			
			}
		}
		
		//isEmpty() function-returns if heap is empty or not
		public boolean isEmpty() {
			return list.size()==0;
		}
		
		//function to calculate size of heap
		public int size() {
			return list.size();
		}
	}
	
	public static void main(String[] args) {
		
		Heap hp=new Heap();
		
		hp.add(5);
		hp.add(9);
		hp.add(3);
		hp.add(1);
		hp.add(0);
		
		
		System.out.println(hp.size());
		
//		System.out.println(hp.peek());
//		System.out.println(hp.remove());
//		System.out.println(hp.peek());
//		
		System.out.println(hp.isEmpty());
//		while(!hp.isEmpty()) {
//			System.out.println(hp.peek());
//			hp.remove();
//		}
		
	}

}
