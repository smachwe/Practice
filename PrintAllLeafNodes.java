package com.ds;

import java.util.ArrayList;
import java.util.List;

public class PrintAllLeafNodes {

	public static void main(String[] args) {
		// First Create a Binary Tree using Node
		
		String s = "Sumit";
		char[] a = s.toCharArray();
		
		List<Character> numList = new ArrayList<Character>();
		int aa = 0;
		for(char c: a){
			aa = (int)c;
			
		}
		
		for(char numC: numList){
			
		}
		
		Node root = new Node(1);
		Node n2 = new Node(2);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n3 = new Node(3);
		
		n2.left = n4;
		n2.right = n5;
		root.left = n2;
		root.right = n3;
		
		System.out.println(root);
		System.out.println(" Now printing all Leaves....");
		printAllLeaves(root);
				

	}

	private static void printAllLeaves(Node root) {
		if(root == null)
			return;
		
		if(root.left == null && root.right == null)
			System.out.print(root.id + " ");
		
		if(root.left != null){
			printAllLeaves(root.left);
		}
		
		if(root.right != null){
			printAllLeaves(root.right);
		}
	}

}
