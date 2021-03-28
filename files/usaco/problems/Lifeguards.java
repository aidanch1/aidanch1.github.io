package problems;

import java.io.*;
import java.util.*;

public class Lifeguards {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\lifeguards.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("lifeguards.in"));
		int n = Integer.parseInt(bf.readLine());
		guard[] life = new guard[n];
		long totalTime = 0;
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			life[i] = new guard(s, e);
			totalTime += e-s;
		}
		bf.close();
		Arrays.sort(life, guardCompare);
		for (int i=0; i<life.length-1; i++) {
			if (life[i+1].start < life[i].end && life[i+1].end < life[i].end) {
				totalTime -= life[i+1].end - life[i+1].start;
				life[i].overlap += life[i+1].end - life[i+1].start;
				life[i+1].overlap += life[i+1].end - life[i+1].start;
			}
			else if (life[i+1].start < life[i].end) {
				totalTime -= life[i].end - life[i+1].start;
				life[i].overlap += life[i].end - life[i+1].start;
				life[i+1].overlap += life[i].end - life[i+1].start;
			}
		}
		int minTime = Integer.MAX_VALUE;
		int remove = -1;
		for (int i=0; i<life.length; i++) {
			if (life[i].end - life[i].start - life[i].overlap < minTime) {
				minTime = life[i].end - life[i].start - life[i].overlap;
				remove = i;
			}
		}
		PrintWriter pw = new PrintWriter("lifeguards.out");
		
		if (minTime <= 0) {
			pw.println(totalTime);
		}
		else {
			pw.println(totalTime - minTime);
		}
		pw.close();
	}
	public static class guard{
		int start;
		int end;
		int overlap;
		public guard(int a, int b) {
			start = a;
			end = b;
		}
	}
	public static Comparator<guard> guardCompare = new Comparator<guard>() {

		public int compare(guard s1, guard s2) {

			//ascending order
			return  (int) (s1.start - s2.start);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};

}
