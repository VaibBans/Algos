package com.cg.primitiveconversion;

public class Obj {
//	Obj obj = new Obj(new Obj());
	
	
	public Obj(Obj obj) {
		super();
		System.out.println("Parameterized Constructor");
	}
	
	public Obj() {
		super();
		System.out.println("Empty Constructor");
	}


	public static void main(String[] args) {
		Obj obj1 = new Obj(  new Obj());

	}
}
