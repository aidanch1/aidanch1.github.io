package problems;

import java.io.*;
import java.util.*;

public class HPS {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\hps.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("hps.in"));
		int n = Integer.parseInt(bf.readLine());
		int h = 0;
		int p = 0;
		int s = 0;
		track[] seq = new track[n];
		for (int i=0; i<n; i++) {
			char t = bf.readLine().charAt(0);
			if (t == 'H') {
				h++;
			}
			else if (t == 'P') {
				p++;
			}
			else {
				s++;
			}
			seq[i] = new track(h,p,s);
		}
		bf.close();
		int maxWin = 0;
		for (int i=0; i<n; i++) {
			int tWin = Math.max(Math.max(seq[i].h, seq[i].p), seq[i].s) + 
					Math.max(Math.max(h-seq[i].h, p-seq[i].p), s-seq[i].s);
			if (tWin>maxWin) {
				maxWin = tWin;
			}
		}
		//System.out.println(maxWin);
		PrintWriter pw = new PrintWriter("hps.out");
		pw.println(maxWin);
		pw.close();
	}
	public static class track{
		int h;
		int p; 
		int s;
		public track(int a, int b, int c) {
			h = a;
			p = b;
			s= c;		
		}
	}

}
