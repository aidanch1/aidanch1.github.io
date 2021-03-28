package problems;

import java.io.*;
import java.util.*;

public class Where {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\where.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("whereami.in"));
		int boxes = Integer.parseInt(bf.readLine());
		char[] color = bf.readLine().toCharArray();
		//System.out.println(Arrays.toString(color));
		//find the longest pattern that repeats and then output that+1
		PrintWriter pw = new PrintWriter("whereami.out");
	    
	    
		for (int i=color.length; i>=0; i--) {
			if (repeat(i, color)) {
				//System.out.println(i+1);
				pw.println(i+1);
				break;
			}
		}
		pw.close();
	}
	public static boolean repeat(int l, char[] c) {
		ArrayList<char[]> sequences = new ArrayList<>();
		for (int i=0; i<c.length-l+1; i++) {
			char[] seq = new char[l];
			for (int j=0; j<l; j++) {
				seq[j] = c[i+j];
			}
			sequences.add(seq);
		}
		/*for (char[] i:sequences) {
			System.out.println(Arrays.toString(i));
		}*/
		for (int i=0; i<sequences.size(); i++) {
			for (int j=i+1; j<sequences.size(); j++) {
				if (isEqual(sequences.get(i), sequences.get(j))) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean isEqual(char[] a, char[] b) {
		for (int i=0; i<a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
}
