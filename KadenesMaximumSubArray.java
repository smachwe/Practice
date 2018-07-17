package com.ds;

public class KadenesMaximumSubArray {

	public static void main(String[] args) {
		int[] input = {4,-2,4,3,2,-1};
		
		int current_max = input[0];
		int global_max  = input[0];
		
		for(int i=1; i < input.length -1; i++){
			current_max = Math.max(input[i], current_max + input[i]);
			if(current_max > global_max)
				global_max = current_max;
		}
		System.out.println("Global Max subarray sum is = "+global_max);
	}

}
