package com.ds;

public class ReverseInteger {

	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(reverse(-123)+ " in " + (System.nanoTime() - start) + " nsecs");//1463847412, 1534236461
		start = System.nanoTime();
		System.out.println(newReverse(-123)+ " in " + (System.nanoTime() - start) + " nsecs");//1463847412, 1534236461
	}


    public static int reverse(int x) {
        if(x < 10 && x > -10 ) return x;
        
        boolean negative = x < 0? true: false;
        
        int rev = 0, digit = 0;
        x = Math.abs(x);
        
        while(x != 0) {
            digit = x % 10;
            x = x / 10;
            if((rev) > 0 && (Integer.MAX_VALUE/(rev)) < 10) return 0;
            rev = rev*10 + digit;
        }
        
        if(negative) return -rev;
        else return rev;
    }
    
    // Much better runtime complexity and concise solution. 
    // Does not require ugly negative tracking. Elegant overflow handle. 
    public static int newReverse(int x){
    	int result = 0;
    	
    	while(x != 0){
    		int tail = x % 10;
    		int newResult = result * 10 + tail;
    		if (result != (newResult - tail)/10) return 0;
    		result = newResult;
    		x /= 10;   		
    	}
    	return result;
    }
}
