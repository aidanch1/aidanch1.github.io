/*ID: aidanch1
LANG: JAVA
TASK: zerosum
*/
import java.io.*;
import java.util.*;

public class zerosum {
	/*
	 * brute force all possible combinations of +, -, and ' ', check if they work, 3^8 = 6561 so this is easily possible
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("zerosum.in"));
		int n = Integer.parseInt(bf.readLine());
		op[] ops = new op[n-1];
		ArrayList<char[]> z = new ArrayList<char[]>();
		z.add(new char[] {'+'});
		z.add(new char[] {'-'});
		z.add(new char[] {' '});
		ops[0] = new op(z);
		for (int i=1; i<ops.length; i++) {
			ArrayList<char[]> t = new ArrayList<char[]>();
			for (char[] c:ops[i-1].op) {
				char[] tc1 = new char[i+1];
				char[] tc2 = new char[i+1];
				char[] tc3 = new char[i+1];
				for (int j=0; j<c.length; j++) {
					tc1[j] = c[j];
					tc2[j] = c[j];
					tc3[j] = c[j];
				}
				tc1[i] = '+';
				tc2[i] = '-';
				tc3[i] = ' ';
				t.add(tc1);
				t.add(tc2);
				t.add(tc3);
			}
			ops[i] = new op(t);
		}
		ArrayList<String> ans = new ArrayList<String>();
		for (char[] i:ops[n-2].op) {
			StringBuilder eq = new StringBuilder();
			for (int j=0; j<i.length; j++) {
				eq.append((j+1) + " " + i[j] + " ");
			}
			eq.append((i.length+1));
			String eqq = eq.toString();
			if (calc(eqq)== 0) {
				ans.add(eqq);
			}
		}
		Collections.sort(ans);
		PrintWriter pw = new PrintWriter("zerosum.out");
		for (String s:ans) {
			s = s.replaceAll("   ", " ");
			s = s.replaceAll(" \\+ ", "\\+");
			s = s.replaceAll(" \\- ", "\\-");
			pw.println(s);
		}
		pw.close();
	}
	public static int calc(String eq) {
		eq = eq.replaceAll("   ", "");
		eq = eq.replaceAll("\\+ ", "");
		eq = eq.replaceAll("\\- ", "\\-");
		StringTokenizer st = new StringTokenizer(eq);
		int sum = 0;
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		return sum;
	}
	static class op{
		ArrayList<char[]> op;
		public op(ArrayList<char[]> a) {
			op = a;
		}
	}

}
