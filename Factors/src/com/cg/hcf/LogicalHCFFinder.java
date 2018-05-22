package com.cg.hcf;

public class LogicalHCFFinder {

	public static void main(String[] args) {

		int i,num1=25,num2=50,gcd=1;
		for(i=1;i<num1+num2;i++) {
			if(num1%i==0&&num2%i==0)
				gcd=i;
		}
		System.out.println("GCD is "+gcd);
	}
}