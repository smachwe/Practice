package com.ds;

import java.util.*;

public class Fibonnaci {

	public static void main(String[] args) {
		
		int n = 180;
		int[] values = new int[n+1];
		int i = 0;
		values[i++] = 0;
		values[i++] = 1;
		
		for(int j=i; j<values.length; j++)
			values[j] = values[j-1] + values[j-2];
		
		System.out.println(values[n]);

	}

}
