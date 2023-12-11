package com.nums;

import java.util.Scanner;

public class NumberToWord {
	
	public static String digitToWords(int n) {
		
		if(n==1) {
			return "One";
		}else if(n==2) {
			return "Two";
		}else if(n==3) {
			return "Three";
		}else if(n==4) {
			return "Four";
		}else if(n==5) {
			return "Five";
		}else if(n==6) {
			return "Six";
		}else if(n==7) {
			return "Seven";
		}else if(n==8) {
			return "Eight";
		}else if(n==9) {
			return "Nine";
		}else
			return "Zero";			
	}
	
		
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String output = "";		
		String strnum=String.valueOf(number);
		
		for(int i = 0; i<strnum.length(); i++) {			
			int digit = number%10;
			output = digitToWords(digit) + " " + output;
			number = number/10;
	}
		
		System.out.println(output);
		
	}

}
