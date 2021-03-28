/*ID: aidanch1
LANG: JAVA
TASK: stamps
*/
import java.io.*;
import java.util.*;

public class stamps {
	/*
	 * regular dp similar to the one where you need to make the longest string possible out of a set of prefixes 
	 * except the prefixes here are just coin values
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("stamps.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("stamps.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int k = Integer.parseInt(st.nextToken()); // max stamps that can be used
		int n = Integer.parseInt(st.nextToken()); // number of stamp values
		int[] vals = new int[n];
		int c = 0;
		
		while(c<n) {
			st = new StringTokenizer(bf.readLine());
			while (st.hasMoreTokens()) {
				vals[c] = Integer.parseInt(st.nextToken());
				c++;
			}
		}
		
		int[] stamps = new int[3000000]; // stamps[i] is how many stamps needed to make value i
		Arrays.fill(stamps, 201);
		stamps[0] = 0;
		
		for (int i=0; i<stamps.length; i++) {
			if (stamps[i]<k) {
				for (int j:vals) {
					if (stamps[i]+1<stamps[i+j]) {
						stamps[i+j] = stamps[i] + 1;
					}
				}
			}
		}
		
		
		int a = 0;
		while (stamps[a]<=k) {
			a++;
		}
		
		
		PrintWriter pw = new PrintWriter("stamps.out");
		pw.println(a-1);
		pw.close();
	}

}
