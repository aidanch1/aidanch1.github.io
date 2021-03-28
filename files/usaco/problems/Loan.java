package problems;

import java.io.*;
import java.util.*;

public class Loan {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\loan_silver_jan20\\2.in"));
		BufferedReader bf = new BufferedReader(new FileReader("loan.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long owe = Long.parseLong(st.nextToken());
		long days = Long.parseLong(st.nextToken());
		long min = Long.parseLong(st.nextToken());
		bf.close();
		PrintWriter pw = new PrintWriter("loan.out");
		if (days == 1) {
			pw.println(1);
		}
		else {
			long left = 1;
			long right = owe/min;
			while (left < right) {
				long middle = (left + right + 1) / 2;
				if(possible(middle, owe, days, min)) {
					left = middle;
				}
				else {
					right = middle - 1;
				}
			} 
			pw.println(left);
			
		} 
		pw.close();
		//PrintWriter pw = new PrintWriter("loan.out");
		//pw.close();
	}
	public static boolean possible(long x, long owe, long days, long min) {
		/*long given = 0;
		long d = 0;
		while ((owe-given)/x > min) {
			long wG = (owe-given)/x;
			given += wG;
			d++;
			if (wG * days-d < owe-given) {
				return false;
			}
		}
		d += (owe-given)/min;
		if (owe % min > 0) {
			d++;
		}
		return d <= days;*/
		long g = 0;
		while(days > 0 && g < owe) {
			long y = (owe - g) / x;
			if(y < min) {
			   long leftover = (owe-g + min-1) / min;
			   return leftover <= days;
			  }
			    long maxmatch = owe - x*y;
			    long numdays = (maxmatch - g) / y + 1;
			    if(numdays > days) numdays = days;
			    g += y * numdays;
			    days -= numdays;
			  }
			  return g >= owe;
	}
}
