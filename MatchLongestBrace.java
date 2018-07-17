package com.ds;

import java.util.Stack;

public class MatchLongestBrace {

	public static void main(String[] args) {
		String str = "((((())(((()";
		
		System.out.println(findMax(str));

	}
	
	public static int findMax(String brackets){
		char OPEN = '(';
		char CLOSE = ')';
		Stack<Character> stack = new Stack<Character>();
		int max = 0;
		int curr_max = 0;
		
		for(char c: brackets.toCharArray()){
			if (c == OPEN){
				stack.push(CLOSE);
			} else {
				if(!stack.isEmpty()){
					stack.pop();
					curr_max += 2;
					if(stack.isEmpty()) {
						max = max > curr_max? max : curr_max;
					}
				}
			}
		}
		
		if(!stack.isEmpty()) max = max > curr_max ? max : curr_max;
		
		return max;
		
	}

}
