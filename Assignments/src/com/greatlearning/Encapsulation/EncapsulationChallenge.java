package com.greatlearning.Encapsulation;

public class EncapsulationChallenge {

	private int age;
	private boolean decision;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDecision() {
		return decision;
	}

	public void setDecision(boolean decision) {
		this.decision = decision;
	}

	public static void main(String[] args) {

		EncapsulationChallenge obj = new EncapsulationChallenge();
		obj.setAge(70);
		if (obj.getAge() <= 60) {
			obj.setDecision(true);
		} else {
			obj.setDecision(false);
		}

		System.out.println("The age of the candidate is: " + obj.getAge());
		System.out.println("Driving license can be issued to the candidate: " + obj.isDecision());
	}

}
