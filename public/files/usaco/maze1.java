/*ID: aidanch1
LANG: JAVA
TASK: maze1
*/
import java.io.*;
import java.util.*;

public class maze1 {
	/*
	 * generic floodfill
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("maze1.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("maze1.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		char[][] maze = new char[h*2+1][w*2+1];
		for (int i=0; i<h*2+1; i++) {
			maze[i] = bf.readLine().toCharArray();
		}
		
		ArrayList<int[][]> ans = new ArrayList<>();
		for (int i=1; i<h*2; i+=2) {
			if (maze[i][w*2] != '|') {
				ans.add(floodfill(maze, new coord(i, w*2-1)));
			}
		}
		for (int i=1; i<h*2; i+=2) {
			if (maze[i][0] != '|') {
				ans.add(floodfill(maze, new coord(i, 1)));
			}
		}
		for (int i=1; i<w*2; i+=2) {
			if (maze[0][i] != '-') {
				ans.add(floodfill(maze, new coord(1, i)));
			}
		}
		for (int i=1; i<w*2; i+=2) {
			if (maze[h*2][i] != '-') {
				ans.add(floodfill(maze, new coord(h*2-1, i)));
			}
		} 
		
		int worst = -1;
		int[][] a = ans.get(0);
		int[][] b = ans.get(1);
		for (int i=1; i<h*2; i+=2) {
			for (int j=1; j<w*2; j+=2) {
				int t = Math.min(a[i][j], b[i][j]);
				if (t > worst) {
					worst = t;
				}
			}
		}
		PrintWriter pw = new PrintWriter("maze1.out");
		pw.println(worst);
		pw.close();
	}
	public static int[][] floodfill(char[][] maze, coord start){
		int[][] ans = new int[maze.length][maze[0].length];
		Queue<coord> q = new LinkedList<coord>();
		ans[start.row][start.col] = 1;
		q.add(start);
		while (!q.isEmpty()) {
			coord cur = q.poll();
			if (cur.row > 2 && maze[cur.row-1][cur.col] != '-' && ans[cur.row-2][cur.col] == 0) {
				q.add(new coord(cur.row-2, cur.col));
				ans[cur.row-2][cur.col] = ans[cur.row][cur.col] + 1;
			}
			if (cur.row < maze.length - 2 && maze[cur.row+1][cur.col] != '-' && ans[cur.row+2][cur.col] == 0) {
				q.add(new coord(cur.row+2, cur.col));
				ans[cur.row+2][cur.col] = ans[cur.row][cur.col] + 1;
			}
			if (cur.col > 2 && maze[cur.row][cur.col-1] != '|' && ans[cur.row][cur.col-2] == 0) {
				q.add(new coord(cur.row, cur.col-2));
				ans[cur.row][cur.col-2] = ans[cur.row][cur.col] + 1;
			}
			if (cur.col < maze[0].length-2 && maze[cur.row][cur.col+1] != '|' && ans[cur.row][cur.col+2] == 0) {
				q.add(new coord(cur.row, cur.col+2));
				ans[cur.row][cur.col+2] = ans[cur.row][cur.col] + 1;
			}
		}
		return ans;
	}
	static class coord{
		int row;
		int col;
		public coord(int a, int b) {
			this.row = a;
			this.col = b;
		}
	}

}
