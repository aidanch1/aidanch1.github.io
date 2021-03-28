package problems;

import java.io.*;
import java.util.*;

public class CowCode {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\cowcode.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("cowcode.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String s = st.nextToken(); 
		long n = Long.parseLong(st.nextToken());
		bf.close();
		PrintWriter pw = new PrintWriter("cowcode.out");
		pw.println(index(s, n));
		pw.close();
	}
	public static char index(String s, long n) {
		if (n <= s.length()) {
			return s.charAt((int) (n-1));
		}
		long l = s.length();
		while (l < n) {
			l *= 2;
		}
		l /= 2;
		long dex =  n - l;
		if (dex == 1) {
			return index(s, l);
		}
		else {
			return index(s, n-l-1);
		}
	}

}
