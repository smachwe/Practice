package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-2, 2, 0, -2, 2};
		
		String[] result = find3Sum(input);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	private static String[] find3Sum(int[] input) {
		Arrays.sort(input);
		List<String> lst = new ArrayList<String>();
		int left = 0;
		int right = input.length - 1;
		int two_target;
		for(int i=0; i<input.length - 2; i++){
			two_target = -1 * input[i];
			left = i + 1;
			right = input.length - 1;
			while(left < right){
				if((input[left] + input[right]) == two_target){
					if(!stringExists(lst, input[i], input[left], input[right]))
						lst.add(input[i] + "," + input[left] + "," + input[right]);
					left++;
					right--;
				} else if((input[left] + input[right]) < two_target){
					left++;
				}else {
					right--;
				}
			}
		}
		String[] str_arr = new String[lst.size()];
		int i=0;
		for(String s: lst){
			str_arr[i++] = s;
		}
		
		return str_arr;
	}

	private static boolean stringExists(List<String> lst, int i, int j, int k) {
		StringBuilder sb = new StringBuilder(5);
		sb.append(i).append(",").append(j).append(",").append(k);
		if(lst.contains(sb.toString())) return true;
		sb.delete(0, 5);
		sb.append(i).append(",").append(k).append(",").append(j);
		if(lst.contains(sb.toString())) return true;
		sb.delete(0, 5);		
		sb.append(j).append(",").append(i).append(",").append(k);
		if(lst.contains(sb.toString())) return true;
		sb.delete(0, 5);

		sb.append(j).append(",").append(k).append(",").append(i);
		if(lst.contains(sb.toString())) return true;
		sb.delete(0, 5);

		sb.append(k).append(",").append(j).append(",").append(i);
		if(lst.contains(sb.toString())) return true;
		sb.delete(0, 5);

		sb.append(k).append(",").append(i).append(",").append(j);
		if(lst.contains(sb.toString())) return true;

		return false;
	}

}
