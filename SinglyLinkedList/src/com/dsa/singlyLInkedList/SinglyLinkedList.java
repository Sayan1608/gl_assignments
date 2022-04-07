package com.dsa.singlyLInkedList;

public class SinglyLinkedList {

	private Node head;

	public void displayLinkedList() {
		Node currentNode = head;

		while (currentNode != null) {
			System.out.print(currentNode.nodeData + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.println("NULL");
	}

	public void insertAtFront(int data) {

		Node newNode = new Node();
		newNode.nodeData = data;
		newNode.nextNode = head;
		head = newNode;

	}

	public void insertAtLast(int data) {

		Node newNode = new Node();
		newNode.nodeData = data;
		Node temp = head;

		if (temp == null) {
			head = newNode;
			return;
		}

		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		temp.nextNode = newNode;

	}

	public void insertAtPosition(int data, int pos) {
		Node temp = head;

		if (pos == 1 || temp == null) {
			insertAtFront(data);
			return;
		}
		Node newNode = new Node();
		newNode.nodeData = data;

		for (int i = 1; i < pos - 1; i++) {

			temp = temp.nextNode;

			if (temp == null) {
				System.out.println("Invalid Position.");
				return;
			}
		}

		Node anotherNode = temp.nextNode;
		temp.nextNode = newNode;
		newNode.nextNode = anotherNode;

	}

	public void deleteAtFirst() {
		if (head == null) {
			return;
		}
		head = head.nextNode;
	}

	public void deleteAtLast() {
		if (head == null) {
			return;
		}

		Node temp = head;

		if (temp.nextNode == null) {
			deleteAtFirst();
			return;
		}
		while (temp.nextNode.nextNode != null) {
			temp = temp.nextNode;
		}

		temp.nextNode = null;

	}

	public void deleteAtPosition(int pos) {
		if (head == null) {
			return;
		}
		
		if(pos == 1) {
			deleteAtFirst();
			return;
		}

		Node temp = head;

		for (int i = 1; i < pos - 1; i++) {
			temp = temp.nextNode;

			if (temp == null) {
				System.out.println("Invalid deletion point.");
				return;
			}
		}

		if (temp.nextNode == null) {
			System.out.println("Position to delete is greater than the size of the list.");
			return;
		}

		Node next = temp.nextNode.nextNode;
		temp.nextNode = next;

	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.insertAtLast(10);
		list.displayLinkedList();

		list.insertAtFront(20);
		list.displayLinkedList();

		list.insertAtPosition(30, 2);
		list.displayLinkedList();

		list.deleteAtFirst();
		list.displayLinkedList();

		list.insertAtFront(5);
		list.displayLinkedList();

		list.deleteAtPosition(1);
		list.displayLinkedList();
		
//		list.deleteAtPosition(2);;
//		list.displayLinkedList();
		
//		list.deleteAtPosition(1);
//		list.displayLinkedList();
	}

}
