package com.cg.var;

public class DerivedInitializerBlock extends InitializerBlock{

	int e,f;
	
	{
		e = 5;
		f = 6;
		System.out.println("Child IIB");
	}
	
	public DerivedInitializerBlock() {
		System.out.println("Super Construtor Invoked");
	}
	

	public static void main(String[] args) {
		DerivedInitializerBlock d1 = new DerivedInitializerBlock();
		
	}

	

	

}
