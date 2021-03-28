package problems;

import java.io.*;
import java.util.*;

public class friends {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer>[] group = (ArrayList<Integer>[])new ArrayList[5];
		for (int i=0; i<5; i++) {
			group[i] = new ArrayList<Integer>();
		}
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken()) -1;
			int b = Integer.parseInt(st.nextToken()) -1;
			group[a].add(b);
			group[b].add(a);
		}
		boolean print = false;
		//PrintWriter pw = new PrintWriter("output.txt");
		o: for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				for (int p=0; p<5; p++) {
					if ((i != j && j != p && i != p) && check(i, j, p, group)) {
						System.out.println("WIN");
						print = true;
						break o;
					}
				}
			}
		}
		if (!print) {
			System.out.println("FAIL");
		}
	}
	public static boolean check(int a, int b, int c, ArrayList<Integer>[] group) {
		if (group[a].contains(b) && group[a].contains(c) && group[b].contains(c)) {
			return true;
		}
		if (!group[a].contains(b) && !group[a].contains(c) && !group[b].contains(c)) {
			return true;
		}
		return false;
	}
}
