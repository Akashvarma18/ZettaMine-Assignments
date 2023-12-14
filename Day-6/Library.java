package com.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	private static List<BookManipulation> booklist = new ArrayList<BookManipulation>();
	
	
	public List<BookManipulation> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<BookManipulation> booklist) {
		this.booklist = booklist;
	}
	
	public void addBook(BookManipulation bobj) {
		
		booklist.add(bobj);		
	}
	
	public Boolean isEmpty() {
		
		if(booklist.isEmpty()) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static List<BookManipulation> viewBooksByAuthor(String author ) {
		
		List<BookManipulation> booksByAurthor = new ArrayList<>();
		for(BookManipulation book : booklist) {
			if(book.getBookAuthor().equalsIgnoreCase(author)) {
				booksByAurthor.add(book);
			}
		}
		
		if(booksByAurthor.isEmpty()) {
			System.out.println("This list is empty");
		}
		
		return booksByAurthor;
		
		
	}
	
	public static int countNoOfBooks(String bname) {
		
		List<String> booksByName = new ArrayList<>();
		for(BookManipulation book : booklist) {
			if(book.getBookTitle().equalsIgnoreCase(bname)) {
				booksByName.add(bname);
			}
		}
		
		return booksByName.size();
				
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1.Add Book");
		System.out.println("2. Display all Books Details");
		System.out.println("3.search Book Author");
		System.out.println("4.Count Number of books - by book name");
		System.out.println("5.Exit");
		System.out.println();
		System.out.println();
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		System.out.print("Enter the isbn no: ");
		int isbn = input.nextInt();
		System.out.print("Enter the book name: ");
		String book = input.next();
		System.out.println("Enter the author name: ");
		String authorName = input.next();
		
		booklist.add(new BookManipulation(isbn,book,authorName));
		
		if(choice == 1) {
			
			booklist.add(new BookManipulation(isbn,book,authorName));
				
		}else if(choice == 2) {
			
			System.out.println(booklist);
			
		}else if(choice == 3) {
			
			viewBooksByAuthor(authorName);
				
		}else if(choice == 4) {
			
			countNoOfBooks(book);
			
			
		}else {
			
			System.exit(0);
			
		}
		
		
		

	}

}
