package com.cg.userdefinedarray;

public class Test {
	
	public static void main(String[] args) {
		
		int[] sarr = {1};
		int[] scarr = sarr;
		int[][] arr = {{1,2},{3,4}};
		int[][] carr = arr.clone();
		
		carr[0][1] = 10;
			/*
		System.out.println(arr[0]);
		System.out.println(sarr);
		System.out.println(carr[0]);
		System.out.println(arr);
		System.out.println(carr);
		System.out.println(scarr==sarr);*/
		
		System.out.println(carr[0][1]);
		System.out.println(arr[0][1]);
	}
}