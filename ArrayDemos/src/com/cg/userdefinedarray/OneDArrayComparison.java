package com.cg.userdefinedarray;

import java.util.Arrays;

public class OneDArrayComparison implements Cloneable{

	public static void main(String[] args) {

		int[] arr1 = {1};
		int[] arr2 = arr1.clone();
		
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println(Arrays.equals(arr1, arr2));
	}

}
