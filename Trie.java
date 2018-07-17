package com.ik.homework.graphs.homework1;

import java.net.URL;
import java.util.*;

public class Trie {
	class TrieNode {
		char c;
		Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		boolean isLeaf;
		List<Integer> positions = new ArrayList<Integer>();
		public TrieNode() {
		}
		
		public TrieNode(char c){
			this.c = c;
		}
	}
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public boolean contains(String word) {
		TrieNode current = root;
		for(char c: word.toCharArray()){
			if(current == null || !current.children.containsKey(c)) return false;
			current = current.children.get(c);
		}
		if(current == null) return false;
		else return current.isLeaf;
	}

	public List<Integer> getItems(String word){
		TrieNode current = root;
		for(char c: word.toCharArray()){
			if(!current.children.containsKey(c)){
				TrieNode newNode = new TrieNode(c);
				current.children.put(c, newNode);
			}
			current = current.children.get(c);
		}
		current.isLeaf = true;
		return current.positions;
	}
	
	
	public void insert(String word){
		Map<Character, TrieNode> current = root.children;
		for(int i=0; i< word.length(); i++){
			TrieNode value;
			char key = word.charAt(i);
			if(current.containsKey(key)){
				value = current.get(key);
			} else {
				value = new TrieNode(key);
				current.put(key, value);
			}
			current = value.children;
			
			if(i == word.length() - 1)
				value.isLeaf = true;
		}		
	}
	/*
	public boolean contains(String word){
		Map<Character, TrieNode> children = root.children;
		TrieNode t = null;
		
		for(int i=0; i< word.length(); i++){
			char c = word.charAt(i);
			if(children.containsKey(c)){
				t = children.get(c);
				children = t.children;
			} else {
				t = null;
				break;
			}
		}
		
		if(t == null) return false;
		else return t.isLeaf;
	}
	*/
	
	public static void main(String[] args) throws Exception {
		Trie trie = new Trie();
		Scanner scanner = null;
		try{
		URL url = new URL("https://norvig.com/big.txt");
		 scanner =  new Scanner(url.openStream());
		StringBuilder text = new StringBuilder();
		while(scanner.hasNext()){
			text.append(scanner.nextLine());
		}
		
		
		String[] input = text.toString().toLowerCase().split(" "); // "Hello how are you doing Sumit Machwe".toLowerCase().split(" ");
		
		for(int i=0;i<input.length;i++){
			trie.getItems(input[i]).add(i);
		}
		
		String[] query = {"","is", "are", "Machwe"};
		
		for(String s: query){
			System.out.println("\nDoes the trie contain " + s + " ->" + trie.contains(s.toLowerCase()));
			if(trie.contains(s.toLowerCase())) System.out.print("Positions are: \n" + trie.getItems(s.toLowerCase()));
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(scanner != null) scanner.close();
		}
	}
}
