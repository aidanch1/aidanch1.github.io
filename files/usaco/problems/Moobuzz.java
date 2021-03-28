package problems;

import java.io.*;
import java.util.*;

public class Moobuzz {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("moobuzz.in"));
		int n = Integer.parseInt(bf.readLine());
		//every 15 numbers, 8 numbers are said
		//int n = 4;
		int ans = (n / 8) * 15;
		int g = n % 8;
		PrintWriter pw = new PrintWriter("moobuzz.out");
		bf.close();
	   
		if (g==0) {
			pw.println(ans+14);
		}
		if (g==1) {
			pw.println(ans+1);
		}
		if (g==2) {
			pw.println(ans+2);
		}
		if (g==3) {
			pw.println(ans+4);
		}
		if (g==4) {
			pw.println(ans+7);
		}
		if (g==5) {
			pw.println(ans+8);
		}
		if (g==6) {
			pw.println(ans+11);
		}
		if (g==7) {
			pw.println(ans+13);
		}
		 pw.close();
	}

}
