package com.ik.homework.tree;

public class FlipTree {

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(3);
		root.right = new Node(4);
		root.right.right = new Node(1);
		root.right.left = new Node(8);
		printInOrder(root);
		Node flipped = flipTree(root); 
		System.out.println("After flipping");
		printInOrder(flipped);

	}

	
	private static Node flipTree(Node node) {
		if(node == null) return null;
		
		Node temp = flipTree(node.left);
		node.left = flipTree(node.right);
		node.right = temp;
		return node;
	}


	public static void printInOrder(Node n){
		if(n == null) return;
		printInOrder(n.left);
		System.out.print(n.val + " ");
		printInOrder(n.right);
	}

}
