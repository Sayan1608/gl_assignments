package com.btree.postOrderTraversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PostOrderTraversal {

	static Node root = null;
	static int value;
	static Scanner sc = new Scanner(System.in);

	Deque<Node> queue = new LinkedList<Node>();

	// Represent a node of binary tree
	static class Node {
		int key;
		Node left;
		Node right;
	}

	static Node newNode(int data) {
		Node temp = new Node();

		temp.key = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}

	Node insertNode(Node root, int key) {
		// Create a new node
		Node newnode = newNode(key);

		if (root == null) {
			root = newnode;
			queue.add(root);
			return root;
		} else {
			Node node;
			node = queue.remove();

			if (node.left == null) {
				node.left = newnode;
				queue.add(node.left);
				queue.addFirst(node);
				return root;
			} else if (node.right == null) {
				node.right = newnode;
				queue.add(node.right);
				return root;
			}
		}
		return root;
	}

	public void postOrderTraversal(Node root) {

		if (root == null) {
			return;
		} else {
			Node temp = root;
			postOrderTraversal(temp.left);
			postOrderTraversal(temp.right);
			System.out.print(temp.key + " ");
		}
	}

	public static void main(String[] args) {
		PostOrderTraversal obj = new PostOrderTraversal();

		System.out.print("Enter number of nodes to insert :: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter value " + i + " : ");
			root = obj.insertNode(root, sc.nextInt());
		}
		System.out.println("Post Order Traversal :: ");
		obj.postOrderTraversal(root);
	}

}
