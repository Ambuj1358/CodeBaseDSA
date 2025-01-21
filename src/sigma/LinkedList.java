package sigma;



public class LinkedList {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addFirst(int data) {//no need to add static as we will access this method with class object ll
		//step1->Create a node
		Node newNode=new Node(data);
		
		size++;
		
		if(head==null) {
			head=tail=newNode;
			return;//function removed from call stack from here
		}
		
		//step2->make new Node's next points to head
		newNode.next=head;
		
		//step3->make  newNode as head
		head=newNode;
	}
	
	//function to add last
	public void addLast(int data) {
		//Step1-> Create a node
		Node lastNode=new Node(data);
		size++;
		
		if(head==null) {
			head=tail=lastNode;
			return;
		}
		
		//or if we don't have tail info the traverse though the ll upto last then insert new Node at last
		//step2->make tail's node point to lastNode
		tail.next=lastNode;
		
		//Step3->make tail as lastNode
		tail=lastNode;
		
	}
	
	//function to print LinkedList
	public void print() {//no need to pass argument as we already have head
		Node temp=head;
		
		if(head==null) {
			System.out.println("ll is empty");
		}
		
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	
	public void add(int idx, int data) {
		Node newNode=new Node(data);
		Node temp=head;
		
		if(idx==0) {
			addFirst(data);
			return;
		}
		
		size++;
		int i=0;
		while(i<idx-1) {
			temp=temp.next;
			i++;
			
		}
		
		//when i=idx-1, then temp->prev
		newNode.next=temp.next;
		
		temp.next=newNode;
		
	}
	
	
	//Function to remove first element from linkedList
	//idea is ->do head=head.next with special cases that's all
	
	public int removeFirst() {//no args as head is already present
		
		//special cases
		if(size==0) {
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		} else if(size==1) {//then head==tail  ->null(make it)
			int val=head.data;
			size=0;
			head=tail=null;
			return val;
		}
		int val=head.data;
		head=head.next;//making head.next as head
		size--;
		return val;
	}
	
	//function to remove last element in a  linkedList
	//idea->make tail's prev to point their next to null and make this prev as tail that's all
	public int removeLast() {//no need of args as tail data already present
		
		
		//special case
		if(size==0) {
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		} else if(size==1) {
			int val=head.data;//as head==tail for size=1
			head=tail=null;
			size=0;
			
			return val;
		}
		
		//now general case
		//NOW we need prev value to delete last element i.e tail
		//prev is at size-2;
		
		Node prev=head;//for iteration
		//last is size-1, so next last(prev) is size-2 
		for(int i=0;  i<size-2;  i++) {
			prev=prev.next;
		}
		
		//now i==size-2
		int val=tail.data;//prev.next.data(size-1)
		prev.next=null;//Breaking the link of prev with tail
		tail=prev;//assigning prev as tail; or renaming prev as tail
		size--;
		
		return val;
		
		
	}
	
	//function for searching element in ll->iterative search
	public int search(int key) {//because we will call this function on some ll, so no need to pass ll
		Node temp=head;
		
		int i=0;
		
		while(temp!=null) {
			if(temp.data==key) {//key found case
				return i;
			}
			temp=temp.next;
			i++;
		}
		
		//key not found case
		
		return -1;
		
		
	}
	
	
	
	//function for seraching element int ll->recursive search
	public int recSearch(int key) {
		return helper(head,key);
		
	}
	
	//helper function for recursive search->Actual helper function
	public int helper(Node head, int key) {
		
		//base case
		if(head==null) {
			return -1;//invalid index
		}
		
		//recursion
		if(head.data == key) {
			return 0;
		}
		
		int idx=helper(head.next, key);
		
		//in case helper function does not found any key
		if(idx==-1) {
			return -1;
		}
		
		return idx+1;
			
	}
	
	//reverse linkedList
	public void reverse() {
		//assigning in java occurs from right to left
		Node curr=tail=head;//here head is stored in tail and head is stored in curr as well
		//because we will need tail at the end to make ll
		Node prev=null;
		Node next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev; //breaking the link with next
			prev=curr;
			curr=next;
		}
		
		head=prev;//last prev is head as curr is null
	}
	
