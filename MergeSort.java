package com.ds;

public class MergeSort {
	
	public static int[] mergeSort(int[] intArr) {
		int[] op = new int[intArr.length];
		
		for(int i=0;i<intArr.length; i++)
			op[i] = intArr[i];
		
		return mergeSort(intArr, 0, intArr.length - 1, op);
	}

	private static int[] mergeSort(int[] intArr, int st, int en, int[] op) {
		if(st >= en) return intArr;
		
		int mid = st + (en - st)/2;
		
		mergeSort(intArr, st, mid, op);
		mergeSort(intArr, mid + 1, en, op);
		
		merge(intArr, st, mid + 1, en, op);
		
		return op;
		
	}

	private static void merge(int[] intArr, int st, int mid, int en, int[] op) {
		int left = st;
		int right = mid;
		int curr = 0;
		int numElements = en - st + 1;
		
		while(left < mid && right <= en){
			if(intArr[left] < intArr[right]){
				op[curr++] = intArr[left++];
			} else
				op[curr++] = intArr[right++];
		}
		
		while(left < mid)
			op[curr++] = intArr[left++];
		while(right <= en)
			op[curr++] = intArr[right++];
		
		for(int i = numElements -1; i >= 0; i--,en--)
			intArr[en] = op[i];

	}

}
