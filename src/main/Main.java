package main;

import model.ListaEnlazadaTail;
import model.Node;

public class Main {

	public static void main(String[] args) {
		ListaEnlazadaTail list = new ListaEnlazadaTail();
		list.addFirst(new Node(4));
		list.addFirst(new Node(3));
		list.addFirst(new Node(2));
		list.addFirst(new Node(1));
		list.addFirst(new Node(0));
		
		list.addLast(new Node(10));
		list.addLast(new Node(11));
		list.addLast(new Node(12));
		
		list.print();
		
		Node goal = list.search(10);
		System.out.println("Obtenido: " + goal.getValue());
		System.out.println("----------------");
		list.delete(10);
		list.print();
	}

}
