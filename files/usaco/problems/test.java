package problems;

import java.io.*;
import java.util.*;

public class test {
  public static void main(String[] args) throws Exception {
    String name = "swap";
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\xinchen\\Downloads\\swapsfeb1.txt"));
    InputLine line = new InputLine(br.readLine());
    int n = Integer.parseInt(line.nextToken());
    int m = Integer.parseInt(line.nextToken());
    long k = Long.parseLong(line.nextToken());
    int[] l = new int[m];
    int[] r = new int[m];
    for (int i = 0; i < m; i++) {
      line = new InputLine(br.readLine());
      l[i] = Integer.parseInt(line.nextToken()) - 1;
      r[i] = Integer.parseInt(line.nextToken()) - 1;
    }
    br.close();
    int[] a = new int[n];
    int[] p = new int[n]; // position of i
    for (int i = 0; i < n; i++) {
      a[i] = i + 1;
      p[i] = i;
    }
    for (int i = 0; i < m; i++) {
      swap(a, p, l[i], r[i]);
    }
    int[] c = new int[n];
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (c[i] == 0) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);
        int j = i;
        while (p[j] != i) {
          j = p[j];
          list.add(j);
        }
        for (int g = 0; g < list.size(); g++) {
          int d = list.get(g);
          c[d] = g;
          map.put(d, list);
        }
      }      
    }
    for (int i = 0; i < a.length; i++) {
      ArrayList<Integer> list = map.get(i);
      int d = (int)(k % list.size());
      int g = list.get((c[i] + d) % list.size());
      /*
      int g = i;
      for (int j = 0; j < d; j++) {
        g = p[g];
      }
      */
      a[g] = i + 1;
    }
    //PrintWriter pw = new PrintWriter(name + ".out");
    for (int i = 0; i < a.length; i++) {
      System.out.println("" + a[i]);
    }
   // pw.close(); 
  }
  static void swap(int[] a, int[] p, int l, int r) {
    while (l < r) {
      int t = a[l];
      a[l] = a[r];
      a[r] = t;
      p[a[l] - 1] = l;
      p[a[r] - 1] = r;
      l++;
      r--;
    }
  }
  static class InputLine {
    final StringTokenizer tokenizer;
    public InputLine(String line) {
      this.tokenizer = new StringTokenizer(line);
    }
    public String nextToken() {
      return this.tokenizer.nextToken();
    }
  }
}
