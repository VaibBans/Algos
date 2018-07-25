package com.cg.thiskeyword;

public class Main extends Check{

	int a,b;
	
	public Main() {
		this(10,20);
	}


	public Main(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Main returnInstance() {
		return this;
	}
	
	public void disp() {
		System.out.println("Using this");
	}
	
	public void objArg(Main m) {
		System.out.println(m.a+" "+m.b);
		System.out.println("Using this keyword "+this.a+" "+this.b);
	}
	
	public void printVal() {
		objArg(returnInstance());
	}


	public static void main(String[] args) {
		
		Main m = new Main();
		m.printVal();
	}

}

class Check{

	public Check() {
		super();
		System.out.println("Parent Class constructor");
	}
	
}
