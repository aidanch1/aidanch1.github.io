package problems;

import java.io.*;
import java.util.*;

public class MultiMoo {
	static int maxArea2 = 0;

	public static void main(String[] args) throws IOException {
		// BufferedReader bf = new BufferedReader(new
		// FileReader("C:\\Users\\xinchen\\Downloads\\multimoo.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("multimoo.in"));
		int size = Integer.parseInt(bf.readLine());
		int[][] board = new int[size][size];
		for (int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < size; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bf.close();
		int maxArea1 = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] > -1) {
					ArrayList<coord> region = new ArrayList<>();
					region.add(new coord(i, j));
					find(board, region, board[i][j]);
					if (region.size() > maxArea1) {
						maxArea1 = region.size();
					}
					// System.out.println(region.size());
					clear(region, board);
				}

			}
		}
		PrintWriter pw = new PrintWriter("multimoo.out");
		pw.println(maxArea1);
		pw.println(maxArea2);
		pw.close();
	}

	public static void clear(ArrayList<coord> region, int[][] board) {
		for (coord i : region) {
			board[i.row][i.column] = -1;
		}
	}

	public static void find(int[][] board, ArrayList<coord> region, int desire) {
		HashSet<coord> map = new HashSet<>(region);
		ArrayList<coord> old = new ArrayList<>(region);
		boolean added = true;
		while (added) {
			added = false;
			ArrayList<coord> news = new ArrayList<>();
			for (coord c : old) {
				if (c.row < board.length - 1 && board[c.row + 1][c.column] == desire
						&& !map.contains(new coord(c.row + 1, c.column))) {
					map.add(new coord(c.row + 1, c.column));
					news.add(new coord(c.row + 1, c.column));
					region.add(new coord(c.row + 1, c.column));
					added = true;
				}
				if (c.row > 0 && board[c.row - 1][c.column] == desire
						&& !map.contains(new coord(c.row - 1, c.column))) {
					map.add(new coord(c.row - 1, c.column));
					news.add(new coord(c.row - 1, c.column));
					region.add(new coord(c.row - 1, c.column));
					added = true;
				}
				if (c.column < board.length - 1 && board[c.row][c.column + 1] == desire
						&& !map.contains(new coord(c.row, c.column + 1))) {
					map.add(new coord(c.row, c.column + 1));
					news.add(new coord(c.row, c.column + 1));
					region.add(new coord(c.row, c.column + 1));
					added = true;
				}
				if (c.column > 0 && board[c.row][c.column - 1] == desire
						&& !map.contains(new coord(c.row, c.column - 1))) {
					map.add(new coord(c.row, c.column - 1));
					news.add(new coord(c.row, c.column - 1));
					region.add(new coord(c.row, c.column - 1));
					added = true;
				}
				//////////////////////////////////
				if (c.row < board.length - 1 && board[c.row + 1][c.column] != desire && board[c.row + 1][c.column] != -1
						&& !map.contains(new coord(c.row + 1, c.column))) {
					ArrayList<coord> rCopy = new ArrayList<coord>(region);
					rCopy.add(new coord(c.row + 1, c.column));
					find2(board, rCopy, desire, board[c.row + 1][c.column]);
					if (rCopy.size() > maxArea2) {
						maxArea2 = rCopy.size();
					}
				}
				if (c.row > 0 && board[c.row - 1][c.column] != desire&& board[c.row-1][c.column] != -1
						&& !map.contains(new coord(c.row - 1, c.column))) {
					ArrayList<coord> rCopy = new ArrayList<coord>(region);
					rCopy.add(new coord(c.row - 1, c.column));
					find2(board, rCopy, desire, board[c.row - 1][c.column]);
					if (rCopy.size() > maxArea2) {
						maxArea2 = rCopy.size();
					}
				}
				if (c.column < board.length - 1 && board[c.row][c.column + 1] != desire&& board[c.row][c.column+1] != -1
						&& !map.contains(new coord(c.row, c.column + 1))) {
					ArrayList<coord> rCopy = new ArrayList<coord>(region);
					rCopy.add(new coord(c.row, c.column + 1));
					find2(board, rCopy, desire, board[c.row][c.column + 1]);
					if (rCopy.size() > maxArea2) {
						maxArea2 = rCopy.size();
					}
				}
				if (c.column > 0 && board[c.row][c.column - 1] != desire&& board[c.row][c.column-1] != -1
						&& !map.contains(new coord(c.row, c.column - 1))) {
					ArrayList<coord> rCopy = new ArrayList<coord>(region);
					rCopy.add(new coord(c.row, c.column - 1));
					find2(board, rCopy, desire, board[c.row][c.column - 1]);
					if (rCopy.size() > maxArea2) {
						maxArea2 = rCopy.size();
					}
				}
			}
			old = news;
		}
	}

	public static void find2(int[][] board, ArrayList<coord> region, int desire, int desire2) {
		HashSet<coord> map = new HashSet<>(region);
		ArrayList<coord> old = new ArrayList<>(region);
		boolean added = true;
		while (added) {
			added = false;
			ArrayList<coord> news = new ArrayList<>();
			for (coord c : old) {
				if (c.row < board.length - 1
						&& (board[c.row + 1][c.column] == desire || board[c.row + 1][c.column] == desire2)
						&& !map.contains(new coord(c.row + 1, c.column))) {
					map.add(new coord(c.row + 1, c.column));
					news.add(new coord(c.row + 1, c.column));
					region.add(new coord(c.row + 1, c.column));
					added = true;
				}
				if (c.row > 0 && (board[c.row - 1][c.column] == desire || board[c.row - 1][c.column] == desire2)
						&& !map.contains(new coord(c.row - 1, c.column))) {
					map.add(new coord(c.row - 1, c.column));
					news.add(new coord(c.row - 1, c.column));
					region.add(new coord(c.row - 1, c.column));
					added = true;
				}
				if (c.column < board.length - 1
						&& (board[c.row][c.column + 1] == desire || board[c.row][c.column + 1] == desire2)
						&& !map.contains(new coord(c.row, c.column + 1))) {
					map.add(new coord(c.row, c.column + 1));
					news.add(new coord(c.row, c.column + 1));
					region.add(new coord(c.row, c.column + 1));
					added = true;
				}
				if (c.column > 0 && (board[c.row][c.column - 1] == desire || board[c.row][c.column - 1] == desire2)
						&& !map.contains(new coord(c.row, c.column - 1))) {
					map.add(new coord(c.row, c.column - 1));
					news.add(new coord(c.row, c.column - 1));
					region.add(new coord(c.row, c.column - 1));
					added = true;
				}
			}
			old = news;
		}
	}

	public static class coord {
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
			return row * 37 + column;
		}

		@Override
		public String toString() {
			return "(" + row + ", " + column + ")";
		}
	}
}
