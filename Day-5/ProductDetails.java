package com.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no of products to be saved: ");
		
		int noOfProducts = input.nextInt();
		
		Map<Integer, String> products = new HashMap();
		
		for(int i =1; i<=noOfProducts; i++) {
			
			System.out.print("Enter the product id of product- "+ i );
			int product = input.nextInt();
			System.out.print("  Enter the product name of product - " +i);
			String productName = input.next();	
			products.put(product, productName);
			
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\Akash Varma\\Desktop\\Stocks.ser");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			oos.writeObject(products);
			System.out.println(" File Successfully written");
		} catch (IOException e) {
			
			System.out.println("Failed to write file");
		}
		
		

	}

}
