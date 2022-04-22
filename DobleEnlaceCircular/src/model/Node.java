package model;

public class Node {
	//Datos
	private int value;
	private Player player;
	
	//Enlaces
	private Node prev;
	private Node next;
	
	public Node(int value) {
		this.value = value;
	}

	public Node() {
		
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
