package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class LeftOut {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\leftout_silver_open19\\12.in"));
		BufferedReader bf = new BufferedReader(new FileReader("leftout.in"));
		int size = Integer.parseInt(bf.readLine());
		char[][] cows =  new char[size][size];
		for (int i=0; i<size; i++) {
			char[] row = bf.readLine().toCharArray();
			//make row always start with R
			if (row[0] == 'L') {
				for (int j=0; j<row.length;j++) {
					if (row[j] == 'L') {
						row[j] = 'R';
					}
					else {
						row[j] = 'L';
					}
				}
			}
			cows[i] = row;
		}
		/*for (int i=0; i<cows.length; i++) {
			System.out.println(Arrays.toString(cows[i]));
		}*/
		
		bf.close();
		for (int i=1; i<cows[0].length;i++) {
			//make all the columns start with R
			if (cows[0][i] == 'L') {
				for (int j=0; j<cows.length; j++) {
					if (cows[j][i] == 'L') {
						cows[j][i] = 'R';
					}
					else {
						cows[j][i] = 'L';
					}
				}
			}
		}
		/*for (int i=0; i<cows.length; i++) {
			System.out.println(Arrays.toString(cows[i]));
		}*/
		
		int rs = 0;
		int ls = 0;
		int r = 0;
		int c = 0;
		PrintWriter pw = new PrintWriter("leftout.out");
		for (int i=1; i<cows.length; i++) {
			for (int j=1; j<cows[i].length; j++) {
				if (cows[i][j] == 'R') {
					rs++;
				}
				else {
					ls++;
					r = i;
					c = j;
				}
			}
		}
		if (rs == 0) {
			pw.println("1 1");
		}
		else if (ls == 0) {
			pw.println("-1");
		}
		else if (ls == 1) {
			pw.println((r+1) + " " + (c+1));
		}
		else if(rs == 1) {
			pw.println(-1);
		}
		else if(ls == cows.length-1) {
			rowCol(cows, pw);
		}
		else {
			pw.println(-1);
		}
		pw.close();
		
	}
	public static void rowCol(char[][] a, PrintWriter pw) {
		for (int i=1; i<a.length; i++) {
			int j=1;
			while(a[i][j] == 'L') {
				j++;
				if (j == a.length) {
					pw.println(i-1 +" 0");
					return;
				}
			}
		}
		for (int i=1; i<a[0].length; i++) {
			int j=1;
			while(a[j][i] == 'L') {
				j++;
				if (j == a.length) {
					pw.println("0 " + (i-1));
					return;
				}
			}
		}
		pw.println("-1");
	}

}
