package ambujSigmaRevisit;

public class LinkedListPractice {
	
	//Returning a head node means returning entire linked List as initial node contains the address of next node and so on so ->>head will build the entire node
	
	
	private static class Node {
		int data;
		Node next;
		
		//constructor with diff diff fields
		//default
		public Node(int data) {
			this.data=data;
			this.next=null;//means next will initilly points out null untill specified
			
		}
		
		
		
	}
	
	//Function to create Linked list from a given array
	public static Node createLinkedList(int[] arr) {
		Node head=new Node(arr[0]);//as head will be always array 1st elem data carrying node
		
		Node temp=head;
		
		for(int i=1;  i<arr.length;  i++) {
			Node newNode=new Node(arr[i]);
			temp.next=newNode;
			temp=newNode;//temp goes to newNode,similar to temp=temp.next
		}
		
		return head;//ll from array
	}
	
	//function to traverse an ll
	public static void traverse(Node head) {
		
		//what if head is null
		if(head==null) {
			System.out.print("Empty linkedList found");
			return;
		}
		
		
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
		
	}
	
	
	//Delete elem from linkedList->>From start,from end,Any pos,from given node value
	
	//Function to delete Node from start
	public static Node deleteHead(Node head) {
		
		if(head==null || head.next==null) return null;//as if no elm or only one elem found ->>then just return null as 1 will be deleted
		
		head=head.next;//no need to delete the ref as java garbage collector will take care
		
		return head;
	}
	
	//function to delete last node of ll
	public static Node deleteLastNode(Node head) {
		//concept->>go to 2nd last node ->>then points it to null
		//corner cases
		if(head==null || head.next==null) return null;//mandotory corner cases
		
		Node curr=head;//tracking the 2nd last node
		while(curr.next.next!=null) {//loop will stop only when we will find 2nd last elem
			curr=curr.next;
			
		}
		
		//now we have curr as 2nd last elem so
		curr.next=null;//now we lost the ref of last node->>means we successfully deleted last node
		
		return head;
		
		
	}
	
	//Function for deleting elem from any given pos 
	public static Node deleteFromAnyPos(Node head,int pos) {
	//	Concept->>Go to just before the node which is to be deleted and adjust prev node pointer to temp.next(temp node to be deleted)
		//Corner cases
		if(head==null ) return null;
		
		if(pos<1) {
			System.out.println("invalid position");
			return null;
		}
		
		//Special case ->>if head node to be deleted->>and it is not null as null case already dealt
		if(pos==1) {
			head=head.next;
			
			return head;//prev head will automatically deleted by garbage collector
		}
		
		Node temp=head;
		int i=0;
		Node prev=null;//will carry during traversal to keep track of 2nd last node before node to be deleted
		
		while(temp!=null) {
			i++;
			if(i==pos) {
				prev.next=prev.next.next;//now prev.next will point out temp.next or prev.next.next
				break;//no need of loop when elem got deleted
				
			}
		
		    	prev=temp;
		    	temp=temp.next;
			
		}
		
		
	//	if(temp==null) return null;//if temp becomes null before finding the elem pos to be deleted->>if pos not found nothing will be happened to ll as we have simply returned the head
		
		return head;
	}
	
	//Function for deleting node based on given data as value
	public static Node deleteValue(Node head,int value) {
		//Concept->traverse on ll->>check for curr data==value->>prev pointer will bypass this curr node
		
		//Corner cases
		if(head==null) return null;
		
		if(head.data==value) {
			//delete front node as in while loop this case is not covered
			head=head.next;
			return head;
		}
		
		Node temp=head;
		Node prev=null;
		
		while(temp!=null) {
			
			if(temp.data==value) {
				prev.next=prev.next.next;
				break;//will ensure if ll has duplicates elem then 1st occurence will be deleted
			}
			prev=temp;
			temp=temp.next;
					
			
		}
		
		return head;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr= {15,4,2,8,3};
		Node head=createLinkedList(arr);
		
		traverse(head);
		
		head=deleteValue(head, 78);
		traverse(head);
		
		//head=deleteFromAnyPos(head, 7);//no need to assign to head as this fun will produce changes in head by default so either collect or not ->>does not matter
		//intill and unless we are changing the head like this fun 
		//as we are building linked list->>so if head is same ->>so no need to collect but if head changes we have to collect the new head and proceed
	//	traverse(head);
		//head=deleteHead(head);
	//	traverse(head);
//		head=deleteLastNode(head);
//		traverse(head);
//		
		//System.out.println(head.data);
		
	}

}
