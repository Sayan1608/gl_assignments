package com.greatlearning.bst;

import java.util.Scanner;

public class BstSearch {
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int value;
		boolean status;
		Node root = null;
		int[] arr = { 34, 1, 89, 22, 19, 38 };
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
		int stop = -1;
		while (stop != 0) {
			System.out.println("\nEnter value to search.");
			int val = sc.nextInt();
			status = search(root, val);
			if (status == true) {
				System.out.println("\nValue found in tree!!!\nEnter 0 to stop or any value to continue searching");
				if (sc.nextInt() == 0) {
					stop = 0;
				}
			} else {
				System.out.println("\nValue not found!!!\nEnter 0 to stop or Enter any value to continue searching");
				if (sc.nextInt() == 0) {
					stop = 0;
				}
			}
		}
		System.out.println("Program completed successfully");
		sc.close();
	}
}