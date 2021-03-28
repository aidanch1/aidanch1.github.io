package problems;

import java.io.*;
import java.util.*;

public class Wormsort {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\wormsort.txt"));
		//BufferedReader bf = new BufferedReader(new FileReader("wormsort.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//binary search for width, for every try merge stuff and then if each index contains itself in its merged list then its possible
		int ncows = Integer.parseInt(st.nextToken());
		int nholes = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		spot[] cows = new spot[ncows];
		for (int i=0; i<ncows; i++) {
			cows[i] = new spot(Integer.parseInt(st.nextToken()), i);
		}
		hole[] holes = new hole[nholes];
		for (int i=0; i<nholes; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			int w = Integer.parseInt(st.nextToken());
			holes[i] = new hole(a, b, w);
		}
		int min = 0;
		int max = 1000000001;
		while (min < max) {
			int middle = (min + max + 1) / 2;
			if (possible(middle, cows, holes)) {
				min = middle;
			}
			else {
				max = middle - 1;
			}
		}
		System.out.println(min);
	}
	public static boolean possible(int width, spot[] spots, hole[] holes) {
		for (int i=0; i<holes.length; i++) {
			if (holes[i].w >= width) {
				spots[holes[i].a].group.addAll(spots[holes[i].b].group);
				spots[holes[i].b].group = spots[holes[i].a].group;
			}
		}
		for (int i=0; i<spots.length; i++) {
			if (!(spots[i].group.contains(spots[i].cow))) {
				return false;
			}
		}
		return true;
	}
	public static class spot{
		int cow;
		HashSet<Integer> group = new HashSet<>();
		public spot(int a, int b) {
			cow = a;
			group.add(b);
		}
	}
	public static class hole{
		int a, b, w;
		public hole(int a, int b, int w) {
			this.a = a;
			this.b = b;
			this.w = w;
		}
	}
}
