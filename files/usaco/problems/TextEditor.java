package problems;

import java.io.*;
import java.util.*;

public class TextEditor {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\editor.txt"));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] board = new int[n];
		for (int i=0; i<n; i++) {
			board[i] = Integer.parseInt(st.nextToken()) + 1;
		}
		st = new StringTokenizer(bf.readLine());
		int startRow = Integer.parseInt(st.nextToken()) -1;
		int startCol = Integer.parseInt(st.nextToken()) -1;
		coord start = new coord(startRow, startCol);
		int endRow = Integer.parseInt(st.nextToken()) -1;
		int endCol = Integer.parseInt(st.nextToken()) -1;
		coord end = new coord(endRow, endCol);
		
		int direction = 0;
		if (start.row > end.row) {
			direction = -1;
		}
		else {
			direction = 1;
		}
		int left = start.col;
		while (start.row != end.row) {
			start.row += direction;
			if (board[start.row] < left) {
				left = board[start.row];
			}
		}
		int base = Math.abs(left - end.col);
		if (endCol >= startCol) {
			System.out.println(Math.abs(start.row - end.row) + base);
		}
		
		else {
			int moves = 0;
			for (int i=1; i<base/2; i++) {
				if (((start.row - i*direction)>0 && (start.row - i*direction)<n) && board[start.row - i*direction] < left && Math.abs(board[start.row - i*direction] - end.col) < base-i*2) {
					base = Math.abs(board[start.row - i*direction] - end.col);
					moves = i;
				}
			}
			System.out.println(Math.abs(start.row - end.row) + base + moves*2);
		}
	}
	static class coord{
		int row;
		int col;
		public coord(int a, int b) {
			row = a;
			col = b;
		}
	}
}
