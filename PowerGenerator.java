package com.ik.homework.recursion;


public class PowerGenerator {
	
	public static void main(String[] args) {
		float f = 2f;
		int p = 32;
		System.out.println(pow(f, p));

	}

	static float pow(float dblbase, int ipower) {
		if( dblbase == 0) return 0.0f;
		if(ipower == 0) return 1f;
		
		if(ipower < 0) {ipower *= -1; dblbase = 1/dblbase;}
		
		float res = 1;
		
		while(ipower > 0) {
			if(ipower%2 == 1) res *= dblbase;
			dblbase *= dblbase;
			ipower /=2;
		}
		
		return res;
	}

}
