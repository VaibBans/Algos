package com.cg.thiskeyword;

public class A {

	B b;

	public A(B b) {
		super();
		this.b = b;
		System.out.println("Constructor agument");
	}

	public A() {
		super();
	}
	public static void main(String[] args) {
		B b = new B(1);
	}
}


class B{
	
	int a = 1;

	public B(int a) {
		super();
		A p = new A(this);
		this.a = a;
	}
	
	
	public B() {
		
	}
	
	
}