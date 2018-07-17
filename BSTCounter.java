package com.ik.homework.recursion;
import java.util.*;

public class BSTCounter {

	static Map<Integer, Long> map = new HashMap<Integer, Long>();
	static {
		map.put(0, 1L);
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(how_many_BSTs(n));

	}
	
    static long how_many_BSTs(int n) {
    	if(map.containsKey(n)) return map.get(n);
    	else {
    		long res = 0L;
    		for(int leftSubBST = 0; leftSubBST < n; leftSubBST++){
    			int rightSubBST = n - 1 - leftSubBST;// 1 for the root;
    			res += how_many_BSTs(leftSubBST) * how_many_BSTs(rightSubBST);
    		}
    		map.put(n, res);
    		return res;

    	}

    }


}
