package com.ds;

import java.util.*;

public class MinStackTester {

	static class MinStack {

		private Stack<Integer> data = new Stack<Integer>();
		private Stack<Integer> min = new Stack<Integer>();
		private List<Integer> minList = new ArrayList<Integer>();

		public void push(int item) {
			data.push(item);

			if (!min.isEmpty()) {
				if (min.peek() < item)
					min.push(min.peek());
				else
					min.push(item);
			} else
				min.push(item);
		}

		public int pop() {
			int t = 0;
			if (!data.isEmpty()) {
				t = data.pop();
				min.pop();
			}

			return t;
		}

		public int getMin() {
			int m;
			if (min.isEmpty())
				m = -1;
			else
				m = min.peek();

			minList.add(m);

			return m;
		}

		public int[] getMinArray() {
			int[] o = new int[minList.size()];
			for (int i = 0; i < o.length; i++)
				o[i] = minList.get(i);

			return o;

		}
	}

	static int[] min_stack(int[] operations) {
		MinStack ms = new MinStack();

		for (int i : operations) {
			if (i == -1) {
				ms.pop();
			} else if (i == 0) {
				ms.getMin();
			} else if (i >= 1) {
				ms.push(i);
			}
		}

		return ms.getMinArray();

	}

	public static void main(String[] args) {

		int[] input = { 10, 5, 0, -1, 0, -1, 0 };
		
		int[] o = min_stack(input);


		for (int i : o)
			System.out.println(i);

	}

}
