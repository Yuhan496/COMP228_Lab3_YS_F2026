package com.ys.hospital;

public class Doctor extends Person{
  
	//private fields
	private String specialization;
	private double consulationFee;
	
	//constructor with super()
	public Doctor(String personId, String name, int age, String specialization, double consulationFee) {
		super(personId, name, age);
		this.specialization = specialization;
		this.consulationFee = consulationFee;
	}
	
	//example of method inheritance
	public void diagnosePatient() {
		System.out.println(getName() + " is diagnosing patients.");
	}
	
	//method overriding 
	@Override
	public void performDuties() {
		System.out.println(getName() + " is examining patients.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSpecialization: " + specialization + "\nConsulationFee: $" + consulationFee;
	}
}

