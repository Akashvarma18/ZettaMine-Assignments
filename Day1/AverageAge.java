package com.Day1;

import java.util.Scanner;

public class AverageAge {
	static Scanner input = new Scanner(System.in);
	
	public static double calculateAverage(int numOfEmps) {
		
		int[] empArr = new int[numOfEmps];
		float average = 0;
		for(int i=0; i<numOfEmps;i++) {
			empArr[i] = input.nextInt();	
			if(empArr[i]>=28 && empArr[i]<=40) {
				average += empArr[i]/2;
			}else {
				
				return -1;
			}
			
		}
			return average;
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter no of employees: ");
		int numOfEmps = input.nextInt();
		if (numOfEmps<2) {
			System.out.println("Sample Output");
			System.err.print("please enter a valid employee count");
		}else {
			System.out.println("Enter the age of " + numOfEmps + " employees");
			double output = calculateAverage(numOfEmps);
			if(output==-1) {
				System.err.println("Invalid age encountered");
			}else {
				System.out.print("Average age is: ");
				System.out.printf("%.2f", output);
			}
			
		}
	}

}
