package com.practice.arrays;

public class PeakFinder {

	public static void main(String[] args) {
		int[] in = {9,9,4,9,9,19,4,9};
		int index = -1;
		index = findPeak(in);
		
		if(index < 0)
			System.out.println("Peak does not exist");
		else
			System.out.println(in[index]);

	}

	private static int findPeak(int[] in) {
		return findPeak(in, 0, in.length -1);
	}

	
	private static int findPeak(int[] in, int start, int end) {
		
		if(start > end) return -1;
		if(start == end) return start;
		
		int mid = (end + start) / 2;
		
		if(isPeak(in, mid)) return mid;
		if(mid > 0 && in[mid - 1] > in[mid]) return findPeak(in, start, mid - 1);
		else
			return findPeak(in, mid + 1, end);
		
	}

	private static boolean isPeak(int[] in, int id) {
		if(id == 0 && in.length > 1) return in[id] > in[id+1];
		if(id == in.length - 1) return in[id] > in[id - 1];
		
		if(in[id -1] < in[id] && in[id] > in[id + 1]) return true;
		else return false;
	}

}
