package problems;

import java.io.*;
import java.util.*;

public class Gymnastics {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\gymnastics.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("gymnastics.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[][] c = new int[k][n];
		for (int i=0; i<k; i++) {
			StringTokenizer stt = new StringTokenizer(bf.readLine());
			for (int j=0; j<n; j++) {
				c[i][j] = Integer.parseInt(stt.nextToken())-1;
			}
		}
		bf.close();
		int pairs = 0;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (checkConsistent(i, j, c) || checkConsistentB(i,j,c)) {
					pairs++;
				}
			}
		}
		PrintWriter pw = new PrintWriter("gymnastics.out");
	    pw.println(pairs);
	    pw.close();
		//System.out.println(pairs);
	}
	public static boolean checkConsistent(int a, int b, int[][] c) {
		for (int i=0; i<c.length; i++) {
			boolean founda = false;
			boolean foundb = false;
			for (int j=0; j<c[i].length; j++) {
				if (c[i][j] == a) {
					founda = true;
				}
				else if (c[i][j] == b) {
					foundb = true;
				}
				if (foundb && !founda) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean checkConsistentB(int a, int b, int[][] c) {
		for (int i=0; i<c.length; i++) {
			boolean founda = false;
			boolean foundb = false;
			for (int j=0; j<c[i].length; j++) {
				if (c[i][j] == a) {
					founda = true;
				}
				else if (c[i][j] == b) {
					foundb = true;
				}
				if (!foundb && founda) {
					return false;
				}
			}
		}
		return true;
	}
}
