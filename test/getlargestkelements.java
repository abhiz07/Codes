import java.util.ArrayList;
import java.util.PriorityQueue;

public class getlargestkelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 5, 17, 8, 16, 22, 42, 9, 34, 50 };
		System.out.println(getLargestK(arr, 3));

	}

	// complexity (n)logk
	// for k smallest change compareto function and if condition for checking
	// the array value
	private static class Pair implements Comparable<Pair> {
		int data;

		public Pair(int data) {
			this.data = data;
		}

		public int compareTo(Pair o) {
			return this.data - o.data;
		}
	}

	public static ArrayList<Integer> getLargestK(int arr[], int k) {
		ArrayList<Integer> final1 = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			Pair rp = new Pair(arr[i]);
			pq.add(rp);
		}
		for (int j = k; j < arr.length; j++) {
			Pair rp = pq.remove();
			if (rp.data > arr[j]) {
				pq.add(rp);
			} else {
				rp.data = arr[j];
				pq.add(rp);
			}
		}
		while (pq.size() != 0) {
			Pair rp = pq.remove();
			final1.add(rp.data);
		}
		return final1;
	}

}
