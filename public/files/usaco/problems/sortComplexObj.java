package problems;

import java.util.Arrays;
import java.util.Comparator;

public class sortComplexObj {

	public static void main(String[] args) {
		Coordinate[] p = new Coordinate[3];
		p[0] = new Coordinate(3,5);
		p[1] = new Coordinate(5,1);
		p[2] = new Coordinate (2, 9);
		Arrays.sort(p, new SortX());
		
		System.out.println(Arrays.toString(p));
	}
	
}
class Coordinate{
	public int x;
	public int y;
	public Coordinate(int a, int b) {
		x = a;
		y = b;
	}
	@Override
	public String toString() {
		return "("+ x + ", " + y+")";
	}
}
class SortX implements Comparator<Coordinate>{
	@Override
	public int compare(Coordinate a, Coordinate b) {
		// TODO Auto-generated method stub
		return a.x-b.x;
	}
	
}