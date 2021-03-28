package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class convention2 {
	

	public static void main(String[] args) {
		int cows = 5;
		cow[] cowc= new cow[cows];
		cowc[0] = new cow(0,25,3);
		cowc[1] = new cow(1,105,30);
		cowc[2] = new cow(2,20,50);
		cowc[3] = new cow(3,10,17);
		cowc[4] = new cow(4,100,10);
		//dont need this sorted
		//cowc = sort(cowc);
		ArrayList<cow> pasture = new ArrayList<>();
		// array is used to store information like this:
		// [0th element]: cow eating [1st element] last cow in line, ... [nth element]first cow in line
		int maxwait = 0;
		for (int i =0; i<150; i++) {
			for (cow p:cowc) {
				if (p.arriveTime == i && pasture.size()==0) {
					pasture.add(p);
				}
				else if (p.arriveTime == i && pasture.size()>0) {
					cow cowBefore = findSpot(pasture, p);
					if (cowBefore.seniority == -1) {
						p.leaveTime = pasture.get(0).leaveTime + p.eatTime;
						pasture.add(p);
						//change leavetime for every cow left of p except first cow
						for (int l=pasture.indexOf(p)-1; l>0; l--) {
							pasture.get(l).leaveTime += p.eatTime;
						}
					}
					else {
					p.leaveTime = cowBefore.leaveTime + p.eatTime;
					pasture.add(pasture.indexOf(cowBefore), p);
					for (int l=pasture.indexOf(p)-1; l>0; l--) {
						pasture.get(l).leaveTime += p.eatTime;
					}
					}
					for (cow cc:pasture) {
						int wait = cc.leaveTime-cc.eatTime-cc.arriveTime;
						if (wait>maxwait) {
							maxwait = wait;
						}
					}
				}
				else if(p.leaveTime == i) {
					Collections.swap(pasture, 0, pasture.size()-1);
					pasture.remove(pasture.size()-1);
				}
			}
		}
		System.out.println(maxwait);
	}
	public static cow findSpot(ArrayList<cow> a, cow p) {
		cow cowBefore = new cow(-1,-1,-1);
		for (int k=1; k<a.size(); k++) {
			if (a.get(k).seniority<p.seniority) {
				cowBefore = a.get(k);
			}
		}
		return cowBefore;
	}
	static class cow{
		public int seniority;
		public int arriveTime;
		public int leaveTime;
		public int eatTime;
		cow(int s, int a, int b) {
			seniority = s;
			arriveTime = a;
			leaveTime = a+b;
			eatTime = b;
		}
	}
	public static cow[] sort(cow[] cows) {
		for (int i=0; i<cows.length; i++) {
			for (int p = 0; p<cows.length-1-i; p++) {
				if (cows[p].arriveTime>cows[p+1].arriveTime) {
					cow temp = cows[p];
					cows[p] = cows[p+1];
					cows[p+1] = temp;
				}
			}
		}
		return cows;
	}
}
