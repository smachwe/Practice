package com.ik.homework.graphs;

import java.util.*;

public class BFSGraph {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n3 = new Node(3);
		Node n5 = new Node(5);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n7 = new Node(7);

		Node n4 = new Node(4);
		Node n2 = new Node(2);
		Node n6 = new Node(6);

		n1.neighbours = new ArrayList<Node>();
		n1.neighbours.add(n3);
		n1.neighbours.add(n5);

		n5.neighbours = new ArrayList<Node>();
		n5.neighbours.add(n1);
		n5.neighbours.add(n3);
		n5.neighbours.add(n9);
		n5.neighbours.add(n7);

		n3.neighbours = new ArrayList<Node>();
		n3.neighbours.add(n1);
		n3.neighbours.add(n5);

		n8.neighbours = new ArrayList<Node>();
		n8.neighbours.add(n5);
		n8.neighbours.add(n9);

		n9.neighbours = new ArrayList<Node>();
		n9.neighbours.add(n5);
		n9.neighbours.add(n8);

		n7.neighbours = new ArrayList<Node>();
		n7.neighbours.add(n5);

		n2.neighbours = new ArrayList<Node>();
		n2.neighbours.add(n4);
		n2.neighbours.add(n6);

		List<Node<Integer>> list = new ArrayList<Node<Integer>>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);
		list.add(n7);
		list.add(n8);
		list.add(n9);

		// printBFS(list);
		System.out.println(printDFS(list, n1, n7));

	}

	private static List<Integer> printDFS(List<Node<Integer>> list, Node<Integer> start, Node<Integer> end) {
		Node[] prev = new Node[list.size() + 1];
		boolean[] seen = new boolean[list.size() + 1];
		int[] dist = new int[list.size() + 1];
		Queue<Node<Integer>> queue = new ArrayDeque<Node<Integer>>();

		queue.add(start);
		seen[start.val] = true;
		dist[start.val] = 0;

		while (!queue.isEmpty()) {
			Node<Integer> n = queue.poll();
			if (n == end)
				return buildPath(start, end, prev);
			
			for (Node<Integer> child : n.neighbours) {
				if (!seen[child.val]) {
					queue.add(child);
					dist[child.val] = dist[n.val] + 1;
					prev[child.val] = n;
				}
			}
		}

		return null;
	}

	/* 
	 * has a infinite loop
	 */
	private static List<Integer> buildPath(Node<Integer> start, Node<Integer> end, Node<Integer>[] prev) {
		List<Integer> path = new ArrayList<Integer>();
		Node<Integer> curr = end;
		
		while(prev[curr.val] != null){
			path.add(curr.val);
			curr = prev[curr.val];
		}
		path.add(curr.val);
		Collections.reverse(path);
		return path;
	}
}
