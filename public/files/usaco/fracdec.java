/*ID: aidanch1
LANG: JAVA
TASK: fracdec
*/
import java.io.*;
import java.util.*;

public class fracdec {
	/*
	 * Very easy
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("fracdec.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		//int n=45;
		//int d=56;
		StringBuilder sb = new StringBuilder();
		
		int w=n/d; // whole number before decimal
		sb.append(w);
		sb.append('.');
		int off = sb.length(); // for inserting parenthesis later if necessary
		n %= d;
		
		if (n == 0) {
			sb.append(0);
		}
		
		HashMap<Integer, Integer> prev = new HashMap<>();
		int count = 0;
		while (n != 0 && !prev.containsKey(n)) { // while theres remainder and its not repeating
			prev.put(n, count);
			count++;
			n*=10;
			int t = n/d;
			n%=d;
			sb.append(t);
		}
		//System.out.println(prev.get(n) + " " + count);
		if (n != 0) {
			sb.insert(off+prev.get(n), "(");
			sb.insert(off+1+count, ")");
		}
		//System.out.println(sb.toString());
		PrintWriter pw = new PrintWriter("fracdec.out");
		String ans = sb.toString(); // the next 3 lines just split ans into lines of (up to) 76 characters for output
		for (int i=0; i<ans.length()/76; i++) {
			pw.println(ans.substring(i*76, (i+1)*76));
		}
		pw.println(ans.substring(ans.length()/76*76));
		pw.close(); 
	}

}
