package problems;

import java.io.*;
import java.util.*;

public class cereal {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\cereal.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("cereal.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // number of cows
		int m = Integer.parseInt(st.nextToken()); // number of cereals
		
		cow[] line = new cow[n];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			line[i] = new cow(a, b);
		}
		int[] cereal = new int[m];
		Arrays.fill(cereal, -1);
		int ans = 0;
		int[] ret = new int[n];
		
		for (int i=n-1; i>=0; i--) {
			//add cow n
			cow toAdd = line[i];
			if(cereal[toAdd.a] == -1) {
				cereal[toAdd.a] = i;
				ans++;
			}
			else {
				int c = cereal[toAdd.a];
				cereal[toAdd.a] = i;
				cow next = line[c];
				while (true) {
					if (cereal[next.b] == -1) {
						cereal[next.b] = c;
						ans++;
						break;
					}
					else {
						if (cereal[next.b] < c) {
							break;
						}
						else {
							int t = cereal[next.b];
							cereal[next.b] = c;
							c = t;
							next = line[c];
						}
					}
				}
			}
			ret[i] = ans;
		}
		PrintWriter pw = new PrintWriter("cereal.out");
		for (int i:ret) {
			pw.println(i);
		}
		pw.close(); 
	}
	static class cow{
		int a;
		int b;
		public cow(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

}
