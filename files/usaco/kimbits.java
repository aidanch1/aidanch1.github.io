/*ID: aidanch1
LANG: JAVA
TASK: kimbits
*/
import java.io.*;
import java.util.*;

public class kimbits {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("kimbits.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()); // max length of bit sequence
		int l = Integer.parseInt(st.nextToken()); // max number of '1' allowed
		long m = Integer.parseInt(st.nextToken()); // m'th element
		
		String ans = toadd(m-1, l, 0);
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n-ans.length(); i++) {
			sb.append(0);
		}
		sb.append(ans);
		
		PrintWriter pw = new PrintWriter("kimbits.out");
		pw.println(sb);
		pw.close();
	}
	public static String toadd(long n, int l, int prev) {
		int add = 0;
		String s = Long.toBinaryString(n);
		char[] t = s.toCharArray();
		for (int i=0; i<t.length-l; i++) {
			if (t[i]=='1') {
				add += Math.pow(2, t.length-i-2-l);
			}
		}
		if (add-prev == 0) {
			return s;
		}
		return toadd(n+add, l, add);
	}

}
