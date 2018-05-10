package com.java.ReadWriteOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

	public FileWriting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your text here");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		File f = new File("C:\\Users\\bhanu\\Downloads\\Softwares\\Text.txt");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
