package main;

import java.util.Scanner;

import model.Lista;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static Lista list;
	
	public static void main(String[] args) {
		list = new Lista();
		
		/*list.add();
		list.add();
		list.add();
		list.add();
		list.add();
		
		
		Node head = new Node(6);
		head.setPlayer(new Player("Yuluka"));
		list.add(head);
		
		list.print();
		
		int dice = 2;
		list.movePlayer(dice);
		list.print();*/
		int option;
		do {
			option = showMenu();
			runOption(option);
		}while(option != 0);
		list.print();
	}


	private static int showMenu() {
		// TODO Auto-generated method stub
		int option = 0;
		System.out.println("Elige una opción para ejecutar: \n"+
				"1. Dar turno \n" + 
				"2. Mostrar turno \n" + 
				"3. Pasar turno \n" + 
				"4. Eliminar turno actual \n" +
				"0. Salir <-");
		option = sc.nextInt();
		sc.nextLine();
		return option;
	}

	private static void runOption(int option) {
		// TODO Auto-generated method stub
		switch(option) {
		case 1:
			giveTurn();
			break;
		case 2:
			showTurn();
			break;
		case 3:
			skipTurn();
			break;
		case 4:
			deleteCurrentTurn();
			break;
		default:
			System.out.println("Bye :3");
		}
	}


	private static void deleteCurrentTurn() {
		// TODO Auto-generated method stub
		
	}


	private static void skipTurn() {
		// TODO Auto-generated method stub
		
	}


	private static void showTurn() {
		// TODO Auto-generated method stub
		
	}


	private static void giveTurn() {
		// TODO Auto-generated method stub
		list.add();
	}
	

}
