package com.cg.scope;

public class B{

	public static void main(String[] args) {
		A a = new A();
		System.out.println("Public field "+a.a);
		System.out.println("Protected field "+a.b);
		System.out.println("Default field "+a.c);
//		System.out.println("Private field "+A.d);
	}
}
