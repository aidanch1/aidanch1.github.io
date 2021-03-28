package problems;

import java.io.*;
import java.util.*;

public class moop {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("moop.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("moop.in"));
		int n = Integer.parseInt(bf.readLine());
		mo[] mos = new mo[n];
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			mos[i] = new mo(a, b);
		}
		Arrays.sort(mos, mocompare);
		
		int[] minl = new int[n];
		int min = mos[0].y;
		minl[0] = mos[0].y;
		for (int i=1; i<n; i++) {
			if (mos[i].y < min) {
				min = mos[i].y;
			}
			minl[i] = min;
		}
		int[] maxr = new int[n];
		int max = mos[n-1].y;
		maxr[n-1] = mos[n-1].y;
		for (int i=n-2; i>=0; i--) {
			if (mos[i].y > max) {
				max = mos[i].y;
			}
			maxr[i] = max;
		}
		int ans = 1;
		for (int i=0; i<n-1; i++) {
			if (minl[i] > maxr[i+1]) {
				ans++;
			}
		}		
		PrintWriter pw = new PrintWriter("moop.out");
		pw.println(ans);
		pw.close();
	}
	static class mo{
		int x;
		int y;
		public mo(int a, int b) {
			this.x = a;
			this.y = b;
		}
	}
	public static Comparator<mo> mocompare = new Comparator<mo>() {
		public int compare(mo s1, mo s2) {
			//ascending order
			if (s1.x == s2.x) {
				return (int) s1.y - s2.y;
			}
			return  (int) (s1.x - s2.x);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};

}
