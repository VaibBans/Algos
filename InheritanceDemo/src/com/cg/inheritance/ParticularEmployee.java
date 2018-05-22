package com.cg.inheritance;

public class ParticularEmployee extends Employee {

	String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}	
	
	public void displayDetails() {
		System.out.println("Name "+name+" Designation "+designation+" Salary "+salary);
	}
}