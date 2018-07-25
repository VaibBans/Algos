package com.cg.equals;

public class EqualsTest {

	public static void main(String[] args) {

		Equals e1 = new Equals(1,2);

		Equals e2 = new Equals(1,2);
		
		Equals e3 = new Equals(1,2);
		
		if(e1.equals(e1,e2)&&e1.equals(e2, e3)&&e1.equals(e3,e1))
			System.out.println("All are equal");
		else
			System.out.println("Not equal");
		}
}