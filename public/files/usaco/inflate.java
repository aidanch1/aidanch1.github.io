/*ID: aidanch1
LANG: JAVA
TASK: inflate
*/
import java.io.*;
import java.util.*;

public class inflate {
	/*
	 * Dp; for every new problem i, go through every minute j and take the max of (use i or dont use i) for that minute j
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("inflate.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("inflate.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int m = Integer.parseInt(st.nextToken()); // minutes of contest
		int n = Integer.parseInt(st.nextToken()); // number of categories
		int[] ans = new int[m+1];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(bf.readLine());
			int points = Integer.parseInt(st.nextToken()); 
			int minutes = Integer.parseInt(st.nextToken());
			for (int j=minutes; j<=m; j++) {
				if (ans[j]<ans[j-minutes]+points) {
					ans[j] = ans[j-minutes] + points;
				}
			}
		}
		
		
		PrintWriter pw = new PrintWriter("inflate.out");
		pw.println(ans[m]);
		pw.close();
	}
}
