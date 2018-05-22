package com.cg.famousnumbers;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num1=0,num2=1,num3,i,noOfTerms = 10;
		System.out.print(num1+", "+num2+", ");
		for(i=3;i<noOfTerms;i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3+", ");
		}
		num3 = num1+num2;
		System.out.println(num3);
	}
}