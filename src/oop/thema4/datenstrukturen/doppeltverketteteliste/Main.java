package oop.thema4.datenstrukturen.doppeltverketteteliste;

public class Main {

	public static void main(String[] args) {

		// Erstelle eine doppelt verkettete Liste
		DoublyLinkedList list = new DoublyLinkedList();
		
		// Füge Elemente hinzu
		list.add(5);
		list.add(15);
		list.add(25);

		// Liste vorwärts ausgeben
		System.out.println("Doppelt verkettete Liste vorwärts:");
		list.displayForward();
	}

}
