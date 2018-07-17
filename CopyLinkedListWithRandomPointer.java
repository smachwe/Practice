package com.ds.ll;

import java.util.*;
// not solved :( 
public class CopyLinkedListWithRandomPointer {

	public static class Node {
		public int val;
		public Node next;
		public Node random;

		public Node(int node_value) {
			val = node_value;
			next = null;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(this.val);
			if (next != null)
				sb.append("->").append(next.val);
			if (random != null)
				sb.append("\\->").append(random.val);

			return sb.toString();
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1); 
		root.next = new Node(2);
		root.next.next = new Node(3);root.next.next.random = root.next;
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);root.random = root.next.next.next.next;
		root.next.next.next.next.next = new Node(6);root.next.random = root.next.next.next;
	
		System.out.println(root);

	}

}
