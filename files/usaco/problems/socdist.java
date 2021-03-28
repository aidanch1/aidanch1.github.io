package problems;

import java.io.*;
import java.util.*;

public class socdist {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\socdist.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("socdist.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		interval[] intervals = new interval[m];
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(bf.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			intervals[i] = new interval(a, b);
		}
		Arrays.sort(intervals, intervalCompare);
		
		long max = (intervals[m-1].end - intervals[0].start) / 2;
		long min = 1;
		while (max > min + 1) {
			long mid = (max + min) / 2;
			boolean p = t(mid, intervals, n);
			if (p) {
				min = mid;
			}
			else {
				max = mid;
			}
		}
		
		PrintWriter pw = new PrintWriter("socdist.out");
		if (t(max, intervals, n)) {
			pw.println(max);
		}
		else {
			pw.println(min);
		}
		pw.close(); 
	}
	public static boolean t(long d, interval[] intervals, int cows){
		long curposition = intervals[0].start;
		cows--;
		int curinterval = 0;
		o: while (cows > 0) {
			if (intervals[curinterval].end >= curposition + d){
				curposition+=d;
				cows--;
			}
			else {
				while(intervals[curinterval].end < curposition + d) {
					curinterval++;
					if (curinterval == intervals.length) {
						break o;
					}
				}
				curposition = Math.max(curposition+d, intervals[curinterval].start);
				cows--;
			}
		}
		return cows == 0;
	}
	static class interval{
		long start, end;
		public interval(long a, long b) {
			start = a;
			end = b;
		}
	}
	public static Comparator<interval> intervalCompare = new Comparator<interval>() {
		public int compare(interval s1, interval s2) {
			//ascending order
			return  (int) (s1.start - s2.start);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};
}
