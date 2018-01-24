package LinkedList3;

public class Main {

	public static void main(String[] args) {

		MyLinkedNode<String> list = new MyLinkedNode<>();
		MyLinkedNode<Integer> list1 = new MyLinkedNode<>();

		

		list1.add(new Integer(12));
		list1.add(new Integer(12));
		list1.add(new Integer(123));
		list1.add(new Integer(12));
		list1.add(new Integer(123));
		
	
		
		list1.deleteNode(123);
	
		System.out.println(list1);

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
