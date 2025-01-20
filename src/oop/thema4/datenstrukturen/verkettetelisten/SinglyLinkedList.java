package oop.thema4.datenstrukturen.verkettetelisten;

public class SinglyLinkedList {

	private Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		while (current!= null) {
			System.out.println(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
}

