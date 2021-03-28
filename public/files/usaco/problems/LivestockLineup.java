package problems;

import java.io.*;
import java.util.*;

public class LivestockLineup {
	static ArrayList<String> pos = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\lineup.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("lineup.in"));
		int n = Integer.parseInt(bf.readLine());
		String[] groups = {"Beatrice","Belinda","Bella","Bessie","Betsy","Blue","Buttercup","Sue"};
		String a = "";
		perm(groups, a);
		String[] conditions = new String[n];
		for (int i=0; i<n; i++) {
			String cond = bf.readLine();
			String name1 = cond.substring(0, cond.indexOf(" "));
			String name2 = cond.substring(cond.lastIndexOf(" ")+1);
			conditions[i] = name1 + " " + name2;
		}
		bf.close();
		PrintWriter pw = new PrintWriter("lineup.out");
		for (String i:pos) {
			if (check(i,conditions)) {
				StringTokenizer stt = new StringTokenizer(i);
				while(stt.hasMoreTokens()) {
				pw.println(stt.nextToken());
				}
				break;
			}
		}
		pw.close();
	}
	public static boolean check(String a, String[] c) {
		for (String i:c) {
			String name1 = i.substring(0, i.indexOf(" "));
			String name2 = i.substring(i.lastIndexOf(" ")+1);
			if (!(a.indexOf(name1)-a.indexOf(name2) == name2.length()+1) && !(a.indexOf(name2)-a.indexOf(name1) == name1.length()+1)) {
				return false;
			}
		}
		return true;
	}
	public static void perm(String[] a, String b){
		if (a.length == 1) {
			pos.add(b + a[0]);
			return;
		}
		for (int i=0; i<a.length; i++) {
			String bb = b + a[i] + " ";
			String[] rem = new String[a.length-1];
			int in = 0;
			for (int j=0; j<a.length; j++) {
				if (j != i) {
					rem[in] = a[j];
					in++;
				}
			}
			perm(rem, bb);
		}
	}
}
