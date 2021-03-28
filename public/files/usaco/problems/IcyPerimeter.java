package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IcyPerimeter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfIn = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\perimeter_silver_jan19\\8.in"));
		BufferedReader bfOut = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\perimeter_silver_jan19\\8.out"));
		int size = Integer.parseInt(bfIn.readLine());
		char[][] ic = new char[size][size];
		for (int i=0; i<size; i++) {
			ic[i] = bfIn.readLine().toCharArray();
		}
		bfIn.close();
		int maxArea = 0;
		int per = 0;
		for (int i=0; i<ic.length; i++) {
			for (int j=0; j<ic[i].length; j++) {
				if (ic[i][j] == '#') {
					ArrayList<coord> region = new ArrayList<>();
					region.add(new coord(i,j));
					find(ic, region);
					int tper = perimeter(region, ic); 
					if (region.size()>maxArea) {
						maxArea = region.size();
						per = tper;
					}
					if (region.size()==maxArea && tper<per) {
						per = tper;
					}
					//System.out.println(region.size());
					clear(region, ic);
				}
			}
		}
		System.out.println(maxArea + " " + per);
		System.out.println(bfOut.readLine());
		bfOut.close();
	}
	public static void clear(ArrayList<coord> region, char[][] board) {
		for (coord i:region) {
			board[i.row][i.column] = '.';
		}
	}
	public static int perimeter(ArrayList<coord> region, char[][] board) {
		int perimeter = 0;
		for (coord i:region) {
			if (i.row == board.length-1 || board[i.row+1][i.column] == '.') {
				perimeter++;
			}
			if (i.row == 0 || board[i.row-1][i.column] == '.') {
				perimeter++;
			}
			if (i.column == board[i.row].length-1 || board[i.row][i.column+1] == '.') {
				perimeter++;
			}
			if (i.column == 0 || board[i.row][i.column-1] == '.') {
				perimeter++;
			}
		}
		return perimeter;
	}
	/*public static boolean contains(ArrayList<coord> region, int i, int j) {
		for (coord c:region) {
			if (c.row == i && c.column == j) {
				return true;
			}
		}
		return false;
	}*/
	public static void find(char[][] board, ArrayList<coord> region) {
		HashSet<coord> map = new HashSet<>(region);
		ArrayList<coord> old = new ArrayList<>(region);
		boolean added = true;
		while (added) {
			added = false;
			ArrayList<coord> news = new ArrayList<>();
			for (coord c:old) {
				if (c.row<board.length-1 && board[c.row+1][c.column] == '#' && !map.contains(new coord(c.row+1, c.column))) {
					map.add(new coord(c.row+1, c.column));
					news.add(new coord(c.row+1, c.column));
					region.add(new coord(c.row+1, c.column));
					added = true;
				}
				if (c.row>0 && board[c.row-1][c.column] == '#'&& !map.contains(new coord(c.row-1, c.column))) {
					map.add(new coord(c.row-1, c.column));
					news.add(new coord(c.row-1, c.column));
					region.add(new coord(c.row-1, c.column));
					added = true;
				}
				if (c.column<board.length-1 && board[c.row][c.column+1] == '#'&& !map.contains(new coord(c.row, c.column+1))) {
					map.add(new coord(c.row, c.column+1));
					news.add(new coord(c.row, c.column+1));
					region.add(new coord(c.row, c.column+1));
					added = true;
				}
				if (c.column>0 && board[c.row][c.column-1] == '#' && !map.contains(new coord(c.row, c.column-1))) {
					map.add(new coord(c.row, c.column-1));
					news.add(new coord(c.row, c.column-1));
					region.add(new coord(c.row, c.column-1));
					added = true;
				}
			}
			old = news;
		}
	}
	public static class coord{
		public int row;
		public int column;
		public coord(int a, int b) {
			row = a;
			column = b;
		}
		@Override
		public boolean equals(Object a) {
			coord b = (coord) a;
			return b.row == row && b.column == column;
		}
		@Override
	    public int hashCode() {
	        return row*37+column;
	    }
		 @Override
		    public String toString() { 
		        return "("+row + ", " + column+")"; 
		    } 
	}
}
