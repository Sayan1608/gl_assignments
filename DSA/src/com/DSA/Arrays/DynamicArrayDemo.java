package com.DSA.Arrays;

public class DynamicArrayDemo {

	int[] array;
	int size;
	int capacity;

	public DynamicArrayDemo(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
	}

	public void insert(int element) {
		if (capacity == size) {    // when size exceeds capacity increase the array size
			growArray();
		}
		array[size++] = element; // insertion of element and increasing size
	}

	private void growArray() {
		int[] temp = new int[2 * size];
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		array = temp;
		capacity = 2 * size;
	}

	public int delete(int index) {
		if (index >= size) {
			return -1;
		}

		int deletedElement = array[index];
		for (int i = index + 1; i < size; i++) {  // left shift operation
			array[i - 1] = array[i];
		}
		size--;
		return deletedElement;
	}

	public void display() {
		System.out.println("\nArray with size: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n\nArray with capacity: ");
		for (int i = 0; i < capacity; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		DynamicArrayDemo ob = new DynamicArrayDemo(3);
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		ob.insert(50);

		ob.display();

		System.out.println("\nDeleted Element ::" + ob.delete(2));
		ob.display();

	}

}
