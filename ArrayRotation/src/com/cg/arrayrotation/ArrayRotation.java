package com.cg.arrayrotation;

public class ArrayRotation {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int i,j=2,k;
		for(i=0;i<arr.length;i++) {
			if(i<arr.length-j) {
				arr[i] = arr[j+i];
			}
			else {
				arr[i] = arr[i-j];
			}
				System.out.println(arr[i]);
		}
	}

}
