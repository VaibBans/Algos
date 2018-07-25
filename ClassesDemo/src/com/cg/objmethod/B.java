package com.cg.objmethod;

public class B {

	public static void main(String[] args) {
		A a1 = new A(10) {
			public void print() {
				System.out.println("Overriding method while object creating using parameterized constructor");
				System.out.println("Value "+a);
			}
		};
		a1.print();
		
		A a2 = new A() {
			public void print() {
				System.out.println("Overriding method while object creating using non-parameterized constructor");
				System.out.println("Value "+a);
			}
		};
		a2.print();
	}
}