package com.ik.homework.tree;

public class Node {
    int val;
    Node left;
    Node right;
    Node nextRight;
    public Node(int value) {
        this.val = value;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	if(left != null) sb.append(left);
    	sb.append(val + "");
    	if(right != null) sb.append(right);
    	
    	return sb.toString();
    }
}