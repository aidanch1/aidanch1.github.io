import java.util.PriorityQueue;

public class dijkstraTemplate {
	public static void main(String[] args) {
		//driver code
	}
	/*public static void dijkstra(Node source) {
		source.distance = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.add(source);
		
		while (!q.isEmpty()) {
			Node cur = q.poll();
			for (Edge i:cur.adjacent) {
				Node next = i.target;
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
	}*/
}
/*class Node implements Comparable<Node>{
	
	public char name;
	public Edge[] adjacent;
	public int distance;
	public Node parent;
	
	public Node(char n) {
		name = n;
		distance = Integer.MAX_VALUE;
	}
	@Override
	public int compareTo(Node other) {
		return Integer.compare(distance, other.distance);
	}
}
class Edge {
	public Node target;
	public int weight;
	public Edge(Node n, int w) {
		target = n;
		weight = w;
	}
} */
