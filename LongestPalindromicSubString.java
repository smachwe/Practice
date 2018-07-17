package com.ds;

public class LongestPalindromicSubString {

	private static int lo = 0, maxLen = 0;
	
	public static void main(String[] args) {
		String s = "abcdmadamabcd";
		
		System.out.println(longestPalindrome(s));

	}

	private static String longestPalindrome(String s) {
		if(s == null || s.length() < 2) return s;
		
		for(int i=0; i< s.length() - 1; i++){
			expandPalindrome(s, i, i); // assuming odd
			expandPalindrome(s, i, i+1); // assuming even
		}
		return s.substring(lo, lo+maxLen);
	}

	private static void expandPalindrome(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			left--;right++;
		}
		if(maxLen < (right - left - 1)){
			lo = left + 1;
			maxLen = right - left - 1;
		}
	}

}
