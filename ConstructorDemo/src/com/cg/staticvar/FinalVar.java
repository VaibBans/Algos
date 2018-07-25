package com.cg.staticvar;

public class FinalVar {

	final int i;
	int b;
	
	public FinalVar() {
		super();
		i=1;
	}
	
	

	public FinalVar(int b) {
		super();
		this.b = b;
		i=2;
	}



	public static void main(String[] args) {
		
		FinalVar f = new FinalVar();
		FinalVar ff = new FinalVar(10);
		
		System.out.println(f.i);
		System.out.println(ff.i);
	}
}
