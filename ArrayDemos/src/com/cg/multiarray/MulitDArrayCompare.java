package com.cg.multiarray;

public class MulitDArrayCompare implements Cloneable{

	public static void main(String[] args) {
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = arr1.clone();

		System.out.println(arr1==arr2);
		System.out.println(arr1[1]==arr2[1]);
		System.out.println(arr1[1].equals(arr2[1]));
	}

}
