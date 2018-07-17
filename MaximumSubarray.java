package com.ds;
import java.util.*;
/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * @author sumitmachwe
 *
 */
		
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] arr = {-10,12,-3};//{-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum = maximumSubarray(arr);
		
			System.out.print(maxSum + " ");

	}

	private static int maximumSubarray(int[] arr) {
		int n = arr.length;
		int maxSum = arr[0], sum = 0;
		
		for(int i=0; i < n; i++){
			sum +=arr[i];
			maxSum = Math.max(maxSum, sum);
			sum = Math.max(sum,0); 
		}
		return maxSum;
	}

}
