package com.cg.var;

public class InitializerBlock {
	int a=1,b=2,c=3,d=4;
	{
		a = 1;
		System.out.println("Parent IIB");
	}
	public InitializerBlock(int a){
		this.a = a;
	}
	
	public InitializerBlock() {
		System.out.println("In parent constructor "+a+" "+b+" "+c+" "+d);
	}
	
	/*public void printVal() {
		System.out.println(a+" "+b+" "+c+" "+d);
	}*/
	public static void main(String[] args) {
		InitializerBlock b1 = new InitializerBlock();
//		b1.printVal();
		
		InitializerBlock b2 = new InitializerBlock();
		
	}
}
