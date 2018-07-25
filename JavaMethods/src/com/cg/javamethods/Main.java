package com.cg.javamethods;

public class Main {

	int x;
	
	public Main(int x) {
		super();
		this.x = x;
	}

	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Main m = new Main(5);
	
		System.out.println("Hashcode of passed param " +m);
		change(m);
		System.out.println(m.x);
	}

	public static void change(Main m) {
		m = new Main(10);
		System.out.println("Hashcode of change object " +m);

	}
}
