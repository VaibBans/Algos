package com.cg.primefactorization;

import java.util.Scanner;

public class PrimeInBetweenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,i,j,count=0;
		System.out.println("Enter the number");
		number = sc.nextInt();
		int[] primeNo = primeNUm(number);
		
		for(i=1;i<=number;i++) {
			if(primeNo[i]==0||primeNo[i]==1)
				continue;
			else
				System.out.println(primeNo[i]);
		}
		sc.close();
	}
	
	public static int[] primeNUm(int number) {
		int i,j,count=0;
		int[] primeNo = new int[number+1];
		for(i=1;i<=number;i++) {
				for(j=1;j<=i;j++) {
					if(j==1||j==i)
						continue;
					else if(i%j==0) {
						count=1;
						break;
					}
					else if(i%j!=0) {
						count=0; 
				}
			}
				if(count==0)
					primeNo[i] = i;
		}
		return primeNo;
	}
}
