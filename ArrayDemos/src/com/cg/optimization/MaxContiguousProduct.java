package com.cg.optimization;

import java.util.Arrays;

public class MaxContiguousProduct {

	public static void main(String[] args) {
		
		int[] arr = {-2, -3, 4, -1, -2, -1, 5, -3};
		int maxProd=1,i,count=0;
		Arrays.sort(arr);
		for(int j:arr) {
			if(j<0)
				count++;
		}
		if(count%2==0) {
			for(i=0;i<arr.length;i++)
				maxProd*=arr[i];
		}
		else {
			for(i=1;i<arr.length;i++) {
				maxProd*=arr[i];
			}
		}
		System.out.println("Max product is "+maxProd);
		
	}

}
