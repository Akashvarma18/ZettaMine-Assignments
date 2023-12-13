package com.Deserialization.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ProductDetailsDeserialization {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter product ID: ");
		
		int pid = input.nextInt();
		
		
		FileInputStream fos = null;
		try {
			fos = new FileInputStream("C:\\Users\\Akash Varma\\Desktop\\Stocks.ser");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ObjectInputStream oos = null;
		try {
			oos = new ObjectInputStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(oos.readObject());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
