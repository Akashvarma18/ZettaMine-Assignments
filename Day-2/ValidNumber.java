package com.Day2;

import java.util.Scanner;
public class ValidNumber {	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter your phone number: ");
		String number = sc.next();
		Boolean first = number.matches("^[6789][0-9]{9}$");
		if(first) {
			System.out.println("True");
		}else {
			System.out.println("Insert a relevent number");
		}
		
		
		
		
		

	}

}
