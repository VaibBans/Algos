package com.cg.string;

import java.nio.charset.Charset;

public class StringTest {

	public static void main(String[] args) {
		byte[] byte_arr = {71, 101, 101, 107, 115};
		Charset cs = Charset.defaultCharset();
		String str = new String(byte_arr,1,2,cs);
		
		System.out.println(str);
		System.out.println(str.length());
		
		String s = "hello";
		s = s.replaceAll("hello", "HELLO");
		System.out.println(s);
		
		String s_buff = "ASDF";
		System.out.println(s_buff.contains("A"));
		String str1 = new String(s_buff);
		System.out.println(str1);
	}

}
