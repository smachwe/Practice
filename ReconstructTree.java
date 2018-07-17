package com.ik.homework.tree;
import java.util.*;

public class ReconstructTree {

	public static void main(String[] args) {
		int[] inOrder = {15,30,35,40,45,50,60,70,72,75,77,80};
		int[] preOrder = {50,30,15,40,35,45,70,60,80,75,72,77};
		Node root = reconstruct(inOrder, preOrder);
		System.out.println();
		printInOrder(root);
		System.out.println();
		printLevelOrder(root);
	}

	private static Node reconstruct(int[] iInOrderArray, int[] iPreOrderArray) {
		return reconstruct(iInOrderArray, iPreOrderArray, 0, 0, iInOrderArray.length - 1);
	}

	private static Node reconstruct(int[] inOrder, int[] preOrder, int preOrderCurr, int inStart, int inEnd) {
		if(inStart > inEnd || preOrderCurr >= preOrder.length) return null;
		
		Node root = new Node(preOrder[preOrderCurr]);
		
		int inOrderIndex = getInOrderIndex(inOrder, root.val);
		root.left = reconstruct(inOrder, preOrder, preOrderCurr + 1, inStart, inOrderIndex - 1);
		root.right = reconstruct(inOrder, preOrder, preOrderCurr + inOrderIndex - inStart + 1, inOrderIndex + 1, inEnd);
		
		return root;
	}

	private static int getInOrderIndex(int[] inOrder, int val) {
		for(int i=0;i<inOrder.length;i++){
			if(inOrder[i] == val) return i;
		}
		return -1;
	}
	
	public static void printInOrder(Node n){
		if(n == null) return;
		printInOrder(n.left);
		System.out.print(n.val + " ");
		printInOrder(n.right);
	}
	
	public static void printLevelOrder(Node n){
		if (n == null) return;
		
		Queue<Node> q = new ArrayDeque<Node>();
		List<Node> list = null;
		StringBuilder sb = null;
		String sep = " ";
		
		q.add(n);
		while(!q.isEmpty()){
			list = new ArrayList<Node>();
			sb = new StringBuilder();
			while(!q.isEmpty()) {
				Node x = q.poll();
				if(x.left != null) list.add(x.left);
				if(x.right != null) list.add(x.right);
				sb.append(x.val).append(sep);
			}
			System.out.println(sb.toString().trim());
			for(Node child: list)
				q.add(child);
		}
	}

}
