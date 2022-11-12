import java.util.HashMap;
import java.util.Scanner;

public class kitten {

	public static void main(String[] str) {
		Scanner reader = new Scanner(System.in);
		HashMap<String, String> tree = new HashMap<>();

		String catAt = reader.next();
		String parent = reader.next();

		while (!parent.equals("-1")) {
			String[] children = reader.nextLine().split(" ");
			for (String child : children) {
				tree.put(child, parent);
			}
			parent = reader.next();
		}
		reader.close();

		System.out.print(catAt);
		while (catAt != null) {
			catAt = tree.get(catAt);
			if (catAt == null) {
				break;
			}
			System.out.print(" " + catAt);
		}
		System.out.flush();
	}
}