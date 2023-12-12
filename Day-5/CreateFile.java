package com.day5;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		File directory = new File("C:/CJava");
		if(!directory.exists()) {
			if(directory.mkdir()) {
				System.out.println("Directory Successfully created");
			}else {
				System.out.println("Failed to create directory");
			}
		}		
		File subDirectory = new File("C:/CJava/java");
		if(!subDirectory.exists()) {
			if(subDirectory.mkdir()) {
				System.out.println("Sub Directory Successfully created");
			}else {
				System.out.println("Failed to create Sub Directory");
			}
		}	
		
		File file = new File("C:/CJava/java/java.txt");
		if(!file.exists()) {
			try {
				if(file.createNewFile()) {
					System.out.println("file Successfully created");
				}else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
				System.out.println("File not craeted");
			}
		}
		
	}
}
