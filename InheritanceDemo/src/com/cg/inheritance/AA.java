package com.cg.inheritance;

public class AA {

	static int a = 5;
	
	public static void printVal() {
		System.out.println("Main Class "+a);
	}
	
	public static void main(String[] args) {

		final AA aa;
	
		AA a = new AA();
		AA b = new AB();
		a.printVal();
		aa = a;
		AB.printVal();
		
	}

}
class AB extends AA{
	
	public static void printVal() {
		System.out.println("Derived Class "+a);
	}
}