package com.DSA.collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("List: "+list);
		
		list.add(10);
		System.out.println("List: "+list);
		
		list.add(1,15);
		System.out.println("List: "+list);
		
		list.addFirst(100);
		System.out.println("List: "+list);
		System.out.println(list.offer(98));
		
		System.out.println("List: "+list);
		
		System.out.println(list.peek());
		
		System.out.println("Polled Element: "+list.poll());
		System.out.println("List: "+list);
	}

}
