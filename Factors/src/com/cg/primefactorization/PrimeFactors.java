package com.cg.primefactorization;

public class PrimeFactors {

	public static void main(String[] args) {
		int num1 = 4;
		prime(num1);
	}
	
	public static int[] prime(int num1) {
		int i=0,j;
		int pfarr[] = new int[num1];
		
		for(i=2,j=0;i<pfarr.length;) {
			if(num1%i==0) {
				num1 = num1/i;
				pfarr[j] = i;
				j++;
				continue;
			}
			else 
				i++;
		}
		for(i=0;i<pfarr.length;i++) {
//			System.out.println(pfarr[i]);
		}
		return pfarr;
	}
}