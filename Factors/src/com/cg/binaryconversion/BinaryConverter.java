package com.cg.binaryconversion;

public class BinaryConverter {

	public static void main(String[] args) {

		int num = 34,size=calculateSize(num);
		int binaryVal[] = new int[size];
		binaryConverter(binaryVal, num);
		reverseArray(binaryVal);
	}

	public static void reverseArray(int arr[]) {
		int i,temp;
		for(i=0;i<arr.length/2;i++) {		
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		printVal(arr);
	}

	public static void printVal(int arr[]) {
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] binaryConverter(int arr[], int num) {
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i] = num%2;
			num=num/2;
		}	
		return arr;
	}
	
	public static int calculateSize(int num) {
		int size=0,i;
		double a;
		for(i=0;i<num;i++) {
		a = Math.pow(2, i);
		if(a>num)
			break;
		else
			size++;
		}
		return size;
	}
}