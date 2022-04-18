package com.btree.levelOrderTraversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LevelOrderTraversal {

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

	public void levelOrderTraversal(Node root) {
		if (root != null) {
			System.out.println("Level Order Traversal ::");
			Node temp = root;
			Deque<Node> queue = new LinkedList<LevelOrderTraversal.Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				temp = queue.poll();
				System.out.print(temp.key + " ");
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}

		} else {
			System.out.println("Tree is Empty.");
			return;
		}

	}

	public static void main(String[] args) {

		LevelOrderTraversal obj = new LevelOrderTraversal();

		root = obj.insertNode(root, 10);
		root = obj.insertNode(root, 20);
		root = obj.insertNode(root, 30);
		root = obj.insertNode(root, 40);
		root = obj.insertNode(root, 50);

		obj.levelOrderTraversal(root);
	}

}
