package com.ds;

public class OddEvenGroup {

	public static void main(String[] args) {
		int[] input = {5,7,10,2,2};
		int st = 0;
		int en = input.length - 1;
		
		while(st < en) {
			while(input[st]%2 == 0) st++;
			while(input[en]%2 != 0) en--;
			
			swap(input, st, en);
		}
		swap(input, st, en);
		
		for(int i: input)
			System.out.print(i + " ");
		
	}
	
	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
