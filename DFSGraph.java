package com.ik.homework.graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSGraph {

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
		
		n4.neighbours = new ArrayList<Node>();
		n6.neighbours = new ArrayList<Node>();
		
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
		
		dfs(list);
		
	}

	private static void dfs(List<Node<Integer>> nodes) {
		boolean[] seen = new boolean[nodes.size() + 1];// because array starts from index 0 and our nodes are starting with val=1
		for(Node<Integer> cur: nodes){
			if(!seen[cur.val]){
				List<Integer> comp = new ArrayList<Integer>();
				explore(cur, seen, comp);
				System.out.println(comp);
			}
		}
	}
	
	static void explore(Node<Integer> curr, boolean[] seen, List<Integer> comp){
		seen[curr.val] = true;
		comp.add(curr.val);
		for(Node<Integer> next: curr.neighbours){
			if(!seen[next.val]){
				explore(next,seen, comp);
			}
		}
	}

}
