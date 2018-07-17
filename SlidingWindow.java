package com.ds;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		int w = 3;
		int[] op = max_in_sliding_window(arr, w);
		
		for(int i:op)
			System.out.print(i + " ");
		
	}
	
    static int[] max_in_sliding_window(int[] arr, int w) {
		int[] op = new int[arr.length - w + 1];
		int start = 0;
		int end = w - 1;
		int max = max(arr, start, end);
		op[0] = max;
		
		for(int i=w,j = 1;i<arr.length; i++, j++){
			start++;end++;
			if(arr[i] >= op[j - 1]) op[j] = arr[i];
			else {
				op[j] = max(arr, start, end);
			}
		}
		
		return op;

    }

	static int max(int[] a, int i, int j){
		int ret = a[i];
		for(int x = i+1;x<=j; x++)
			if(a[x]>ret) ret = a[x];
		
		return ret;
	}

}
