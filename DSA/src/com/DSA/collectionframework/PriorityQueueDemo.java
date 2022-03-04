package com.DSA.collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();

		queue.add("Sayan Sengupta");
		queue.add("Ayan Mukherjee");
		queue.add("Farhan Akhtar");
		queue.add("Emran Hashmi");

		System.out.println("Queue: " + queue);

		Iterator<String> itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println("Queue: " + queue);
		
		queue.remove();
		System.out.println("Queue: " + queue);
		
		queue.poll();
		System.out.println("Queue: " + queue);
	}

}
