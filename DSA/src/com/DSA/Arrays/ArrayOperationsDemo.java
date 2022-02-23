package com.DSA.Arrays;

public class ArrayOperationsDemo {

	int[] array;
	int capacity;
	int size;

	public ArrayOperationsDemo(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
	}

	public void insertAtEnd(int element) {
		if (size == capacity) {
			return;
		}
		array[size++] = element;
	}

	public void insertAtIndex(int element, int index) {
		if (size == capacity) {
			return;
		}

		for (int i = index; i < size; i++) {
			array[i + 1] = array[i];
		}
		array[index] = element;
		size++;
	}

	public int deleteFromEnd() {
		int deletedElement = array[size - 1];
		array[size - 1] = 0;
		size--;
		return deletedElement;
	}

	public int deleteFromIndex(int index) {
		if (index >= size) {
			return -1;
		}

		int deletedElement = array[index];
		for (int i = index + 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		size--;
		return deletedElement;
	}

	public void traverse() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public boolean search(int element) {
		for (int e : array) {
			if (e == element) {
				System.out.println("Found");
				return true;
			}
		}
		return false;
	}

	public void sort() {
		for (int i = 0; i < size; i++) {
			boolean isSorted = true;
			for (int j = 0; j < size - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					isSorted = false;
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			if (isSorted) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		ArrayOperationsDemo ob = new ArrayOperationsDemo(10);
		ob.insertAtEnd(10);
		ob.insertAtEnd(20);
		ob.insertAtEnd(18);

		ob.insertAtIndex(25, 2);

		System.out.print("Deleted Element::" + ob.deleteFromEnd());
		System.out.print("\nArray::");

		ob.traverse();

		System.out.print("\nDeleted Element::" + ob.deleteFromIndex(1));
		System.out.print("\nArray::");

		ob.traverse();

		System.out.println(ob.search(10));
		System.out.println(ob.search(20));
		ob.insertAtEnd(20);
		ob.insertAtEnd(17);
		ob.traverse();
		
		ob.sort();
		System.out.print("\nAfter Sorting:");
		ob.traverse();
	}

}
