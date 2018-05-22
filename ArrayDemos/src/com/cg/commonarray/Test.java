package com.cg.commonarray;

import java.util.Arrays;

public class Test {

	int arr[];
	int num;

	public Test(int size) {
		arr = new int[size];
		num=size;
	}

	@Override
	public String toString() {
		return "Test [arr=" + Arrays.toString(arr) + ", num=" + num + "]";
	}

	
	
}