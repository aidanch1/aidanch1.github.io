package problems;

import java.io.*;
import java.util.*;

public class Swaps {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("swap.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int numSwaps = Integer.parseInt(st.nextToken());
		long krepeats = Integer.parseInt(st.nextToken());
		int[] old = new int[n];
		int[] neww = new int[n];
		for (int i = 0; i < old.length; i++) {
			old[i] = i;
			neww[i] = i;
		}
		for (int i = 0; i < numSwaps; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			swap(s, e, neww);
		}
		bf.close();
		ArrayList<ArrayList<Integer>> cycles = new ArrayList<>();
		HashSet<Integer> used = new HashSet<>();
		for (int i = 0; i < neww.length; i++) {
			if (!used.contains(i)) {
				ArrayList<Integer> cycle = new ArrayList<>();
				cycle.add(i);
				used.add(i);
				int cur = i;
				while (neww[cur] != i) {
					cur = neww[cur];
					cycle.add(cur);
					used.add(cur);
				}
				cycles.add(cycle);
			}
		}
		/*System.out.println(Arrays.toString(old));
		System.out.println(Arrays.toString(neww));
		for (ArrayList<Integer> i : cycles) {
			System.out.println(i);
		}*/
		int[] finish = new int[n];
		for (ArrayList<Integer> i : cycles) {
			long it = krepeats % i.size();
			for (int j=0; j<i.size(); j++) {
				finish[i.get(j)] = i.get((int) ((j+it)%i.size()));
			}
		}
		PrintWriter pw = new PrintWriter("swap.out");
		for (int i:finish) {
			//System.out.println(i+1);
			pw.println(i+1);
		}
		pw.close();
	}

	public static void swap(int s, int e, int[] a) {
		for (int i = 0; i < (e - s) / 2 + 1; i++) {
			int t = a[e - i];
			a[e - i] = a[s + i];
			a[s + i] = t;
		}
	}

}
