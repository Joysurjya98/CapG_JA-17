package com.capgemini.Book.service;

import java.util.Scanner;
import java.util.ArrayList;

import com.capgemini.Book.exception.*;
import com.capgemini.Book.model.*;

public class BookManager {
	static ArrayList <Book> bookList = new ArrayList <Book>();
	static Scanner sc = new Scanner(System.in);
	static Book b;
	
	public BookManager() {
		super();
	}

	public static void createBook() throws Throwable {
		System.out.println("Enter the Book ID: ");
		int bookid = sc.nextInt();
		System.out.println("Enter book name: ");
		sc.next();
		String bname = sc.nextLine();
		System.out.println("Enter book price: ");
		double price = sc.nextDouble();
		b = new Book(bookid, bname, price);
		b.checker(b);
		checkIfBookAlreadyExists(b);
		bookList.add(b);
	}
	
	
	public static void readBook() throws ArrayListIsNull {
		for (Book i: bookList) {
			if (i != null)
				System.out.println("ID: " +  i.getBid() + ", Name: " + i.getBname() + ", Price: " + i.getPrice());
			else
				throw new ArrayListIsNull();
		}
		
	}
	
	public void updateBook() throws BookNotFound, BookAlreadyFound {
		boolean ct = false;
		System.out.println("Enter book id: ");
		int id = sc.nextInt();
		for (Book i: bookList) {
			if (i.getBid() == id) {
				System.out.println("Enter Book Name: ");
				sc.nextLine();
				String newBName = sc.nextLine();
				System.out.println("Enter price: ");
				double newPrice = sc.nextDouble();
				Book b1 = new Book(id, newBName, newPrice);
				checkIfBookAlreadyExists(b1);
				i.setBname(newBName);
				i.setPrice(newPrice);
				ct = true;
			}
		}
		if (ct == false)
			throw new BookNotFound();
	}
	
	public void deleteBook() throws BookNotFound {
		boolean ct = false;
		System.out.println("Enter book id: ");
		int id = sc.nextInt();
		for (Book i: bookList) {
			if (i.getBid() == id) {
				i = null;
				ct = true;
			}
		}
		if (ct == false)
			throw new BookNotFound();
	}
	
	public static void checkIfBookAlreadyExists(Book b) throws BookAlreadyFound {
		for (Book i: bookList) 
			if (b.getBname().equalsIgnoreCase(i.getBname()) && b.getBid() == i.getBid())
				throw new BookAlreadyFound();
	}
}
