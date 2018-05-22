package com.cg.finaldemo;

public class FinalDemo {

	final static int a=1;
	final int b;
	final static String str;
	final int c;
	{
		b = 10;
	}
	
	static {
		str = "A";
	}
	public FinalDemo(int a) {
		super();
		c=a;
//		this.a = a;
			
	}
	
	
	public FinalDemo() {
		super();
		c=6;
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
		final int i;
		i=10;
  
		
		FinalDemo d1 = new FinalDemo(111);
		FinalDemo d = new FinalDemo();
			
		System.out.println(d1.c);
		System.out.println(d.c);
		System.out.println(d.a+1);
		System.out.println(d.b);
		System.out.println(d.str);
	}
}
