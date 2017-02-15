import java.util.*;

public class CollectionIterator {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("Sunil");
		list.add("Harish");
		list.add("Vinod");

		list.add(10);
		list.add(20);

		System.out.println("Displaying Collection");

		Iterator itr = list.iterator();

		while (itr.hasNext()) {

			Object o = itr.next();

			if (o instanceof String) {

				String str = (String) o;
				System.out.println(str);

				if (str.equals("Harish")) {
					itr.remove();
				}

			}
			if (o instanceof Integer) {
				Integer intr = (Integer) o;
				System.out.println(intr);
			}

		}

		System.out.println("After Iterator:" + list);

	}

}
