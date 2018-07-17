package com.ds;

import java.util.Arrays;

public class MergeSortTest {

	public static void main(String[] args) {
		int[] in = {9,4,5,6,2,7,4,0,9,1,3,2};
		
		for(int i:in)
			System.out.print(i + " ");
		
		int[] op = MergeSort.mergeSort(in);
		
		System.out.println();
		
		for(int i:op)
			System.out.print(i + " ");
		
		Arrays.sort(in);
		System.out.println("\n\nAfter Arrays.sort(...)");
		
		for(int i:op)
			System.out.print(i + " ");


	}

}
