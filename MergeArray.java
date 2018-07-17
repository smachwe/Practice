package com.ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class MergeArray {

	public static void main(String[] args) {
		int k = 500; // # of arrays
		int n = 500; // size of each array
		
		Random r = new Random();
		int[][] input = new int[k][n];
		
		for(int i=0;i<k;i++){
			for(int j=0;j<n; j++){
				input[i][j] = r.nextInt(999999999) + 1000000000;
			}
		}
		for(int[] arr: input)
			Arrays.sort(arr);
		/*
		for (int i = 0; i < k; i++) {
			for(int j=0;j < n; j++){
			System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		int[] final_arr = merge(input);	

		for(int i=0;i<final_arr.length; i++)
			System.out.print(final_arr[i] + " ");

	}

	private static int[] merge(int[][] arr) {
		// Figure out direction
		boolean asc = true;
		int prev = arr[0][0];
		for(int i=1;i<arr[0].length; i++){
			if (prev > arr[0][i]) { 
				asc = false;
				break;
			}else if(prev < arr[0][i]) {
				asc = true;
				break;
			}
			prev = arr[0][i];
		}
		int total = arr.length * arr[0].length;
		
		PriorityQueue<Integer> myHeap = null;
		if(asc) {
			myHeap = new PriorityQueue<Integer>(total);
		} else {
			myHeap = new PriorityQueue<Integer>(total, Collections.reverseOrder());
		}
		
		
		for(int i=0; i<arr.length; i++){
			for(int j=0;j<arr[0].length;j++) {
				myHeap.add(arr[i][j]);
			}
		}
		
		
		int[] final_arr = new int[total];
		int i=0;
		
		while(!myHeap.isEmpty())
			final_arr[i++] = myHeap.poll();
			
		return final_arr;
	}

	private static void merge(int[] a, int[] b, int st, int en, int[] c) {
		if (a.length < 1) {c = b; return;}
		if (b.length < 1) {c = a; return;}
		int curr = 0;
		int left = st, right = st;

		while(left <= en && right <= en){
			if(a[left] < b[right]){
				c[curr++] = a[left++];
			}else if(a[left] >= b[right]){
				c[curr++] = b[right++];
			}
		}
		
		while(left <= en)
			c[curr++] = a[left++];
		
		while(right <= en)
			c[curr++] = b[right++];
		
	}

}
