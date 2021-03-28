package problems;

import java.io.*;
import java.util.*;

public class TheGreatRevegetation {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\revegetate_silver_feb19\\2.in"));
		StringTokenizer s = new StringTokenizer(bf.readLine());
		int areas = Integer.parseInt(s.nextToken());
		int c = Integer.parseInt(s.nextToken());
		
		land[] pastures = new land[areas];
		for (int i=0; i<areas; i++) {
			pastures[i] = new land();
		}
		for (int i=0; i<c;i++) {
			StringTokenizer cow = new StringTokenizer(bf.readLine());
			cow.nextToken();
			int a = Integer.parseInt(cow.nextToken())-1;
			int b = Integer.parseInt(cow.nextToken())-1;
			if (pastures[b].id + pastures[a].id == -2) {
				pastures[a].id = a;
				pastures[b].id = a;
				pastures[a].group.add(a);
				pastures[a].group.add(b);
			}
			else if (pastures[b].id == -1 && pastures[a].id>-1) {
				pastures[b].id = pastures[a].id;
				pastures[pastures[a].id].group.add(b);
			}
			else if (pastures[a].id == -1 && pastures[b].id>-1) {
				pastures[a].id = pastures[b].id;
				pastures[pastures[b].id].group.add(a);
			}
			else if (pastures[b].id > -1 && pastures[a].id>-1 && pastures[a].id != pastures[b].id) {
				int t = pastures[a].id;
				for (int j:pastures[pastures[a].id].group) {
					pastures[j].id = pastures[b].id;
					pastures[pastures[b].id].group.add(j);
				}
				pastures[t].group.clear();
			}
		}
		bf.close();
		//PrintWriter pw = new PrintWriter("C:\\Users\\xinchen\\Downloads\\revegetate_silver_feb19\\9output.txt");
		//pw.print(1);
		System.out.print(1);
		for (land i:pastures) {
			if (i.group.size()>0 || i.id == -1) {
				System.out.print(0);
			}
			//System.out.println(i.group);
		}
		//pw.close();
		System.out.println();
		
		BufferedReader bfout = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\revegetate_silver_feb19\\2.out"));
		System.out.println(bfout.readLine());
		bfout.close();
	}
	public static class land {
		int id = -1;
		ArrayList<Integer> group = new ArrayList<>();
	}
}
