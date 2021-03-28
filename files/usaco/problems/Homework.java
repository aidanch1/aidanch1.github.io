package problems;

import java.io.*;
import java.util.*;

public class Homework {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\homework.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("homework.in"));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] scores = new int[n];
		int total = 0;
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			scores[i] = a;
			total += a;
		}
		int[] min = new int[n-2];
		int cmin = Math.min(scores[n-1], scores[n-2]);
		for (int i=n-2; i>0; i--) {
			min[i-1] = Math.min(scores[i], cmin);
		}
		double maxScore = 0;
		ArrayList<Integer> k = new ArrayList<>();
		for (int i=0; i<min.length; i++) {
			total -= scores[i];
			double p = (total - min[i]) / (double) (n-i-2);
			if (p > maxScore) {
				maxScore = p;
				k.clear();
				k.add(i+1);
			}
			else if (p == maxScore) {
				k.add(i+1);
			}
		}
		PrintWriter pw = new PrintWriter("homework.out");
		for (int i:k) {
			pw.println(i);
		}
		pw.close();
	}

}
