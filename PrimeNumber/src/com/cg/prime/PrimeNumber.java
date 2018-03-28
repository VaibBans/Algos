package com.cg.prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number,i,count=0;
		System.out.println("Enter the number");
		number = sc.nextInt();
		for(i=1;i<=number;i++) {
			if(i==number) {
					break;
			}
			else if(number%i!=0) {
				count = 1;
			}
			else if(number%i==0&i!=1){
				count = 0;
				break;
			}
			else if(i==1)
				continue;
		}
		if(count==1)
			System.out.println("Prime number");
		else if(count==0)
			System.out.println("Composite number");
	}
}