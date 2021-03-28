package problems;

import java.io.*;
import java.util.*;

public class helpcross {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\helpcross.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("helpcross.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] chickens = new int[c];
		cow[] cows = new cow[n];
		for (int i=0; i<c; i++) {
			chickens[i] = Integer.parseInt(bf.readLine());
		}
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			cows[i] = new cow(s, e);
		}
		bf.close();
		Arrays.sort(chickens);
		Arrays.sort(cows, cowCompare);
		HashSet<Integer> takenCow = new HashSet<>();
		for (int i=0; i<chickens.length; i++) {
			for (int j=0; j<cows.length; j++) {
				if (!takenCow.contains(j) && cows[j].start<=chickens[i] && cows[j].end>=chickens[i]) {
					takenCow.add(j);
					break;
				}
			}
		}
		PrintWriter pw = new PrintWriter("helpcross.out");
		pw.println(takenCow.size());
		pw.close();
	}
	public static class cow{
		int start;
		int end;
		public cow(int a, int b) {
			start = a;
			end = b;
		}
	}
	public static Comparator<cow> cowCompare = new Comparator<cow>() {

		public int compare(cow s1, cow s2) {

			//ascending order
			return  (int) (s1.end - s2.end);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};

}
