package com.cg.equals;

public class EqualityCheck1 implements Cloneable{

	int a;

	public EqualityCheck1(int a) {
		super();
		this.a = a;
	}

	public EqualityCheck1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {

		EqualityCheck1 e1 = new EqualityCheck1(10);
		EqualityCheck1 e2 = (EqualityCheck1) e1.clone();
		EqualityCheck1 e3 = e1;
		
		Object obj;
		obj = (Object)e1;
		
		if(obj.equals(e1))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		if(e1.a==e2.a)
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
		
		System.out.println(e1.a);
		System.out.println(e2.a);
		System.out.println(e3.a);
		
		System.out.println(e1==e3);
	}
}
