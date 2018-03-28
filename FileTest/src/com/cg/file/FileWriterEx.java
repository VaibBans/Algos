package com.cg.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		FileWriter fw = null;
		FileReader fr = null;
		int count;
		try {
			fw = new FileWriter("file.txt",true);
			fr = new FileReader("file.txt");
			int c = fr.read();
			if(c==-1) {
				System.out.println("In if");
				fw.write((char)49);
			}
			while(c!=-1&&c<52) {
			System.out.println("In while loop");
			c=fr.read();
			System.out.println("Value of C-"+c);
			int val = c+1;
			System.out.println("Value of val  "+val);
			fw.write((char)(val));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Success");
		fr.close();                             //it is mandatory to close the streams for writing in file
		fw.close();
	}
}
