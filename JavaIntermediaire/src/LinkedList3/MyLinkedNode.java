package LinkedList3;

import java.util.LinkedList;

public class MyLinkedNode<T extends Comparable<T>> {

	LinkedList<String> a = new LinkedList<>();

	public Node<T> head;
	public Node<T> current;
	public Node<T> previous;

	public void insertFirst(T value) {

		Node<T> newNode = new Node<T>(value, null);
		if (head == null) {
			head = newNode;

		} else {
			newNode.setNext(head);
			head = newNode;
		}

	}

	
	
	public void insertLast(T value) {

		/*
		 * if(current.compareTo(value) > 0) {
		 * 
		 * }
		 */

		Node<T> newNode = new Node<T>(value, null);

		if (head == null) {
			head = newNode;

		} else {
			current = head;
			while (current.getNext() != null) {

				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}

	public Node<T> deleteFirst() {

		Node<T> headRemoved = head;
		if (head != null) {
			head = head.getNext();
		}
		return headRemoved;
	}

	public String returnRemovedHead() {
		String removed;
		String remove = "";

		if ((removed = (String) deleteFirst().getValue()) == null) {

			return "The list is empty ! Amigo";

		} else {

			remove = "[ " + "The headRemoved is : " + removed.toString().toUpperCase() + " ]";
		}

		return remove;
	}

	public Node<T> deleteLast() {

		if (head != null) {
			current = head;
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(null);
			return current;
		}
		return current;
	}

	public String returnRemovedTail() {
		String removed;
		String remove = "";

		if ((removed = (String) deleteLast().getValue()) == null) {

			return "The list is empty ! Amigo";

		} else {

			remove = "[ " + "The tailRemoved is : " + removed.toString().toUpperCase() + " ]";
		}

		return remove;
	}

	public Node<T> deleteAny(T value) {

		if (head == null) {
			System.err.println("the list is empty !!!");
			return null;
		} else {
			current = head;
			while (current != null && !current.getValue().equals(value)) {
				previous = current;
				current = current.getNext();
			}
			if (current == head && current.getValue().equals(value)) {
				head = head.getNext();
				return current;
			} else if (current != null) {
				previous.setNext(current.getNext());
				return current;

			} else {
				System.err.println("Element not found : error 404" + "\n" + "\n");
				return null;
			}
		}
	}

	public boolean deleteNode(T value) {
		 boolean removed = false;
		if (head == null) {
			System.err.println("the list is empty !!!2");
			return removed;
		}
		while (head != null && head.getValue().equals(value)) {
			head = head.getNext();
			removed = true;
		}

		Node<T> current = head;
		while ( current != null && current.getNext() != null) {
			while (current != null && current.getNext() != null && current.getNext().getValue().equals(value)) {
				current.setNext(current.getNext().getNext());
				removed = true;
			}
			current = current.getNext();
		}
		System.err.println("Element NOT in the list");
		return removed;
	}

	public void deleteAll(T data) {
		Node<T> current = head;
		if (head == null) { // list is empty
			return;
		}
		// while loop to delete consecutive occurances of data
		while (head.getValue().equals(data)) { // if we want to delete the head , make next node head
			head = head.getNext();

		}
		while (current.getNext() != null) {
			// while loop to delete consecutive occurances of data
			while (current.getNext().getValue().equals(data)) {
				current.setNext(current.getNext().getNext());

			}
			current = current.getNext();
		}
	}

	public void add(T value) {
		Node<T> nouveau = new Node<T>(value, null);

		if (head == null) {
			head = nouveau;
			return;
		}
		if (value.compareTo(head.getValue()) < 0) {
			nouveau.setNext(head);
			head = nouveau;
			return;
		}
		current = head;
		while (current.getNext() != null) {
			if (value.compareTo(current.getNext().getValue()) < 0) {
				nouveau.setNext(current.getNext());
				current.setNext(nouveau);
				return;
			}
			current = current.getNext();
		}
		current.setNext(nouveau); // le plus grand : Z
	}

	@Override
	public String toString() {

		String description;

		description = "\n********************************************\n";
		description += "\tLa Liste simplement chainée       \n";
		description += "********************************************\n";
		if (head == null) {
			description += "The list is empty !";
		} else {
			
			
			for(Node<T> start=head ; start !=null ; start = start.getNext()) {
				description += "\n" + start.getValue();

			}

			/*while (start != null) {
				description += "\n" + start.getValue();
				start = start.getNext();
			}*/
		}
		return description;
	}

}
