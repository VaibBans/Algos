package com.cg.inheritance;

public class FinalMethods {

	int a = 10;
	
	public int dispVal() {
		System.out.println("From Super Class");
		return a;
	}
	
	public static void main(String[] args) {
		FinalMethods a = new A();
		System.out.println(a.dispVal());
		
		FinalMethods a1 = new A();
//		a1.printHello();
		
		A a2 = new A();
		a2.printHello();
	}
}

class A extends FinalMethods{
	
	public int dispVal() {
		return this.a;
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
}