package com.ys.hospital;

public class Nurse extends Person {
	
	//private fields
	private String department;
	private String shift;
	
	//constructor with super()
	public Nurse(String personId, String name, int age, String department, String shift) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	//example of method inheritance
	public void assistPatient() {
		System.out.println(getName() + " is assisting patients.");
	}

	//method overriding
	@Override
	public void performDuties() {
		System.out.println(getName() + " is looking after patients.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDepartment: " + department + "\nShift: " + shift;
	}
	
	
}
