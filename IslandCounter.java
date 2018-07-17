package com.ik.homework.graphs;
import java.util.*;
public class IslandCounter {
	
	public static class Cell{
		public int row;
		public int col;
		public Cell(int r, int c) {
			this.row = r;
			this.col = c;
		}
		public static Cell make(int r, int c){
			return new Cell(r,c);
		}
	}

	public static void main(String[] args) {
		char[][] grid = {{'g','w','g','w'},
						 {'w','g','w','g'},
						 {'g','w','g','w'},
						 {'w','g','w','g'}};
		int count = 0;
		for(int i=0; i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				if(grid[i][j] == 'g'){
					exploreIsland(grid, i, j);
					count++;
				}
			}
		}
		
		System.out.println("Number of islands = " + count);

	}

	private static void exploreIsland(char[][] grid, int i, int j) {
		grid[i][j] = 'w';		
		for(Cell next: getNeighbors(grid, i, j)){
			if(grid[next.row][next.col] == 'g')
				exploreIsland(grid, next.row, next.col);
		}
	}

	private static List<Cell> getNeighbors(char[][] grid, int i, int j) {
		List<Cell> deltas = new ArrayList<Cell>(4);
		deltas.add(Cell.make(1,0));
		deltas.add(Cell.make(0,1));
		deltas.add(Cell.make(-1,0));
		deltas.add(Cell.make(0, -1));
		
		List<Cell> result = new ArrayList<Cell>();
		
		for(Cell cur: deltas){
			int nextRow = cur.row + i;
			int nextCol = cur.col + j;
			
			if(0 <= nextRow && nextRow < grid.length && 0 <= nextCol && nextCol < grid[i].length)
				result.add(Cell.make(nextRow, nextCol));
		}
		
		return result;
	}

}
