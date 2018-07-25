package com.cg.constructor;

public class CopyConstructor {

	int a,b;
	
	public CopyConstructor(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	CopyConstructor() {
		super();
	}
	
	public CopyConstructor(CopyConstructor cc) {
		super();
		System.out.println("Copy Constructor");
		a = cc.a;
		b = cc.b;
	}

	public static void main(String[] args) {
		
		CopyConstructor c1 = new CopyConstructor(10,20);
		CopyConstructor c2 = new CopyConstructor(c1);
		CopyConstructor c3 = new CopyConstructor();
		
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		System.out.println(c2.a+c2.b);
	}
}