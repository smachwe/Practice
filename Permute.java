package com.ds;

public class Permute {
	public static void main(String[] args) {
		String in = "ABCD";

		permute(in);
	}

	private static void permute(String in) {
		permute(in.toCharArray(), 0);
	}

	private static void permute(char[] in, int i) {
		if (i == in.length)
			System.out.println(in);
		else {
			for (int j = i; j < in.length; j++) {
				swap(in, i, j);
				permute(in, i + 1);
				swap(in, i, j);
			}
		}
	}

	private static void swap(char[] in, int i, int j) {
		char t = in[i];
		in[i] = in[j];
		in[j] = t;
	}
}
