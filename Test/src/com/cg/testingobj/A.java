package com.cg.testingobj;

public class A {
	
	class B{
		
	}
	B b1;
	A a;
	A b;
	int x=10;
	
	B disp() {
		System.out.println(b1);
		return new B();
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println(a1.a.a.a);
		if(a1.a==null)
			a1.a = new A();
		if(a1.b==null)
			a1.b = new A();
		
		if(a1.a.b==null)
			a1.a.b = new A();
		System.out.println(a1.b);
		System.out.println(a1.a.b.a);
	}
}
