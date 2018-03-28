package com.cg.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MessageWriter {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("demo.txt", "rws");
		FileWriter fw = new FileWriter("demo.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message");
		String message = sc.nextLine();
		int c = raf.read();
		if(c==-1) {
				fw.write(message);
		}
		fw.close();
	}

}
