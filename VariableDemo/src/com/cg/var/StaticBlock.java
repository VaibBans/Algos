package com.cg.var;

public class StaticBlock {

	static int x = 10;
	int i;
	public StaticBlock(int i) {
		System.out.println("Constructor called");
	}
	
	static {
		System.out.println("Static Block called");
	}

	public static void main(String[] args) {

		StaticBlock block = new StaticBlock(10);
		StaticBlock a = new StaticBlock(5);
		System.out.println(StaticBlock.x);
	}

}
