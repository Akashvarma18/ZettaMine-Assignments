package com.Day2;

import java.util.Scanner;

class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

   
    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        
        if (availableTickets >= 0) {
            Ticket.availableTickets = availableTickets;
        } else {
            System.out.println("Invalid value for availableTickets.");
            Ticket.availableTickets = 0;
        }
    }

    public int calculateTicketCost(int nooftickets) {
     
        if (nooftickets > 0 && nooftickets <= availableTickets) {
        
            availableTickets = availableTickets -  nooftickets;


            int totalAmount = nooftickets * price;


            System.out.println("Available tickets: " + availableTickets);
            System.out.println("Total amount: " + totalAmount);
            return totalAmount;
        } else {
            System.out.println("Tickets are not available.");
            return -1;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter no of bookings: ");
        int numberOfBookings = scanner.nextInt();
        System.out.print("Enter the available tickets: ");
        int availableTickets = scanner.nextInt();
        Ticket.setAvailableTickets(availableTickets);
        for (int i = 0; i < numberOfBookings; i++) {
            Ticket ticket = new Ticket();

            System.out.print("Enter the ticketid: ");
            ticket.setTicketid(scanner.nextInt());
            
            System.out.print("Enter the price: ");
            
            ticket.setPrice(scanner.nextInt());

            System.out.print("Enter the no of tickets: ");
            int numberOfTickets = scanner.nextInt();

            int totalAmount = ticket.calculateTicketCost(numberOfTickets);
            
            System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
        }

        
    }
}

	
	
	
	
	

