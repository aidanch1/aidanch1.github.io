package problems;

import java.io.*;
import java.util.*;

public class MilkvisitsREMASTERED {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\milkvisits_silver_dec19\\1.in"));
		BufferedReader bf = new BufferedReader(new FileReader("milkvisits.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[] milk = bf.readLine().toCharArray();
		farm[] farms = new farm[n];
		for (int i=0; i<n; i++) {
			farms[i] = new farm(milk[i], i);
		}
		for (int i=0; i<n-1; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			if (farms[a].milk == farms[b].milk) {
				farms[a].group.addAll(farms[b].group);
				farms[b].group = farms[a].group;
			}
		}
		PrintWriter pw = new PrintWriter("milkvisits.out");
		for (int i=0; i<m; i++) {
		    st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken())-1;
			int e = Integer.parseInt(st.nextToken())-1;
			char like = st.nextToken().charAt(0);
			if (!farms[s].group.contains(e)) {
				pw.print(1);
				//System.out.print(1);
			}
			else if (farms[s].group.contains(e) && farms[s].milk == like) {
				pw.print(1);
				//System.out.print(1);
			}
			else {
				pw.print(0);
				//System.out.print(0);
			}
		}
		pw.close();
		bf.close();
	}
	public static class farm{
		char milk;
		HashSet<Integer> group = new HashSet<>();
		public farm(char a, int b) {
			milk = a;
			group.add(b);
		}
	}

}
