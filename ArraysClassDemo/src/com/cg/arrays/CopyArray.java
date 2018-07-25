package com.cg.arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int[] arr2 = Arrays.copyOfRange(arr,1,2);
		
		for(int a:arr2)
//			System.out.println(a);
		
		Arrays.fill(arr, 1);
		for(int a:arr)
			System.out.println(a);
		
	}
}
