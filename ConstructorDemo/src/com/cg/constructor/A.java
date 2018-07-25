package com.cg.constructor;

public class A {

	int a;
	
	public A(int a) {
		super();
		this.a = a;
		System.out.println("A's parameterized constructor");
	}
	
	public A() {
		super();
		System.out.println("A's default constructor");
	}
}