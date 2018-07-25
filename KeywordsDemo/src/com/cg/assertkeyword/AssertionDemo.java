package com.cg.assertkeyword;

public class AssertionDemo {

	public static void main(String[] args) {

		boolean bool = false;
		try {
		int weight = 5;
		assert weight>20 : bool = true;
		System.out.println(weight);
	}catch(AssertionError ae) {
		System.out.println("underweight");
	}
		System.out.println("bool value "+bool);
	}
}
