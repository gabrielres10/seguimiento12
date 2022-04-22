package model;

public class Lista {
	private Node head;
	
	public void add() {
		if(head == null) {
			Node node = new Node(1);
			head = node;
			head.setNext(head);
			head.setPrev(head);
		}else {
			Node node = new Node();
			Node tail = head.getPrev();
			node.setValue(tail.getValue() + 1);
			tail.setNext(node);
			node.setPrev(tail); 
			
			node.setNext(head);
			head.setPrev(node);
			
		}
	}
	
	public void add(Node node) {
		if(head == null) {
			node.setValue(1);
			head = node;
			head.setNext(head);
			head.setPrev(head);
		}else {
			Node tail = head.getPrev();
			node.setValue(tail.getValue() + 1);
			tail.setNext(node);
			node.setPrev(tail); 
			
			node.setNext(head);
			head.setPrev(node);
			
		}
	}
	
	public void delete(Node node) {
		findPlayer(node);
		deleteNode(null,node);
	}
	
	private void deleteNode(Node prev, Node current) {
		// TODO Auto-generated method stub
		//Condiciones de parada
		if (current == null) {
			return;
		}
		//enlazar el segundo nodo con la cola en ambas direcciones
		if (head.equals(current)) {
			Node head = this.head;
			Node tail = this.head.getPrev();
			head = head.getNext();
			return;
		}
		
		
		//Algoritmo recursivo
		
	}

	public void print() {
		print(head);
	}
	
	private void print(Node node) {
		//Condiciones de parada
		
		if(node.getNext() == head) {
			//System.out.println(node.getValue());
			System.out.println(node.getValue()+" "+(node.getPlayer() != null ? node.getPlayer().getPlayer():""));
			return;
		}
		
		System.out.println(node.getValue()+" "+(node.getPlayer() != null ? node.getPlayer().getPlayer():""));
		//Algoritmo recursivo
		print(node.getNext());
	}
	
	public void movePlayer(int dice) {
		Node playerNode = findPlayer(head);
		
		//movePlayer(playerNode, dice);
		Player p = playerNode.getPlayer();
		playerNode.setPlayer(null);
		movePlayer(playerNode,p,dice);
		
		
	}
	
	private void movePlayer(Node current,Player player,int dice) {
		//condicion de parada
		if(dice == 0){
			current.setPlayer(player);
			return;
		}
		//Metodo recursivo
		movePlayer(current.getNext(),player,dice-1);
	}

	private Node findPlayer(Node current) {
		if(current.getPlayer() != null) {
			return current;
		}
		return findPlayer(current.getNext());
	}
}
