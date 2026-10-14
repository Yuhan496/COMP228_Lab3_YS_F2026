package com.ys.hospital;

public class Surgeon extends Doctor {

	//private fields
	private String surgeryType;
	private String operatingRoom;
    
	//constructor with super()
	public Surgeon(String personId, String name, int age, String specialization, double consulationFee, String surgeryType, String operatingRoom) {
		super(personId, name, age, specialization, consulationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	
	//example of method inheritance
	public void performSurgery() {
		System.out.println(getName() + " is performing " + surgeryType + " in room " + operatingRoom + ".");
	}
	
	//method overriding
	@Override
	public void performDuties() {
		System.out.println(getName() + " is performing a surgery.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSurgery Type: " + surgeryType + "\nOperating Room: " + operatingRoom;
		
	}
}
