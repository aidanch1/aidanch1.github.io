package problems;

import java.io.*;
import java.util.*;

public class CowRental {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\rental_silver_jan18\\4.in"));
		BufferedReader bf = new BufferedReader(new FileReader("rental.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int totalGal = 0;
		int[] cows = new int[n]; // stores how many gallons each cow produces
		for (int i=0; i<n; i++) {
			int t = Integer.parseInt(bf.readLine());
			cows[i] = t;
			totalGal += t;
		}
		store[] stores = new store[m];
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(bf.readLine());
			int g = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			stores[i] = new store(g,p);
		}
		int[] rentals = new int[r];
		for (int i=0; i<r; i++) {
			rentals[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(stores, storePriceCompare); // first store is best store to sell to
		Arrays.sort(cows);
		Arrays.sort(rentals);
		//try renting the worst cow, then the 2 worst cows, then 3, etc and use the max
		long maxProfit = sell(stores, totalGal);
		long rentProfit = 0;
		int stop = Math.min(rentals.length, cows.length);
		for (int i=0; i<stop; i++) {
			totalGal -= cows[i];
			long profit = sell(stores, totalGal);
			rentProfit += rentals[rentals.length-1-i];
			profit += rentProfit;
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}
		//System.out.println(maxProfit);
		PrintWriter pw = new PrintWriter("rental.out");
		pw.println(maxProfit);
		pw.close();
	}
	public static int sell(store[] s, int gal) {
		int money = 0;
		int cstore = -1;
		while (gal > 0 && cstore < s.length-1) {
			cstore++;
			money += s[cstore].gallon * s[cstore].price;
			gal -= s[cstore].gallon;
		}
		if (gal < 0) {
			money += gal * s[cstore].price;
		}
		return money;
	}
	public static class store{
		int gallon;
		int price;
		public store(int a, int b) {
			gallon = a;
			price = b;
		}
	}
	public static Comparator<store> storePriceCompare = new Comparator<store>() {

		public int compare(store s1, store s2) {

			//ascending order
			//return fruitName1.compareTo(fruitName2);
			//descending order
			return  (int) (s2.price - s1.price);
		}
	};

}
