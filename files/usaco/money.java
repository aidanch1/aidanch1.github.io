/*ID: aidanch1
LANG: JAVA
TASK: money
*/
import java.io.*;
import java.util.*;

public class money {
	/*
	 * find the sum by dp-ing through the array in the same way as the subset sums problem, 
	 * except with slight modification by starting from the front and going to the back on the inner for loop because you can use a coin more than once
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\money.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("money.in"));
		StringTokenizer vals = new StringTokenizer(bf.readLine());
		int numCoin = Integer.parseInt(vals.nextToken());
		int amount = Integer.parseInt(vals.nextToken());
		long[] dp = new long[amount+1];
		dp[0] = 1;
		int[] coinValues = new int[numCoin];
		String nextLine;
		int curCoin = 0;
		while((nextLine = bf.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(nextLine);
			while(st.hasMoreTokens()) {
				coinValues[curCoin] = Integer.parseInt(st.nextToken());
				curCoin++;
			}
		}
		for (int i=0; i<numCoin; i++) {
			for (int j=0; j<=amount; j++) {
				if (j-coinValues[i]>=0) {
					dp[j] += dp[j-coinValues[i]];
				}
			}
		}
		PrintWriter pw = new PrintWriter("money.out");
		pw.println(dp[amount]);
		pw.close();
	}

}
