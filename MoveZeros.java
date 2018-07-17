package com.ds;
import java.util.*;
/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note: You must do this in-place without making a copy of the array. Minimize the total number of operations.
 * @author sumitmachwe
 *
 */
public class MoveZeros {

	public static void main(String[] args) {
		int[] in = {1,0,0,3,0, 0, 0, -1};
		moveZeros(in);
		
		for(int i: in)
			System.out.print(i + " ");

	}

	private static void moveZeros(int[] in) {
		int start=0, end =0;
		while(start < in.length) {
			if(in[start] == 0) {
				end = start + 1;
				while(end < in.length){
					if(in[end] != 0) {
						swap(in, start, end);
						break;
					}
					end++;
				}
			}
			start++;
		}
	}

	private static void swap(int[] in, int start, int end) {
		int temp = in[start];
		in[start] = in[end];
		in[end] = temp;
	}

}
