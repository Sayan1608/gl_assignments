package com.DSA.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		System.out.println("Hash Set : " + set);

		set.add("Sayan");
		set.add("Ayan");

		System.out.println("Hash Set : " + set);

		set.add("Piyush");
		System.out.println("Hash Set : " + set);

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		set.add("Ismail");
		System.out.println("Hash Set : " + set);
		
		set.add("Sayan"); // duplicates are not allowed in Set 
		System.out.println("Hash Set : " + set); // ordering is not mainted in a HashSet

	}

}
