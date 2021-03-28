package problems;

import java.io.*;
import java.util.*;

public class Triangles {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("triangles.in"));
		int numPoints = Integer.parseInt(bf.readLine());
		coord[] coords = new coord[numPoints];
		HashMap<Integer, ArrayList<coord>> xGroups = new HashMap<>();
		HashMap<Integer, ArrayList<coord>> yGroups = new HashMap<>();
		for (int i=0; i<numPoints; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			coord a = new coord(x, y, i);
			coords[i] = a;
			if (xGroups.containsKey(x)){
				xGroups.get(x).add(a);
			}
			else {
				ArrayList<coord> l = new ArrayList<coord>(); 
				l.add(a);
				xGroups.put(x, l);
			}
			if (yGroups.containsKey(y)){
				yGroups.get(y).add(a);
			}
			else {
				ArrayList<coord> l = new ArrayList<coord>(); 
				l.add(a);
				yGroups.put(y, l);
			}
		}
		bf.close();
		for (int i:xGroups.keySet()) {
			Collections.sort(xGroups.get(i), coordYCompare);
			int sum = 0;
			xGroups.get(i).get(0).sumBotY = 0;
			xGroups.get(i).get(xGroups.get(i).size()-1).sumTopY = 0;
			for (int j=1; j<xGroups.get(i).size(); j++) {
				sum += j*(xGroups.get(i).get(j).y - xGroups.get(i).get(j-1).y);
				xGroups.get(i).get(j).sumBotY = sum;
				coords[xGroups.get(i).get(j).id].sumBotY = sum;
			}
			sum = 0;
			for (int j=xGroups.get(i).size()-2; j>=0; j--) {
				sum += (xGroups.get(i).size() - j - 1)*(xGroups.get(i).get(j+1).y - xGroups.get(i).get(j).y);
				xGroups.get(i).get(j).sumTopY = sum;
				coords[xGroups.get(i).get(j).id].sumTopY = sum;
			}
		}
		for (int i:yGroups.keySet()) {
			Collections.sort(yGroups.get(i), coordXCompare);
			int sum = 0;
			yGroups.get(i).get(0).sumLeftX = 0;
			yGroups.get(i).get(yGroups.get(i).size()-1).sumRightX = 0;
			for (int j=1; j<yGroups.get(i).size(); j++) {
				sum += j*(yGroups.get(i).get(j).x - yGroups.get(i).get(j-1).x);
				yGroups.get(i).get(j).sumLeftX = sum;
				coords[yGroups.get(i).get(j).id].sumLeftX = sum;
			}
			sum = 0;
			for (int j=yGroups.get(i).size()-2; j>=0; j--) {
				sum += (yGroups.get(i).size() - j - 1)*(yGroups.get(i).get(j+1).x - yGroups.get(i).get(j).x);
				yGroups.get(i).get(j).sumRightX = sum;
				coords[yGroups.get(i).get(j).id].sumRightX = sum;
			}
		}
		long sum = 0;
		for (coord i:coords) {
			//System.out.println(i);
			long topLeft = ((long)i.sumLeftX * i.sumTopY) % 1000000007;
			long botLeft = ((long)i.sumLeftX * i.sumBotY) % 1000000007;
			long topRight = ((long)i.sumRightX * i.sumTopY) % 1000000007;
			long botRight = ((long)i.sumRightX * i.sumBotY) % 1000000007;
			sum += topLeft + botLeft + topRight + botRight;
			sum %= 1000000007;
		}
		PrintWriter pw = new PrintWriter("triangles.out");
		pw.println(sum);
		pw.close();
		//System.out.println(sum);
		/*for (ArrayList<coord> i:xGroups.values()) {
			System.out.println(i);
		}
		for (ArrayList<coord> i:yGroups.values()) {
			System.out.println(i);
		}*/
		//MAKE SURE SUM IS LONG
	}
	static class coord{
		int x;
		int y;
		int id;
		int sumTopY;
		int sumBotY;
		int sumLeftX;
		int sumRightX;
		public coord(int x, int y, int id) {
			this.x = x;
			this.y = y;
			this.id = id;
		}
		@Override
		public String toString() {
			return "coord [x=" + x + ", y=" + y + ", sumTopY=" + sumTopY + ", sumBotY=" + sumBotY + ", sumLeftX="
					+ sumLeftX + ", sumRightX=" + sumRightX + "]";
		}
		
	}
	public static Comparator<coord> coordYCompare = new Comparator<coord>() {

		public int compare(coord s1, coord s2) {

			//ascending order
			return  (int) (s1.y - s2.y);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};
	public static Comparator<coord> coordXCompare = new Comparator<coord>() {

		public int compare(coord s1, coord s2) {

			//ascending order
			return  (int) (s1.x - s2.x);
			//descending order
			//return  (int) (s2.start - s1.start);
		}
	};
}
