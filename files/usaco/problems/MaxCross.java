package problems;

import java.io.*;
import java.util.*;

public class MaxCross {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\maxcross.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("maxcross.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] cross = new int[n];
		for (int i=0; i<b; i++) {
			int a = Integer.parseInt(bf.readLine());
			cross[a-1] = 1;
		}
		bf.close();
		int broken = 0;
		for (int i=0; i<k; i++) {
			broken += cross[i];
		}
		int minbroken = broken;
		for (int i=k; i<n; i++) {
			broken -= cross[i-k];
			broken += cross[i];
			if (broken < minbroken) {
				minbroken = broken;
			}
		}
		PrintWriter pw = new PrintWriter("maxcross.out");
		pw.println(minbroken);
		pw.close();
	}

}
