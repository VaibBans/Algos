package com.cg.instance;

public class A {

	int a = 10;
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		B c = new B();
		
		System.out.println(a instanceof A);
		System.out.println(b instanceof A);
		System.out.println(c instanceof A);
		
		System.out.println("**************************");
		
		System.out.println(a instanceof B);
		System.out.println(b instanceof B);
		System.out.println(c instanceof B);
		
		System.out.println("Using child reference "+c.a);
		
		if(b instanceof A)
			if(b instanceof B)
				System.out.println("Instance of both");
			else
				System.out.println("Instance of child");
		
	}

}

class B extends A{
	
}
