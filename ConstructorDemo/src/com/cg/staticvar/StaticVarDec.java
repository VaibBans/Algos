package com.cg.staticvar;

public class StaticVarDec {

	final static int a ;
	static int b;
	final int c;
	
	static {
		a = 10;
		b = 1;
	}
	
	public StaticVarDec() {
		super();
		b = 10;
		c = 3;
	}
	

	public static void main(String[] args) {
		
	}
}
