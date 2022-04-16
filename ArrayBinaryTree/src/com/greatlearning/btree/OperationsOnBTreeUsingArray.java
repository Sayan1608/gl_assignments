package com.greatlearning.btree;

import java.util.Scanner;

public class OperationsOnBTreeUsingArray {
	private static Scanner in = new Scanner(System.in);

	private static int[] tree = new int[2], tmpTree;
	private int size, key;
	private int tIndex, searchIndex;

	public void insertValues() {

		System.out.print("Enter the number of values to be inserted in array binary tree :: ");
		size = in.nextInt();
		tree = new int[size + 1];

		for (tIndex = 1; tIndex <= size; tIndex++) {
			System.out.print("Enter value " + tIndex + ":: ");
			int val = in.nextInt();

			if (val != 0) {
				tree[tIndex] = val;
			} else {
				System.out.println("cannot use 0. Reserved for other purpose. Insert different value");
				tIndex--;
			}
		}
		tIndex--;

	}

	public void insertNewValues() {

		System.out.println("\nAccept number of values to input");
		size = in.nextInt();

		if (tIndex + size + 1 > tree.length) { // used when the no of values is greater than the array length
			// set size of tmptree array to new size
			tmpTree = new int[tIndex + size + 2];
			// copy from tree to tmptree
			System.arraycopy(tree, 0, tmpTree, 0, tree.length);
			// set tree to new array size
			tree = new int[tmpTree.length];
			// copy the values from tmptree to tree
			System.arraycopy(tmpTree, 0, tree, 0, tree.length);
			// insert the values to tree array of new size
			insert(size);

		}
	}

	private void insert(int s) {

		while (s > 0) {

			tIndex++;
			System.out.print("Enter value " + tIndex + ":: ");
			int val = in.nextInt();
			if (val != 0) {
				tree[tIndex] = val;
				s--;
			} else {
				System.out.println("cannot use 0. Reserved for other purpose. Insert different value");
				tIndex--;
			}
		}

	}

	// print array binary tree level by level

	public void printTree() {

		System.out.println("Binary Tree in level by level order. Root is: " + tree[1]);

		for (int j = 1; j <= tIndex; j++) {

			if (tree[j] != 0) { // 0 in the array represents blank space or no value

				System.out.print(tree[j] + " ");

			}

		}

		System.out.println("\n");

	}

	// using the printFamily method construct the updated tree

	public void printFamily() {

		System.out.println("Construct updated tree based on the below details.....");

		for (int j = tIndex; j > 1; j--) {

			if (tree[j] != 0) {

				System.out.println("\nParent of " + tree[j] + " is:" + tree[j / 2]);

				if (2 * j <= tIndex && tree[2 * j] != 0) {

					System.out.println("\tleft Child of " + tree[j] + " is: " + tree[2 * j]);

				}

				if (2 * j + 1 <= tIndex && tree[2 * j + 1] != 0) {

					System.out.println("\tRight Child of " + tree[j] + " is: " + tree[2 * j + 1]);

				}

			}

		}

	}

	public void deleteValue() {

		System.out.println("Enter value to delete");

		key = in.nextInt();

		if (key != 0) {

			searchIndex = searchValue(key);

			if (searchIndex != -1) {

				if (searchIndex == tIndex) { // if deletion value is last value then delete and decrement i

					tree[searchIndex] = 0;

					tIndex -= 1;

				} else {

					tree[searchIndex] = tree[tIndex]; // replace deletion value

					tree[tIndex] = 0; // make deepest rightmost value to 0

					tIndex -= 1;

				}

				printTree();

				printFamily();

				System.out.println("Value found and deleted!!!");

			} else { // if variable val is -1

				System.out.println("\nValue " + key + " does not exist in the tree\n");

			}

		} else { // if deletion value is 0

			System.out.println("Value 0 does not exist!!!");

		}

	}

	private int searchValue(int keyVal) {
		for (int k = 1; k <= tIndex; k++) {
			if (tree[k] == keyVal)
				return k;
		}
		return -1;
	}

	public static void main(String[] args) {

		String status = "c";
		int ch = 0;

		OperationsOnBTreeUsingArray op = new OperationsOnBTreeUsingArray();

		do {

			System.out.println("0. Exit\n1. Insert\n2. Deletion\n3. Print Binary Tree\nEnetr your choice");
			ch = in.nextInt();

			switch (ch) {

			case 0: // change status to "s" and exit.
				status = "s";
				break;
			case 1: // Insertion
				if (tree[1] != 0) {
					// when tree is not empty
					op.insertNewValues();

				} else {
					// when tree in empty
					op.insertValues();
				}
				break;
			case 2: // Deletion
				if (tree[1] != 0) {
					op.deleteValue();
				} else {
					System.out.println("Tree is Empty!!.Cannot Delete!!");
				}
				break;
			case 3: // Print Binary Tree
				if (tree[1] != 0) { // when tree is not empty
					op.printTree();
					op.printFamily();
				} else { // tree is Empty
					System.out.println("Tree is Empty!!!");
				}
				break;

			}

		} while (!status.equalsIgnoreCase("s"));
	}

}
