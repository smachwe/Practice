package com.ds;

import java.util.Stack;

public class MatchingParantheses {

	public static void main(String[] args) {
		String input = "{( ( 1 + 2 ) * 3 ))";
		
		boolean match = hasMatchingParantheses(input);
		
		System.out.println(match);

	}
	
    public static boolean hasMatchingParantheses(String strExpression) {
    	if(strExpression == null) return true;
    	
    	char[] in = strExpression.toCharArray();
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i=0; i< in.length; i++){
    		if( in[i] == '{') stack.push('}');
    		if( in[i] == '(') stack.push(')');
    		if( in[i] == '[') stack.push(']');
    		
    		if( in[i] == '}') {if(stack.isEmpty() || stack.pop() != in[i]) return false; } 
    		if( in[i] == ')') {if(stack.isEmpty() || stack.pop() != in[i]) return false; } 
    		if( in[i] == ']') {if(stack.isEmpty() || stack.pop() != in[i]) return false; } 
    		
    	}
    	if(stack.isEmpty()) return true;
    	else return false;

    }
}
