package com.greatlearning.bst.deletion;

import java.util.Scanner;

public class BstDeletion {

	// BST node
	static class Node {
		int key;
		Node left, right;
	};

	// creation of new node
	static Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	static Node insert(Node root, int key) {
		Node newnode = newNode(key);
		Node x = root;
		Node current_parent = null;
		while (x != null) {
			current_parent = x;
			if (key < x.key)
				x = x.left;
			else if (key > x.key)
				x = x.right;
			else {
				System.out.println("Value already exists!!!");
				return newnode;
			}
		}
		// If the root is null, the tree is empty.
		if (current_parent == null)
			current_parent = newnode;
		// assign new node node to the left child
		else if (key < current_parent.key)
			current_parent.left = newnode;
		// assign the new node to the right child
		else
			current_parent.right = newnode;
		// return pointer to new node
		return current_parent;
	}

	static boolean search(Node root, int key) {
		root = search_Recursive(root, key);
		if (root != null)
			return true;
		else
			return false;
	}

	static Node search_Recursive(Node root, int key) {
		// when root is null or key is present at root
		if (root == null || root.key == key)
			return root;
		// when value is greater than root's key
		if (root.key > key)
			return search_Recursive(root.left, key);
		// when value is less than root's key
		return search_Recursive(root.right, key);
	}

	static void Inorder(Node root) {
		if (root == null)
			return;
		else {
			Inorder(root.left);
			System.out.print(root.key + " ");
			Inorder(root.right);
		}
	}

	public static Node deleteNode(Node root, int key) {
		Node temp = root;

		if (temp == null) {
			return temp;
		} else {

			if (key < temp.key) {
				temp.left = deleteNode(temp.left, key);
			} else if (key > temp.key) {
				temp.right = deleteNode(temp.right, key);
			}else {
				
				if(temp.left == null)
					return temp.right;
				if(temp.right == null)
					return temp.left;
				
//				temp.key = minValue(temp.right);
				temp.key = minValue(temp.left);
				
//				temp.right = deleteNode(temp.right, temp.key);
				temp.left = deleteNode(temp.left, temp.key);
			}
			
		}
		return temp;
	}

	private static int minValue(Node root) {
		int min = root.key;
		while(root.left != null) {
			root = root.left;
			min = root.key;
		}
		return min;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int value;
		boolean status;
		Node root = null;
		int[] arr = { 34, 10,9, 89, 22, 19, 38 };
		for (int i = 0; i < arr.length; i++) {
			value = arr[i];
			if (root == null) {
				root = insert(root, value);
			} else {
				insert(root, value);
			}
		}
		System.out.println("Inorder of Binary Treee!!\n");
		Inorder(root);
		int stop = 0;
		do {
			System.out.print("\nEnter the value to delete :: ");
			int delVal = sc.nextInt();

			if (search(root, delVal)) {
				// deletion operation
				System.out.println("Deletion Node value -> " + deleteNode(root, delVal).key);
				
				System.out.println("Inorder of Binary Treee!!\n");
				Inorder(root);

			} else {
				System.out.println("value not found!!");
			}

			System.out.println("\nEnter 0 to stop or any other key to continue.");
			stop = sc.nextInt();
		} while (stop != 0);

		System.out.println("\nProgram completed successfully");
		sc.close();
	}

}
