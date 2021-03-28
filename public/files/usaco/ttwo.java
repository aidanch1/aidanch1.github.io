/*ID: aidanch1
LANG: JAVA
TASK: ttwo
*/
import java.io.*;
import java.util.*;

public class ttwo {
	/*
	 * wow i didnt expect this to work (thought there'd be some other trick) but just simulate every minute of farmer and cows moving
	 * until they either 1) meet up or 2) are in a state previously seen meaning they will never meet
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\ttwo.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("ttwo.in"));
		char[][] grid = new char[10][10];
		ob f = new ob();
		ob c = new ob();
		for (int i=0; i<10; i++) {
			char[] t = bf.readLine().toCharArray();
			grid[i] = t;
			for (int j=0; j<10; j++) {
				if (t[j] == 'F') {
					f.row = i;
					f.col = j;
					f.dir = 'n';
				}
				if (t[j] == 'C') {
					c.row = i;
					c.col = j;
					c.dir = 'n';
				}
			}
		}
		/*System.out.println(f.row +" "+ f.col);
		System.out.println(c.row + " " + c.col);*/
		HashSet<String> states = new HashSet<String>();
		int time = 0;
		boolean meet = false;
		PrintWriter pw = new PrintWriter("ttwo.out");
		while (!states.contains(makeState(f,c))) {
			states.add(makeState(f, c));
			move(f, grid);
			move(c, grid);
			time++;
			
			if (f.row == c.row && f.col == c.col) {
				pw.println(time);
				meet = true;
				break;
			}
			//System.out.println(time + ": "+ f +" "+ c);
		}
		if (!meet) {
			pw.println(0);
		}
		pw.close();
		
	}
	public static void move(ob a, char[][] grid) {
		if (a.dir == 'n') {
			if (a.row == 0 || grid[a.row-1][a.col] == '*') {
				a.dir = 'e';
			}
			else {
				a.row -= 1;
			}
		}
		else if (a.dir == 'w') {
			if (a.col == 0 || grid[a.row][a.col-1] == '*') {
				a.dir = 'n';
			}
			else {
				a.col -= 1;
			}
		}
		else if (a.dir == 's') {
			if (a.row == 9 || grid[a.row+1][a.col] == '*') {
				a.dir = 'w';
			}
			else {
				a.row += 1;
			}
		}
		else {
			if (a.col == 9 || grid[a.row][a.col+1] == '*') {
				a.dir = 's';
			}
			else {
				a.col += 1;
			}
		}
	}
	public static String makeState(ob a, ob b) {
		return a.hash() + b.hash();
	}
	public static class ob{
		int row;
		int col;
		char dir;
		public String toString() {
			return "(" + row + ", " + col + ")";
		}
		public String hash() {
			return "" + row + col + dir;
		}
	}

}
