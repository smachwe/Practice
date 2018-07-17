package com.ds;

public class Quicksort {

	public static void main(String[] args) {
		char[] arr1 = "Hello \nWorld. How are you Doing?".toCharArray(); //new int[]{1,1,5,4,0};
		int[] arr = new int[arr1.length];
		
		for(int i=0; i< arr1.length; i++)
			arr[i] = arr1[i];
		
		qsort(arr, 0, arr.length - 1);
		
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = (char)arr[i];
		}
		
		System.out.println(arr1);
	}
	
	
	private static void qsort(int[] a, int st, int en) {
		if (en <= st) return;
		
		int pivot = partition(a, st, en);
		qsort(a, st, pivot - 1);
		qsort(a, pivot + 1, en);	
	}


	private static int partition(int[] a, int st, int en) {
		int pivot = a[st];
		int lt = st; int rt = en + 1;
		while (lt < rt) {
			while(a[++lt] < pivot) {if(lt == en) break;}
			while(a[--rt] > pivot) {if(rt == st) break;}
			if(lt < rt) swap(a, lt, rt);
		}
		
		swap(a, st, rt);
		
		return rt;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}

}
