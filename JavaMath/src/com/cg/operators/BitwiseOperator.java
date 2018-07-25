package com.cg.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int x = 33;
		int y = 48;
			if((x&y)==x)
				System.out.println(x+ " is smaller than "+y);
			else
				System.out.println(y+ " is smaller than "+x);
			System.out.println(x&y);
	}
}
