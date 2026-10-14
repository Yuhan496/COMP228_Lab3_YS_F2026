package com.ys.hospital;

public class Person {
	
	//private fields
	private String personId;
	private String name;
	private int age;
	
	//constructor
	public Person(String personId, String name, int age) {
		this.personId = personId;
		this.name = name;
		this.age = age;
	}
	
	//method performDuties
	public void performDuties() {
		System.out.println(this.name + " is performing hospital duties.");
	}
	
	//get attributes
	public String getPersonId() {
		return personId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ID: " + personId + "\nName: " + name + "\nAge: " + age;
	}
}
