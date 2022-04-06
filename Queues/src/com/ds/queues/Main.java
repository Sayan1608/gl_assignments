package com.ds.queues;

public class Main {

	public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation(4);
		
		q.enqueue(10);
		q.enqueue(20);
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
	}

}
