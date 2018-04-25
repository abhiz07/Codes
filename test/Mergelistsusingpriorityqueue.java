import java.util.ArrayList;
import java.util.PriorityQueue;

public class Mergelistsusingpriorityqueue {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());

		lists.get(0).add(10);
		lists.get(0).add(20);
		lists.get(0).add(30);
		lists.get(0).add(40);

		lists.get(1).add(12);
		lists.get(1).add(14);
		lists.get(1).add(18);
		lists.get(1).add(42);

		lists.get(2).add(5);
		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(16);

		lists.get(3).add(11);
		lists.get(3).add(17);
		lists.get(3).add(21);
		lists.get(3).add(50);

		System.out.println(mergeksortedlists(lists));

	}

	private static class Pair implements Comparable<Pair> {
		int data;
		int lno;
		int ino;

		public Pair(int data, int lno, int ino) {
			this.data = data;
			this.lno = lno;
			this.ino = ino;
		}

		public int compareTo(Pair o) {
			return this.data - o.data;
		}
	}

	public static ArrayList<Integer> mergeksortedlists(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> merged = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();

		
		while (pq.size() != 0) {
			Pair rp = pq.remove();
			merged.add(rp.data);
			rp.ino++;
			if (rp.ino < lists.get(rp.lno).size()) {
				rp.data = lists.get(rp.lno).get(rp.ino);
				pq.add(rp);
			}
		}
		return merged;

	}
}
