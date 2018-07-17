package com.ik.homework.graphs.homework1;

import java.util.*;

import com.ik.homework.graphs.Node;

public class StringTransform {

	public static void main(String[] args) {
		String[] words = { "cat", "hat", "bad", "had" };
		String start = "bat";
		String stop = "had";

		for (String s : string_transformation(words, start, stop)) {
			System.out.print(s + " ");
		}

	}

	/**
	 * first: Generate adjacency list for each node. Node being each word of the
	 * words array second: Find the first word from words which is 1 change
	 * apart from "start". third: do a bfs with a counter until the word is
	 * found
	 * 
	 * @param words
	 * @param start
	 * @param stop
	 * @return
	 */
	static String[] string_transformation(String[] words, String start,
			String stop) {
		List<String> temp = new ArrayList<String>();
		int i = 0, startId = -1;
		boolean startExists = false, stopExists = false;
		for (i = 0; i < words.length; i++){
			temp.add(words[i]);
			if(words[i] == start) {startExists = true;startId = i;}
			if(words[i] == stop) stopExists = true;
		}
		if(!startExists) {startId = i++; temp.add(start);}
		if(!stopExists)  {temp.add(stop);}
		
		String[] newWords = new String[temp.size()];
		temp.toArray(newWords);

		Node<String>[] graph = createAdjacencyList(newWords);
		Map<String, Node<String>> parent = new HashMap<String, Node<String>>();
		Queue<Node<String>> queue = new ArrayDeque<Node<String>>();
		Node<String> terminal = graph[startId];

		parent.put(start, terminal);
		queue.add(terminal);

		while (!queue.isEmpty()) {
			Node<String> n = queue.poll();
			n.isVisited = true;
			if (n.val == stop) {
				// found the stop.
				return getPath(parent, start, stop, terminal);
			}
			for (Node<String> cur : n.neighbours) {
				if (!cur.isVisited) {
					cur.isVisited = true;
					parent.put(cur.val, n);
					queue.add(cur);
				}
			}
		}

		return new String[] { "-1" };
	}

	private static String[] getPath(Map<String, Node<String>> parent,
			String start, String stop, Node terminal) {
		List<String> path = new ArrayList<String>();
		path.add(stop);
		Node<String> cur = parent.get(stop);
		while (cur.val != terminal.val) {
			path.add(cur.val);
			cur = parent.get(cur.val);
		}
		path.add(start);
		Collections.reverse(path);

		String[] result = new String[path.size()];
		path.toArray(result);

		return result;
	}

	private static List<Node<String>> findSingleDiffNodes(Node<String>[] graph, String start) {
		List<Node<String>> result = new ArrayList<Node<String>>();

		for (Node<String> node : graph)
			if (hasOnlyOneDiff(start, node.val))
				result.add(node);

		return result;
	}

	private static Node<String>[] createAdjacencyList(String[] words) {
		Node<String>[] result = new Node[words.length];
		Node<String> left = null, right = null;
		for (int i = 0; i < words.length; i++) {
			if (result[i] == null) {
				left = new Node<String>(words[i]);
				result[i] = left;
			} else
				left = result[i];

			for (int j = i + 1; j < words.length; j++) {
				if (result[j] == null) {
					right = new Node<String>(words[j]);
					result[j] = right;
				} else
					right = result[j];

				if (hasOnlyOneDiff(words[i], words[j])) {
					left.neighbours.add(right);
					right.neighbours.add(left);
				}
			}
		}

		return result;
	}

	private static boolean hasOnlyOneDiff(String string1, String string2) {
		if (Math.abs(string1.length() - string2.length()) > 1)
			return false;

		char[] left = string1.toCharArray();
		char[] right = string2.toCharArray();
		int diffCount = string1.length() > string2.length() ? 1 : 0;

		int smallerStr = string1.length() > string2.length() ? string2.length()
				: string1.length();
		for (int i = 0; i < smallerStr; i++)
			if (left[i] != right[i])
				diffCount++;

		if (diffCount > 1)
			return false;
		else
			return true;
	}

}
