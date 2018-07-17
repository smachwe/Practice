package com.ik.homework.graphs.homework1;
import java.util.*;

public class KnightsTour {
	
	public static class Cell {
		public int row;
		public int col;
		public Cell(int r, int c) {
			this.row = r;
			this.col = c;
		}
		public static Cell make(int r, int c){
			return new Cell(r, c);
		}
	}

	public static void main(String[] args) {
		System.out.println(find_minimum_number_of_moves(5,5,0,0,4,1));

	}

    static int find_minimum_number_of_moves(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
    	if(start_row == end_row && start_col == end_col) return 0;
    	int[][] grid = new int[rows][cols];
    	Queue<Cell> queue = new ArrayDeque<Cell>();
    	queue.add(Cell.make(start_row, start_col));
    	
    	while(!queue.isEmpty()){
    		Cell cur = queue.poll();
    		
    		if(cur.row == end_row && cur.col == end_col){
    			return grid[cur.row][cur.col];
    		}
    		
    		for(Cell c: getNeighbors(grid, cur.row, cur.col)){
    			if(grid[c.row][c.col] == 0) {
    				grid[c.row][c.col] = grid[cur.row][cur.col] + 1;
    				queue.add(Cell.make(c.row, c.col));
    			}
    		}
    	}
    	return -1;
    }
    

    
    private static List<Cell> getNeighbors(int[][] grid, int i, int j){
    	List<Cell> positions = new ArrayList<Cell>();
    	positions.add(Cell.make(-2, -1));
    	positions.add(Cell.make(-2, 1));
    	positions.add(Cell.make(-1, -2));
    	positions.add(Cell.make(-1, 2));
    	positions.add(Cell.make(1, -2));
    	positions.add(Cell.make(1, 2));
    	positions.add(Cell.make(2, -1));
    	positions.add(Cell.make(2, 1));
    	
    	List<Cell> result = new ArrayList<Cell>();
    	
    	for(Cell cur: positions){
    		if(0 <= i + cur.row && 0 <= j + cur.col && i + cur.row < grid.length && cur.col + j < grid[i].length)
    			result.add(Cell.make(cur.row + i, cur.col+j));
    	}
    	
    	return result;
    	
    }
}
