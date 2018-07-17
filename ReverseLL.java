package com.ds.ll;

import com.ds.*;

public class ReverseLL {

	public static void main(String[] args) {
		
		LinkedListNode n10 = new LinkedListNode(11);
		LinkedListNode n9 = new LinkedListNode(10,n10);
		LinkedListNode n8 = new LinkedListNode(9,n9);		
		LinkedListNode n7 = new LinkedListNode(8,n8);
		LinkedListNode n6 = new LinkedListNode(7, n7);
		LinkedListNode n5 = new LinkedListNode(6, n6);
		LinkedListNode n4 = new LinkedListNode(5, n5);
		LinkedListNode n3 = new LinkedListNode(4, n4);
		LinkedListNode n2 = new LinkedListNode(3, n3);
		LinkedListNode n1 = new LinkedListNode(2, n2);
		LinkedListNode head = new LinkedListNode(1, n1);
		
		System.out.println(head);
		head = reverseList(head, 3);
		System.out.println(head);

	}

	private static LinkedListNode reverseList(LinkedListNode head, int k) {
		LinkedListNode current = head;
		LinkedListNode previous = null, next = null;
		while (current != null) {
			while (current != null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
		}
		return previous;
	}

}
