package com.cg.binaryinsertdata;

public class BinaryInsertData {

	public static void main(String[] args) {

		int arr[] = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 6;
		arr[5] = 7;	
		int i,num=5,temp=0,index,lower=0,upper=arr.length;
		while(true) {
			index = (upper+lower)/2;
			if(arr[index+1]>num) {
				upper = index+1; 
			}
			else if(arr[index-1]<num)
				lower = index;
			System.out.println("Index "+index);
			if(arr[lower]<num&&arr[upper]>num) {
				for(i=0;i<arr.length-upper-1;i++) {
				temp = arr[upper+i];
				arr[upper+i] = num;
				arr[upper+1+i] = temp;
				}
				break;
			}
		}
		for(i=0;i<arr.length;i++)System.out.println(arr[i]);
	}
}