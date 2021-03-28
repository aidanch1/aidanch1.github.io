package problems;

import java.io.*;
import java.util.*;

public class mootube {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\mootube.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("mootube.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int[][] vids = new int[n][n];
		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(bf.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int relevance = Integer.parseInt(st.nextToken());
			vids[r - 1][c - 1] = relevance;
			vids[c - 1][r - 1] = relevance;
		}
		fill(vids);
	//	System.out.println(Arrays.deepToString(vids));
		PrintWriter pw = new PrintWriter("mootube.out");
		for (int i=0; i<q; i++) {
			st = new StringTokenizer(bf.readLine());
			int k = Integer.parseInt(st.nextToken());
			int vid = Integer.parseInt(st.nextToken())-1;
			int rec = 0;
			for (int l=0; l<vids[vid].length; l++) {
				if (vids[vid][l]>=k) {
					rec++;
				}
			}
			pw.println(rec);
		}
		pw.close();
		bf.close();
	}

	public static void fill(int[][] m) {
		for (int i=0; i<m.length; i++) {
			ArrayList<Integer> connect = new ArrayList<>();
			for (int j=0; j<m[i].length; j++) {
				if (m[i][j] > 0) {
					connect.add(j);
				}
			}
			if (connect.size()>=2) {
				for (int f=0; f<connect.size()-1; f++) {
					for (int g=f+1; g<connect.size(); g++) {
						int nodeA = connect.get(f);
						int nodeB = connect.get(g);
						if (m[nodeA][nodeB] == 0) {
							int rev =  Math.min(m[i][nodeA], m[i][nodeB]);
							m[nodeA][nodeB] = rev;
							m[nodeB][nodeA] = rev;
						}
					}
				}
			}
			
		}
	}

}
