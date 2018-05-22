package com.cg.primitiveconversion;

public class ThisDemo {

	int a,b;
	 ThisDemo(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	 ThisDemo() {
		this(1,2);
	}
	public static void main(String[] args) {

		ThisDemo dmo = new ThisDemo();
		System.out.println(dmo.a);
		System.out.println(dmo.b);
	}
}
