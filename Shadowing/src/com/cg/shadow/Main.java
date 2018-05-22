package com.cg.shadow;

class A {
	void fun() {
		System.out.println("A.fun()");
	}
}
class B extends A { 
	void fun() {   
		System.out.println("B.fun()");
	}
	static void hello() {
		System.out.println("Hello");
	}
}
public class Main {
	public static void main(String args[]) {
		A a = new B();
		B b = new B();
		a.fun();  // prints A.fun()
		b.fun();
//		a.hello();
	}
}