package ComaparableandComparatorIntefaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int roll_no;

	@Override
	public int compareTo(Student s) {

		if (this.roll_no == s.roll_no) {
			return 0;
		} else if (this.roll_no > s.roll_no) {
			return 1;
		} else {
			return -1;
		}

	}
	
	

	public Student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}



	public int getRoll_no() {
		return roll_no;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Rahul", 1));
		students.add(new Student("Pritam", 2));
		students.add(new Student("Sreya", 11));
		students.add(new Student("Priya", 4));
		
		Collections.sort(students);
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		// Comparing on the basis of name : 
		
		System.out.println("************************************************************************************");
		
		NameComparator nameComparator = new NameComparator();
		
		Collections.sort(students, nameComparator);
		
		for(Student s : students) {
			System.out.println(s);
		}
		
	}
	
	
	

}
