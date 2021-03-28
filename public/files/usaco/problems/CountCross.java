package problems;

import java.io.*;
import java.util.*;

public class CountCross {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\countcross.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("countcross.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		HashSet<road> roads = new HashSet<>();
		for (int i=0; i<r; i++) {
			st = new StringTokenizer(bf.readLine());
			int r1 = Integer.parseInt(st.nextToken())-1;
			int c1 = Integer.parseInt(st.nextToken())-1;
			int r2 = Integer.parseInt(st.nextToken())-1;
			int c2 = Integer.parseInt(st.nextToken())-1;
			field a = new field(r1, c1);
			field b = new field(r2, c2);
			roads.add(new road(a, b));
		}
		field[] cowLoc = new field[k];
		for (int i=0; i<k; i++) {
			st = new StringTokenizer(bf.readLine());
			int row = Integer.parseInt(st.nextToken())-1;
			int col = Integer.parseInt(st.nextToken())-1;
			cowLoc[i] = new field(row, col);
		}
		HashSet<field> visited = new HashSet<>();
		ArrayList<Integer> cowsInRegion = new ArrayList<>();
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (!visited.contains(new field(i, j))) {
					HashSet<field> region = new HashSet<>();
					region.add(new field(i, j));
					grow(region, n, roads);
					int counter = 0;
					for (field f:cowLoc) {
						if (region.contains(f)) {
							counter++;
						}
					}
					cowsInRegion.add(counter);
					visited.addAll(region);
				}
			}
		}
		int distantPairs = 0;
		for (int i=0; i<cowsInRegion.size()-1; i++) {
			for (int j=i+1; j<cowsInRegion.size(); j++) {
				distantPairs += cowsInRegion.get(i) * cowsInRegion.get(j);
			}
		}
		PrintWriter pw = new PrintWriter("countcross.out");
		pw.println(distantPairs);
		pw.close();
	}
	public static void grow(HashSet<field> region, int size, HashSet<road> roads) {
		ArrayList<field> old = new ArrayList<>(region);
		boolean added = true;
		while (added) {
			added = false;
			ArrayList<field> news = new ArrayList<>();
			for (field c:old) {
				if (c.row<size-1 && !roads.contains(new road(c, new field(c.row+1, c.column))) && 
						!roads.contains(new road(new field(c.row+1, c.column),c)) && !region.contains(new field(c.row+1, c.column))) {
					news.add(new field(c.row+1, c.column));
					region.add(new field(c.row+1, c.column));
					added = true;
				}
				if (c.row>0 && !roads.contains(new road(c, new field(c.row-1, c.column)))&& 
						!roads.contains(new road(new field(c.row-1, c.column),c))&&!region.contains(new field(c.row-1, c.column))) {
					news.add(new field(c.row-1, c.column));
					region.add(new field(c.row-1, c.column));
					added = true;
				}
				if (c.column<size-1 && !roads.contains(new road(c, new field(c.row, c.column+1)))&& 
						!roads.contains(new road(new field(c.row, c.column+1),c))&& !region.contains(new field(c.row, c.column+1))) {
					news.add(new field(c.row, c.column+1));
					region.add(new field(c.row, c.column+1));
					added = true;
				}
				if (c.column>0 && !roads.contains(new road(c, new field(c.row, c.column-1)))&& 
						!roads.contains(new road(new field(c.row, c.column-1),c))&&!region.contains(new field(c.row, c.column-1))) {
					news.add(new field(c.row, c.column-1));
					region.add(new field(c.row, c.column-1));
					added = true;
				}
			}
			old = news;
		}
	}
	public static class field{
		public int row;
		public int column;
		public field(int a, int b) {
			row = a;
			column = b;
		}
		@Override
		public boolean equals(Object a) {
			field b = (field) a;
			return b.row == row && b.column == column;
		}
		@Override
	    public int hashCode() {
	        return row*37+column;
	    }
	}
	public static class road{
		public field field1;
		public field field2;
		public road(field a, field b) {
			field1 = a;
			field2 = b;
		}
		@Override
		public boolean equals(Object a) {
			road b = (road) a;
			return (b.field1.equals(field1) && b.field2.equals(field2));
		}
		@Override
	    public int hashCode() {
	        return field1.hashCode()*28+field2.hashCode();
	    }
	}

}
