package com.cg.test;

public class Test {

	static A a;
	void print()
	{
		a.disp();
	}
	
	public static void main(String[] args) {
		a = new A();
		Test t = new Test();
		t.print();
		
	}
	/*private class Hello{
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		Test.Hello hello = t.new Hello();
	}*/
	
	private static class A{
		
		void disp() {
			System.out.println("H");
		}
	}
}
