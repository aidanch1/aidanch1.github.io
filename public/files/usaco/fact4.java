/*ID: aidanch1
LANG: JAVA
TASK: fact4
*/
import java.io.*;
import java.util.*;

public class fact4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("fact4.in"));
		int n = Integer.parseInt(bf.readLine());
		
		PrintWriter pw = new PrintWriter("fact4.out");
		pw.println(lastdig(n));
		pw.close();
	}
	
	public static int lastdig(int n) {
		if (n == 1) {
			return 1;
		}
		int a = n/5;
		int b = n%5;
		if (a == 0) {
			return (6*match(b))%10;
		}
		return (cycle(a)*lastdig(a)*match(b))%10;
	}
	public static int match(int n) {
		switch(n) {
		case 2:
			return 2;
		case 3:
			return 6;
		case 4:
			return 4;
		default:
			return 1;
		}
	}
	public static int cycle(int n) {
		int rem = n%4;
		switch (rem) {
		case 1:
			return 2;
		case 2:
			return 4;
		case 3:
			return 8;
		default:
			return 6;
		}
	}

}
