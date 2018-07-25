package com.cg.multiarray;

public class MultiDimArray {

	public static void main(String[] args) {

		int[][] multiArr= {{1,2,3,4},{5,6,7,8,9,10,11,12,13}};
		
		int[][] arr = new int[2][5];
		
		System.out.println("Multi Array Previous Length "+arr[0].length);
		System.out.println("Multi Array Previous Length "+arr[1].length);
		
		arr[0] = new int[3];
		arr[1] = new int[4];  //jagged arrays
		
		System.out.println("Multi Array Length "+arr[0].length);
		System.out.println("Multi Array Length "+arr[1].length);
//		for(int i=0;i<arr.length;i++)
		
		for(int[] a:multiArr) {
			for(int b: a) {
				System.out.print(b);
			}
				System.out.println();
		}
	}

}
