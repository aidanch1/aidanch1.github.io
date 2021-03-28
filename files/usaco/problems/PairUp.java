package problems;

import java.io.*;
import java.util.*;

public class PairUp {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("pairup.in"));
		int n = Integer.parseInt(bf.readLine());
		cow[] cows = new cow[n];
		int total = 0;
		for (int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int num = Integer.parseInt(st.nextToken());
			int output = Integer.parseInt(st.nextToken());
			cows[i] = new cow(num, output);
			total += num;
		}
		bf.close();
		Arrays.sort(cows, cowCompare);
		int left = 0;
		int lc = 0;
		int right = n-1;
		int rc = 0;
		int max = 0;
		for (int i=0; i<total/2; i++) {
			if (cows[left].output + cows[right].output > max) {
				max = cows[left].output + cows[right].output;
			}
			lc++;
			rc++;
			if (lc == cows[left].number) {
				lc = 0;
				left++;
			}
			if (rc == cows[right].number) {
				rc = 0;
				right--;
			}
		}
		PrintWriter pw = new PrintWriter("pairup.out");
		pw.println(max);
		pw.close();
	}
	public static class cow{
		int number;
		int output;
		public cow(int a, int b) {
			number = a;
			output = b;
		}
	}
	public static Comparator<cow> cowCompare = new Comparator<cow>() {

		public int compare(cow s1, cow s2) {

			//ascending order
			return  (int) (s1.output - s2.output);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};

}