	//function to delete Nth node from last
	public void deleteNthNode(int n) {
		
		int sz=0;
		Node temp=head;
		
		//finding size
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		
		if(sz==n) {
			head=head.next;//removeFirst
			return;
		}	
		
		int index=sz-n;//index of prev element from start  which we want to delete
		Node prev=head;
		int i=0;
		while(i<index-1) {
			prev=prev.next;
			i++;
			
		}
		
		//now counter is at exact prev element to be deleted element
		prev.next=prev.next.next;//assigning prev.next.next to prev .next
		
		return;
		
		
	}
	
	//function for finding mid node of even or odd size linkedlist using slow-fast approach or turtule hare approach
	public Node midNode(Node head) {
		Node slow=head;//=1
		Node fast=head;//+2
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;//+1
			fast=fast.next.next;//+2
		}
		
		return slow;  //here slow is mid
	}
	
	//function for checking ll is palindrome or not
	public boolean isPlaindrome() {
		
		//base case
		if(head==null || head.next==null) {
			return true;
		}
		
		//find mid node
		Node mid=midNode(head);
		
		//reverse right part
		Node curr=mid;//here right half is including mid also
		Node prev=null;
		
		while(curr!=null) {
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		//because when curr==null, then prev will point out to head of new reversed node
		Node right=prev;//head of reversed node
		Node left=head;//head of left part
		
		//now comparing with left part and right part
		
		while(right!=null) {//we can also do it with left
			if(left.data!=right.data) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		
		return true;
		
	}
	
	//Floyd's cycle finding algorithm
	//slow fast approach
	
	public boolean cycleDetector() {//without args also it will run as head is universal to this program
		Node slow=head;//+1
		Node fast=head;//+2
		
		//even and odd cases consecutively
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				return true;//cycle exists
			}
			
			
			
		}

		return false;//cycle doesn't exist
	}
	
	//Function for removing cycle in a LinkedList
	//condition is , it should not meet with head node(no circular ll)
	public static void removeCycle() {
		
		//detect a cycle in ll
		//slow fast approach
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		
		while(fast!=null && fast.next!=null) {
			
			slow=slow.next;//+1
			fast=fast.next.next;//+2
			
			if(slow ==fast) {
				cycle=true;
				break;
			}
		}
		
		
		if(cycle == false) {
			return;//if cycle is not there return , otherwise stay
			
		}
		
		
		//finding meeting point
		
		Node prev=null;
		slow=head;      //point slow to head again
		while(slow != fast) {//loop runs until slow == fast
			prev=fast;//assigning fast to prev;
			slow=slow.next;//+1
			fast=fast.next;//here fast moves by 1
			
		}
		
		//now slow==fast, prev is at exact previous to their meeting point so
		prev.next=null;// will break the connection from last nodes
		
	}
	
	
	
	//function for mergerSort on ll
	public static Node mergeSort(Node head) {
		//base cases
		if(head == null || head.next==null) {
			return head;
		}
		
		//recursion(kaam)
		//find mid
		Node mid=getMid(head);
		//left and right ms
		//now we want right part head so
		Node rightHead=mid.next;
		Node leftPart=head;//same as previous
		//breaking link between left and right part
		mid.next=null;
		
		Node newLeft=mergeSort(leftPart);
		Node newRight=mergeSort(rightHead);
		
		//merge
		return merge(newLeft,newRight);
		
	}
	
	//Helper function for merging left and right part
	public static Node merge(Node head1,Node head2) {
		//creating a dummy node temp of a ll
		Node mergedll=new Node(-1);//creating a ll
		Node temp=mergedll;//pointing temp to mergell, that have only one element so temp will point at head only
		
		while(head1 != null && head2 !=null) {
			if(head1.data <= head2.data) {
				temp.next=head1; //because head1 node is small and we are doing for ascending oredr sorting
				head1=head1.next;
				
			} else {
				temp.next=head2;
				head2=head2.next;
			}
			
			temp=temp.next; //here it is written as it will increase in both cases , we can also write it inside
		}
		
		//for leftover part of left ll
		while(head1 !=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		
		//for leftover part of right ll
				while(head2 !=null) {
					temp.next=head2;
					head2=head2.next;
					temp=temp.next;
				}
				
				//now returning mergedll.next as 1st node was dummy
				
				return  mergedll.next;
				
			
		
	}
	
	//helper function to find mid node for mergesort
	//i.e I want mid node as last node of left part or 1st part
	public static Node getMid(Node head) {
		//slow fast approach
		Node slow=head;
		Node fast=head.next;  // for mid as last node of 1st part(visulize with fig)
		
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;//+1
			fast=fast.next.next; //+2
		}
		
		return slow;//mid node
	}
	
	//function for zig zag program
	public void zigzag() {
		//step1=find mid(1st half last node)
	     //using slow fast approach
		Node slow=head;
		Node fast=head.next;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		Node mid=slow;
		
		//find right part reverse
		Node curr=mid.next;
		mid.next=null;
		Node prev=null;
		Node next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		//step3 ->alternate merging
		Node right=prev;//right part head
		Node left =head;//left part head
		
		while(right!=null && left !=null) {
			Node nextL=left.next;
			left.next=right;
			Node nextR=right.next;
			right.next=nextL;
			
			right=nextR;
			left=nextL;
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		
		//ll is -1->2->3->4->5->6->null
		ll.print();
		ll.zigzag();
		ll.print();
//		
//		ll.addFirst(1);
//		ll.addFirst(2);
//		ll.addFirst(3);
//		ll.addFirst(4);
//		ll.addFirst(5);
//		
//		//ll is ->5->4->3->2->1
//		ll.print();
		
		
		//here we are inserting head of prev ll to get new head of new ll(the sorted ll)
		//ll.head=mergeSort(ll.head );
		//now ll should be -1->2->3->4->5
		//ll.print();
		
//		head=new Node(1);
//		Node temp=new Node(2);
//		head.next=temp;
//		head.next.next=new Node(3);
//		head.next.next.next=temp;
		
	   //ll.print();
		//removeCycle();
//		System.out.println(ll.cycleDetector());
//		removeCycle();
//		System.out.println("cycle is removed");
//		System.out.println(ll.cycleDetector());
//		
		
		
		
		//1->2->3->1 remove 1 from last then no cycle found
		//when last element is pointing to head then it is a special cases
		//in most of the cases it will point to middle node (qs will be like this in most coding platform)
//		head.next.next.next=head;
		
		//removeCycle();
		//System.out.println(ll.cycleDetector());
		
		//ll.print();
		
		//if we want to call this cycleDetector method without ll object then make the method as static
		
		//System.out.println(ll.cycleDeector());
		
		
		
//		LinkedList ll=new LinkedList();
//		
//		ll.addLast(1);
//		ll.addLast(2);
//		ll.addLast(2);
//		ll.addLast(3);
//		ll.print();
//		
//		System.out.println(ll.cycleDeector(head));
		
		//System.out.println(ll.isPlaindrome());
//		ll.addFirst(2);
//		ll.addFirst(1);
//		ll.addLast(3);
//		ll.addLast(4);
//		ll.addLast(5);
//		
//		ll.print();
//		ll.deleteNthNode(3);
//		ll.print();
//		//ll.print();
//		ll.addFirst(2);
//		//ll.print();
//		ll.addFirst(3);
//		//ll.print();
//		
//		ll.addLast(4);
//		//ll.print();
//		ll.addLast(5);
//		//ll.print();
//		
//		
//		ll.add(2, 9);
//		//ll.print();
//		
//	//	System.out.println(size);
//		
//		ll.removeFirst();
//	//	ll.print();
//		//System.out.println(size);
//		
//		ll.removeLast();
//		//ll.print();
//	//	System.out.println(size);
//		
//		if(ll.search(9)==-1) {
//			//System.out.println("Key not found");
//		} else {
//			//System.out.println(ll.search(9));
//		}
//		
//		//System.out.println(ll.recSearch(8));
//		
//		//ll.reverse();
//		ll.print();
//		ll.deleteNthNode(2);
//		ll.print();
//		
//		
////		Node temp=head;
////		
////		while(temp!=null) {
////			System.out.print(temp.data + " ");
////			temp=temp.next;
////		}
////		System.out.println();
//		
//		//System.out.println(ll);
//		
//		//System.out.println();
////		ll.head = new Node(1);
////		ll.head.next=new Node(2);
//		// write methods for add, remove, search element
		
		
	}

}
