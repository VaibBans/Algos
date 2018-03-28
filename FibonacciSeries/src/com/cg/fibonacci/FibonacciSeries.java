package com.cg.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int val = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int arr[] = new int[num+1];
		for(int i=0;val<num;) {
			if(val==0) {
				System.out.print(val+", ");
				arr[i] = val;
				val = i+1;	
			}
			else {
				if(i==0)
					val = val+arr[i];
				else {
					arr[i] = val;
					val = val+arr[i-1];
				}
				i++;
				if(val<num)
					System.out.print(val+", ");
				else
					System.out.println();
			}	
		}
		sc.close();
	}
}