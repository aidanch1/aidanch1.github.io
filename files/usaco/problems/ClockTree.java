package problems;

import java.io.*;
import java.util.*;

public class ClockTree {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\ClocksBasicCase.txt"));
		BufferedReader bf = new BufferedReader(new FileReader("clocktree.in"));
		int numRooms = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		room[] rooms = new room[numRooms];
		int[] originalClockTimes = new int[numRooms];
		for (int i=0; i<numRooms; i++) {
			int t = Integer.parseInt(st.nextToken());
			originalClockTimes[i] = t;
			rooms[i] = new room(t, new ArrayList<Integer>());
		}
		//System.out.println(Arrays.toString(originalClockTimes));
		for (int i=0; i<numRooms-1; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken()) -1;
			int b = Integer.parseInt(st.nextToken()) -1;
			rooms[a].paths.add(b);
			rooms[b].paths.add(a);
		}
		bf.close();
		int possibleRooms = 0;
		for (int i=0; i<rooms.length; i++) {
			HashSet<Integer> visited = new HashSet<>();
			walk(i, rooms, visited);
			if (rooms[i].clock == 12 || rooms[i].clock == 1) {
				possibleRooms++;
				//System.out.println("possible from " + i);
			}
			//System.out.println(Arrays.toString(rooms));
			resetRooms(rooms, originalClockTimes);
		}
		PrintWriter pw = new PrintWriter("clocktree.out");
		pw.println(possibleRooms);
		pw.close();
		//System.out.println(possibleRooms);
	}
	public static void walk(int start, room[] rooms, HashSet<Integer> visited) {
		 Stack<Integer> nextRooms = new Stack<>();
		 for (int i:rooms[start].paths) {
			 nextRooms.push(i);
			 nextRooms.push(start);
		 }
		 visited.add(start);
		// System.out.println("start " + start);
		 while (!nextRooms.empty()) {
			 int previous = nextRooms.pop();
			 int current = nextRooms.peek();
			 nextRooms.push(previous);
			 if (!visited.contains(current)) {
			 rooms[current].clock++;
			 if (rooms[current].clock == 13) {
				 rooms[current].clock = 1;
			 } 
			 }
			 boolean edge = true;
			 for (int i:rooms[current].paths) {
				 if (!visited.contains(i)) {
					 nextRooms.push(i);
					 nextRooms.push(current);
					 edge = false;
				 }
			 }
			 if (edge) {
				 int change = 12 - rooms[current].clock;
				// if (previous != start) {
				 	//System.out.println(rooms[previous].clock);
					 rooms[previous].clock = (rooms[previous].clock + change + 1) % 12;
					 if (rooms[previous].clock == 0) {
						 rooms[previous].clock = 12;
					 }
					 //System.out.println(rooms[previous].clock + " " +previous);
				// }
				/* else {
					 rooms[previous].clock = (rooms[previous].clock + change) % 12;
					 if (rooms[previous].clock == 0) {
						 rooms[previous].clock = 12;
					 }
				 } */
				 rooms[current].clock = 12;
				 nextRooms.pop();
				 nextRooms.pop();
			 }
			 visited.add(current);
			// System.out.println("moved to " + current);
		 }
	}
	public static void resetRooms(room[] a, int[] originalTimes) {
		for (int i=0; i<a.length; i++) {
			a[i].clock = originalTimes[i];
		}
	}
	static class room{
		int clock;
		ArrayList<Integer> paths;
		public room(int clock, ArrayList<Integer> paths) {
			this.clock = clock;
			this.paths = paths;
		}
		@Override
		public String toString() {
			return "room [clock=" + clock + ", paths=" + paths + "]";
		}
		
	}
}
