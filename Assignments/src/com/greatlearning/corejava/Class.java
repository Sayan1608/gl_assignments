package com.greatlearning.corejava;

public class Class { // This is a class

void copyMe() {

System.out.println("Inside copy me method");

}

 

public static void main(String[] args) {

	Class c = new Class();
	c.copyMe(); // executing copyMe() method through object of class
}

}
