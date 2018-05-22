package com.cg.inheritance;

public class Super extends Base{

	
	public static void main(String[] args) {
		Base s1 = new Super();
		System.out.println(s1.b);
		s1.setA(11);
		System.out.println(s1.getA());

	}

}
class Base {
	private int a = 10;
	int b;
	
	protected int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
}