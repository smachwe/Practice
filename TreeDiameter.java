package com.ds;

import java.util.*;

public class TreeDiameter {

	public static class TreeNode {
		int distance;
		List<TreeNode> children;
	}

	private static class DiameterReturnValue {
		int diameter, distanceToMostDistantLeaf;
	}

	public static void main(String[] args) {
		String tree = "{0,3,{5,2,{8,0},{7,0}},{5,2,{9,0},{8,0}},{5,2,{10,0},{9,0}}}";
		TreeNode root = buildTree(tree.toCharArray());

		int dia = findDiameter(root);

		System.out.println(dia);

	}

	private static TestCase tests[] = {
			// One node - no diameter
			new TestCase("{0,0}", 0),
			// One leaf
			new TestCase("{0,1,{5,0}}", 5),
			// Still one leaf
			new TestCase("{0,1,{5,1,{4,1,{7,0}}}}", 16),
			// The diameter of the first child is the diameter of the tree
			new TestCase("{0,1,{5,2,{8,0},{7,0}}}", 15),
			// The diameter of the last child is the diameter of the tree
			new TestCase(
					"{0,3,{1,2,{5,0},{7,0}},{1,2,{6,0},{5,0}},{1,2,{10,0},{9,0}}}",
					19),
			// Now the diameter is between a leaf in the first child and a leaf
			// in the third child
			new TestCase("{0,3,{5,2,{8,0},{7,0}},{5,2,{9,0},{8,0}},{5,2,{10,0},{9,0}}}",29) };

	private static class TestCase {
		public TestCase(String t, int d) {
			tree = t;
			diameter = d;
		}

		String tree;
		int diameter;
	}

	private static int findDiameter(TreeNode root) {
		if (root == null)
			return -1;

		return diaRec(root).diameter;
	}

	private static DiameterReturnValue diaRec(TreeNode tree) {
		DiameterReturnValue returnValue = new DiameterReturnValue();
		if (tree.children == null) {
			returnValue.distanceToMostDistantLeaf = tree.distance;
			returnValue.diameter = 0;
			return returnValue;
		}

		returnValue.diameter = -1;
		int distToMostDistantLeaf = 0, distTo2ndMostDistantLeaf = 0;
		for (TreeNode child : tree.children) {
			DiameterReturnValue r = diaRec(child);
			returnValue.diameter = Math.max(returnValue.diameter, r.diameter);
			if (r.distanceToMostDistantLeaf > distToMostDistantLeaf) {
				distTo2ndMostDistantLeaf = distToMostDistantLeaf;
				distToMostDistantLeaf = r.distanceToMostDistantLeaf;
			} else if (r.distanceToMostDistantLeaf > distTo2ndMostDistantLeaf) {
				distTo2ndMostDistantLeaf = r.distanceToMostDistantLeaf;
			}
		}

		returnValue.distanceToMostDistantLeaf = distToMostDistantLeaf
				+ tree.distance;
		returnValue.diameter = Math.max(returnValue.diameter,
				distToMostDistantLeaf + distTo2ndMostDistantLeaf);

		return returnValue;
	}

	private static int index = 0;

	private static TreeNode buildTree(char[] s) {
		index++; // initial {
		TreeNode root = new TreeNode();

		root.distance = readNumber(s);

		index++; // ,
		int childrenCount = readNumber(s);
		index++;
		if (childrenCount == 0)
			return root;

		root.children = new ArrayList<TreeNode>();
		while (childrenCount-- > 0) {
			root.children.add(buildTree(s));
			index++;
		}

		return root;
	}

	private static int readNumber(char[] s) {
		int d = 0;
		while (Character.isDigit(s[index])) {
			d *= 10;
			d += s[index++] - '0';
		}
		return d;
	}

}
