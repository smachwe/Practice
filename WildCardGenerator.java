package com.ik.homework.recursion;
import java.util.*;
public class WildCardGenerator {

	private static final char WILD_CHAR = '?';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String s : find_all_possibilities("10?0101?11?1?"))
			System.out.println(s);

	}

	static String[] find_all_possibilities(String s) {
		List<String> res = new ArrayList<String>();
		find_all_possibilities(s.toCharArray(), 0, res);
		
		String[] out = new String[res.size()];
		res.toArray(out);
		
		return out;

	}
	
	static void find_all_possibilities(char[] input, int index, List<String> result) {
		if(input.length == index) {
			result.add(Arrays.toString(input));
			return;
		} 

		if(input[index] == WILD_CHAR){
			input[index] = '0';
			find_all_possibilities(input, index+1, result);
			
			input[index] = '1';
			find_all_possibilities(input, index+1, result);
			
			input[index] = WILD_CHAR;
			
		} else {
			find_all_possibilities(input, index+1, result);
		}

	}
}
