package com.ds;
import java.util.*;
/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

 * @author sumitmachwe
 *
 */
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String in = "leetcode";
		int c = firstUniqueChar(in);
		
		System.out.println(c);

	}

	private static int firstUniqueChar(String in) {
		Map<Character, Integer> charMap = new HashMap<>();
		char[] chars = in.toCharArray();
		for(char c: chars){
			if(charMap.containsKey(c)) charMap.put(c, charMap.get(c) + 1);
			else charMap.put(c, 1);
		}
		
		for(int i=0; i < chars.length; i++)
			if(charMap.get(chars[i]) == 1) return i;
		
		return '\u0000';
	}

}
