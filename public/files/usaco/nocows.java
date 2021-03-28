/*ID: aidanch1
LANG: JAVA
TASK: nocows
*/
import java.io.*;
import java.util.*;


public class nocows {
	/*
	 * OK so mod works like this: (a*b) % x = a%x * b%x
	 * SO we can do that to avoid overflow!
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("nocows.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int nodes = Integer.parseInt(st.nextToken());
		int depth = Integer.parseInt(st.nextToken());
		
		//int nodes = 99;
		//int depth = 15;
		long[][] dp = new long[depth+1][nodes+1];
		dp[1][1] = 1;
		for (int i=1; i<depth; i++) {
			for (int j=1; j<nodes; j+=2) {
				solve(dp, i, j);
			}
		}
		solve(dp, depth, nodes);
		/*for (int i=0; i<depth+1; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}*/
		//System.out.println(dp[depth][nodes]%9901);
		PrintWriter pw = new PrintWriter("nocows.out");
		pw.println(dp[depth][nodes]%9901);
		pw.close(); 
	}
	public static void solve(long[][] dp, int depth, int nodes) {
		for (int n=1; n<nodes-1; n+=2) {
			int n2 = nodes-1-n;
			
			for (int d = 1; d<depth-1; d++) {
				//depth-1 takes n nodes
				dp[depth][nodes] += dp[depth-1][n] * dp[d][nodes-1-n];
				//depth-1 takes n2 nodes
				dp[depth][nodes] += dp[depth-1][n2] * dp[d][n];
			}
			
			
			dp[depth][nodes] += dp[depth-1][n] * dp[depth-1][n2];
		}
		dp[depth][nodes] %= 9901;
	}

}
