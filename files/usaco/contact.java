/*ID: aidanch1
LANG: JAVA
TASK: contact
*/
import java.io.*;
import java.util.*;

public class contact {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("contact.in"));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken()); // min length of pattern
		int b = Integer.parseInt(st.nextToken()); // max length of pattern
		int n = Integer.parseInt(st.nextToken()); // number of frequencies to output
		HashMap<String, counter> pattern = new HashMap<String, counter>();
		
		StringBuilder seq = new StringBuilder();
		String line = bf.readLine();
		while (line != null) {
			seq.append(line);
			line = bf.readLine();
		}
		for (int i=a; i<=b; i++) {
			for (int j=0; j<=seq.length()-i; j++) {
				String p = seq.substring(j, j+i);
				pattern.putIfAbsent(p, new counter(0));
				pattern.get(p).increment();
			}
		}
		f[] freq = new f[pattern.size()];
		int cf = 0;
		for (Map.Entry<String, counter> entry:pattern.entrySet()) {
			freq[cf] = new f(entry.getValue().intValue(), entry.getKey());
			cf++;
		}
		
		Arrays.sort(freq, fcompare);
		
		PrintWriter pw = new PrintWriter("contact.out");
		pw.println(freq[0].frequency);
		pw.print(freq[0].pattern);
		int curfreq = 1;
		int freqsout = 1;
		for (int i=1; i<freq.length; i++) {
			if (freq[i].frequency == freq[i-1].frequency) {
				if (curfreq % 6 == 0) {
					pw.print("\n" + freq[i].pattern);
				}
				else {
					pw.print(" " + freq[i].pattern);
				}
				curfreq++;
			}
			else {
				freqsout++;
				if (freqsout > n) {
					break;
				}
				pw.println("\n" + freq[i].frequency);
				pw.print(freq[i].pattern);
				curfreq = 1;
			}
		}
		pw.println();
		pw.close();
	}
	public static Comparator<f> fcompare = new Comparator<f>() {

		public int compare(f s1, f s2) {

			//ascending order
			//return  (int) (s1.start - s2.start);
			//descending order
			if (s2.frequency==s1.frequency) {
				if (s2.pattern.length()==s1.pattern.length()) {
					return Integer.parseInt(s1.pattern, 2) - Integer.parseInt(s2.pattern, 2);
				}
				return s1.pattern.length()-s2.pattern.length();
			}
			return  (int) (s2.frequency - s1.frequency);
		}
	};

}
class f{
	int frequency;
	String pattern;
	public f(int a, String b) {
		frequency = a;
		pattern = b;
	}
	public String toString() {
		return frequency + ": " + pattern;
	}
}
class counter{
	int count;
	public counter(int a) {
		count = a;
	}
	public void increment(){
		count++;
	}
	public int intValue() {
		return count;
	}
} 
