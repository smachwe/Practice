package com.ds;

public class FindMissingNumber {

	public static void main(String[] args) {
		int count = Integer.MAX_VALUE - 1000;
		int[] x = new int[count];
		int i = 0;
		for(;i<count; i++)
			x[i] = i;
		x[i-1] +=1;
		
		System.out.println(find(x));
	}
	
	public static int find(int[] nos){
		int res = 0;
		for(int i=0; i<=nos.length - 1; i++){
			res ^= nos[i];
			res ^= (i+1);
		}
		
		res = res ^ (nos.length + 1);
		return res;
	}

}
