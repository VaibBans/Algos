package com.cg.arraysearch;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {1,4,5,96,789,1024,12115,451156};
		int i=1,curVal,num = 1024,origin=0;
		curVal = (arr.length)/2;
		while(true) {
			System.out.println("CurVal "+curVal);
			if(arr[curVal]==num) 
				break;
			
			else if(arr[curVal]<num) {
				origin = curVal;
				curVal = curVal+(arr.length-curVal)/2;
				i++;
			}
			else if(arr[curVal]>num) {
				curVal = (origin+curVal)/2;
				i++;
			}
			if(i>arr.length-1)
				break;
		}
		if(i<arr.length-1)
			System.out.println("Number found");
		else
			System.out.println("Number Not found");
		System.out.println(i);
	}
}