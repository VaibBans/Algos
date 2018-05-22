package com.cg.arrayelementdeletion;

public class ArrayElementDeletion {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};
		int i, index = 4,j;
		int length = arr.length;
		for(i=0;i<arr.length;i++) 
			if(arr[i]==index)
				break;		
		
		for(j=i;j<arr.length-1;j++) 
			arr[j] = arr[j+1];
		length--;
		
		for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
/*for(j=0; j<nElems; j++) // look for it
if(arr[j] == searchKey)
break;
for(int k=j; k<nElems-1; k++) // move higher ones down
arr[k] = arr[k+1];
nElems--;*/