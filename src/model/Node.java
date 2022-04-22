package model;

public class Node {
	//Información
	private int value;
	//Enlaces
	private Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	
	
	/**
	 * @return the vale
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param vale the vale to set
	 */
	public void setValue(int vale) {
		this.value = vale;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
