package com.DSA.collectionframework;

/*
 * ArrayList Demo
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		
		list2.addAll(list1);
		
		System.out.println("list2: "+list2);
		
		list2.add(3, 101);
		System.out.println("list2: "+list2);
		
		list2.set(4, 501);
		System.out.println("list2: "+list2);
		
		list1.remove(1);
		
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		
		System.out.println("Element at 3rd index: "+list2.get(3));
		
	}

}
