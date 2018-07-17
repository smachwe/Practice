package com.ds;
import java.util.*;
// INCOMPLETE
public class GasStation {

	private static int N = 10;
	
	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<>();
		m.put('C', 1);
		int rr = 0;
		for(Integer i: m.values())
			rr += i;
		
		System.out.println(rr);
		
		System.out.println(16%10);
		System.out.println(16/10);
		
		int[] cost = new int[N];
		int[] gas  = new int[N];

		Random r = new Random();
		for(int i=0; i<cost.length; i++){
			cost[i] = r.nextInt(99);
			gas[i] = r.nextInt(99);			
		}
		
		for(int i=0; i < N; i++){
			
		}


	}

}
