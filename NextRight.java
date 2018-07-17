package com.ik.homework.tree;
/**
 * unable to do this yet..... :(
 * @author sumitmachwe
 *
 */
public class NextRight {

	public static void main(String[] args) {
		
		Node root = new Node(6);
		root.left = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(3);
		root.right = new Node(4);
		root.right.right = new Node(1);
		root.right.left = new Node(8);
		
		preOrder(root);
		
		populateNextRight(root, null);
		System.out.println("\nAfter populating next right pointers");
		preOrder(root);

	}

	private static void populateNextRight(Node root, Node rightPtr) {
		if(root == null) return;
		
		if(root.left != null)
			root.left.nextRight = root.right;
		if(root.right != null)
			root.right.nextRight = rightPtr;
		
		rightPtr = (root.left == null ? root.right : root.left);
		populateNextRight(root.left, rightPtr);
		populateNextRight(root.right, rightPtr);
		
		return;
	}

	
	public static void preOrder(Node n){
		if(n == null) return;
		if(n.nextRight == null)
			System.out.print(n.val + "->null ");
		else
			System.out.print(n.val + "->" + n.nextRight.val + " ");
		
		preOrder(n.left);
		preOrder(n.right);
	}

}
