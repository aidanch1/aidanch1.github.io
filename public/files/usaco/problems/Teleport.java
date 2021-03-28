package problems;

import java.io.*;
import java.util.*;

public class Teleport {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\teleport_silver_feb18\\3.in"));
		//BufferedReader bf = new BufferedReader(new FileReader("teleport.in"));
		int manurePiles = Integer.parseInt(bf.readLine());
		//manure[] m = new manure[manurePiles];
		ArrayList<manure> m = new ArrayList<>();
		long dist = 0;
		for (int i=0; i<manurePiles; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (Math.abs(a-b)<Math.abs(a-0)) {
				dist += Math.abs(a-b);
			}
			else {
				m.add(new manure(a, b));
			}
		}
		long minDist = Long.MAX_VALUE;
		for (int i=0; i<m.size(); i++) {
			long p = dist(m, m.get(i).end);
			if (p<minDist) {
				minDist = p;
			}
		}
		System.out.println(minDist + dist);
		BufferedReader bfout = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\teleport_silver_feb18\\3.out"));
		System.out.println(bfout.readLine());
		/*PrintWriter pw = new PrintWriter("teleport.out");
		pw.println(minDist + dist);
		pw.close();*/
	}
	public static long dist(ArrayList<manure> a, int y) {
		long d = 0;
		for (manure i:a) {
			int not = Math.abs(i.start-i.end);
			int t = Math.abs(i.start-0) + Math.abs(y-i.end);
		//	int ot = Math.abs(i.start-y) + Math.abs(0-i.end);
			d += Math.min(t, not);
		}
		return d;
	}
	static class manure {
		int start;
		int end;
		public manure(int a, int b) {
			start = a;
			end = b;
		}
	}

}
