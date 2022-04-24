package StackImplementation;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> queue;
	Queue<Integer> tempQueue;

	public StackUsingQueue() {
		queue = new LinkedList<Integer>();
		tempQueue = new LinkedList<Integer>();
	}

	public void push(int data) {

		// if queue is empty
		if (queue.size() == 0)
			queue.add(data);
		else {
			// if queue is not empty, first remove all the elements and store in tempqueue
			// add the new element in queue
			
			int size = queue.size();
			for (int i = 0; i < size; i++)
				tempQueue.add(queue.remove());

			queue.add(data);

			// now copy the elements back from tempQueue to queue
			for (int i = 0; i < size; i++) {
				System.out.println(tempQueue.peek());
				queue.add(tempQueue.remove());
				
			}
			

		}

	}

	public int pop() {
		if (queue.size() == 0)
			throw new NoSuchElementException();
		return queue.remove();
	}

	public void display() {

		if (queue.size() == 0) {
			System.out.println("\nEmpty");
		} else {
			for (Integer val : queue)
				System.out.print(val + " ");
		}
	}

	public int getSize() {
		return queue.size();
	}

	public boolean isEmpty() {
		return (queue.size() == 0);
	}

}
