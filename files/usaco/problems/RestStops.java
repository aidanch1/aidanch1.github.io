package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class RestStops {

	public static void main(String[] args) throws IOException {
		//prioritize the tastiest grass until Bessie has to leave
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\reststops_silver_feb18\\10.in"));
		StringTokenizer s = new StringTokenizer(bf.readLine());
		int length = Integer.parseInt(s.nextToken());
		int rstops = Integer.parseInt(s.nextToken());
		int rf = Integer.parseInt(s.nextToken()); // 4 seconds per meter
		int rb = Integer.parseInt(s.nextToken());
		Rest[] stops = new Rest[rstops];
		for (int i=0; i<rstops; i++) {
			s = new StringTokenizer(bf.readLine());
			long l = Integer.parseInt(s.nextToken());
			long t = Integer.parseInt(s.nextToken());
			stops[i] = new Rest(l, t);
		}
		bf.close();
		//sort rest stops by tastiness
		Arrays.sort(stops, RestStopCompare);
		long maxTasty = (stops[0].location * rf - stops[0].location * rb) * stops[0].taste;
		//get rid of any rest stops that are less tasty and before the tastier ones
		long loc = stops[0].location;
		for (int i=1; i<stops.length; i++) {
			if (stops[i].location>loc) {
				//calculate
				long distance = stops[i].location-loc;
				maxTasty += (distance*rf - distance*rb) * stops[i].taste;
				//new location
				loc = stops[i].location;
			}
		}
		System.out.println(maxTasty);
		BufferedReader bfout = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\reststops_silver_feb18\\10.out"));
		System.out.println(bfout.readLine());
		bfout.close();
	}
	public static class Rest{
		long location;
		long taste;
		public Rest(long a, long b) {
			location = a;
			taste = b;
		}
	}
	public static Comparator<Rest> RestStopCompare = new Comparator<Rest>() {

		public int compare(Rest r1, Rest r2) {

			//ascending order
			//return fruitName1.compareTo(fruitName2);
			//descending order
			return  (int) (r2.taste - r1.taste);
		}
	};
}
