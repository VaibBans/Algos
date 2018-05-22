package com.cg.arrayrotation;

public class OneByOneArrayRotation {

	public static void main(String[] args) {

		int arr[] = {1,8,34,90,125,6};
		int i,temp,j,num=2;
		for(i=0;i<num;i++){
			temp = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}