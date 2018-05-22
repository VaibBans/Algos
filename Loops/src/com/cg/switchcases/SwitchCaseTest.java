package com.cg.switchcases;

public class SwitchCaseTest {

	public static void main(String[] args) {

		int i = 1;
		switch(i) {
		case 1: System.out.println("One");
			return;
		case 2: System.out.println("Two");
			break;
		case 3: System.out.println("Three");
			
		case 4: System.out.println("Four");
			break;
		case 5: System.out.println("Five");
			break;
		default:System.out.println("Not Matched");		
		}
	}
}