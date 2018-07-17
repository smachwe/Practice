package com.ds;
import java.util.*;
/**
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Notes: canonical numbers (numbers described by a single letter): I = 1 V = 5 X = 10 L = 50 C = 100 D = 500 M = 1000

Additive rule: Use left to right descending value canonical numbers to represent number e.g. XVII = 17

Subtractive rule: In case additive rule returns more than 4 same characters in a row, write next larger canonical numeral and prefix numeral sequence to subtract. e.g. IIII = 4 is written as IV (5-1)

 * @author sumitmachwe
 *
 */

public class RomanToInt {

	public static void main(String[] args) {
		String roman = "IVMCCCCCCLLLLLLLLLLLLLLXXXXXXXXXXXXXXXXIIIIIIIIIIIIIIIIIIVVVVVVVV";
		
		int val = romanToInt(roman);
		
		System.out.println(val);

	}
	
	private static Map<Character, Integer> romanMap = new HashMap<>();
	static {
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	}

	private static int romanToInt(String roman) {
		if(roman == null || "".equals(roman)) return 0;
		if(roman.length() == 1) return romanMap.get(roman.charAt(0));
//		else if(roman.length() == 0) return 0;
		
		int maxpos = 0, maxnum = 0;
		
		for(int i=0; i < roman.length(); i++){
			if(maxnum < romanMap.get(roman.charAt(i))){
				maxnum = romanMap.get(roman.charAt(i));
				maxpos = i;
			}
		}
//		System.out.format("roman.length()=%s, maxpos=%s\n", roman.length(), maxpos);
		return romanMap.get(roman.charAt(maxpos)) - romanToInt(roman.substring(0, maxpos)) + romanToInt(roman.substring(maxpos + 1, roman.length()));
	}

}
