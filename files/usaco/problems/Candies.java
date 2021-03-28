package problems;

public class Candies {

	public static void main(String[] args) {
		int candies = 100000;
		int kids = 50010;
		
		int give = (candies / kids) * kids;
		candies -= (candies / kids);
		give += Math.min(candies, kids/2);
		System.out.println(give);
	}

}
