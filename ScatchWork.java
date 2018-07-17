package com.ds;
import java.util.*;

public class ScatchWork {

	public static void main(String[] args) {
		String s = "Sumiiit";
		
		for(int start=0; start < s.length(); start++){
			for(int end=start; end < s.length(); end++){
				System.out.print(s.substring(start, end+1) + " ");
			}
		}
		
		Set<Character> c = new HashSet<>();
		c.add('m');c.add('t');c.add('i');
		System.out.println();
		System.out.println(charsExist(s, c));

	}
	
	public static String charsExist(String s, Set<Character> c){
		int m = c.size();
		int n = s.length();
		
		while(m < n){
			for(int i=0; i< n - m + 1; i++){
				int j = i, count = m;
				for(; j < i+m; j++){
					if(c.contains(s.charAt(j))) count--;
					if(count == 0) return s.substring(i, i+m);
				}					
			}
			m++;
		}
		
		return null;
	}

}
