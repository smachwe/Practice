package com.ik.homework.tree;

public class IsBST {

	static int root_val = 0;
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(14);
		root.right = new Node(7);
		root_val = root.val;
		System.out.println(isBST(root));
		
	}

	private static boolean isBST(Node root) {
		if(root == null) return true;
		boolean l = false, r = false;
		if(root.left != null && root_val > root.left.val) l = isBST(root.left);
		else if (root.left == null) l = true;
		if(root.right != null && root_val < root.right.val) r = isBST(root.right);
		else if(root.right == null) r = true;
		
		return l && r;
	}

}
