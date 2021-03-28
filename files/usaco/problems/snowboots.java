package problems;

import java.io.*;
import java.util.*;

public class snowboots {
	static int minDiscard = 0;
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\snowboots.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("snowboots.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int tm = Integer.parseInt(st.nextToken());
		int bm = Integer.parseInt(st.nextToken());
		int[] snowdepth = new int[tm];
		st = new StringTokenizer(bf.readLine());
		for (int i=0; i<tm; i++) {
			snowdepth[i] = Integer.parseInt(st.nextToken());
		}
		boot[] boots = new boot[bm];
		for (int i=0; i<bm; i++) {
			st = new StringTokenizer(bf.readLine());
			int d = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			boots[i] = new boot(d, s);
		}
		tryBoots(boots, snowdepth, 0, 0);
		PrintWriter pw = new PrintWriter("snowboots.out");
		pw.println(minDiscard);
		pw.close();
	}
	public static void tryBoots(boot[] b, int[] s, int cboot, int loc) {
		if (minDiscard != 0) {
			return;
		}
		if (cboot == b.length) {
			return;
		}
		if (loc >= s.length-1) {
		/*	if (cboot < minDiscard) {
				minDiscard = cboot;
			}*/
			minDiscard = cboot;
			return;
		}
		if (s[loc] > b[cboot].depth) {
			return;
		}
		
		for (int i=b[cboot].steps; i>=1; i--) {
			tryBoots(b, s, cboot, loc+i);
		}
		tryBoots(b, s, cboot+1, loc);
	}
	static class boot{
		int depth;
		int steps;
		public boot(int d, int s) {
			depth = d;
			steps = s;
		}
	}

}
