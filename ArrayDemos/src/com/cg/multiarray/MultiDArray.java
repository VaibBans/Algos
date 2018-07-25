package com.cg.multiarray;

public class MultiDArray {

	public static void main(String[] args) {

		int[][] arr = new int[5][];
		int i,j,count=0;
		for(i=0;i<arr.length;i++)
			arr[i] = new int[i+1];
		
		for(i=0;i<arr.length;i++)
			for(j=0;j<i+1;j++) {
				arr[i][j] = count++;
			}
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<i+1;j++) 
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}

}
