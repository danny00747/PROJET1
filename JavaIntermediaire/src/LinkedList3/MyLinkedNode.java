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

	public boolean search(T value) {
		if (head == null) {
			return false;
		} else {
			current = head;
			while (current.getNext() != null) {
				if (current.getValue().equals(value)) {
					System.out.println(value + ": is the list");
					return true;
				}
				current = current.getNext();
			}
		}
		System.out.println(value + ": is NOT the list");
		return false;
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

	/* Given a key, deletes the first occurrence of key in linked list */
	public void deleteNode1(T value) {
		// Store head node
		Node<T> temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.getValue().equals(value)) {
			head = temp.getNext(); // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.getValue() != value) {
			while (current != null && current.getNext() != null && current.getNext().getValue().equals(value)) {
				current.setNext(current.getNext().getNext());

			}

			prev = temp;
			temp = temp.getNext();
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.setNext(temp.getNext());
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
		while (current != null && current.getNext() != null) {
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

	public void add2(T value) {

		Node<T> newNode = new Node<T>(value, null);

		if (head == null) {
			System.out.println("la liste est vide");
			head = newNode;
			return;

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
		StringBuilder toto = new StringBuilder();

		toto.append("********************************************\n");
		toto.append("\tLa Liste simplement chainée       \n");
		toto.append("********************************************\n");
		if (head == null) {
			toto.append("The list is empty !");
		} else {

			for (Node<T> start = head; start != null; start = start.getNext()) {
				toto.append("\n" + start.getValue());

			}

			/*
			 * while (start != null) { description += "\n" + start.getValue(); start =
			 * start.getNext(); }
			 */
		}
		return toto.toString();
	}

}
