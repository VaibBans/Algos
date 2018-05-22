package com.cg.recursion;

public class FibonacciRecursion {

	static 	int i=1;

	public static void main(String[] args) {

		fibo(10);
	}

	public static int fibo(int num) {
		while(i<=num) {
			System.out.println(i+" ");
			i = i+fibo(num);
		}
		return i;
	}
}