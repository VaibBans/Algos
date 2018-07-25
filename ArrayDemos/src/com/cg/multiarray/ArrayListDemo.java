package com.cg.multiarray;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		System.out.println(arr.get(0));

		Iterator<Integer> itr = arr.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

	public static Integer[] returnArr(Integer arr[]) {
		return arr;
	}
}