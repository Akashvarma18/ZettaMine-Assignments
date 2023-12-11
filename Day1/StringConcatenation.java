package com.nums;

import java.util.Scanner;

public class StringConcatenation {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter Inmate's Name: ");
		String name = input.nextLine();
		System.out.print("Enter Inmate's father's name: ");
		String fatherName = input.nextLine();
		String pattern = "^[A-Za-z ]+$";
		if(name.matches(pattern) && fatherName.matches(pattern)) {
			
			System.out.println(name.toUpperCase() + " " + fatherName.toUpperCase());		
		}else {
			System.err.println("Invalid Name");
		}
				
	}

}
