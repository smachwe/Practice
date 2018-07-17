package com.ds;

public class Atoi {

	public static void main(String[] args) {
		String in = "-010";
		
		int val = atoi(in);
		
		System.out.println(val);

	}

	private static int atoi(String in) {
		if(in == null || "".equals(in)) return 0;
		boolean negate = false;
		if(in.charAt(0) == '-') negate = true;
		int x = (negate? 1 : 0);
		
		int sum = 0;
		for(int i=x; i<in.length(); i++){
			sum = sum*10 + (in.charAt(i) - '0');
		}
		
		if(negate) return -1*sum;
		else return sum;
	}

}
