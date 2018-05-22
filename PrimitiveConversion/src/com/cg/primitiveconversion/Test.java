package com.cg.primitiveconversion;

public class Test implements Cloneable{

	
	int n;
	
	public Test(int n) {
		super();
		this.n = n;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		Test obj = new Test(10);
		Test obj1 = (Test) Class.forName("com.cg.primitiveconversion.Test").newInstance();
		obj.printHello();
		obj1.nonStatic();
		
		obj = new Test(); // Change the previous obj value 
		
		System.out.println(obj.n);
				
		Test obj2 = (Test)obj.clone();
		
		System.out.println(obj.n);
		System.out.println(obj1.n);

		System.out.println(obj2.n);
	}

	public static void printHello() {
		System.out.println("Hello");
	}
	
	public void nonStatic() {
		System.out.println("Hi");
	}

}
