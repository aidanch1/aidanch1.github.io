package problems;

public class LearnQuickSort {

	public static void main(String[] args) {
		int[] a = {1,6,4,2,7,5,6};
		sort(a, 0, a.length-1);
		for (int i:a)
		System.out.print(i + " ");
	}
	public static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int small = low - 1;
		for (int i=low; i<high; i++) {
			if (a[i]<pivot) {
				small++;
				int t = a[i];
				a[i] = a[small];
				a[small] = t;
			}
		}
		a[high] = a[small+1];
		a[small+1] = pivot;
		return small+1;
	}
	public static void sort(int[] a, int low, int high) {
		if (low<high) {
			int p = partition(a, low, high);
			sort(a, low, p-1);
			sort(a, p+1, high);
		}
	}

}
