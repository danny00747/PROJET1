package LinkedList3;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		var list1 = new MyLinkedNode<Integer>();
		MyLinkedNode<String> list2 = new MyLinkedNode<>();
		var list3 = new MyLinkedNode<String>(); 

		list1.add(10);
		list1.add(13);

		list1.add(new Integer(123));
		list1.add(new Integer(12));
		list1.add(new Integer(12));
		list1.add(new Integer(12));
		list1.add(new Integer(12));
		list1.add(new Integer(123));
		list1.add(new Integer(125));
		list1.deleteNode(12);


		list1.deleteNode(10);

		list2.add("danny");
		list2.add("messi");
		list2.add("suarez");
		list2.add(new String("pique"));
		list3.add("hubert"); 

		System.out.println(list1);
		System.out.println();
		System.out.println(list2);
		System.out.println();

	}

	public static void display() {

		Node<String> start = new Node<>("Apple", new Node<>("Banana", new Node<>("Cherry", null)));

		while (start != null) {
			System.out.println(start.getValue());
			start = start.getNext();

		}

		/*
		 * System.out.println(start.getValue());
		 * System.out.println(start.getNext().getValue());
		 * System.out.println(start.getNext().getNext().getValue());
		 * System.out.println(start.getNext().getNext().getNext());
		 */

	}

}
