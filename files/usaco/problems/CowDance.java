package problems;

import java.io.*;
import java.util.*;

public class CowDance {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\cowdance.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("cowdance.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] d = new int[n];
		for (int i=0; i<n; i++) {
			d[i] = Integer.parseInt(bf.readLine());
		}
		bf.close();
		boolean printed = false;
		PrintWriter pw = new PrintWriter("cowdance.out");
		for (int k=1; k<=n; k++) {
			PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(); // top node is the time when next cow will stop dancing
			int time = 0;
			boolean uTime = true;
			for (int i=0; i<n; i++) {
				if (pQ.size() == k) {
					time = pQ.poll();
				}
				if (time + d[i] > t) {
					uTime = false;
					break;
				}
				pQ.add(time + d[i]);
			}
			if (uTime) {
				pw.println(k);
				break;
			}
		}
		pw.close();

	}

}
