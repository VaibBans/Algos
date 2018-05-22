package com.cg.variablescope;

public class VariableScope {

	static int a = 10;
	static int b = 5;
	public static void main(String[] args) {
		a = 5;
		System.out.println("In main value of a "+a );
		System.out.println("In main value of b "+b);
		diffMain();
	}

	public static void diffMain() {
		a = 10;
		b = 20;
		System.out.println("Indifferent function value of b "+b);
		System.out.println("In different function value of a "+a);
	}

}
