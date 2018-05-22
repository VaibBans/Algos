package com.cg.childscope;

import com.cg.scope.A;

public class Child extends A {

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Child c = new Child();
		A a = new A();

		System.out.println("Public field "+c.a);
		System.out.println("Protected field "+c.b);
	}

}
