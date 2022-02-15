package com.OOPS.Constructors;

public class Employee {
	String name;
	int empId;
	
	public Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Sayan",101);
		Employee e2 = new Employee("abc",102);
		
		// Emp1
		System.out.println("Employee 1 ::" + e1.name+ " "+e1.empId);
		
		// Emp2
		System.out.println("Employee 2 ::" + e2.name+ " "+e2.empId);
	}

}
