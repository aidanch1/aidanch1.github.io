/*ID: aidanch1
LANG: JAVA
TASK: concom
*/
import java.io.*;
import java.util.*;

public class concom {
	/*
	 * basically brute force, for every company i find all companies j that it owns by merging, i.e if it owns j, then add everything j owns to what i owns
	 * now that i owns everything j owns, go through all of what i owns again to see if it owns any new stuff
	 * when i owns nothing new, then go through everything i owns and if i owns > 50, then add that to a list of answers
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\concom.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("concom.in"));
		int numTriple = Integer.parseInt(bf.readLine());
		company[] companies = new company[100];
		for (int i=0; i<100; i++) {
			companies[i] = new company();
		}
		for (int i=0; i<numTriple; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int p = Integer.parseInt(st.nextToken());
			companies[a].control.put(b, p);
		}
		PrintWriter pw = new PrintWriter("concom.out");
		for (int i=0; i<100; i++) {
			ArrayList<Integer> c = find(i, companies);
			Collections.sort(c);
			for (int j:c) {
				if (j != i) {
					pw.println((i+1) + " " + (j+1));
				}
			}
		}
		pw.close();
	}
	public static ArrayList<Integer> find(int a, company[] companies) {
		HashMap<Integer, Integer> own = new HashMap<Integer, Integer>(companies[a].control);
		Stack<Integer> toProcess = new Stack<Integer>();
		HashSet<Integer> added = new HashSet<Integer>();
		for (int i:own.keySet()) {
			if (own.get(i) > 50) {
				toProcess.add(i);
				added.add(i);
			}
		}
		while (!toProcess.isEmpty()) {
			int cur = toProcess.pop();
			for (int i:companies[cur].control.keySet()) {
				if (!own.containsKey(i)) {
					own.put(i, companies[cur].control.get(i));
				}
				else {
					own.replace(i, own.get(i)+companies[cur].control.get(i));
				}
			}
			for (int i:own.keySet()) {
				if (!added.contains(i) && own.get(i) > 50) {
					toProcess.add(i);
					added.add(i);
				}
			}
		}
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i:own.keySet()) {
			if (own.get(i) >= 50) {
				ret.add(i);
			}
		}
		return ret;
	}
	static class company{
		HashMap<Integer, Integer> control;
		public company(){
			control = new HashMap<Integer, Integer>();
		}
	}
}
