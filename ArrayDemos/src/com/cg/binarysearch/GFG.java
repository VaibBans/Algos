package com.cg.binarysearch;

import java.util.Arrays;

public class GFG
{
    public static void main(String[] args)
    {
    	 int intArr[] = {7,40,10,20,15,22,35};
    	 
//    	 {40,10,8,20,35};
    	  int intKey = 22;
    	 Arrays.sort(intArr);
    	 System.out.println(Arrays.toString(intArr));
    	 System.out.println(intKey + " found at index = "
                 +Arrays.binarySearch(intArr,intKey));
        
    }
}


/*byte byteArr[] = {10,20,15,22,35};
char charArr[] = {'g','p','q','c','i'};

double doubleArr[] = {10.2,15.1,2.2,3.5};
float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
short shortArr[] = {10,20,15,22,35};
*/ 
// Arrays.sort(intArr);
/* Arrays.sort(byteArr);
Arrays.sort(charArr);

Arrays.sort(doubleArr);
Arrays.sort(floatArr);
Arrays.sort(shortArr);*/


/*    byte byteKey = 35;
char charKey = 'g';

double doubleKey = 1.5;
float floatKey = 35;
short shortKey = 5;*/

   
/* System.out.println(byteKey + " found at index = "
                   +Arrays.binarySearch(byteArr,byteKey));
System.out.println(charKey + " found at index = "
                   +Arrays.binarySearch(charArr,charKey));

System.out.println(doubleKey + " found at index = "
                   +Arrays.binarySearch(doubleArr,doubleKey));
System.out.println(floatKey + " found at index = "
                   +Arrays.binarySearch(floatArr,floatKey));
System.out.println(shortKey + " found at index = "
                   +Arrays.binarySearch(shortArr,shortKey));*/