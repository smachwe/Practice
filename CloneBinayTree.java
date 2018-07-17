package com.ik.homework.tree;

public class CloneBinayTree {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(14);
		root.right = new Node(7);
		
		printInOrder(root);
		
		Node clonedRoot = cloneTree(root);
		System.out.println("\n");
		
		printInOrder(clonedRoot);
		
	}
	
	public static Node cloneTree(Node root) {
		if(root == null) return null;
		
		Node newRoot = new Node(root.val);
		newRoot.left = cloneTree(root.left);
		newRoot.right = cloneTree(root.right);
		return newRoot;
	}

	public static void printInOrder(Node n){
		if(n == null) return;
		printInOrder(n.left);
		System.out.print(n.val + " ");
		printInOrder(n.right);
	}

}
