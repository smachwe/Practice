package com.ik.homework.tree;
import java.util.*;
/**
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

 * @author sumitmachwe
 *
 */
public class SameTree {

	public static void main(String[] args) {
		
		Node root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(14);
		root.right = new Node(7);
		
		Node second = CloneBinayTree.cloneTree(root);
		second.left.val = 10;
		System.out.println(isSameTree(root, second));

	}
	
	public static boolean isSameTree(Node first, Node second){
		if(first != null && second != null){
			if(first.val == second.val) return isSameTree(first.left, second.left) && isSameTree(first.right, second.right);
		}
		
		if(first == null && second == null) return true;
		else return false;
	}

}
