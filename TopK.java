package com.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopK {

	public static void main(String[] args) {
		// Don't rely on input size
		int[] input = {1,5,1,5,1};
		
		int[] op = topK(input, 3);
		
		for(int i:op)
			System.out.print(i + " ");


	}
	
	private static int[] topK(int[] arr, int k){
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i: arr) {
			if(!maxHeap.contains(i))
				maxHeap.add(i);
		}
		
		int[] op = new int[Math.min(k, maxHeap.size())];
		for(int i=0; i<k; i++){
			if(!maxHeap.isEmpty())
				op[i] = maxHeap.poll();
		}
		
		return op;
	}

}
