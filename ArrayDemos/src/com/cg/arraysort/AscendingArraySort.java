package com.cg.arraysort;

public class AscendingArraySort {

	public static void main(String[] args) {

		int arr[] = {4,2,5,6,1,1,1,1,1,3,8,9,10,11,12,13,15,14,45,89};

		sortAscendingArray(arr);
		printArr(arr);
		sortDescendingArray(arr);
		System.out.println("***********************");
		printArr(arr);

	}

	public static void printArr(int arr[]) {
		int i;
		for(i=0;i<arr.length;i++)
			if(arr[i]!=0)
				System.out.println(arr[i]);
			else
				System.out.println("Null Value");
	}

	public static void sortAscendingArray(int arr[]) {
		int i,j,temp,min;

		for(i=0;i<arr.length;i++) {
			min = arr[i];
			for(j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					temp = arr[i];
					arr[i] = min;
					arr[j] = temp;
				}
			}
		}
	}

	public static void sortDescendingArray(int arr[]) {
		int i,j,temp,max;

		for(i=0;i<arr.length;i++) {
			max = arr[i];
			for(j=i;j<arr.length;j++) {
				if(arr[j]>max) {
					max = arr[j];
					temp = arr[i];
					arr[i] = max;
					arr[j] = temp;
				}
			}
		}
	}
}