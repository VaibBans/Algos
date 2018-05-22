package com.cg.primitiveconversion;

public class ThisArgument {

	ThisArgument arg;
	int a = 5;
	void display() {
		System.out.println("Hello");
	}
	
	public ThisArgument() {
	
		A a = new A(this);
	}

	public static void main(String[] args) {
		ThisArgument arg = new ThisArgument();
	}

}

class A{
	ThisArgument arg;

	int b = 4;
	public A(ThisArgument arg) {
		super();
		this.arg = arg;
		arg.display();
	}
	
}
