package com.ys.hospital;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
	
	//constructor with super()
	public EmergencyDoctor (String personId, String name, int age, String specialization, double consulationFee) {
		super(personId, name, age, specialization, consulationFee);
	}

	//adding method
	public void handleEmergency() {
		System.out.println(getName() + " is handling emergency.");
	}
	
	@Override
	public void prescribeMedication() {
		System.out.println(getName() + " is prescribing medication.");
	}
	
	@Override
	public void generateBill() {
		System.out.println(getName() + " is generating Bill.");
	}
	
	//method overriding
	@Override
	public void performDuties() {
		System.out.println(getName() + " is performing emergency duties.");
	}
}
