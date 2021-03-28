/*ID: aidanch1
LANG: JAVA
TASK: humble
*/
import java.io.*;
import java.util.*;

public class humble {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("humble.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("humble.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int k = Integer.parseInt(st.nextToken()); // size of set
		int n = Integer.parseInt(st.nextToken()); // nth humble number
		
		st = new StringTokenizer(bf.readLine());
		int[] set = new int[k];
		for (int i=0; i<k; i++) {
			set[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int[] hums = new int[n+1];
		hums[0] = 1;
		int[] next = new int[k];
		
		for (int i=1; i<=n; i++) {
			int nexthum = Integer.MAX_VALUE;
			for (int j=0; j<k; j++) {
				while (next[j]<i && set[j]*hums[next[j]]<=hums[i-1]) {
					next[j]++;
				}
				if (set[j]*hums[next[j]]<nexthum) {
					nexthum = set[j]*hums[next[j]];
				}
			}
			hums[i] = nexthum;
		}
		PrintWriter pw = new PrintWriter("humble.out");
		pw.println(hums[n]);
		pw.close();
	}

}
