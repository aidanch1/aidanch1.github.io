package problems;

import java.io.*;
import java.util.*;

public class Meetings {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\meetings.txt"));
		//BufferedReader bf = new BufferedReader(new FileReader("meetings.in"));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int c = Integer.parseInt(stt.nextToken());
		long length = Integer.parseInt(stt.nextToken());
		long totalWeight = 0;
		HashMap<Long, cow> cows = new HashMap<Long, cow>();
		for (int i=0; i<c; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int w = Integer.parseInt(st.nextToken());
			totalWeight += w;
			long l = Integer.parseInt(st.nextToken());
			
			int v = Integer.parseInt(st.nextToken());
			cows.put(l, new cow(w, l, v));
		}
		int restWeight = 0;
		int collide = 0;
		while (restWeight < (totalWeight+1)/2) {
			ArrayList<cow> list = new ArrayList<cow>(cows.values());
			for (cow a : list) {
				long oldloc = a.location;
				while (a.location != 0 && a.location != length && !cows.containsKey((a.location))) {
					a.location += a.velocity;
				}
				if (a.location == 0 || a.location == length) {
					restWeight += a.weight;
					cows.remove(oldloc);
				}
				else {
					a.velocity *= -1;
					//a.location += a.velocity;
					cows.get(a.location).velocity *= -1;
					cows.remove(oldloc);
					cows.put(a.location, a);
					collide++;
				}
			}
		}
		/* PrintWriter pw = new PrintWriter("meetings.out");
	    pw.println(collide);
	    pw.close();
	    bf.close(); */
		System.out.println(collide);
	}
	static class cow{
		int weight;
		long location;
		int velocity;
		public cow(int w, long l, int v) {
			weight = w;
			location = l;
			velocity = v;
		}
	}

}
