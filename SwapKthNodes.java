package com.ds.ll;

public class SwapKthNodes {

	public static void main(String[] args) {

		LinkedListNode n7 = new LinkedListNode(8);
		LinkedListNode n6 = new LinkedListNode(7, n7);
		LinkedListNode n5 = new LinkedListNode(6, n6);
		LinkedListNode n4 = new LinkedListNode(5, n5);
		LinkedListNode n3 = new LinkedListNode(4, n4);
		LinkedListNode n2 = new LinkedListNode(3, n3);
		LinkedListNode n1 = new LinkedListNode(2, n2);
		LinkedListNode head = new LinkedListNode(1, n1);
		
		System.out.println(head);
		
		head = swap_nodes(head, 3);
		
		System.out.println(head);

	}
	
	public static LinkedListNode swap_nodes(LinkedListNode head, int k)  {
		LinkedListNode left = head;
		LinkedListNode previous_to_left = null;
		LinkedListNode right = head;
		LinkedListNode previous_to_right = null;
		LinkedListNode temp = head;
		
		while(--k > 0 && temp != null){
			previous_to_left = temp;
			temp = temp.next;
		}
		
		left = temp;
		
		while(temp.next != null) {
			temp = temp.next;
			previous_to_right = right;
			right = right.next;
		}
		
		if(previous_to_left != null)
			previous_to_left.next = right;
		else 
			head = right;
		
		if(previous_to_right != null)
			previous_to_right.next = left;
		else 
			head = left;
		
		temp = left.next;
		left.next = right.next;
		right.next = temp;
		
		return head;
	}

}
