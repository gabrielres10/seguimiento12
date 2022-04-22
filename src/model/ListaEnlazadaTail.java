package model;

public class ListaEnlazadaTail {
	private Node head;
	private Node tail;

	public void addFirst(Node node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}

	}

	/*
	 * public void addLast(Node node) { if(tail == null) { head = node; tail = node;
	 * }else { node.setNext(tail); tail = node; }
	 * 
	 * }
	 */
	public void addLast(Node node) {
		addLast(head, node);
	}

	private void addLast(Node current, Node node) {
		// Caso base
		if (current.getNext() == null) {
			current.setNext(node);
			return;
		}
		// Recursivo
		addLast(current.getNext(), node);
	}

	public Node search(int goal) {
		return search(head, goal);
	}

	private Node search(Node current, int goal) {
		if (current == null) {
			return null;
		}

		if (current.getValue() == goal) {
			return current;
		}

		return search(current.getNext(), goal);
	}

	public void print() {
		print(head);
	}

	private void print(Node current) {
		if (current == null) {
			return;
		}
		System.out.println(current.getValue());
		print(current.getNext());
	}

	public void delete(int value) {
		delete(null, head, value);
	}

	public void delete(Node prev, Node current, int value) {
		if (current == null) {
			return;
		}
		if (head.getValue() == value) {
			head = head.getNext();
			return;
		}

		if (current.getValue() == value) {
			prev.setNext(current.getNext());
			return;
		}

		delete(current, current.getNext(), value);
	}
}
