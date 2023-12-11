package com.day1;

import java.util.Scanner;

public class ReportCard {
	
	
	public static int marksEntry(int num) {
		Scanner input = new Scanner(System.in);
		int[] subjectsArray = new int[num];
		int total = 0;
		System.out.println("SUBJECT" + " ".repeat(20) + "Marks");
		for(int i=0; i<num; i++) {
			System.out.print("Enter Subject " + i+1 + " ".repeat(14));
			subjectsArray[i] = input.nextInt();		
		}	
		
		for(int i=0; i<subjectsArray.length; i++) {
			total += subjectsArray[i];
		}		
		return total;	
			
	}
	
	public static void PrintReportCard() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String studentName = input.next();
		System.out.print("Enter no of subjects: ");
		int subjects = input.nextInt();	
		int total = marksEntry(subjects);
		float Average = ((float)total/subjects);
		System.out.print("Your Average is: ");
		System.out.printf("% .2f",Average);
		
		
					
	}
	
	
	
		
		
		
		
	

	public static void main(String[] args) {
		PrintReportCard();
		

	}

}
