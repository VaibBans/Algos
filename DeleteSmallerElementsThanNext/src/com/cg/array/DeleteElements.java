package com.cg.array;

import java.util.Scanner;

public class DeleteElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, k, j, l;
		System.out.println("How many numbers you want to enter");
		num = sc.nextInt();
		int arr[] = new int[num+1];
		System.out.println("Enter the numbers");
		for(i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter how many numbers to be deleted");
		k = sc.nextInt();
		for(i=0;i<k;i++) {
			for(j=0;j<num;j++) {
				if(arr[j]<arr[j+1]) {
					for(l=j;l<num;l++) {
						arr[l] = arr[l+1];
					}
					break;
				}
				else {
					continue;
				}
			}
		}
		for(i=0;i<num;i++) {
			if(arr[i]==0)
				continue;
			else
				System.out.println(arr[i]);
		}
		sc.close();
	}
}