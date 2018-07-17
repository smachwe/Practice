package com.ik.homework.graphs.homework1;

import java.util.*;

public class OrderOfCharacter {

	public static class Node {
		char val;
		List<Node> neighbours;
		int inDegree;
		boolean isVisited = false;

		public Node(char val) {
			this.val = val;
			this.neighbours = null;
			this.inDegree = 0;
		}
	}

	public static void main(String[] args) {
		String[] input = {"g", "g", "g", "g"}; //{"cca", "aaa", "aab"}; // { "baa", "abcd", "abca", "cab", "cad" };

		String charOrder = find_order(input);

		System.out.println(charOrder);

	}

	static String find_order(String[] words) {
		Node[] graph = constructGraph(words);
		return find_order(graph);
	}

	private static Node[] constructGraph(String[] words) {
		Map<Character, Node> nodes = new HashMap<Character, Node>();
		if(words.length == 1){
			Node prev = new Node(words[0].charAt(0));
			prev.neighbours = new ArrayList<Node>();
			nodes.put(words[0].charAt(0), prev);
			
			for(int i=1; i < words[0].length(); i++){
				Node n = new Node(words[0].charAt(i));
				n.neighbours = new ArrayList<Node>();
				nodes.put(words[0].charAt(i), n);
				prev.neighbours.add(n);
				prev = n;
			}				
		}
		for (int i = 0, j = 1; j < words.length; i++, j++) {
			int l = 0, r = 0;
			while (l < words[i].length() && r < words[j].length()) {
				if (words[i].charAt(l) == words[j].charAt(r) && (l < words[i].length() - 1) && (r < words[j].length() - 1)) {
					l++;
					r++;
				} else {
					break;
				}
			}
			if (words[i].charAt(l) != words[j].charAt(r)) {
				// l comes before r
				Node left = null, right = null;
				if (nodes.containsKey(words[i].charAt(l))) {
					left = nodes.get(words[i].charAt(l));					
				} else {
					left = new Node(words[i].charAt(l));
					left.neighbours = new ArrayList<Node>();
					nodes.put(words[i].charAt(l), left);
				}
				if (nodes.containsKey(words[j].charAt(r)))
					right = nodes.get(words[j].charAt(r));
				else {
					right = new Node(words[j].charAt(r));
					right.neighbours = new ArrayList<Node>();
					nodes.put(words[j].charAt(r), right);
				}

				right.inDegree = right.inDegree + 1;
				left.neighbours.add(right);
				
			} else {
				if(!nodes.containsKey(words[i].charAt(l))){
					Node n = new Node(words[i].charAt(l));
					n.neighbours = new ArrayList<Node>();
					nodes.put(words[i].charAt(l), n);
				}
			}
		}
		Node[] result = new Node[nodes.size()];
		nodes.values().toArray(result);
		
		return result;
	}

	private static String find_order(Node[] graph) {
		//Find the source of the graph (with inDegree == 0)
		StringBuilder sb = new StringBuilder();
		Queue<Node> queue = new ArrayDeque<Node>();
		for(Node n: graph){
			if(n.inDegree == 0) 
			{
				queue.add(n);
				break;
			}
		}
		
		while(!queue.isEmpty()){
			Node cur = queue.poll();
			sb.append(cur.val);
			// reduce the inDegrees of n's neighbors and enqueue those who have now been zero'ed
			for(Node child: cur.neighbours){
				child.inDegree = Math.max(0, child.inDegree - 1);
				if(child.inDegree == 0) queue.add(child);
			}
		}
		return sb.toString();
	}
}
