package com.cg.factorial;

public class Factorial {

	public static void main(String[] args) {

		int i,fact=1,num=10;
		for(i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
