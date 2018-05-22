package com.cg.recursion;

public class JavaRecursion {
	static int i=0;

	public static void main(String[] args) {
		recursion();
	}

	static void recursion() {
		i++;
		if(i<10) {
		System.out.println("Value of i "+i);
		recursion();
		}
			
	}
}
