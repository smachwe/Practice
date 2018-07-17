/*
package com.ds;

import java.util.*;

public class MinStack {
	
	private Stack<Integer> data = new Stack<Integer>();
	private Stack<Integer> min = new Stack<Integer>();
	
	
	
	public void push(int item) throws Exception {
		// not handling autogrowth.. delegating to JDK implementation
		data.push(item);
		
		if(!min.isEmpty()){
			if(min.peek() < item)
				min.push(min.peek());
			else
				min.push(item);
		}else
			min.push(item);
	}
	
	public int peek() throws Exception {
		if(data.isEmpty()) throw new Exception("Peek empty stack");
		
		return data.peek();
	}
	
	public int pop() throws Exception {
		if(data.isEmpty()) throw new Exception("Empty stack");
		int t = data.pop();
		min.pop();
		
		return t;
	}
	
	public int getMin() throws Exception {
		if(min.isEmpty()) throw new Exception("No minimum found");
		
		return min.peek();
	}

}*/
