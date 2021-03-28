package problems;

import java.io.*;
import java.util.*;

public class MilkMeasurement {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\measurement_silver_dec17\\3.in"));
		//BufferedReader bf = new BufferedReader(new FileReader("measurement.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int initial = Integer.parseInt(st.nextToken());
		measurement[] measure = new measurement[n];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = 0;
			String s = st.nextToken();
			if (s.charAt(0) == '+') {
				c = Integer.parseInt(s.substring(1));
			}
			else {
				c = Integer.parseInt(s);
			}
			measure[i] = new measurement(a, b, c);
		}
		bf.close();
		Arrays.sort(measure, measureCompare);
		HashMap<Integer, Integer> cows = new HashMap<Integer, Integer>();
		int max = initial;
		int change = 0;
		for (int i=0; i<measure.length; i++) {
			if (!cows.containsKey(measure[i].cowID)) {
				cows.put(measure[i].cowID, initial + measure[i].change);
				if (initial == max && measure[i].change > 0) {
					change++;
					max = initial + measure[i].change;
				}
				else if (initial == max && measure[i].change < 0) {
					change++;
				}
				else if (initial + measure[i].change >= max) {
					max = initial + measure[i].change;
					change++;
				}
			}
			else {
				int prev = cows.get(measure[i].cowID);
				cows.put(measure[i].cowID, prev + measure[i].change);
				if (prev == max && measure[i].change > 0) {
					if (Collections.frequency(cows.values(), prev)>0) {
						change++;
					}
					max = prev + measure[i].change;
				}
				else if (prev == max && measure[i].change < 0) {
					int t = 0;
					int am = 0;
					for (int j:cows.values()) {
						if (j > t) {
							t = j;
							am = 1;
						}
						if (j == t) {
							am++;
						}
					}
					if (am > 1 || t != cows.get(measure[i].cowID)) {
						change++;
					}
					max = Math.max(t, initial);
				}
				else if (prev + measure[i].change >= max) {
					change++;
					max = prev + measure[i].change;
				}
				
			}
		}
		/*PrintWriter pw = new PrintWriter("measurement.out");
		pw.println(change);
		pw.close();*/
		System.out.println(change);
	}
	public static class measurement{
		int day;
		int cowID;
		int change;
		public measurement(int a, int b, int c) {
			day = a;
			cowID = b;
			change = c;
		}
	}
	public static Comparator<measurement> measureCompare = new Comparator<measurement>() {

		public int compare(measurement s1, measurement s2) {

			//ascending order
			return  (int) (s1.day - s2.day);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};

}
