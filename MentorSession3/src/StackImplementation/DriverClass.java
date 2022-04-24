package StackImplementation;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StackUsingQueue stackUsingQueue = new StackUsingQueue();
		System.out.println("Stack Using Two Queues \n");
		char ch;
		do {
			System.out.println("Stack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. check empty");
			System.out.println("4. size");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				stackUsingQueue.push(sc.nextInt());
				break;
			case 2:
				try {
					System.out.println("Popped Element = " + stackUsingQueue.pop());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				System.out.println("Empty status = " + stackUsingQueue.isEmpty());
				break;
			case 4:
				System.out.println("Size = " + stackUsingQueue.getSize());
				break;
			default:
				System.out.println("Enter a valid option \n ");
				break;
			}
			stackUsingQueue.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		sc.close();

	}

}
