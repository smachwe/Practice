package com.ds;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Neighbours2D {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(
				new OutputStreamWriter(System.out));

		int points_in_2d_gridRows = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
		int points_in_2d_gridColumns = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int[][] points_in_2d_grid = new int[points_in_2d_gridRows][points_in_2d_gridColumns];

		for (int points_in_2d_gridRowItr = 0; points_in_2d_gridRowItr < points_in_2d_gridRows; points_in_2d_gridRowItr++) {
			String[] points_in_2d_gridRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

			for (int points_in_2d_gridColumnItr = 0; points_in_2d_gridColumnItr < points_in_2d_gridColumns; points_in_2d_gridColumnItr++) {
				int points_in_2d_gridItem = Integer
						.parseInt(points_in_2d_gridRowItems[points_in_2d_gridColumnItr]);
				points_in_2d_grid[points_in_2d_gridRowItr][points_in_2d_gridColumnItr] = points_in_2d_gridItem;
			}
		}

		int[][] res = find_nearest_neighbours(points_in_2d_grid, 0);

		for (int resRowItr = 0; resRowItr < res.length; resRowItr++) {
			for (int resColumnItr = 0; resColumnItr < res[resRowItr].length; resColumnItr++) {
				bufferedWriter.write(String
						.valueOf(res[resRowItr][resColumnItr]));

				if (resColumnItr != res[resRowItr].length - 1) {
					bufferedWriter.write(" ");
				}
			}

			if (resRowItr != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}


	 class ID implements Comparator<ID> {
		int dist;
		int x;
		int y;
		
		public ID(int dist, int x, int y) {
			this.dist = dist;
			this.x = x;
			this.y = y;
		}

		@Override
		public int compare(ID o1, ID o2) {
			return o1.dist - o2.dist;
		}

	}
	/*
	 * Complete the find_nearest_neighbours function below.
	 */
	static int[][] find_nearest_neighbours(int[][] pt, int k) {
		/*
		 * Write your code here.
		 */
		ID[] distance_grid = new ID[pt.length];
		for(int i=0; i< pt.length; i++){
//			distance_grid[i] = new ID(pt[i][0]*pt[i][0] + pt[i][1]*pt[i][1], pt[i][0], pt[i][0]*pt[i][1]);			
		}
		int[][] op = new int[k][2];
		
		int firstPartition = partition(distance_grid, 0, distance_grid.length);
		
		if(firstPartition > k){
			// Then the left hand side of partition has a subset which is the answer
		} else if(firstPartition == k) {
			// Then the left hand side of partition is the answer
		} else {
			
		}
		
		return null;

	}

	private static int partition(ID[] a, int st, int en) {
		int pivot = a[st].dist;
		int lt = st; int rt = en + 1;
		while (lt < rt) {
			while(a[++lt].dist < pivot) {if(lt == en) break;}
			while(a[--rt].dist > pivot) {if(rt == st) break;}
			if(lt < rt) swap(a, lt, rt);
		}
		
		swap(a, st, rt);
		
		return rt;
	}
	
	private static void swap(ID[] a, int i, int j) {
		ID temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}
	
}
