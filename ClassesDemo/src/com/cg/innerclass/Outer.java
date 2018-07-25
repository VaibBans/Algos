package com.cg.innerclass;

public class Outer {

	int a = 1;
	
	class nonStaticInner{
		int x = 1;
		public void print() {
			System.out.println("Inner class "+x);
			System.out.println("Accessing outer class variable "+a);
		}
	}
	
	public static class StaticInner{
		
	}
	public static void main(String[] args) {
		
		int mainVariable = 1;
		Outer outer  =new Outer();
		Outer.nonStaticInner i = outer.new nonStaticInner();
		
		StaticInner sInner = new StaticInner();
	}

}
