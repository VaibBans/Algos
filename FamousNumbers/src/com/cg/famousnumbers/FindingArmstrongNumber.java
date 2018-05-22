package com.cg.famousnumbers;

public class FindingArmstrongNumber {

	public static void main(String[] args) {

		long num = 2000;
		long i;
		System.out.println("Armstrong Number");
		for(i=1;i<=num;i++) {
			long count = tensPower(i);
			long[] arr = new long[(int)count+1];

			arr = arrDigits(i, arr);
			if(i==checkNum(arr, i))
				System.out.println(i);
		}
	}

	public static long tensPower(long num) {
		long i = 0,j = 1, count = 0;
		while(true) {
			i = num/(int)Math.pow(10, j); //i = num%(int)Math.pow(10, j);
			if(i==0) 
				break;
			j++;
			count++;
		}
		return count;
	}

	public static long[] arrDigits(long num,long arr[]) {
		int i,j=1;
		j = (int)Math.pow(10, tensPower(num));
		for(i=0;i<arr.length&&j>=0;i++) {
			arr[i] = num/j;
			num = num%j;
			j = j/10;
		}
		return arr;
	}

	public static long checkNum(long arr[],long num) {
		int i;
		long sum=0L;
		for(i=0;i<arr.length;i++) {
			sum = sum + (int)Math.pow(arr[i],3);
		}
			return sum;
	}
}