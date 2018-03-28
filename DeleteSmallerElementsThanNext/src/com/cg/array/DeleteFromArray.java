package com.cg.array;

import java.math.BigDecimal;
import java.util.Scanner;

public class DeleteFromArray {

	public static void main(String[] args) {

		long a = 1234557;
		Long b = new Long(a);
		b.reverse(a);
		BigDecimal bigDecimal = new BigDecimal(1e2);
		BigDecimal bigDecimal2 = new BigDecimal(2.7182818284590452353602874713527*2.7182818284590452353602874713527
				);
		BigDecimal bigDecimal3 = new BigDecimal(0);
		bigDecimal3 = bigDecimal-bigDecimal2;
		System.out.println("Difference is "+);
		System.out.println("Big value "+bigDecimal);
		System.out.println("value "+b );
		Scanner sc = new Scanner(System.in);
		int num,i,pos;
		System.out.println("How many number you want to enter");
		num = sc.nextInt();
		int arr[] = new int[100];
		System.out.println("Enter the numbers");
		for(i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position from you want to delete the number");
		pos = sc.nextInt();
		if(pos>num) {
			System.err.println("No position in the array");
		}
		else {
			for(i=pos;i<num;i++) {
				arr[pos-1] = arr[pos];
			}
			System.out.println("Printing the values");
			for(i=0;i<num;i++) {
				System.out.println(arr[i]);
			}
		}	
	}
}