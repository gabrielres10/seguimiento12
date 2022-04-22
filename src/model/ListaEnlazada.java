package model;

public class ListaEnlazada {
	private Node head;
	
	public void addFirst(Node node) {
		//Lista vacia
		if(head == null) {
			head = node;
			
		}
		//lista No Vacia
		else {
			node.setNext(head);
			head = node;
			
		}
	
	}
	
	public void addLast(Node node) {
		addLast(head,node);
	}
	
	private void addLast(Node current,Node node) {
		//Caso base
		if(current.getNext() == null) {
			current.setNext(node);
			return;
		}
		//Recursivo
		addLast(current.getNext(),node);
	}
	
	public void addLastIterative(Node node) {
		if(head == null) {
			head = node;
			
		}else {
			Node current = head;
			while(current.getNext()!= null) {
				current = current.getNext();
				
			}
			current.setNext(node);
			
		}
		
	}
	public void print() {
		print(head);
	}
	private void print(Node current) {
		//caso base
		if(current == null) {
			return;
		}
		
		//Iterativo
		System.out.println(current.getValue());
		print(current.getNext());
	}
	public Node search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
