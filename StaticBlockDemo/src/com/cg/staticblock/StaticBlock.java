package com.cg.staticblock;

public class StaticBlock {

	final static int a;
	 static {
		 System.out.println("Inside static block");
		a=4;
	}
	 
	 {
		 System.out.println("Inside Instance Initializer block");
	 }
	 int b;
	 String str;
	public StaticBlock(int b, String str) {
		super();
		this.b = b;
		this.str = str;
	}
	public StaticBlock() {
		super();
		System.out.println("Inside constructor");
	}
	
	public static void print() {
		int c=1;
		System.out.println(c);
	}
}
