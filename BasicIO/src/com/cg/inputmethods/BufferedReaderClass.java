package com.cg.inputmethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws Exception{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String a = buff.readLine();
		System.out.println(Integer.parseInt(a));
	}

}
