package com.cg.constructor;

public class C extends P{

	@Override
	public void disp() throws ArithmeticException{
		System.out.println("Hello in Sub Class");
	}
	
	public static void main(String[] args) throws Exception{
		C c = new C();
		
		c.disp();
	}
}
