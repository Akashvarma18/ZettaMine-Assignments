package com.nums;

import java.util.Scanner;

public class TicketCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of ticket: ");
        int numTickets = scanner.nextInt();

        if (numTickets < 5 || numTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.print("Do you want refreshment: ");
        String refreshment = scanner.next();

        System.out.print("Do you have coupon code: ");
        String couponCode = scanner.next();

        System.out.print("Enter the circle K or Q: ");
        char circle = scanner.next().charAt(0);

        calculateTicketCost(numTickets, refreshment, couponCode, circle);

    }

    static void calculateTicketCost(int numTickets, String refreshment, String couponCode, char circle) {
        double kingClassCost = 75;
        double queenClassCost = 150;
        double refreshmentCost = 50;

        double totalCost = 0;

        if (circle == 'K') {
            totalCost = numTickets * kingClassCost;
        } else if (circle == 'Q') {
            totalCost = numTickets * queenClassCost;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        if (refreshment.equals("Y")) {
            totalCost += numTickets * refreshmentCost;
        }
     
        if (couponCode.equals("Y")) {
            totalCost = totalCost + (totalCost*2)/100; 
        }
     
        if (numTickets > 20) {
            totalCost = totalCost +  (totalCost*10)/100;  
        }
        System.out.printf("Ticket cost: %.2f%n", totalCost);
    }
}
