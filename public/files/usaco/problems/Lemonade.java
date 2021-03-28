package problems;

import java.io.*;
import java.util.*;

public class Lemonade {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\lemonade.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("lemonade.in"));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] wait = new int[n];
		for (int i=0; i<n; i++) {
			wait[i] = Integer.parseInt(st.nextToken());
		}
		bf.close();
		Arrays.sort(wait);
		PrintWriter pw = new PrintWriter("lemonade.out");
		boolean print = false;
		o: for (int i=0; i<wait.length; i++) {
			if (wait[wait.length-i-1] < i) {
				pw.println(i);
				print = true;
				break o;
			}
		}
		if (!print) {
			pw.print(n);
		}
		pw.close();
	}

}
