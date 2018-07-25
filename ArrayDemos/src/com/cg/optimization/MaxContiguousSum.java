package com.cg.optimization;

public class MaxContiguousSum {

	public static void main(String[] args) {

		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max = 0, sum = 0,i,sIndex=0,eIndex=0,count=0;
		for(i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			if(sum<0) {
				sum=0;
				sIndex=0;
				count=0;
			}

			if(max<sum) {
				max = sum;
				eIndex=i;
			}

			if(sum>0&&max>=sum&&count==0) {
				sIndex=i;
				count=1;
			}
		}
		System.out.println(max);
		for(i=sIndex;i<eIndex;i++)
			System.out.print(arr[i]+",");
		System.out.println(arr[i]);
	}
}
