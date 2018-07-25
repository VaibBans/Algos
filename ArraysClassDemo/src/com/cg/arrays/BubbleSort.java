package com.cg.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {4,1,5,3,6,7,8,2,45,56,89,23,450,115};
		bubbleSort(arr);
		print(arr);
	}

	public static int[] bubbleSort(int[] arr) {
		int i,flag;
		while(checkArr(arr)==1) {
			for(i=0;i<arr.length-1;i++) {
				if(arr[i+1]<arr[i]) {
					flag = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = flag;
				}
			}
			bubbleSort(arr);
		}
		return arr;
	}

	public static int checkArr(int[] arr) {
		int i,count=0;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1])
				continue;
			else { 
				count=1;
				break;
			}
		}
		return count;
	}
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
