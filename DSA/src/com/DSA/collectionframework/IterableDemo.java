package com.DSA.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			list.add(i * 10);
		}

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		for(Integer i : list) {
			System.out.print(i+" ");
		}
	}

}
