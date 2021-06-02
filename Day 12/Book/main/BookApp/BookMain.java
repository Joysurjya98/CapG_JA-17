package com.capgemini.BookApp;

import java.util.Scanner;
import com.capgemini.Book.service.*;

public class BookMain {

	public static void main(String[] args) throws Throwable{
		Scanner sc = new Scanner(System.in);
		BookManager bm = new BookManager();
		char ch = 'y';
		while(ch =='y') {
			System.out.println("1. Create New Book \n2. Display Book Details\n3. Update Book Details\n4. Delete Book");
			System.out.println("========================================================");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				bm.createBook();
				break;
			case 2:
				bm.readBook();
				break;
			case 3:
				bm.updateBook();
			case 4:
				bm.deleteBook();	
			default:
				System.out.println("Wrong Choice");
			}
			System.out.println("========================================================");
			System.out.println("Do you want to continue (y/n)?");
			ch=sc.next().trim().charAt(0);
			
			if(ch=='n') {
				System.out.println("------------------Thank You---------------------");
			}
		}

	}

}
