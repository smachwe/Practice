package com.ds;

public class MaximumWordCount {

	/**
	 * Given an array of words, such that a word w is repeated more than half the time. 
	 * Find that word
	 * @param args
	 */
	public static void main(String[] args) {
		String[] input = {"a", "a","","b","c","d","e","b","c","c"};
		
		int count = 0;
		String maxStr = null;
		for (String str : input) {
			if(count == 0){
				maxStr = str;
				count++;
			}else if(str == maxStr)
				count++;
			 else
				count--;
			
		}
		
		System.out.println("Max repeat word is: " + maxStr);

	}

}
