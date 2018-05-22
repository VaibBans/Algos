package com.cg.inheritance;

public class A {

	void display(){
		System.out.println("A's Method");
	}
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();
		
		A b1 = b;
		A c1 = c;
		
		a.display();
		b.display(10);
		c.display();
		
		b1.display();
		c1.display();
		
	}

}

class B extends A{
	
	void display(int a) {
		System.out.println("B's Method");
	}
	
	void print() {
		System.out.println("B's Method");
	}
}

class C extends A{
	
	void display() {
		System.out.println("C's Method");
	}
	
	void printp() {
		System.out.println("C's Method");
	}
}
