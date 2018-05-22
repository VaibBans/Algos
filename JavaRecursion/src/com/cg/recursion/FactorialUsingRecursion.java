package com.cg.recursion;

public class FactorialUsingRecursion {
	
	static 	int fact=1;

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));
	}
	
	public static int factorial(int num) {
		if(num>0) {
			fact = fact*num;
			num--;
			factorial(num);
			}
			return fact;
	}

}
