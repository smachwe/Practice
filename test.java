package com.ds;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s = "Never a foot too \"far, even.";
		
		System.out.println(s);
		System.out.println(s.charAt(0) == s.charAt(s.length() - 1));
		System.out.println(s.substring(1, s.length() - 1));
		
		char[] a = s.toCharArray();
		
		List<Integer> numList = new ArrayList<Integer>();
		int aa = 0;
		for(char c: a){
			if(c == 45) System.out.println("Found negative");
			else {
			numList.add(aa,(int)c - 48);
			aa++;
			}
			
		}
		
		for(Integer numC: numList){
			System.out.println(numC);
		}

	}

}
