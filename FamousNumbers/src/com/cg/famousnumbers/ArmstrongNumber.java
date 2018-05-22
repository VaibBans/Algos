package com.cg.famousnumbers;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int count = tensPower(num);
		int[] arr = new int[count+1];
		
		arr = arrDigits(num, arr);
		if(checkNum(arr, num))
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
	
	public static int tensPower(int num) {
		int i = 0,j = 1, count = 0;
		while(true) {
			i = num/(int)Math.pow(10, j); //i = num%(int)Math.pow(10, j);
			if(i==0) 
				break;
			j++;
			count++;
		}
		return count;
	}
	
	public static int[] arrDigits(int num,int arr[]) {
		int i,j=1;
		j = (int)Math.pow(10, tensPower(num));
		for(i=0;i<arr.length&&j>=0;i++) {
			arr[i] = num/j;
			num = num%j;
			j = j/10;
			System.out.println(arr[i]);
		}
		return arr;
	}
	
	public static boolean checkNum(int arr[],int num) {
		int i,sum=0;
		for(i=0;i<arr.length;i++) {
			sum = sum + (int)Math.pow(arr[i],3);
		}
		System.out.println("Sum "+sum);
		if(num==sum)
			return true;
		else
			return false;
	}
}