package com.cg.arraysearch;

public class BinarySearch2 {

	public static void main(String[] args) {
		int arr[] = {1,4,5,96,789,1024,12115,451156};
		int curIn,lower=0,upper=arr.length,num=1024,i=1;
		while(true) {
			curIn = (lower+upper)/2;
			System.out.println("CurIn "+curIn);
			if(arr[curIn]==num) 
				break;
			else if(upper<lower) 
				break;	
			else {
				if(num>arr[curIn])
					lower++;
				else
					upper--;
			}
			if(curIn>arr.length-1)
				break;
			i++;
		}
		if(curIn==arr.length)
			System.out.println("Number not found");
		else
			System.out.println("Number found");
		
		System.out.println("Iterations "+i);
	}

}
