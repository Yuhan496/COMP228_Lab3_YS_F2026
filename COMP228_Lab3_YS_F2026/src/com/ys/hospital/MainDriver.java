package com.ys.hospital;

public class MainDriver {

	public static void main(String[] args) {
		
		//creating objects
		Doctor doctor = new Doctor("A01", "Dave Johnson", 36, "Cardiology", 100.00);
		Nurse nurse = new Nurse("B01", "Nancy Nateson", 45, "Birth Center", "Night");
		Surgeon surgeon = new Surgeon("C01", "Jay Smith", 39, "General Surgery", 200.00, "Appendctomy", "RA-3");
		EmergencyDoctor emergencyDoctor = new EmergencyDoctor("D01", "David Lee", 38, "Emergency", 150.00);

		//display details of doctor and methods
		System.out.println(doctor);
		doctor.diagnosePatient();
		doctor.performDuties();
		
		//display details of nurse and methods
		System.out.println(nurse);
		nurse.assistPatient();
		nurse.performDuties();
		
		//display details of surgeon and methods
		System.out.println(surgeon);
		surgeon.performSurgery();
		surgeon.performDuties();
		
		//display details of emergency doctor and methods
		System.out.println(emergencyDoctor);
		emergencyDoctor.handleEmergency();
		emergencyDoctor.performDuties();
		emergencyDoctor.prescribeMedication();
		emergencyDoctor.generateBill();
		
		//polymorphism
		System.out.println("\nDemonstration of Polymorphism");
		Person person;
		
		person = doctor;
		person.performDuties();
		
		person = nurse;
		person.performDuties();
		
		person = surgeon;
		person.performDuties();
		
		person = emergencyDoctor;
		person.performDuties();
		
		//interface
		System.out.println("\nDemonstration of interface");
		
		MedicalProfessional medical = emergencyDoctor;
		Billable billing = emergencyDoctor;
		
		medical.prescribeMedication();
		billing.generateBill();
	}

}
