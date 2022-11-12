import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

class arraysmoothening {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		int N = s.nextInt();
		int K = s.nextInt();

		for (int i = 0; i < N; i++) {
			int num = s.nextInt();
			freqMap.put(num, bump(freqMap.get(num)));
		}
		s.close();

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
		maxHeap.addAll(freqMap.values());

		for (int i = 0; i < K; i++) {

			if (maxHeap.peek() > 0) {
				int newInt = maxHeap.poll() - 1;
				maxHeap.offer(newInt);
			} else {
				break;
			}
		}

		System.out.println(maxHeap.poll());
	}

	static int bump(Integer i) {
		if (i == null) {
			return 1;
		}
		return i + 1;
	}
}