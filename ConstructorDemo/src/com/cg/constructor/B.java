package com.cg.constructor;

public class B extends A{

	int num;
	
	public B(int a,int num) {
		super(a);
		this.num = num;
	}
	
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		A a = new B(1,10);
		B b = new B(2,11);
		
		A c = new B();
		B d = new B();
	}

}
