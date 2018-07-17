package com.ik.homework.recursion;

import java.util.*;

public class NQueen {

	public static void main(String[] args) {

		int n = 5;
		String[][] out = find_all_arrangements(n);
		
		System.out.println("Total solutions " + out.length);
		
		for(String[] s: out){
			System.out.println(String.join(",\n", s));
		}
		

	}
	
	static String[][] find_all_arrangements(int n) {
		Set<List<String>> op = new HashSet<List<String>>();

		char[][] grid = new char[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] = '-';

		if (!nQueen(grid, 0, op))
			System.out.println("Solution does not exist");
		

		String[][] output = new String[op.size()][n];
		int i = 0, j = 0;
		for (List<String> s : op) {
			j = 0;
			for (String elem : s) {
				output[i][j++] = elem;
			}
			i++;
		}
		
		return output;
	}

	private static List<String> stringyfy(char[][] grid) {
		StringBuilder sb = new StringBuilder();
		List<String> output = new ArrayList<String>();

		for (int i = 0; i < grid.length; i++) {
			sb = new StringBuilder();
			for (int j = 0; j < grid.length; j++) {
				sb.append(grid[i][j]);
			}
			output.add(sb.toString());
		}
		return output;
	}

	private static boolean nQueen(char[][] grid, int row, Set<List<String>> solution) {
		if (row == grid.length) {
			solution.add(stringyfy(grid));
			return true;
		}
		boolean res = false;
		for (int i = 0; i < grid.length; i++) {
			if (legal(grid, row, i)) {
				grid[row][i] = 'q';
				res = nQueen(grid, row + 1, solution) || res;
				grid[row][i] = '-';
			}
		}

		return res;
	}

	private static boolean legal(char[][] grid, int row, int col) {
		// We only need to look upwards
		// Same row
		for (int i = 0; i < grid.length; i++)
			if (grid[row][i] == 'q')
				return false;
		// left diagonal
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (grid[i][j] == 'q')
				return false;
		}
		// vertical
		for (int i = row - 1; i >= 0; i--)
			if (grid[i][col] == 'q')
				return false;
		// right diagonal
		for (int i = row - 1, j = col + 1; i >= 0 && j < grid.length; i--, j++) {
			if (grid[i][j] == 'q')
				return false;
		}

		return true;
	}

}
