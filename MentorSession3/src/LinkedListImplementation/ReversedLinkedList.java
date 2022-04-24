package LinkedListImplementation;


public class ReversedLinkedList {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static Node insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}

	public static Node reverseNode(Node node) {

		Node prev = null;
		Node next = null;
		Node current = node;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	public static void printList(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		head = new Node(10);
//		head.next = new Node(20);
//		head.next.next = new Node(30);
		head = insertNode(10);
		head = insertNode(20);
		head = insertNode(30);
		head = insertNode(40);
		System.out.println("List :: ");
		printList(head);
		System.out.println("Reversed List :: ");
		head = reverseNode(head);
		printList(head);
	}

}
