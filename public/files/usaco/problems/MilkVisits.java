package problems;

import java.io.*;
import java.util.*;

public class MilkVisits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\milkvisits.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("milkvisits.in"));
		StringTokenizer stt = new StringTokenizer(bf.readLine());
		int farms = Integer.parseInt(stt.nextToken());
		int friends = Integer.parseInt(stt.nextToken());
		char[] milktype = bf.readLine().toCharArray();
		HashSet<HashSet<Integer>> hPaths = new HashSet<>();
		HashSet<HashSet<Integer>> gPaths = new HashSet<>();
		for (int i=0; i<farms-1; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			if (milktype[b] == 'H' && milktype[a]=='H') {
				boolean added = false;
				for (HashSet<Integer> j:hPaths) {
					if (j.contains(a) && !j.contains(b)) {
						j.add(b);
						added = true;
						break;
					}
					else if (j.contains(b) && !j.contains(a)) {
						j.add(a);
						added = true;
						break;
					}
				}
				if (!added) {
					HashSet<Integer> tp = new HashSet<>();
					tp.add(a);
					tp.add(b);
					hPaths.add(tp);
				}
			}
			else if (milktype[b] == 'G' && milktype[a]=='G') {
				boolean added = false; 
				for (HashSet<Integer> j:gPaths) {
					if (j.contains(a) && !j.contains(b)) {
						j.add(b);
						added = true;
						break;
					}
					else if (j.contains(b) && !j.contains(a)) {
						j.add(a);
						added = true;
						break;
					}
				}
				if (!added) {
					HashSet<Integer> tp = new HashSet<Integer>();
					tp.add(a);
					tp.add(b);
					gPaths.add(tp);
				}
			}
		}
		PrintWriter pw = new PrintWriter("milkvisits.out");
		for (int i=0; i<friends; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			char milk = st.nextToken().charAt(0);
			boolean printed = false;
			if (start == end) {
				if (milk == 'H') {
					if (milktype[start] == 'H') {
						//System.out.print(1);
						printed = true;
						pw.print(1);
					}
					else {
						//System.out.print(0);
						printed = true;
						pw.print(0);
					}
				}
				else {
					if (milktype[start] == 'G') {
						//System.out.print(1);
						printed = true;
						pw.print(1);
					}
					else {
						pw.print(0);
						//System.out.print(0);
						printed = true;
					}
				}
			}
			
			if (milk == 'H') {
				for (HashSet<Integer> j:gPaths) {
					if (j.contains(start) && j.contains(end)) {
						pw.print(0);
						//System.out.print(0);
						printed = true;
						break;
					}
				}
			}
			else if (milk == 'G') {
				for (HashSet<Integer> j:hPaths) {
					if (j.contains(start) && j.contains(end)) {
						//System.out.print(0);
						pw.print(0);
						printed = true;
						break;
					}
				}
			}
			if(!printed) {
				//System.out.print(1);
				pw.print(1);
			}
		}
		bf.close();
		pw.close();
	}

}
