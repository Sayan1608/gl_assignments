package com.ds.queues;

public class QueueImplementation {

	private int maxsize;
	private int front;
	private int rear;
	private int[] arr;

	public QueueImplementation(int maxsize) {
		this.maxsize = maxsize;
		arr = new int[this.maxsize];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == maxsize - 1) {
			return true;
		}
		return false;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue overflow.");
		} else {
			if (front == -1) {
				front = 0;
			}
			arr[++rear] = data;
			System.out.println(arr[rear] + " inserted.");
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue underflow.");
		} else {
			System.out.println(arr[front] + "deleted.");

			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}

		}
	}

}
