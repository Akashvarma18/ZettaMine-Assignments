package com.nums;

import java.util.Scanner;

public class BillGeneration {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter the no of pizzas bought: ");
		int pizzaCount = input.nextInt();
		int pizzaTotal = pizzaCount * 100;
		System.out.print("Enter the no of puffs bought: ");
		int puffsCount = input.nextInt();
		int puffTotal = puffsCount * 20;
		System.out.print("Enter the no of drinks bought: ");
		int drinksCount = input.nextInt();
		int drinksTotal = drinksCount * 5;
		
		float totalPrice = pizzaTotal + puffTotal + drinksTotal;
		
		System.out.println();
		System.out.println("Bill Details");
		System.out.println("No of Pizzas:" +"\t\t" + pizzaCount + "\t" + "Cost:" + pizzaTotal);
		System.out.println("No of Puffs:" +"\t\t" + puffsCount + "\t" + "Cost:" + puffTotal);
		System.out.println("No of Cool Drinks:" +"\t" + drinksCount + "\t" + "Cost:" + drinksTotal);
		System.out.println();
		System.out.print("Total Price = ");
		System.out.printf("%.2f" , totalPrice);
		System.out.println();
		System.out.println();
		System.out.println("ENJOY THE SHOW!!");	
	}

}
