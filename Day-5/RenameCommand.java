package com.day5;

import java.io.File;

public class RenameCommand {

	public static void main(String[] args) {
		
		String existingFileName = args[0];
		String newFileName = args[1];
		
		File existingFile = new File(existingFileName);
		File newFile = new File(newFileName);
		
		if(!existingFile.exists()) {
			System.out.println("File not exists");
			return;
		}else {
			
			if(existingFile.renameTo(newFile)) {
				System.out.println("File renamed successfully");	
			}else {
				System.out.println("File not renamed successfully");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
