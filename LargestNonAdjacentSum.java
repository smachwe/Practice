package com.ds;

public class LargestNonAdjacentSum {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 2, 5};
		int s = largestSum(arr);
		

	}

	private static int largestSum(int[] arr) {
		if(arr.length == 0) return 0;
		if(arr.length == 1) return arr[0];
		if(arr.length == 2) return Math.max(arr[0], arr[1]);
		
		
		
		for(int delta=1; delta < arr.length; delta++){}
		return 0;
	}

}
