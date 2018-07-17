package com.ik.homework.recursion;

import java.util.*;

public class SubsetGenerator {
	

	public static void main(String[] args) {
		
		String x = "";

		long st = System.currentTimeMillis();
		String[] res = generate_all_subsets(x);
		System.out.println(res.length + " " + Math.pow(2, x.length()) + " in " + (System.currentTimeMillis() - st) + " ms");
	}

	static String[] generate_all_subsets(String s) {
		char[] input = s.toCharArray();
		String[] sub = new String[input.length];
		List<String> output = new ArrayList<String>();

		subsetRec(input, 0, sub, output);

		String[] a = new String[output.size()];
		return output.toArray(a);
	}

	static void subsetRec(char[] in, int i, String[] sub, List<String> output) {
		if(i == in.length){
			printSet(sub, output);
		} else{
			sub[i] = null;
			subsetRec(in, i+1, sub, output);
			
			sub[i] = in[i] + "";
			subsetRec(in, i+1, sub, output);
		}

	}

	private static void printSet(String[] sub, List<String> output) {
		
		StringBuilder sb = new StringBuilder();
		
		for(String s: sub){
			if(s != null) sb.append(s);
		}
		output.add(sb.toString());		
	}

}
