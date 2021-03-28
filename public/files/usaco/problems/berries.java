package problems;

import java.io.*;
import java.util.*;

public class berries {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("berries.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("berries.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] trees = new int[n];
		st = new StringTokenizer(bf.readLine());
		for (int i=0; i<n; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(trees);
		int max = 0;
		for (int i=0; i<trees[n-1]; i++) {
			int[] copy = new int[n];
			for (int j=0; j<n; j++) {
				copy[j] = trees[j];
			}
			int t = t(i, copy, k);
			if (t > max) {
				max = t;
			}
		}
		
		PrintWriter pw = new PrintWriter("berries.out");
		pw.println(max);
		pw.close(); 
	}
	public static int t(int min, int[] trees, int b) {
		int t = b;
		int ans = 0;
		o: for (int i=0; i<trees.length; i++) {
			while (trees[i] > min) {
				trees[i] -= min;
				if (t <= b/2) {
					ans += min;
				}
				t--;
				if (t == 0) {
					return ans;
				}
			}
		}
		Arrays.sort(trees);
		int c = 0;
		while(t > 0) {
			if (t <= b/2) {
				ans += trees[trees.length-1-c];
			}
			c++;
			if (c==trees.length) {
				break;
			}
			t--;
		}
		return ans;
	}
}
