package com.cg.arithmetic;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int a=4;
		float res,b=2;
		
		int result;
		res = a/b;
		result = (int)(a/b);
		System.out.println(res+ " "+result);
		
		int aa = 20, bb = 10, cc = 30, results;
		 
        //result holds max of three
        //numbers
        results = ((aa > bb) ? (aa > cc) ? aa : cc : (bb > cc) ? bb : cc);
        System.out.println("Max of three numbers = "+results);
		
		System.out.println(a);
		System.out.println(a);
		
		
	}
}