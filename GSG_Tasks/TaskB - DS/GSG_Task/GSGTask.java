/*
 Task B.
Given the head of a singly linked list, write the code to reverse the list, and return the reversed list.(Code required)
Example: Input: Head of following linked list  1->2->3->4->5->NULL  Output: Linked list should be changed to,  5->4->3->2->1->NULL
 */
import java.util.Stack;

class Node{
	int data;
	Node next;
	Node(){}
	Node(int data){this.data=data;}
	
}

public class GSGTask {
static Node CreateLL(){
	 Node head = new Node(1);
	 Node p = head;
	 for (int i = 2 ; i <=5 ; i ++) {
		 Node nxt= new Node(i);
		 p.next =  nxt;
		 p = p.next ;
	 }
	 p.next = null;
	 return head;
 }
static Node ReverseLL(Node head) {
	Stack<Node> stack= new Stack <Node>();
	
	while (head!=null) {
		stack.push(head);
		head = head.next;
	}
	Node p;
	head= stack.pop();
	p = head;
	while(!stack.isEmpty()) {
		p.next = stack.pop();
		p= p.next;
	}
	p.next = null;
	return head;
}
	public static void main(String[] args) {
		Node head = CreateLL();
		Node p = head;
		System.out.println("Before Reverse:");
		while (p!=null) {
			System.out.print(p.data+"->");
			p = p.next;
		}

		Node reversed = ReverseLL(head);
		p=reversed;
		System.out.println("\nReversed:");
		while (p!=null) {
			System.out.print(p.data+"->");
			p = p.next;
		}
		
		
		
	}
}
