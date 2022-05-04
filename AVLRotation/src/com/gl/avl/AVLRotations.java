package com.gl.avl;

public class AVLRotations {

	// BST node
	static class Node {
		int key, height;
		Node left, right;
	};

	// creation of new node
	static Node newNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.height = 1;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	public int getHeight(Node N) {
		if (N == null)
			return 0;
		return N.height;
	}

	public int findMax(int a, int b) {
		return (a > b) ? a : b;
	}

	public int getBalanceFactor(Node N) {
		if (N == null)
			return 0;
		return getHeight(N.left) - getHeight(N.right);
	}

	private Node leftRotation(Node y) {
		Node x = y.right;
		Node T2 = x.left;

		// performing left-rotation

		x.left = y;
		y.right = T2;

		// updating the heightts
		y.height = 1 + findMax(getHeight(y.left), getHeight(y.right));
		x.height = 1 + findMax(getHeight(x.left), getHeight(x.right));
		return x;
	}

	private Node rightRotation(Node y) {
		// TODO Auto-generated method stub
		Node x = y.left;
		Node T2 = x.right;

		// perform rotation

		x.right = y;
		y.left = T2;

		// updating the heights
		y.height = 1 + findMax(getHeight(y.left), getHeight(y.right));
		x.height = 1 + findMax(getHeight(x.left), getHeight(x.right));

		return x;
	}

	public Node insert(Node node, int key) {
		// create node
		if (node == null) {
			return (newNode(key));
		}

		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		else // Duplicate keys not allowed
			return node;

		node.height = 1 + findMax(getHeight(node.left), getHeight(node.right));
		int balance = getBalanceFactor(node);

		// 1. Right rotation case
		if (balance > 1 && key < node.left.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Right Rotation");
			return rightRotation(node);

		} // 2. Left rotation case
		if (balance < -1 && key > node.right.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Left Rotation");
			return leftRotation(node);
		}
		// Left Right rotation case

		if (balance > 1 && key > node.left.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Left Right Rotation");
			node.left = leftRotation(node.left);
			return rightRotation(node);
		}

		// Right Left rotation case

		if (balance < -1 && key < node.right.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Right Left Rotation");
			node.right = rightRotation(node.right);
			return leftRotation(node);
		}

		return node;
	}

	public void Inorder(Node root) {
		if (root == null)
			return;
		else {
			Inorder(root.left);
			System.out.print(root.key + "{" + root.height + "}" + " ");
			Inorder(root.right);
		}
	}

	public static void main(String[] args) {
		AVLRotations avl = new AVLRotations();
		Node root = null;
		int value = 0;

		int[] arr = { 50,70,60,80,40 };

		for (int i = 0; i < arr.length; i++) {
			value = arr[i];
			System.out.println("\nInserting " + value + " to tree");
			root = avl.insert(root, value);
			// Print inorder traversal of the BST
			System.out.println("\nInorder of Binary tree. '{}' contains height of node");
			avl.Inorder(root);
			System.out.println();
		}

	}

}
