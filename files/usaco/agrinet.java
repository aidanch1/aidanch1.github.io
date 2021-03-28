/*ID: aidanch1
LANG: JAVA
TASK: agrinet
*/
import java.io.*;
import java.util.*;

public class agrinet {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("agrinet.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("agrinet.in"));
		int n = Integer.parseInt(bf.readLine());
		int[][] graph = new int[n][n];
		for (int i=0; i<n; i++) {
			int j = 0;
			while(j<n) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				while(st.hasMoreTokens()) {
					graph[i][j] = Integer.parseInt(st.nextToken());
					j++;
				}
			}
		}
		
		int ans = prim(graph);
		
		PrintWriter pw = new PrintWriter("agrinet.out");
		pw.println(ans);
		pw.close();
	}
	
	public static int prim(int[][] graph) {
		int v = graph.length;
		int[] parent = new int[v];
		int[] dist = new int[v]; //dist[i] = closest i is to the rest of the tree
		boolean[] used = new boolean[v];
		for(int i=0; i<v; i++) {
			dist[i] = Integer.MAX_VALUE;
			used[i] = false;
		}
		dist[0] = 0;
		parent[0] = -1;
		for (int i=0; i<v-1; i++) {
			int cur = closest(dist, used);
			used[cur] = true;
			for (int j=0; j<v; j++) {
				if (graph[cur][j] != 0 && !used[j] && graph[cur][j] < dist[j]) {
					parent[j] = cur;
					dist[j] = graph[cur][j];
				}
			}
		}
		return sumweights(parent, graph);
	}
	public static int closest(int[] dist, boolean[] used) {
		int min = Integer.MAX_VALUE, index = -1;
		for (int i=0; i<dist.length; i++) {
			if (!used[i] && dist[i] < min) {
				min = dist[i];
				index = i;
			}
		}
		return index;
	}
	public static int sumweights(int[] parent, int[][] graph) {
		int w = 0;
		for (int i=1; i<parent.length; i++) {
			w += graph[parent[i]][i];
		}
		return w;
	}
}
