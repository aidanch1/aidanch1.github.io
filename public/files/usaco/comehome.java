/*ID: aidanch1
LANG: JAVA
TASK: comehome
*/
import java.io.*;
import java.util.*;

public class comehome {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("comehome.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("comehome.in"));
		int p = Integer.parseInt(bf.readLine());
		HashMap<Character, Node> graph = new HashMap<Character, Node>();
		for (int i=0; i<p; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			Node a = new Node(st.nextToken().charAt(0));
			Node b = new Node(st.nextToken().charAt(0));
			int weight = Integer.parseInt(st.nextToken());
			if (!graph.containsKey(a.name)) {
				graph.put(a.name, a);
			}
			if (!graph.containsKey(b.name)) {
				graph.put(b.name, b);
			}
			graph.get(a.name).adjacent.add(new Edge(b.name, weight));
			graph.get(b.name).adjacent.add(new Edge(a.name, weight));
		}
		
		dijkstra('Z', graph);
		
		Node shortest = new Node('.');
		for (Node i:graph.values()) {
			if (i.name != 'Z' && Character.isUpperCase(i.name) && i.distance < shortest.distance)
			shortest = i;
		}
		
		PrintWriter pw = new PrintWriter("comehome.out");
		pw.println(shortest.name + " "+ shortest.distance);
		pw.close();
	}
	
	public static void dijkstra(char source, HashMap<Character, Node> graph) {
		graph.get(source).distance = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.add(graph.get(source));
		
		while (!q.isEmpty()) {
			Node cur = q.poll();
			for (Edge i:cur.adjacent) {
				Node next = graph.get(i.target);
				int weight = i.weight;
				
				int distancefromcur = cur.distance+weight;
				if(distancefromcur < next.distance) {
					q.remove(next);
					next.distance = distancefromcur;
					next.parent = cur;
					q.add(next);
				}
			}
		}
		
	}

}
class Node implements Comparable<Node>{
	
	public char name;
	public List<Edge> adjacent;
	public int distance;
	public Node parent;
	
	public Node(char n) {
		name = n;
		distance = Integer.MAX_VALUE;
		adjacent = new ArrayList<Edge>();
	}
	@Override
	public int compareTo(Node other) {
		return Integer.compare(distance, other.distance);
	}
}
class Edge {
	public char target;
	public int weight;
	public Edge(char n, int w) {
		target = n;
		weight = w;
	}
}