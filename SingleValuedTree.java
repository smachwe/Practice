package com.ik.homework.tree;

import java.util.StringTokenizer;

public class SingleValuedTree {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(5);
		root.left.left = new Node(5);
		root.left.right = new Node(5);
		root.right = new Node(5);
		root.right.left = new Node(5);
		root.right.right = new Node(5);
		root.right.right.right = new Node(1);
		
		String s = "5 5 5 # # 5 # # 5 5 # # 5 # 1";
//		root = createTree(s);
		
		System.out.println(root);
		System.out.println(createTree(s));
		
		System.out.println(findSingleValueTrees(root));

	}
	static Node createTree(String data) {
        if (data == null || data.length() == 0) return null;
        StringTokenizer st = new StringTokenizer(data, " ");
        return deserialize(st);
    }

    static Node deserialize(StringTokenizer st) {
        if (!st.hasMoreTokens())
            return null;
        String s = st.nextToken();
        if (s.equals("#"))
            return null;
        Node root = new Node(Integer.valueOf(s));
        root.left = deserialize(st);
        root.right = deserialize(st);

        return root;
    }

	static int findSingleValueTrees(Node n) {
		return findSingleValueTrees(n, n.val);
	}
	   
    static int findSingleValueTrees(Node n, int v) {
    	if(n == null) return 0;
    	    	
    	if(!isSVT(n, v)){
    		int leftCount = findSingleValueTrees(n.left, v);
    		int rightCount = findSingleValueTrees(n.right, v);
    		return leftCount + rightCount;
    	} else {
    		int leftCount = findSingleValueTrees(n.left, v);
    		int rightCount = findSingleValueTrees(n.right, v);
    		return leftCount + rightCount + 1;
    	}    	
    }

	private static boolean isSVT(Node n, int v) {
		// leaf node
		if(n.left == null && n.right == null && n.val == v) return true;
		
		if(n.left != null && v == n.left.val && n.right != null && v == n.right.val) return true;
		if(n.left != null && v == n.left.val && n.right == null) return true;
		if(n.right != null && v == n.right.val && n.left == null) return true;
		
		return false;
	}

}
