package com.cg.inheritance;

public class EmpApp {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		ParticularEmployee employee = new ParticularEmployee();
		
		employee1.setName("ABC");
		employee1.setSalary(1212115);
		
		
		employee.setDesignation("Manager");
		employee.setName("XYZ");
		employee.setSalary(1000000);
		
		employee.displayDetails();
		
	}

}
