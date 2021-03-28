package problems;

import java.io.*;
import java.util.*;

public class PresentStack {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\presents.txt"));
		int testCases = Integer.parseInt(bf.readLine());

		for (int q = 0; q < testCases; q++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(bf.readLine());
			HashMap<Integer, Integer> present = new HashMap<>();
			for (int i = 0; i < n; i++) {
				present.put(Integer.parseInt(st.nextToken()), i);
			}

			st = new StringTokenizer(bf.readLine());
			int[] send = new int[m];
			for (int i = 0; i < m; i++) {
				send[i] = present.get(Integer.parseInt(st.nextToken()));
			}

			int max = 0;
			long time = 0;
			for (int i=0; i<send.length; i++) {
				if (send[i] > max) {
					max = send[i];
					time += ((send[i] - i) * 2) + 1;
				} 
				else {
					time++;
				}
			}
			System.out.println(time);
		}

	}
}