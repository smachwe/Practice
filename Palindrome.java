package com.ds;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Neverafoottoofareven";
		s = s.replaceAll("[,.;:\\\\\"]","");
		System.out.println(s);
		System.out.println(is_palindrome(s.toUpperCase().replace("\\s+", "")));
		String t = s.toLowerCase().replace("\\s+", "");
		System.out.println(is_palindrome(t, 0 , t.length() - 1));

	}
	
	private static boolean is_palindrome(String s){
		if(s.length() <= 1) { return true;}
		else if(s.charAt(0) == s.charAt(s.length() -1 )) {			
			 return is_palindrome(s.substring(1,s.length() - 1));
		} else
			return false;
	}
	
	private static boolean is_palindrome(String s, int i, int j){
		if(s.length() <= 1 || i > j) return true;
		
		else if(s.charAt(i) == s.charAt(j))
			return is_palindrome(s, i+1, j-1);
		else return false;
	}

}
