package com.ik.homework.recursion;

public class UniquePaths {

	public static void main(String[] args) {
		int m = 12, n = 4;
		
		int paths = uniquePaths(m,n);
		
		System.out.println(paths);

	}

	private static int uniquePaths(int m, int n) {
		return uniquePathsRec(1, 1, m, n);
	}

	private static int uniquePathsRec(int start_row, int start_col, int end_row, int end_col) {
		if(start_row == end_row && start_col == end_col) return 1;
		int paths = 0;
		if(start_row < end_row){
			paths += uniquePathsRec(start_row + 1, start_col, end_row, end_col);
		}
		if(start_col < end_col) {
			paths += uniquePathsRec(start_row, start_col + 1, end_row, end_col);
		}
		return paths;		
	}


}
