/*ID: aidanch1
LANG: JAVA
TASK: cowtour
*/
import java.io.*;
import java.util.*;

public class cowtour {
	/*
	 * trick to realize: when joining node i and j the new diameter is the max of farthest from i + distance i to j + farthest from j
	 * or the old diameter of i/j
	 */

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("cowtour.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("cowtour.in"));
		
		int n = Integer.parseInt(bf.readLine());
		int[][] coords = new int[n][2];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			coords[i][0] = x;
			coords[i][1] = y;
		}
		
		double[][] graph = new double[n][n];
		double inf = 999999999;
		
		for (int i=0; i<n; i++) {
			char[] t = bf.readLine().toCharArray();
			for (int j=0; j<n; j++) {
				if (t[j] == '1') {
					graph[i][j] = Math.sqrt(Math.pow((coords[i][0] - coords[j][0]), 2) + Math.pow((coords[i][1] - coords[j][1]), 2));
				}
				else if (i == j) {
					graph[i][j] = 0;
				}
				else {
					graph[i][j] = inf;
				}
			}
		}
		
		double[][] fw = floydWarshall(graph);
		double[] farthest = new double[n]; // farthest node from i
		double[] diam = new double[n]; // diameter of field of i
		int[] id = new int[n]; // which field i belongs in
		for (int i=0; i<n; i++)
			id[i] = -1;
		int fields = 0;
		
		for (int i=0; i<n; i++) {
			if (id[i] == -1) { // if new field
				fields++;
				double diami = -1;
				for (int j=0; j<n; j++) { 
					if (fw[i][j] != inf) { // for every node in field find farthest node
						id[j] = fields;
						double farj = -1;
						for (int k=0; k<n; k++) {
							if (fw[j][k] != inf && fw[j][k] > farj) {
								farj = fw[j][k];
							}
						}
						if (diami < farj) {
							diami = farj;
						}
						farthest[j] = farj;
					}
				}
				for (int j=0; j<n; j++) { 
					if (fw[i][j] != inf) { // for every node in field set diameter
						diam[j] = diami;
					}
				}
			}
		}
		
		double mind = inf;
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (id[i] != id[j]) {
					//add path between i and j
					double d = Math.max(Math.max(
							farthest[i] + farthest[j] + 
							Math.sqrt(Math.pow((coords[i][0] - coords[j][0]), 2) + Math.pow((coords[i][1] - coords[j][1]), 2))
							, diam[i]), diam[j]);
					if (d < mind) {
						mind = d;
					}
				}
			}
		}

		PrintWriter pw = new PrintWriter("cowtour.out");
		pw.format("%.6f\n", mind);
		pw.close();	
	}
	
	public static double[][] floydWarshall(double[][] graph) {
		int v = graph.length;
		double[][] dist = new double[v][v];
		for (int i=0; i<v; i++) {
			for (int j=0; j<v; j++) {
				dist[i][j] = graph[i][j];
			}
		}
		for (int k=0; k<v; k++) {
			for (int i=0; i<v; i++) {
				for (int j=0; j<v; j++) {
					if (dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		return dist;
	}
}
