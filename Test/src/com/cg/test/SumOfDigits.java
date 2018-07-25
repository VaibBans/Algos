package com.cg.test;

public class SumOfDigits {
	static long sum = 0;
	public static void main(String[] args) {
		long num = 7861546577486461168L;
		System.out.println(oneDigitSum(num));
	}
	
	public static long sumOfDigits(long num) {
		long sum = 0,rem;
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum+=rem;
		}
		return sum;
	}
	
	public static long oneDigitSum(long num) {
		if(num>9) {
			sum = sumOfDigits(num);
			oneDigitSum(sum);
		}
		return sum;
	}
}